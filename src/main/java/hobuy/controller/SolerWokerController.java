package hobuy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hobuy.domain.SolerWorker;
import hobuy.service.SolerWorkerService;

@Controller
@RequestMapping(value = "/solerworker")
public class SolerWokerController {
	@Value("#{solerWorkerService}")
	private SolerWorkerService solerWorkerService;

	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		return "/jsp/SolerWorker/login.jsp";
	}

	@RequestMapping(value = "/packworker.do", method = RequestMethod.GET)
	public String packGet(HttpServletRequest request) {
		return "/jsp/SolerWorker/PackWorker.jsp";
	}

	@RequestMapping(value = "/acceptorder.do", method = RequestMethod.GET)
	public String acceptOrder(HttpServletRequest request) {
		solerWorkerService.accpetOrder(request);
		return "/jsp/SolerWorker/AcceptOrder.jsp";
	}

	@RequestMapping(value = "/acceptorder.do", method = RequestMethod.POST)
	public String acceptOrderPost(Long oid, HttpServletRequest request) {
		SolerWorker solerWorker = (SolerWorker) request.getSession().getAttribute("solerWorker");
		solerWorkerService.accpetOrderPost(oid, solerWorker, request);
		return "/jsp/SolerWorker/AcceptOrder.jsp";
	}

	@RequestMapping(value = "/exportingorder.do", method = RequestMethod.GET)
	public String exportOrder(HttpServletRequest request) {
		solerWorkerService.exportingOrder(request);
		return "/jsp/SolerWorker/ExportingOrder.jsp";
	}

	@RequestMapping(value = "/exportedorder.do", method = RequestMethod.GET)
	public String exportedOrder(HttpServletRequest request) {
		solerWorkerService.exportedOrder(request);
		return "/jsp/SolerWorker/ExportedOrder.jsp";
	}

	@RequestMapping(value = "/sendworker.do", method = RequestMethod.GET)
	public String sendGet(HttpServletRequest request) {
		solerWorkerService.sendGet(request);
		return "/jsp/SolerWorker/SendWorker.jsp";
	}

	@RequestMapping(value = "/getorders.do", method = RequestMethod.POST)
	public String getOrders(Integer state, HttpServletRequest request) {
		SolerWorker worker = (SolerWorker) request.getSession().getAttribute("solerWorker");
		solerWorkerService.getOrders(state, worker, request);
		return "/jsp/SolerWorker/SendWorker.jsp";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginPost(SolerWorker solerWorker, HttpServletRequest request) {
		Integer type = solerWorkerService.loginPost(solerWorker, request);
		if (type == 1) {
			return "redirect:packworker.do";
		} else if (type == 2) {
			return "redirect:sendworker.do";
		}
		return "/jsp/SolerWorker/login.jsp";
	}

}
