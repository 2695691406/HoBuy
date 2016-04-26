/***********************************************************************
 * Module:  Index_postionDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Index_postion
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

import hobuy.domain.Index_postion;
import hobuy.domain.Index_postionPK;
import hobuy.domain.dao.Index_postionDao;

/**
 * Class that implements methods of Index_postionDao interface
 *
 */
@Repository
public class Index_postionDaoImpl extends HibernateDaoImpl implements Index_postionDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_postionDao#save(hobuy.domain.Index_postion)
	 */
	public Serializable save(Index_postion index_postionObject) throws DaoException {
		return super.save(index_postionObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_postionDao#load(hobuy.domain.Index_postionPK)
	 */
	public Index_postion load(Index_postionPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Index_postion.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Index_postion) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_postionDao#delete(hobuy.domain.Index_postion)
	 */
	public void delete(Index_postion index_postionObject) throws DaoException {
		super.delete(index_postionObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_postionDao#update(hobuy.domain.Index_postion)
	 */
	public void update(Index_postion index_postionObject) throws DaoException {
		super.update(index_postionObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_postionDao#saveOrUpdate(hobuy.domain.
	 * Index_postion)
	 */
	public void saveOrUpdate(Index_postion index_postionObject) throws DaoException {
		super.saveOrUpdate(index_postionObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_postionDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Index_postion)
	 */
	public List queryByExample(Index_postion index_postionObject) throws DaoException {
		return super.queryByExample(Index_postion.class, index_postionObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_postionDao#getIndex_postionList()
	 */
	public List getIndex_postionList() throws DaoException {
		return super.loadAll(Index_postion.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_postionDao#getIndex_postionList(int, int)
	 */
	public List getIndex_postionList(int firstResult, int maxResult) {
		return super.loadAll(Index_postion.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_postionDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Index_postion.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_postionDao#findByName(java.lang.String, int,
	 * int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Index_postion.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_postionDao#findByIntroduce(java.lang.String)
	 */
	public List findByIntroduce(java.lang.String introduce) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("introduce", introduce));
		return super.findByCriterions(Index_postion.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Index_postionDao#findByIntroduce(java.lang.String,
	 * int, int)
	 */
	public List findByIntroduce(java.lang.String introduce, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("introduce", introduce));
		return super.findByCriterions(Index_postion.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Index_postionDao#findByPostionname(java.lang.String)
	 */
	public List findByPostionname(java.lang.String postionname) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("postionname", postionname));
		return super.findByCriterions(Index_postion.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Index_postionDao#findByPostionname(java.lang.String,
	 * int, int)
	 */
	public List findByPostionname(java.lang.String postionname, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("postionname", postionname));
		return super.findByCriterions(Index_postion.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Index_postionDao#findByManager(hobuy.domain.Manager)
	 */
	public List findByManager(hobuy.domain.Manager manager) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("manager", manager));
		return super.findByCriterions(Index_postion.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Index_postionDao#findByManager(hobuy.domain.Manager,
	 * int, int)
	 */
	public List findByManager(hobuy.domain.Manager manager, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("manager", manager));
		return super.findByCriterions(Index_postion.class, cs, firstResult, maxResult);
	}
}