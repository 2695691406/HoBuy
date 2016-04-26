package hobuy.service;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hobuy.EncryptUtils;
import hobuy.domain.Address;
import hobuy.domain.AddressPK;
import hobuy.domain.Order;
import hobuy.domain.OrderPK;
import hobuy.domain.Order_product;
import hobuy.domain.Product;
import hobuy.domain.ProductPK;
import hobuy.domain.Product_evaluate;
import hobuy.domain.Repertory;
import hobuy.domain.RepertoryPK;
import hobuy.domain.Shoppingcart;
import hobuy.domain.ShoppingcartPK;
import hobuy.domain.Soler;
import hobuy.domain.Soler_evaluate;
import hobuy.domain.User;
import hobuy.domain.UserPK;
import hobuy.domain.Waiter;
import hobuy.domain.dao.AddressDao;
import hobuy.domain.dao.OrderDao;
import hobuy.domain.dao.Order_productDao;
import hobuy.domain.dao.ProductDao;
import hobuy.domain.dao.Product_evaluateDao;
import hobuy.domain.dao.RepertoryDao;
import hobuy.domain.dao.ShoppingcartDao;
import hobuy.domain.dao.Soler_evaluateDao;
import hobuy.domain.dao.UserDao;

@Service("userCenterService")
public class UserCenterService {
	@Autowired
	private UserDao userDaoImpl;
	@Autowired
	private RepertoryDao repertoryDaoImpl;
	@Autowired
	private ShoppingcartDao shoppingcartDaoImpl;
	@Autowired
	private OrderDao orderDaoImpl;
	@Autowired
	private AddressDao addressDaoImpl;
	@Autowired
	private Order_productDao order_productDaoImpl;
	@Autowired
	private ProductDao productDaoImpl;
	@Autowired
	private Soler_evaluateDao soler_evaluateDaoImpl;
	@Autowired
	private Product_evaluateDao product_evaluateDaoImpl;

	public void shoppingCartPost(Long repertoryid, User user, Shoppingcart shoppingCart, HttpServletRequest request) {
		Repertory repertory = repertoryDaoImpl.load(new RepertoryPK(repertoryid));
		Shoppingcart shoppingCartRL = shoppingcartDaoImpl.findByUserAndRepertory(user, repertory);
		if (shoppingCartRL == null) {
			shoppingCart.setCreatetime(new Date());
			shoppingCart.setUser(user);
			shoppingCart.setRepertory(repertory);
			// shoppingcartDaoImpl.save(shoppingCart);
			shoppingCartRL = shoppingCart;
		} else {
			shoppingCartRL.setSum(shoppingCartRL.getSum() + shoppingCart.getSum());
		}
		shoppingcartDaoImpl.saveOrUpdate(shoppingCartRL);

	}

	public void shoppingCart(User user, HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<Shoppingcart> shoppingcarts = shoppingcartDaoImpl.findByUser(user);
		List<Address> addresses = addressDaoImpl.findByUser(user);
		request.setAttribute("shoppingcarts", shoppingcarts);
		request.setAttribute("addresses", addresses);
	}

	public void shoppingCartDelete(Long id, User user, HttpServletRequest request) {
		// TODO Auto-generated method stub
		Shoppingcart shoppingcart = shoppingcartDaoImpl.load(new ShoppingcartPK(id));
		if (shoppingcart.getUser().equals(user)) {
			shoppingcartDaoImpl.delete(shoppingcart);
		} else {
			System.out.println("非法操作数据");
		}
	}

	public void orders(User user, HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<Order> orders = orderDaoImpl.findByUser(user);
		request.setAttribute("orders", orders);
	}

	public void orderPost(Long[] rids, Integer[] sums, Address address, User user, HttpServletRequest request) {
		// TODO Auto-generated method stub
		if (address.getId() == -1) {
			address.setUser(user);
			Long id = (Long) addressDaoImpl.save(address);
			address.setId(id);
		} else {
			address = addressDaoImpl.load(new AddressPK(address.getId()));
		}
		Map<Soler, Set<Order_product>> map = new HashMap<Soler, Set<Order_product>>();
		int i = 0;
		for (Long rid : rids) {
			Repertory repertory = repertoryDaoImpl.load(new RepertoryPK(rid));
			Shoppingcart shoppingcart = (Shoppingcart) shoppingcartDaoImpl.findByRepertory(repertory).get(0);

			Soler soler = repertory.getProduct().getSoler();
			Order_product order_product = new Order_product();
			order_product.setRepertory(repertory);
			if (repertory.getState() == 2) {
				order_product.setPrice(repertory.getBid() * sums[i]);
			} else if (repertory.getState() == 1) {
				order_product.setPrice(repertory.getPrice() * sums[i]);
			}
			repertory.setRepertory_nubmer(repertory.getRepertory_nubmer() - sums[i]);
			order_product.setPnum(sums[i]);
			if (!map.containsKey(soler)) {
				Set<Order_product> order_products = new HashSet<Order_product>();
				order_products.add(order_product);
				map.put(soler, order_products);
			} else {
				map.get(soler).add(order_product);
			}
			shoppingcartDaoImpl.delete(shoppingcart);
			i++;
		}
		Set<Entry<Soler, Set<Order_product>>> entries = map.entrySet();
		for (Entry<Soler, Set<Order_product>> entry : entries) {
			Double totleprice = 0.0;
			for (Order_product order_p : entry.getValue()) {
				totleprice += order_p.getPrice();

			}

			Order order = new Order();
			order.setAddress(address);
			order.setCreatetime(new Date());
			order.setPrice(totleprice);
			order.setUser(user);
			Byte a = 0;
			order.setPrintstate(a);
			order.setSoler(entry.getKey());
			Long oid = (Long) orderDaoImpl.save(order);
			order.setId(oid);
			for (Order_product order_p : entry.getValue()) {
				order_p.setOrder(order);
				order_productDaoImpl.save(order_p);
			}
		}

	}

	public void pay(Long oid, User user, HttpServletRequest request) {
		Order order = orderDaoImpl.load(new OrderPK(oid));
		if (order.getUser().getId() == user.getId() && order.getState() == 0) {
			order.setState(1);
			orderDaoImpl.update(order);
		}
	}

	public void receive(Long oid, User user, HttpServletRequest request) {
		// TODO Auto-generated method stub
		Order order = orderDaoImpl.load(new OrderPK(oid));
		if (order.getUser().getId() == user.getId() && order.getState() == 2) {
			order.setState(3);
			Collection<Order_product> collection = order.getOrder_product();
			for (Order_product order_product : collection) {
				Repertory repertory = order_product.getRepertory();
				repertory.setSole_number(repertory.getSole_number() + order_product.getPnum());
				Product product = repertory.getProduct();
				product.setSolenumber(product.getSolenumber() + order_product.getPnum());
			}
			orderDaoImpl.update(order);
		}
	}

	public boolean evaluate(Long oid, User user, HttpServletRequest request) {
		// TODO Auto-generated method stub
		Order order = orderDaoImpl.load(new OrderPK(oid));
		if (order.getUser().getId() == user.getId()) {
			if (order.getState() == 3 || order.getState() == 5) {
				System.out.println("匹配成功");
				request.setAttribute("order", order);
				return true;
			}
		}
		return false;
	}

	public void evaluatePost(Long oid, Long[] pids, String[] contents, Soler_evaluate soler_evaluate, User user,
			HttpServletRequest request) {
		Order order = orderDaoImpl.load(new OrderPK(oid));
		if (user.getId() != order.getUser().getId()) {
			return;
		}
		int state = order.getState();
		if (state == 3) {
			order.setState(4);
		} else if (state == 5) {
			order.setState(6);
		} else {
			return;
		}
		int i = 0;
		for (Long proid : pids) {
			Product product = productDaoImpl.load(new ProductPK(proid));
			String evaluate_level = request.getParameter("plevel" + proid);
			Product_evaluate product_evaluate = new Product_evaluate();
			product_evaluate.setContent(contents[i]);
			product_evaluate.setEvaluate_level(Integer.parseInt(evaluate_level));
			product_evaluate.setUser(user);
			product_evaluate.setTime(new Date());
			product_evaluate.setProduct(product);
			product_evaluate.setOrder_id(oid);
			Double evaluate_double = (product.getEvaluate_level() * product.getEvaluate_count()
					+ product_evaluate.getEvaluate_level()) / (product.getEvaluate_count() + 1);
			product.setEvaluate_level(evaluate_double);
			product.setEvaluate_count(product.getEvaluate_count() + 1);
			product_evaluateDaoImpl.save(product_evaluate);
		}
		soler_evaluate.setOrder(order);
		Soler soler = order.getSoler();
		soler.setReputaion((soler.getCount() * soler.getReputaion() + soler_evaluate.getEvaluate_level())
				/ (soler.getCount() + 1));
		soler.setCount(soler.getCount() + 1);
		soler_evaluate.setSoler(soler);
		soler_evaluate.setTime(new Date());
		soler_evaluate.setUser(user);
		soler_evaluateDaoImpl.save(soler_evaluate);
		orderDaoImpl.update(order);

	}

	public void cancleorder(Long oid, User user, HttpServletRequest request) {
		Order order = orderDaoImpl.load(new OrderPK(oid));
		if (order.getUser().getId() == user.getId() && order.getState() == 0) {
			order.setState(7);
			orderDaoImpl.update(order);
		}

	}

	public void wantcancleorder(Long oid, User user, HttpServletRequest request) {
		Order order = orderDaoImpl.load(new OrderPK(oid));
		if (order.getUser().getId() == user.getId() && order.getState() == 1) {
			order.setState(8);
			orderDaoImpl.update(order);
		}
	}

	public void waiters(Long oid, User user, HttpServletRequest request) {
		Order order = orderDaoImpl.load(new OrderPK(oid));
		if (order.getUser().getId() == user.getId()) {
			Collection<Waiter> waiters = order.getSoler().getWaiter();
			request.setAttribute("waiters", waiters);
		}
	}

	public void addresses(User user, HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<Address> addresses = addressDaoImpl.findByUser(user);
		request.setAttribute("addresses", addresses);
	}

	public void addressPost(Address address, User user, HttpServletRequest request) {
		if (address.getPhone() == null || address.getPhone().trim().length() < 11 || address.getAddress() == null
				|| address.getAddress().trim().length() < 1) {
			return;
		}
		address.setUser(user);
		addressDaoImpl.save(address);
	}

	public void userDetail(Long userid, HttpServletRequest request) {
		// TODO Auto-generated method stub
		User user = userDaoImpl.load(new UserPK(userid));
		request.setAttribute("user", user);
	}

	public boolean updatePwd(String oldpwd, String newpwd, User user, HttpServletRequest request) {
		// TODO Auto-generated method stub
		EncryptUtils utils = new EncryptUtils();
		oldpwd = utils.MD5(oldpwd);
		if (user.getPwd().equals(oldpwd)) {
			newpwd = utils.MD5(newpwd);
			user.setPwd(newpwd);
			userDaoImpl.update(user);
			return true;
		}
		return false;
	}
}
