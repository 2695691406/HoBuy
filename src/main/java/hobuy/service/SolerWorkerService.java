package hobuy.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hobuy.domain.Order;
import hobuy.domain.OrderPK;
import hobuy.domain.Soler;
import hobuy.domain.SolerWorker;
import hobuy.domain.SolerWorkerPK;
import hobuy.domain.dao.ClazzDao;
import hobuy.domain.dao.OrderDao;
import hobuy.domain.dao.ProductDao;
import hobuy.domain.dao.SolerDao;
import hobuy.domain.dao.SolerWorkerDao;
import hobuy.service.utils.OrderType;

@Service("solerWorkerService")
public class SolerWorkerService {
	@Autowired
	ProductDao productDaoImpl;
	@Autowired
	ClazzDao clazzDaoImpl;
	@Autowired
	private SolerWorkerDao solerWorkerDaoImpl;
	@Autowired
	private SolerDao solerDaoImpl;
	@Autowired
	private OrderDao orderDaoImple;

	public Integer loginPost(SolerWorker solerWorker, HttpServletRequest request) {
		// TODO Auto-generated method stub
		SolerWorker solerWorkerRL = solerWorkerDaoImpl.load(new SolerWorkerPK(solerWorker.getId()));
		if (solerWorkerRL == null || !solerWorkerRL.getAccount().equals(solerWorker.getAccount())
				|| solerWorkerRL.getState() == 0) {
			return 0;
		} else {
			if (solerWorkerRL.getType() == 1) {
				request.getSession().setAttribute("solerWorker", solerWorkerRL);
				return 1;
			} else if (solerWorkerRL.getType() == 2) {
				request.getSession().setAttribute("solerWorker", solerWorkerRL);
				return 2;
			}
			return -1;
		}
	}

	public void accpetOrder(HttpServletRequest request) {
		// TODO Auto-generated method stub
		SolerWorker packworker = (SolerWorker) request.getSession().getAttribute("solerWorker");
		if (packworker.getType() != 1) {
			return;
		}
		packworker = solerWorkerDaoImpl.load(new SolerWorkerPK(packworker.getId()));
		Soler soler = packworker.getSoler();
		List<Order> orders = orderDaoImple.findBySoler(soler, 0, 20);
		request.setAttribute("orders", orders);
	}

	public void sendGet(HttpServletRequest request) {
		// TODO Auto-generated method stub
		SolerWorker sendworker = (SolerWorker) request.getSession().getAttribute("solerWorker");
		if (sendworker.getType() != 2) {
			return;
		}
		sendworker = solerWorkerDaoImpl.load(new SolerWorkerPK(sendworker.getId()));
		Soler soler = sendworker.getSoler();
		List<Order> orders = orderDaoImple.findBySoler(soler, 16, 0, 20);
		request.setAttribute("orders", orders);
	}

	public void getOrders(Integer state, SolerWorker worker, HttpServletRequest request) {
		// TODO Auto-generated method stub
		worker = solerWorkerDaoImpl.load(new SolerWorkerPK(worker.getId()));
		Soler soler = worker.getSoler();
		List<Order> orders = orderDaoImple.findBySoler(soler, state, 0, 20);
	}

	public void exportingOrder(HttpServletRequest request) {
		// TODO Auto-generated method stub
		SolerWorker packworker = (SolerWorker) request.getSession().getAttribute("solerWorker");
		if (packworker.getType() != 1) {
			return;
		}
		packworker = solerWorkerDaoImpl.load(new SolerWorkerPK(packworker.getId()));
		Soler soler = packworker.getSoler();
		List<Order> orders = orderDaoImple.findBySoler(soler, 0, 20);
		request.setAttribute("orders", orders);
	}

	public void exportedOrder(HttpServletRequest request) {
		// TODO Auto-generated method stub
		SolerWorker packworker = (SolerWorker) request.getSession().getAttribute("solerWorker");
		if (packworker.getType() != 1) {
			return;
		}
		packworker = solerWorkerDaoImpl.load(new SolerWorkerPK(packworker.getId()));
		Soler soler = packworker.getSoler();
		List<Order> orders = orderDaoImple.findBySoler(soler, 0, 20);
		request.setAttribute("orders", orders);
	}

	public void accpetOrderPost(Long oid, SolerWorker solerWorker, HttpServletRequest request) {
		// TODO Auto-generated method stub
		Order order = orderDaoImple.load(new OrderPK(oid));
		order.setSolerWorker(solerWorker);
		order.setState(OrderType.ORDER_ACCEPT.getValue());
	}

}
