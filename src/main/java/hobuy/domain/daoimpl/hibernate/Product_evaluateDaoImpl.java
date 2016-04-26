/***********************************************************************
 * Module:  Product_evaluateDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Product_evaluate
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

import hobuy.domain.Product_evaluate;
import hobuy.domain.Product_evaluatePK;
import hobuy.domain.dao.Product_evaluateDao;

/**
 * Class that implements methods of Product_evaluateDao interface
 *
 */
@Repository
public class Product_evaluateDaoImpl extends HibernateDaoImpl implements Product_evaluateDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Product_evaluateDao#save(hobuy.domain.Product_evaluate)
	 */
	public Serializable save(Product_evaluate product_evaluateObject) throws DaoException {
		return super.save(product_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#load(hobuy.domain.
	 * Product_evaluatePK)
	 */
	public Product_evaluate load(Product_evaluatePK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Product_evaluate.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Product_evaluate) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#delete(hobuy.domain.
	 * Product_evaluate)
	 */
	public void delete(Product_evaluate product_evaluateObject) throws DaoException {
		super.delete(product_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#update(hobuy.domain.
	 * Product_evaluate)
	 */
	public void update(Product_evaluate product_evaluateObject) throws DaoException {
		super.update(product_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#saveOrUpdate(hobuy.domain.
	 * Product_evaluate)
	 */
	public void saveOrUpdate(Product_evaluate product_evaluateObject) throws DaoException {
		super.saveOrUpdate(product_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Product_evaluate)
	 */
	public List queryByExample(Product_evaluate product_evaluateObject) throws DaoException {
		return super.queryByExample(Product_evaluate.class, product_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#getProduct_evaluateList()
	 */
	public List getProduct_evaluateList() throws DaoException {
		return super.loadAll(Product_evaluate.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#getProduct_evaluateList(int,
	 * int)
	 */
	public List getProduct_evaluateList(int firstResult, int maxResult) {
		return super.loadAll(Product_evaluate.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#findByOrder_id(long)
	 */
	public List findByOrder_id(long order_id) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("order_id", new Long(order_id)));
		return super.findByCriterions(Product_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#findByOrder_id(long, int, int)
	 */
	public List findByOrder_id(long order_id, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("order_id", new Long(order_id)));
		return super.findByCriterions(Product_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#findByTime(java.util.Date)
	 */
	public List findByTime(java.util.Date time) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("time", time));
		return super.findByCriterions(Product_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#findByTime(java.util.Date, int,
	 * int)
	 */
	public List findByTime(java.util.Date time, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("time", time));
		return super.findByCriterions(Product_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#findByContent(java.lang.String)
	 */
	public List findByContent(java.lang.String content) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("content", content));
		return super.findByCriterions(Product_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#findByContent(java.lang.String,
	 * int, int)
	 */
	public List findByContent(java.lang.String content, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("content", content));
		return super.findByCriterions(Product_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#findByEvaluate_level(int)
	 */
	public List findByEvaluate_level(int evaluate_level) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("evaluate_level", new Integer(evaluate_level)));
		return super.findByCriterions(Product_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#findByEvaluate_level(int, int,
	 * int)
	 */
	public List findByEvaluate_level(int evaluate_level, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("evaluate_level", new Integer(evaluate_level)));
		return super.findByCriterions(Product_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Product_evaluateDao#findByProduct(hobuy.domain.Product)
	 */
	public List findByProduct(hobuy.domain.Product product) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("product", product));
		return super.findByCriterions(Product_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Product_evaluateDao#findByProduct(hobuy.domain.Product,
	 * int, int)
	 */
	public List findByProduct(hobuy.domain.Product product, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("product", product));
		return super.findByCriterions(Product_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#findByUser(hobuy.domain.User)
	 */
	public List findByUser(hobuy.domain.User user) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("user", user));
		return super.findByCriterions(Product_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Product_evaluateDao#findByUser(hobuy.domain.User,
	 * int, int)
	 */
	public List findByUser(hobuy.domain.User user, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("user", user));
		return super.findByCriterions(Product_evaluate.class, cs, firstResult, maxResult);
	}
}