package hobuy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import hobuy.domain.Product;
import hobuy.domain.Repertory;
import hobuy.domain.Soler;
import hobuy.domain.SolerWorker;
import hobuy.domain.Soler_property;
import hobuy.domain.User_evaluate;
import hobuy.domain.Waiter;
import hobuy.service.SolerCenterService;
import hobuy.service.extar.ImgGroupFiles;
import hobuy.service.extar.ProductRepertory;

@Controller
@RequestMapping("/solercenter")
public class SolerCneterController {
	@Value("#{solerCenterService}")
	private SolerCenterService solerCenterService;

	/**
	 * 商家中心
	 * 
	 * @return
	 */
	@RequestMapping("center.do")
	public String center(HttpServletRequest request) {
		if (request.getSession().getAttribute("soler") == null) {
			return "redirect:/login.do";
		}
		return "/jsp/SolerCenter/Center.jsp";
	}

	/**
	 * 报告页面
	 * 
	 * @return
	 */

	@RequestMapping("reports.do")
	public String reports(HttpServletRequest request) {
		solerCenterService.report(request);
		return "/jsp/SolerCenter/Reports.jsp";
	}

	/**
	 * 商品报告页面
	 * 
	 * @return
	 */

	@RequestMapping("productreport.do")
	public String productReport(HttpServletRequest request) {
		solerCenterService.productReport(request);
		return "/jsp/SolerCenter/ProductReport.jsp";
	}

	/**
	 * 商品管理页面
	 * 
	 * @return
	 */

	@RequestMapping("productmanage.do")
	public String productManage() {
		return "/jsp/SolerCenter/ProductManage.jsp";
	}

	/**
	 * 商品管理--商品
	 * 
	 * @return
	 */

	@RequestMapping(value = "products.do", method = RequestMethod.GET)
	public String products(HttpServletRequest request) {
		solerCenterService.products(request);
		return "/jsp/SolerCenter/Products.jsp";
	}

	@RequestMapping(value = "products.do", method = RequestMethod.POST)
	public String productsPost(Product product, ImgGroupFiles imgGroupFiles, ProductRepertory repertory,
			MultipartHttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		System.out.println("haha" + request.getFiles("imgs").size());
		System.out.println(product);

		System.out.println(repertory);

		solerCenterService.productsPost(soler, product, imgGroupFiles, repertory, request);
		return "redirect:products.do";
	}

	@RequestMapping(value = "productupdate.do", method = RequestMethod.POST)
	public String productsUpdate(String changeimg, Long id, Product product, MultipartHttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");

		solerCenterService.productUpdate(changeimg, id, product, request, soler);
		return "redirect:products.do";
	}

	@RequestMapping(value = "productdelete.do", method = RequestMethod.GET)
	public String productsDelete(Long pid, HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.productsDelete(pid, request, soler);
		return "redirect:products.do";
	}

	@RequestMapping(value = "repertoryupdate.do", method = RequestMethod.POST)
	public String repertoryUpdate(String changeimg, Long id, Repertory repertory, MultipartHttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.repertoryUpdate(changeimg, id, repertory, request, soler);
		return "redirect:products.do";
	}

	/**
	 * 商品发货
	 * 
	 * @param couriernum
	 * @param oid
	 * @param request
	 * @return
	 */

	@RequestMapping(value = "sendproduct.do", method = RequestMethod.POST)
	public String sendProduct(String couriernum, Long oid, HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.sendProduct(couriernum, oid, request, soler);
		return "redirect:orders.do?state=1&page=0";
	}

	/**
	 * 订单取消
	 * 
	 * @param couriernum
	 * @param oid
	 * @param request
	 * @return
	 */

	@RequestMapping(value = "ordercancle.do", method = RequestMethod.GET)
	public String orderCancle(Long oid, HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.orderCancle(oid, request, soler);
		String url = request.getHeader("referer");
		return "redirect:" + url;
	}

	/**
	 * 评价用户
	 * 
	 * @param oid
	 * @param request
	 * @return
	 */

	@RequestMapping(value = "evaluate.do", method = RequestMethod.GET)
	public String evaluate(Long oid, HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.evaluate(oid, request, soler);
		return "/jsp/SolerCenter/Evaluate.jsp";
	}

	@RequestMapping(value = "evaluate.do", method = RequestMethod.POST)
	public String evaluatePost(Long oid, User_evaluate user_evaluate, HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		int state = solerCenterService.evaluatePost(oid, user_evaluate, request, soler);
		if (state == 5) {
			return "redirect:orders.do?state=5&page=0";
		} else if (state == 6) {
			return "redirect:orders.do?state=6&page=0";
		}
		String url = request.getHeader("referer");
		return "redirect:" + url;
	}

	/**
	 * 联系买家
	 * 
	 * @param oid
	 * @param request
	 * @return
	 */

	@RequestMapping(value = "connectuser.do", method = RequestMethod.GET)
	public String connectUser(Long oid, HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.connectUser(oid, request, soler);
		return "/jsp/SolerCenter/UserMessage.jsp";
	}

	/**
	 * 商品管理--属性组
	 * 
	 * @return
	 */
	@RequestMapping(value = "propertys.do", method = RequestMethod.GET)
	public String propertys(HttpServletRequest request) {
		solerCenterService.propertys(request);
		return "/jsp/SolerCenter/Propertys.jsp";
	}

	@RequestMapping(value = "propertys.do", method = RequestMethod.POST)
	public String propertysPost(Soler_property property, HttpServletRequest request) {
		System.out.println(property);
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.propertysPost(request, soler, property);
		return "redirect:propertys.do";
	}

	@RequestMapping(value = "propertysupdate.do", method = RequestMethod.POST)
	public String propertysUpdate(Soler_property property, HttpServletRequest request) {
		System.out.println(property);
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.propertysUpdate(request, soler, property);
		return "redirect:propertys.do";
	}

	@RequestMapping(value = "propertysdelete.do", method = RequestMethod.GET)
	public String propertysDelete(Soler_property property, HttpServletRequest request) {
		System.out.println(property);
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.propertysDelete(request, soler, property);
		return "redirect:propertys.do";
	}

	/**
	 * ajax获取属性
	 * 
	 * @param proid
	 * @param request
	 */

	@RequestMapping(value = "getproperty.do", method = RequestMethod.POST)
	public void getProperty(Long proid, HttpServletRequest request, HttpServletResponse response) {
		solerCenterService.getProperty(proid, request, response);
	}

	/**
	 * 订单管理
	 * 
	 * @return
	 */
	@RequestMapping("ordermanage.do")
	public String orderManage() {
		return "/jsp/SolerCenter/OrderManage.jsp";
	}

	@RequestMapping("orders.do")
	public String orders(int state, int page, HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.orders(soler, request, state, page);
		return "/jsp/SolerCenter/Orders.jsp";
	}

	/**
	 * 商家评价信息
	 * 
	 * @return
	 */

	@RequestMapping("evaluate.do")
	public String evaluste() {
		return "/jsp/SolerCenter/Evaluate.jsp";
	}

	/**
	 * 客服页面
	 * 
	 * @return
	 */

	@RequestMapping(value = "waiters.do", method = RequestMethod.GET)
	public String waiters(HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.waiters(soler, request);
		return "/jsp/SolerCenter/Waiters.jsp";
	}

	@RequestMapping(value = "waitersdelete.do", method = RequestMethod.GET)
	public String waitersDelete(Long wid, HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.waitersDelete(wid, soler, request);
		return "redirect:waiters.do";
	}

	@RequestMapping(value = "waiters.do", method = RequestMethod.POST)
	public String waitersPost(Waiter waiter, HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.waitersPost(waiter, soler, request);
		return "redirect:waiters.do";
	}

	/**
	 * 工作人员
	 */
	@RequestMapping(value = "solerworkers.do", method = RequestMethod.GET)
	public String solerWorkers(HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.solerWorkers(soler, request);
		return "/jsp/SolerCenter/Workers.jsp";
	}

	@RequestMapping(value = "solerworkersfire.do", method = RequestMethod.GET)
	public String solerWorkersfire(Integer swid, HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.solerWorkersfire(swid, soler, request);
		return "redirect:solerworkers.do";
	}

	@RequestMapping(value = "solerworkers.do", method = RequestMethod.POST)
	public String solerWorkersPost(SolerWorker solerWorker, HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.solerWorkersPost(solerWorker, soler, request);
		return "redirect:solerworkers.do";
	}

	/**
	 * 滚动广告(尚未完成)
	 * 
	 * @return
	 */

	@RequestMapping("carousel.do")
	public String carousel(HttpServletRequest request) {
		Soler soler = (Soler) request.getSession().getAttribute("soler");
		solerCenterService.carousel(soler, request);
		return "/jsp/SolerCenter/Carousel.jsp";
	}

}
