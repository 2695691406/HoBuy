/***********************************************************************
 * Module:  Index_productDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Index_product
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

import hobuy.domain.Index_product;
import hobuy.domain.Index_productPK;
import hobuy.domain.dao.Index_productDao;

/**
 * Class that implements methods of Index_productDao interface
 *
 */
@Repository
public class Index_productDaoImpl extends HibernateDaoImpl implements Index_productDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#save(hobuy.domain.Index_product)
	 */
	public Serializable save(Index_product index_productObject) throws DaoException {
		return super.save(index_productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#load(hobuy.domain.Index_productPK)
	 */
	public Index_product load(Index_productPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Integer(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Index_product.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Index_product) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#delete(hobuy.domain.Index_product)
	 */
	public void delete(Index_product index_productObject) throws DaoException {
		super.delete(index_productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#update(hobuy.domain.Index_product)
	 */
	public void update(Index_product index_productObject) throws DaoException {
		super.update(index_productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#saveOrUpdate(hobuy.domain.
	 * Index_product)
	 */
	public void saveOrUpdate(Index_product index_productObject) throws DaoException {
		super.saveOrUpdate(index_productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Index_product)
	 */
	public List queryByExample(Index_product index_productObject) throws DaoException {
		return super.queryByExample(Index_product.class, index_productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#getIndex_productList()
	 */
	public List getIndex_productList() throws DaoException {
		return super.loadAll(Index_product.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#getIndex_productList(int, int)
	 */
	public List getIndex_productList(int firstResult, int maxResult) {
		return super.loadAll(Index_product.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByStartdate(java.util.Date)
	 */
	public List findByStartdate(java.util.Date startdate) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("startdate", startdate));
		return super.findByCriterions(Index_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByStartdate(java.util.Date,
	 * int, int)
	 */
	public List findByStartdate(java.util.Date startdate, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("startdate", startdate));
		return super.findByCriterions(Index_product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByEnddate(java.util.Date)
	 */
	public List findByEnddate(java.util.Date enddate) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("enddate", enddate));
		return super.findByCriterions(Index_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByEnddate(java.util.Date, int,
	 * int)
	 */
	public List findByEnddate(java.util.Date enddate, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("enddate", enddate));
		return super.findByCriterions(Index_product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByImgurl(java.lang.String)
	 */
	public List findByImgurl(java.lang.String imgurl) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("imgurl", imgurl));
		return super.findByCriterions(Index_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByImgurl(java.lang.String,
	 * int, int)
	 */
	public List findByImgurl(java.lang.String imgurl, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("imgurl", imgurl));
		return super.findByCriterions(Index_product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByCreatetime(java.util.Date)
	 */
	public List findByCreatetime(java.util.Date createtime) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createtime", createtime));
		return super.findByCriterions(Index_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByCreatetime(java.util.Date,
	 * int, int)
	 */
	public List findByCreatetime(java.util.Date createtime, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createtime", createtime));
		return super.findByCriterions(Index_product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Index_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Index_product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByPrice(double)
	 */
	public List findByPrice(double price) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("price", new Double(price)));
		return super.findByCriterions(Index_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByPrice(double, int, int)
	 */
	public List findByPrice(double price, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("price", new Double(price)));
		return super.findByCriterions(Index_product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByIndex_postion(hobuy.domain.
	 * Index_postion)
	 */
	public List findByIndex_postion(hobuy.domain.Index_postion index_postion) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("index_postion", index_postion));
		return super.findByCriterions(Index_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByIndex_postion(hobuy.domain.
	 * Index_postion, int, int)
	 */
	public List findByIndex_postion(hobuy.domain.Index_postion index_postion, int firstResult, int maxResult)
			throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("index_postion", index_postion));
		return super.findByCriterions(Index_product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Index_productDao#findByProduct(hobuy.domain.Product)
	 */
	public List findByProduct(hobuy.domain.Product product) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("product", product));
		return super.findByCriterions(Index_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Index_productDao#findByProduct(hobuy.domain.Product,
	 * int, int)
	 */
	public List findByProduct(hobuy.domain.Product product, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("product", product));
		return super.findByCriterions(Index_product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByWorker(hobuy.domain.Worker)
	 */
	public List findByWorker(hobuy.domain.Worker worker) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("worker", worker));
		return super.findByCriterions(Index_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByWorker(hobuy.domain.Worker,
	 * int, int)
	 */
	public List findByWorker(hobuy.domain.Worker worker, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("worker", worker));
		return super.findByCriterions(Index_product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByUniversity(hobuy.domain.
	 * University)
	 */
	public List findByUniversity(hobuy.domain.University university) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("university", university));
		return super.findByCriterions(Index_product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_productDao#findByUniversity(hobuy.domain.
	 * University, int, int)
	 */
	public List findByUniversity(hobuy.domain.University university, int firstResult, int maxResult)
			throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("university", university));
		return super.findByCriterions(Index_product.class, cs, firstResult, maxResult);
	}
}