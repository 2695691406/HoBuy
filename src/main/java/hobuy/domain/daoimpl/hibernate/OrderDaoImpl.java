/***********************************************************************
 * Module:  OrderDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Order
 ***********************************************************************/

package hobuy.domain.daoimpl.hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;

import hobuy.domain.Order;
import hobuy.domain.OrderPK;
import hobuy.domain.dao.OrderDao;

/**
 * Class that implements methods of OrderDao interface
 *
 */
@Repository
public class OrderDaoImpl extends HibernateDaoImpl implements OrderDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#save(hobuy.domain.Order)
	 */
	public Serializable save(Order orderObject) throws DaoException {
		return super.save(orderObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#load(hobuy.domain.OrderPK)
	 */
	public Order load(OrderPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Order.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Order) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#delete(hobuy.domain.Order)
	 */
	public void delete(Order orderObject) throws DaoException {
		super.delete(orderObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#update(hobuy.domain.Order)
	 */
	public void update(Order orderObject) throws DaoException {
		super.update(orderObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#saveOrUpdate(hobuy.domain.Order)
	 */
	public void saveOrUpdate(Order orderObject) throws DaoException {
		super.saveOrUpdate(orderObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Order)
	 */
	public List queryByExample(Order orderObject) throws DaoException {
		return super.queryByExample(Order.class, orderObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#getOrderList()
	 */
	public List getOrderList() throws DaoException {
		return super.loadAll(Order.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#getOrderList(int, int)
	 */
	public List getOrderList(int firstResult, int maxResult) {
		return super.loadAll(Order.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByPrice(double)
	 */
	public List findByPrice(double price) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("price", new Double(price)));
		return super.findByCriterions(Order.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByPrice(double, int, int)
	 */
	public List findByPrice(double price, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("price", new Double(price)));
		return super.findByCriterions(Order.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByCouriernum(java.lang.String)
	 */
	public List findByCouriernum(java.lang.String couriernum) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("couriernum", couriernum));
		return super.findByCriterions(Order.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByCouriernum(java.lang.String, int,
	 * int)
	 */
	public List findByCouriernum(java.lang.String couriernum, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("couriernum", couriernum));
		return super.findByCriterions(Order.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByCreatetime(java.util.Date)
	 */
	public List findByCreatetime(java.util.Date createtime) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createtime", createtime));
		return super.findByCriterions(Order.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByCreatetime(java.util.Date, int, int)
	 */
	public List findByCreatetime(java.util.Date createtime, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createtime", createtime));
		return super.findByCriterions(Order.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByType(int)
	 */
	public List findByType(int type) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("type", new Integer(type)));
		return super.findByCriterions(Order.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByType(int, int, int)
	 */
	public List findByType(int type, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("type", new Integer(type)));
		return super.findByCriterions(Order.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Order.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Order.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByPrintstate(byte)
	 */
	public List findByPrintstate(byte printstate) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("printstate", new Byte(printstate)));
		return super.findByCriterions(Order.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByPrintstate(byte, int, int)
	 */
	public List findByPrintstate(byte printstate, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("printstate", new Byte(printstate)));
		return super.findByCriterions(Order.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByUser(hobuy.domain.User)
	 */
	public List findByUser(hobuy.domain.User user) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("user", user));
		return super.findByCriterions(Order.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByUser(hobuy.domain.User, int, int)
	 */
	public List findByUser(hobuy.domain.User user, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("user", user));
		return super.findByCriterions(Order.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByAddress(hobuy.domain.Address)
	 */
	public List findByAddress(hobuy.domain.Address address) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("address", address));
		return super.findByCriterions(Order.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findByAddress(hobuy.domain.Address, int,
	 * int)
	 */
	public List findByAddress(hobuy.domain.Address address, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("address", address));
		return super.findByCriterions(Order.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findBySoler(hobuy.domain.Soler)
	 */
	public List findBySoler(hobuy.domain.Soler soler) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(Order.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.OrderDao#findBySoler(hobuy.domain.Soler, int, int)
	 */
	public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(Order.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.OrderDao#findBySolerWorker(hobuy.domain.SolerWorker)
	 */
	public List findBySolerWorker(hobuy.domain.SolerWorker solerWorker) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("solerWorker", solerWorker));
		return super.findByCriterions(Order.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.OrderDao#findBySolerWorker(hobuy.domain.SolerWorker,
	 * int, int)
	 */
	public List findBySolerWorker(hobuy.domain.SolerWorker solerWorker, int firstResult, int maxResult)
			throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("solerWorker", solerWorker));
		return super.findByCriterions(Order.class, cs, firstResult, maxResult);
	}

	public List findBySoler(hobuy.domain.Soler soler, int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Order.class, cs, firstResult, maxResult);
	}

}