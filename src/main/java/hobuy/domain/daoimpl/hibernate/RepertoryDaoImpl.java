/***********************************************************************
 * Module:  RepertoryDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Repertory
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

import hobuy.domain.Repertory;
import hobuy.domain.RepertoryPK;
import hobuy.domain.dao.RepertoryDao;

/**
 * Class that implements methods of RepertoryDao interface
 *
 */
@Repository
public class RepertoryDaoImpl extends HibernateDaoImpl implements RepertoryDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#save(hobuy.domain.Repertory)
	 */
	public Serializable save(Repertory repertoryObject) throws DaoException {
		return super.save(repertoryObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#load(hobuy.domain.RepertoryPK)
	 */
	public Repertory load(RepertoryPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Repertory.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Repertory) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#delete(hobuy.domain.Repertory)
	 */
	public void delete(Repertory repertoryObject) throws DaoException {
		super.delete(repertoryObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#update(hobuy.domain.Repertory)
	 */
	public void update(Repertory repertoryObject) throws DaoException {
		super.update(repertoryObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#saveOrUpdate(hobuy.domain.Repertory)
	 */
	public void saveOrUpdate(Repertory repertoryObject) throws DaoException {
		super.saveOrUpdate(repertoryObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Repertory)
	 */
	public List queryByExample(Repertory repertoryObject) throws DaoException {
		return super.queryByExample(Repertory.class, repertoryObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#getRepertoryList()
	 */
	public List getRepertoryList() throws DaoException {
		return super.loadAll(Repertory.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#getRepertoryList(int, int)
	 */
	public List getRepertoryList(int firstResult, int maxResult) {
		return super.loadAll(Repertory.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByPro1(java.lang.String)
	 */
	public List findByPro1(java.lang.String pro1) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pro1", pro1));
		return super.findByCriterions(Repertory.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByPro1(java.lang.String, int, int)
	 */
	public List findByPro1(java.lang.String pro1, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pro1", pro1));
		return super.findByCriterions(Repertory.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByPro2(java.lang.String)
	 */
	public List findByPro2(java.lang.String pro2) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pro2", pro2));
		return super.findByCriterions(Repertory.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByPro2(java.lang.String, int, int)
	 */
	public List findByPro2(java.lang.String pro2, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pro2", pro2));
		return super.findByCriterions(Repertory.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByPro3(java.lang.String)
	 */
	public List findByPro3(java.lang.String pro3) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pro3", pro3));
		return super.findByCriterions(Repertory.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByPro3(java.lang.String, int, int)
	 */
	public List findByPro3(java.lang.String pro3, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pro3", pro3));
		return super.findByCriterions(Repertory.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByBid(double)
	 */
	public List findByBid(double bid) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("bid", new Double(bid)));
		return super.findByCriterions(Repertory.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByBid(double, int, int)
	 */
	public List findByBid(double bid, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("bid", new Double(bid)));
		return super.findByCriterions(Repertory.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByPrice(double)
	 */
	public List findByPrice(double price) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("price", new Double(price)));
		return super.findByCriterions(Repertory.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByPrice(double, int, int)
	 */
	public List findByPrice(double price, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("price", new Double(price)));
		return super.findByCriterions(Repertory.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findBySole_number(int)
	 */
	public List findBySole_number(int sole_number) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("sole_number", new Integer(sole_number)));
		return super.findByCriterions(Repertory.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findBySole_number(int, int, int)
	 */
	public List findBySole_number(int sole_number, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("sole_number", new Integer(sole_number)));
		return super.findByCriterions(Repertory.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByRepertory_nubmer(int)
	 */
	public List findByRepertory_nubmer(int repertory_nubmer) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("repertory_nubmer", new Integer(repertory_nubmer)));
		return super.findByCriterions(Repertory.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByRepertory_nubmer(int, int, int)
	 */
	public List findByRepertory_nubmer(int repertory_nubmer, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("repertory_nubmer", new Integer(repertory_nubmer)));
		return super.findByCriterions(Repertory.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Repertory.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Repertory.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByImgurl(java.lang.String)
	 */
	public List findByImgurl(java.lang.String imgurl) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("imgurl", imgurl));
		return super.findByCriterions(Repertory.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByImgurl(java.lang.String, int,
	 * int)
	 */
	public List findByImgurl(java.lang.String imgurl, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("imgurl", imgurl));
		return super.findByCriterions(Repertory.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByProduct(hobuy.domain.Product)
	 */
	public List findByProduct(hobuy.domain.Product product) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("product", product));
		return super.findByCriterions(Repertory.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.RepertoryDao#findByProduct(hobuy.domain.Product,
	 * int, int)
	 */
	public List findByProduct(hobuy.domain.Product product, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("product", product));
		return super.findByCriterions(Repertory.class, cs, firstResult, maxResult);
	}
}