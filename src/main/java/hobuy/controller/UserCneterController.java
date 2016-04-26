package hobuy.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hobuy.domain.Address;
import hobuy.domain.Shoppingcart;
import hobuy.domain.Soler_evaluate;
import hobuy.domain.User;
import hobuy.service.UserCenterService;

@Controller
@RequestMapping("/usercenter")
public class UserCneterController {
	@Value("#{userCenterService}")
	private UserCenterService userCenterService;

	/**
	 * 用户中心
	 * 
	 * @return
	 */
	@RequestMapping("center.do")
	public String center() {
		return "/jsp/UserCenter/Center.jsp";
	}

	/**
	 * 订单中心
	 * 
	 * @return
	 */
	@RequestMapping(value = "/orders.do", method = RequestMethod.GET)
	public String orders(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		userCenterService.orders(user, request);
		return "/jsp/UserCenter/Orders.jsp";
	}

	@RequestMapping(value = "/cancleorder.do", method = RequestMethod.GET)
	public String cancleorder(Long oid, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		userCenterService.cancleorder(oid, user, request);
		return "redirect:orders.do";
	}

	@RequestMapping(value = "/wantcancleorder.do", method = RequestMethod.GET)
	public String wantcancleorder(Long oid, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		userCenterService.wantcancleorder(oid, user, request);
		return "redirect:orders.do";
	}

	@RequestMapping(value = "/orders.do", method = RequestMethod.POST)
	public String orderPost(Long rids[], Integer sums[], Address address, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if (address.getId() == -1) {
			if (address.getPhone() == null || address.getPhone().trim().length() < 1 || address.getAddress() == null
					|| address.getAddress().trim().length() < 1) {
				return "redirect:orders.do";
			}
		}
		System.out.println(Arrays.toString(rids));
		System.out.println(Arrays.toString(sums));
		System.out.println(address);
		userCenterService.orderPost(rids, sums, address, user, request);
		return "redirect:orders.do";
	}

	/**
	 * 支付中心
	 * 
	 * @return
	 */
	@RequestMapping(value = "/pay.do", method = RequestMethod.GET)
	public String pay(Long oid, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		userCenterService.pay(oid, user, request);
		return "redirect:orders.do";
	}

	/**
	 * 确认收货
	 * 
	 * @return
	 */
	@RequestMapping(value = "/receive.do", method = RequestMethod.GET)
	public String receive(Long oid, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		userCenterService.receive(oid, user, request);
		return "redirect:orders.do";
	}

	/**
	 * 评价商品
	 * 
	 * @return
	 */
	@RequestMapping(value = "/evaluate.do", method = RequestMethod.GET)
	public String evaluate(Long oid, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if (userCenterService.evaluate(oid, user, request)) {
			return "/jsp/UserCenter/Evaluate.jsp";
		} else {
			return "redirect:orders.do";
		}
	}

	@RequestMapping(value = "/evaluate.do", method = RequestMethod.POST)
	public String evaluatePost(Long oid, Long pids[], String contents[], Soler_evaluate soler_evaluate,
			HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		System.out.println(Arrays.toString(pids));
		System.out.println(Arrays.toString(contents));
		System.out.println(oid);
		System.out.println(soler_evaluate);
		userCenterService.evaluatePost(oid, pids, contents, soler_evaluate, user, request);

		return "redirect:orders.do";
	}

	/**
	 * 联系客服
	 * 
	 * @return
	 */
	@RequestMapping(value = "/waiters.do", method = RequestMethod.GET)
	public String waiters(Long oid, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		userCenterService.waiters(oid, user, request);
		return "/jsp/UserCenter/Waiters.jsp";
	}

	/**
	 * 购物车
	 * 
	 * @return
	 */
	@RequestMapping(value = "/shoppingcart.do", method = RequestMethod.GET)
	public String shoppingcart(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		userCenterService.shoppingCart(user, request);
		return "/jsp/UserCenter/ShoppingCart.jsp";
	}

	@RequestMapping(value = "/shoppingcartDelete.do", method = RequestMethod.GET)
	public String shoppingcartDelete(Long id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		userCenterService.shoppingCartDelete(id, user, request);
		return "redirect:shoppingcart.do";
	}

	@RequestMapping(value = "/shoppingcart.do", method = RequestMethod.POST)
	public String shoppingcartPost(Long repertoryid, Shoppingcart shoppingCart, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		userCenterService.shoppingCartPost(repertoryid, user, shoppingCart, request);
		return "redirect:shoppingcart.do";
	}

	/**
	 * 地址信息管理
	 */
	@RequestMapping(value = "/addresses.do", method = RequestMethod.GET)
	public String addresses(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		userCenterService.addresses(user, request);
		return "/jsp/UserCenter/Address.jsp";
	}

	@RequestMapping(value = "/address.do", method = RequestMethod.POST)
	public String addressPost(Address address, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		userCenterService.addressPost(address, user, request);
		return "redirect:addresses.do";
	}

	/**
	 * 个人信息
	 */
	@RequestMapping(value = "/userdetail.do", method = RequestMethod.GET)
	public String userDetail(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		userCenterService.userDetail(user.getId(), request);
		return "/jsp/UserCenter/UserDetail.jsp";
	}

	/**
	 * 账户安全
	 */
	@RequestMapping(value = "/accountsecurity.do", method = RequestMethod.GET)
	public String accountSecurity(HttpServletRequest request) {
		return "/jsp/UserCenter/AccountSecurity.jsp";
	}

	@RequestMapping(value = "/updatepwd.do", method = RequestMethod.POST)
	public String updatePwd(String oldpwd, String newpwd, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if (userCenterService.updatePwd(oldpwd, newpwd, user, request)) {
			return "redirect:/logoffuser.do";
		} else {
			return "/jsp/UserCenter/AccountSecurity.jsp";

		}
	}

}
