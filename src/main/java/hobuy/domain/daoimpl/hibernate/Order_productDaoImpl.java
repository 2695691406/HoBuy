/***********************************************************************
 * Module:  Order_productDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Order_product
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

import hobuy.domain.Order_product;
import hobuy.domain.Order_productPK;
import hobuy.domain.dao.Order_productDao;

/**
 * Class that implements methods of Order_productDao interface
 *
 */
@Repository
public class Order_productDaoImpl extends HibernateDaoImpl implements Order_productDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#save(hobuy.domain.Order_product)
	 */
	public Serializable save(Order_product order_productObject) throws DaoException {
		return super.save(order_productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#load(hobuy.domain.Order_productPK)
	 */
	public Order_product load(Order_productPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Order_product.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Order_product) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#delete(hobuy.domain.Order_product)
	 */
	public void delete(Order_product order_productObject) throws DaoException {
		super.delete(order_productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#update(hobuy.domain.Order_product)
	 */
	public void update(Order_product order_productObject) throws DaoException {
		super.update(order_productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#saveOrUpdate(hobuy.domain.
	 * Order_product)
	 */
	public void saveOrUpdate(Order_product order_productObject) throws DaoException {
		super.saveOrUpdate(order_productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Order_product)
	 */
	public List queryByExample(Order_product order_productObject) throws DaoException {
		return super.queryByExample(Order_product.class, order_productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#getOrder_productList()
	 */
	public List getOrder_productList() throws DaoException {
		return super.loadAll(Order_product.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#getOrder_productList(int, int)
	 */
	public List getOrder_productList(int firstResult, int maxResult) {
		return super.loadAll(Order_product.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#findByPnum(int)
	 */
	public List findByPnum(int pnum) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pnum", new Integer(pnum)));
		return super.findByCriterions(Order_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#findByPnum(int, int, int)
	 */
	public List findByPnum(int pnum, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pnum", new Integer(pnum)));
		return super.findByCriterions(Order_product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#findByPrice(double)
	 */
	public List findByPrice(double price) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("price", new Double(price)));
		return super.findByCriterions(Order_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#findByPrice(double, int, int)
	 */
	public List findByPrice(double price, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("price", new Double(price)));
		return super.findByCriterions(Order_product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#findByOrder(hobuy.domain.Order)
	 */
	public List findByOrder(hobuy.domain.Order order) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("order", order));
		return super.findByCriterions(Order_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Order_productDao#findByOrder(hobuy.domain.Order,
	 * int, int)
	 */
	public List findByOrder(hobuy.domain.Order order, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("order", order));
		return super.findByCriterions(Order_product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Order_productDao#findByRepertory(hobuy.domain.Repertory)
	 */
	public List findByRepertory(hobuy.domain.Repertory repertory) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("repertory", repertory));
		return super.findByCriterions(Order_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Order_productDao#findByRepertory(hobuy.domain.Repertory,
	 * int, int)
	 */
	public List findByRepertory(hobuy.domain.Repertory repertory, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("repertory", repertory));
		return super.findByCriterions(Order_product.class, cs, firstResult, maxResult);
	}
}