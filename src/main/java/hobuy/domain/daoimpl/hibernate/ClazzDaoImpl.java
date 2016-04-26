/***********************************************************************
 * Module:  ClazzDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Clazz
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

import hobuy.domain.Clazz;
import hobuy.domain.ClazzPK;
import hobuy.domain.dao.ClazzDao;

/**
 * Class that implements methods of ClazzDao interface
 *
 */
@Repository
public class ClazzDaoImpl extends HibernateDaoImpl implements ClazzDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#save(hobuy.domain.Clazz)
	 */
	public Serializable save(Clazz clazzObject) throws DaoException {
		return super.save(clazzObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#load(hobuy.domain.ClazzPK)
	 */
	public Clazz load(ClazzPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Clazz.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Clazz) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#delete(hobuy.domain.Clazz)
	 */
	public void delete(Clazz clazzObject) throws DaoException {
		super.delete(clazzObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#update(hobuy.domain.Clazz)
	 */
	public void update(Clazz clazzObject) throws DaoException {
		super.update(clazzObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#saveOrUpdate(hobuy.domain.Clazz)
	 */
	public void saveOrUpdate(Clazz clazzObject) throws DaoException {
		super.saveOrUpdate(clazzObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Clazz)
	 */
	public List queryByExample(Clazz clazzObject) throws DaoException {
		return super.queryByExample(Clazz.class, clazzObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#getClazzList()
	 */
	public List getClazzList() throws DaoException {
		return super.loadAll(Clazz.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#getClazzList(int, int)
	 */
	public List getClazzList(int firstResult, int maxResult) {
		return super.loadAll(Clazz.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#findByType(int)
	 */
	public List findByType(int type) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("type", new Integer(type)));
		return super.findByCriterions(Clazz.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#findByType(int, int, int)
	 */
	public List findByType(int type, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("type", new Integer(type)));
		return super.findByCriterions(Clazz.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Clazz.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#findByName(java.lang.String, int, int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Clazz.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#findByParent_id(int)
	 */
	public List findByParent_id(int parent_id) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("parent_id", new Integer(parent_id)));
		return super.findByCriterions(Clazz.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#findByParent_id(int, int, int)
	 */
	public List findByParent_id(int parent_id, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("parent_id", new Integer(parent_id)));
		return super.findByCriterions(Clazz.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Clazz.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ClazzDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Clazz.class, cs, firstResult, maxResult);
	}
}