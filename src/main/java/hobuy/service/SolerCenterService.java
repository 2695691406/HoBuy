package hobuy.service;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import hobuy.domain.Clazz;
import hobuy.domain.ClazzPK;
import hobuy.domain.Img_group;
import hobuy.domain.Order;
import hobuy.domain.OrderPK;
import hobuy.domain.Product;
import hobuy.domain.ProductPK;
import hobuy.domain.Repertory;
import hobuy.domain.RepertoryPK;
import hobuy.domain.Soler;
import hobuy.domain.SolerWorker;
import hobuy.domain.SolerWorkerPK;
import hobuy.domain.Soler_evaluate;
import hobuy.domain.Soler_property;
import hobuy.domain.Soler_propertyPK;
import hobuy.domain.User_evaluate;
import hobuy.domain.Waiter;
import hobuy.domain.WaiterPK;
import hobuy.domain.dao.ClazzDao;
import hobuy.domain.dao.Img_groupDao;
import hobuy.domain.dao.OrderDao;
import hobuy.domain.dao.ProductDao;
import hobuy.domain.dao.RepertoryDao;
import hobuy.domain.dao.SolerWorkerDao;
import hobuy.domain.dao.Soler_evaluateDao;
import hobuy.domain.dao.Soler_propertyDao;
import hobuy.domain.dao.User_evaluateDao;
import hobuy.domain.dao.WaiterDao;
import hobuy.service.extar.ImgGroupFiles;
import hobuy.service.extar.ProductRepertory;
import hobuy.service.utils.FileUpload;

@Service("solerCenterService")
public class SolerCenterService {
	@Autowired
	private Soler_evaluateDao soler_evaluateDaoImpl;
	@Autowired
	private ProductDao productDaoImpl;
	@Autowired
	private Soler_propertyDao soler_propertyDaoImpl;
	@Autowired
	private OrderDao orderDaoImpl;
	@Autowired
	private WaiterDao waiterDaoImpl;
	@Autowired
	private ClazzDao clazzDaoImpl;
	@Autowired
	private RepertoryDao repertoryDaoImpl;
	@Autowired
	private Img_groupDao img_groupDaoImpl;
	@Autowired
	private User_evaluateDao user_evaluateDaoIml;
	@Autowired
	private SolerWorkerDao solerWorkerDaoImpl;

	public void report(HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		List<Soler_evaluate> evaluates = soler_evaluateDaoImpl.findBySoler(soler);
		request.setAttribute("evaluates", evaluates);
	}

	public void productReport(HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		List<Product> products = productDaoImpl.findBySoler(soler);
		request.setAttribute("products", products);

	}

	public void products(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		List<Soler_property> properties = soler_propertyDaoImpl.findBySoler(soler, 1);
		List<Product> products = productDaoImpl.findBySolerAndState(soler, 1);
		List<Clazz> parents = clazzDaoImpl.findByType(1);
		Map<Long, List<Clazz>> maps = new HashMap<Long, List<Clazz>>();
		for (Clazz clazz : parents) {
			List<Clazz> childs = clazzDaoImpl.findByParent_id(Integer.parseInt(clazz.getId() + ""));
			maps.put(clazz.getId(), childs);
		}
		request.setAttribute("products", products);
		request.setAttribute("properties", properties);
		request.setAttribute("parents", parents);
		request.setAttribute("chidsmap", maps);
	}

	/**
	 * post方式上传商品信息
	 * 
	 * @param imgGroupFiles
	 * 
	 * @param request
	 */
	public void productsPost(Soler soler, Product product, ImgGroupFiles imgGroupFiles, ProductRepertory prepertory,
			MultipartHttpServletRequest request) {
		// TODO Auto-generated method stub
		// 获取类别信息
		Clazz clazz = (Clazz) clazzDaoImpl.load(new ClazzPK(prepertory.getClazz_id()));
		// 获取属性信息
		Soler_property property = soler_propertyDaoImpl.load(new Soler_propertyPK(prepertory.getPro_id()));
		if (property == null) {
		} else {
			property.setPcount(property.getPcount() + 1);
		}
		// 保存属性组
		Img_group img_group = imgGroupFiles.saveImgs(request);
		if (img_group != null) {
			Long groupid = (Long) img_groupDaoImpl.save(img_group);
			// 通过设置id确保和数据库中的数据一致
			img_group.setId(groupid);
			product.setImg_group(img_group);
		}
		// 保存商品图片
		String imgurl = imgGroupFiles.saveImg(request);
		product.setImgurl(imgurl);
		product.setSoler(soler);
		product.setClazz(clazz);
		product.setSoler_property(property);
		// 保存商品信息
		Long id = (Long) productDaoImpl.save(product);
		// 获取已经保存的商品信息
		product = productDaoImpl.load(new ProductPK(id));
		// 保存商品库存信息
		System.out.println(product);
		List<Repertory> repertories = prepertory.saveImg(request, product);
		for (Repertory repertory : repertories) {
			repertoryDaoImpl.save(repertory);
			System.out.println(repertory);
		}
		// List<MultipartFile> files = request.getFiles("imgs");
		// System.out.println(files.size());
	}

	/**
	 * 获得属性组
	 * 
	 * @param request
	 */

	public void propertys(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		List<Soler_property> properties = soler_propertyDaoImpl.findBySoler(soler, 1);
		request.setAttribute("properties", properties);
	}

	/**
	 * 增加属性组
	 * 
	 * @param request
	 * @param soler
	 * @param property
	 */
	public void propertysPost(HttpServletRequest request, Soler soler, Soler_property property) {
		property.setSoler(soler);
		soler_propertyDaoImpl.save(property);
	}

	/**
	 * 使用属性组商品的数量
	 * 
	 * @param request
	 * @param soler
	 * @param property
	 */
	public void propertysCountSub(HttpServletRequest request, Soler soler, Soler_property property) {
		property = soler_propertyDaoImpl.load(new Soler_propertyPK(property.getId()));
		property.setPcount(property.getPcount() - 1);
		soler_propertyDaoImpl.update(property);
	}

	public void propertysCountAdd(HttpServletRequest request, Soler soler, Soler_property property) {
		property = soler_propertyDaoImpl.load(new Soler_propertyPK(property.getId()));
		property.setPcount(property.getPcount() + 1);
		soler_propertyDaoImpl.update(property);
	}

	/**
	 * 删除属性组
	 * 
	 * @param request
	 * @param soler
	 * @param property
	 */
	public void propertysDelete(HttpServletRequest request, Soler soler, Soler_property property) {

		property = soler_propertyDaoImpl.load(new Soler_propertyPK(property.getId()));
		if (property.getSoler().getId() == soler.getId()) {
			property.setState(0);
			soler_propertyDaoImpl.update(property);
		}

	}

	/**
	 * 更新属性组
	 * 
	 * @param request
	 * @param soler
	 * @param property
	 */
	public void propertysUpdate(HttpServletRequest request, Soler soler, Soler_property property) {
		Soler_property soler_property = soler_propertyDaoImpl.load(new Soler_propertyPK(property.getId()));
		if (soler_property.getSoler().getId() == soler.getId()) {
			soler_property.setName(property.getName());
			soler_property.setPro1name(property.getPro1name());
			soler_property.setPro2name(property.getPro2name());
			soler_property.setPro3name(property.getPro3name());
			soler_propertyDaoImpl.update(soler_property);
		}
	}

	public void orders(Soler soler, HttpServletRequest request, int state, int page) {
		int maxResult = 10;
		int firstResult = page * maxResult;
		List<Order> orders = orderDaoImpl.findBySoler(soler, state, firstResult, maxResult);
		request.setAttribute("orders", orders);
	}

	public void waiters(Soler soler, HttpServletRequest request) {
		List<Waiter> waiters = waiterDaoImpl.findBySoler(soler);
		request.setAttribute("waiters", waiters);
	}

	public void carousel(Soler soler, HttpServletRequest request) {
		// TODO Auto-generated method stub
		// List<Carousel> carousels=
	}

	public void productUpdate(String changeimg, Long id, Product product, MultipartHttpServletRequest request,
			Soler soler) {
		// TODO Auto-generated method stub
		Product productRL = productDaoImpl.load(new ProductPK(id));
		productRL.setName(product.getName());
		productRL.setSubtitle(product.getSubtitle());
		productRL.setIntroduce(product.getIntroduce());
		if (changeimg != null && changeimg.equals("yes")) {
			MultipartFile multipartFile = request.getFile("img");
			String imgurl = new FileUpload().save(multipartFile, request);
			productRL.setImgurl(imgurl);
		}
		productDaoImpl.update(productRL);
	}

	public void repertoryUpdate(String changeimg, Long id, Repertory repertory, MultipartHttpServletRequest request,
			Soler soler) {
		// TODO Auto-generated method stub
		Repertory repertoryRL = repertoryDaoImpl.load(new RepertoryPK(id));
		repertoryRL.setPrice(repertory.getPrice());
		repertoryRL.setBid(repertory.getBid());
		repertoryRL.setRepertory_nubmer(repertory.getRepertory_nubmer());
		repertoryRL.setState(repertory.getState());
		if (changeimg != null && changeimg.equals("yes")) {
			MultipartFile multipartFile = request.getFile("img");
			String imgurl = new FileUpload().save(multipartFile, request);
			repertoryRL.setImgurl(imgurl);
		}
		repertoryDaoImpl.update(repertoryRL);
	}

	public void sendProduct(String couriernum, Long oid, HttpServletRequest request, Soler soler) {
		Order order = orderDaoImpl.load(new OrderPK(oid));
		if (order.getSoler().getId() == soler.getId() && order.getState() == 1) {
			order.setCouriernum(couriernum);
			order.setState(2);
			orderDaoImpl.update(order);
		}

	}

	public void orderCancle(Long oid, HttpServletRequest request, Soler soler) {
		// TODO Auto-generated method stub
		Order order = orderDaoImpl.load(new OrderPK(oid));
		if (order.getSoler().getId() == soler.getId()) {
			if (order.getState() == 1 || order.getState() == 8) {
				// 做退款处理
				order.setState(9);
				orderDaoImpl.update(order);
			}
		}
	}

	public void evaluate(Long oid, HttpServletRequest request, Soler soler) {
		Order order = orderDaoImpl.load(new OrderPK(oid));
		if (soler.getId() == order.getSoler().getId()) {
			if (order.getState() == 3 || order.getState() == 4) {
				request.setAttribute("order", order);
			}
		}
	}

	public Integer evaluatePost(Long oid, User_evaluate user_evaluate, HttpServletRequest request, Soler soler) {
		// TODO Auto-generated method stub
		Order order = orderDaoImpl.load(new OrderPK(oid));
		if (order.getSoler().getId() == soler.getId()) {
			user_evaluate.setOrder(order);
			user_evaluate.setTime(new Date());
			user_evaluate.setSoler(soler);
			user_evaluate.setUser(order.getUser());
			if (order.getState() == 3) {
				order.setState(5);
				user_evaluateDaoIml.save(user_evaluate);
				orderDaoImpl.update(order);
				return 5;
			} else if (order.getState() == 4) {
				order.setState(6);
				user_evaluateDaoIml.save(user_evaluate);
				orderDaoImpl.update(order);
				return 6;
			}
			return 0;
		}
		return 0;
	}

	public void connectUser(Long oid, HttpServletRequest request, Soler soler) {
		// TODO Auto-generated method stub
		Order order = orderDaoImpl.load(new OrderPK(oid));
		if (order.getSoler().getId() == soler.getId()) {
			request.setAttribute("user", order.getUser());
		}
	}

	public void waitersPost(Waiter waiter, Soler soler, HttpServletRequest request) {
		// TODO Auto-generated method stub
		waiter.setSoler(soler);
		waiterDaoImpl.save(waiter);
	}

	public void waitersDelete(Long wid, Soler soler, HttpServletRequest request) {
		// TODO Auto-generated method stub
		Waiter waiter = waiterDaoImpl.load(new WaiterPK(wid));
		if (waiter.getSoler().getId() == soler.getId()) {
			waiterDaoImpl.delete(waiter);
		}
	}

	public void getProperty(Long proid, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		Soler_property property = soler_propertyDaoImpl.load(new Soler_propertyPK(proid));
		if (property != null) {
			JsonObjectBuilder builder = Json.createObjectBuilder();
			if (property.getPro1name() != null && property.getPro1name().trim().length() > 0) {
				builder.add("pro1name", property.getPro1name());
			}
			if (property.getPro2name() != null && property.getPro2name().trim().length() > 0) {
				builder.add("pro2name", property.getPro2name());
			}
			if (property.getPro3name() != null && property.getPro3name().trim().length() > 0) {
				builder.add("pro3name", property.getPro3name());
			}
			JsonObject jsonObject = builder.build();
			try {
				System.out.println(jsonObject.toString());
				response.setCharacterEncoding("utf-8");
				response.getWriter().write(jsonObject.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				response.getWriter().write("0");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void productsDelete(Long pid, HttpServletRequest request, Soler soler) {
		// TODO Auto-generated method stub
		Product product = productDaoImpl.load(new ProductPK(pid));
		product.setState(0);
		productDaoImpl.update(product);
	}

	public void solerWorkers(Soler soler, HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<SolerWorker> solerWorkers = solerWorkerDaoImpl.findBySoler(soler);
		request.setAttribute("solerWorkers", solerWorkers);
	}

	public void solerWorkersPost(SolerWorker solerWorker, Soler soler, HttpServletRequest request) {
		// TODO Auto-generated method stub
		solerWorker.setSend_count(0);
		solerWorker.setCreatedate(new Date());
		solerWorker.setReputation(5.0);
		solerWorker.setSoler(soler);
		solerWorkerDaoImpl.save(solerWorker);
	}

	public void solerWorkersfire(Integer swid, Soler soler, HttpServletRequest request) {
		// TODO Auto-generated method stub
		SolerWorker solerWorker = solerWorkerDaoImpl.load(new SolerWorkerPK(swid));
		if (solerWorker.getSoler().getId() == swid) {
			solerWorker.setState(0);
			solerWorker.setOffdate(new Date());
			solerWorkerDaoImpl.update(solerWorker);
		}
	}

}
