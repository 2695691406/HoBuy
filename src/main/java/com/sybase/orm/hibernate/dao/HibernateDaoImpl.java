/***********************************************************************
 * Module:  HibernateDaoImpl.java
 * Author:  ZD
 * Purpose: Defines implementation class of HibernateDao interface
 ***********************************************************************/

package com.sybase.orm.hibernate.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sybase.orm.dao.DaoException;

/**
 * Class that implements <Code>HibernateDao</Code> interface.
 *
 */
public class HibernateDaoImpl extends HibernateDaoSupport {

	private Log log = LogFactory.getLog(HibernateDaoImpl.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#update(java.lang.Object)
	 */
	public void update(Object persistentObject) throws DaoException {
		try {
			Session session = this.getSessionFactory().getCurrentSession();
			session.update(persistentObject);
		} catch (HibernateException ex) {
			log.error("Fail to update", ex);
			throw new DaoException("Fail to update", ex);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#delete(java.lang.Object)
	 */
	public void delete(Object persistentObject) throws DaoException {
		try {
			Session session = this.getSessionFactory().getCurrentSession();
			session.delete(persistentObject);
		} catch (HibernateException ex) {
			log.error("Fail to delete", ex);
			throw new DaoException("Fail tlo delete", ex);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#queryByExample(java.lang.Class,
	 * java.lang.Object)
	 */
	public List queryByExample(Class clazz, Object persistentObject) throws DaoException {
		List objs = new ArrayList();

		try {
			Session session = this.getSessionFactory().getCurrentSession();
			objs = session.createCriteria(clazz).add(Example.create(persistentObject)).list();

		} catch (HibernateException ex) {

			log.error("Fail to find all  objects", ex);
			throw new DaoException("Fail to find all  objects", ex);
		}

		return objs;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#findAll(java.lang.Class)
	 */
	public List findAll(Class clazz) throws DaoException {
		List objs = new ArrayList();

		try {
			Session session = this.getSessionFactory().getCurrentSession();
			objs = session.createCriteria(clazz).list();

		} catch (HibernateException ex) {

			log.error("Fail to find all  objects", ex);
			throw new DaoException("Fail to find all  objects", ex);
		}

		return objs;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#update(java.lang.Class,
	 * org.hibernate.criterion.Criterion)
	 */
	public List findByProperty(Class clazz, Criterion restriction) throws DaoException {
		List objs = new ArrayList();

		try {
			Session session = this.getSessionFactory().getCurrentSession();
			objs = session.createCriteria(clazz).add(restriction).list();

		} catch (HibernateException ex) {

			log.error("Fail to find objects by property", ex);
			throw new DaoException("Fail to find objects by property", ex);
		}

		return objs;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#findByCriterions(java.lang.
	 * Class, java.util.List)
	 */
	public List findByCriterions(Class clazz, List restrictions) throws DaoException {
		List objs = new ArrayList();

		try {
			Session session = this.getSessionFactory().getCurrentSession();
			Criteria criteria = session.createCriteria(clazz);
			Iterator it = restrictions.iterator();
			while (it.hasNext())
				criteria.add((Criterion) it.next());
			objs = criteria.list();

		} catch (HibernateException ex) {

			log.error("Fail to find objects by criterions", ex);
			throw new DaoException("Fail to find objects by criterions", ex);
		}

		return objs;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#findByCriterions(java.lang.
	 * Class, java.util.List,int,int)
	 */
	public List findByCriterions(Class clazz, List restrictions, int firstResult, int maxResult) throws DaoException {
		List objs = new ArrayList();

		try {
			Session session = this.getSessionFactory().getCurrentSession();
			Criteria criteria = session.createCriteria(clazz).setFirstResult(firstResult).setMaxResults(maxResult);
			Iterator it = restrictions.iterator();
			while (it.hasNext())
				criteria.add((Criterion) it.next());
			objs = criteria.list();

		} catch (HibernateException ex) {

			log.error("Fail to find objects by criterions", ex);
			throw new DaoException("Fail to find objects by criterions", ex);
		}

		return objs;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#findBySQLQuery(java.lang.
	 * String, java.lang.String, java.lang.Class)
	 */
	public List findBySQLQuery(String sqlQuery, String aliasName, Class clazz) throws DaoException {
		List result = new ArrayList();
		try {
			Session session = this.getSessionFactory().getCurrentSession();
			result = session.createSQLQuery(sqlQuery).addEntity(aliasName, clazz).list();

		} catch (HibernateException ex) {

			log.error("Fail to execute query", ex);
			throw new DaoException("Fail to execute query", ex);
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#findByHQLQuery(java.lang.
	 * String)
	 */
	public List findByHQLQuery(String hqlQuery) throws DaoException {
		List result = new ArrayList();
		try {
			Session session = this.getSessionFactory().getCurrentSession();
			result = session.createQuery(hqlQuery).list();

		} catch (HibernateException ex) {

			log.error("Fail to execute query", ex);
			throw new DaoException("Fail to execute query", ex);
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#findByNamedParam(java.lang.
	 * String, java.lang.String,java.lang.Object)
	 */
	public List findByNamedParam(String queryString, String paramName, Object value) throws DaoException {
		return findByNamedParam(queryString, new String[] { paramName }, new Object[] { value });
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#findByNamedParam(java.lang.
	 * String, java.lang.String, java.lang.Object, int, int)
	 */
	public List findByNamedParam(String queryString, String paramName, Object value, int firstResult, int maxResult)
			throws DaoException {
		return findByNamedParam(queryString, new String[] { paramName }, new Object[] { value }, firstResult,
				maxResult);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#findByNamedParam(java.lang.
	 * String, java.lang.String[], java.lang.Object[])
	 */
	public List findByNamedParam(final String queryString, final String[] paramNames, final Object[] values)
			throws DaoException {
		try {
			if (paramNames.length != values.length) {
				throw new IllegalArgumentException("Length of paramNames array must match length of values array");
			}
			Session session = this.getSessionFactory().getCurrentSession();
			//
			Query queryObject = session.createQuery(queryString);

			if (values != null) {
				for (int i = 0; i < values.length; i++) {
					applyNamedParameterToQuery(queryObject, paramNames[i], values[i]);
				}
			}

			return queryObject.list();
			//
			//
		} catch (HibernateException ex) {
			log.error("Fail to find", ex);
			throw new DaoException("Fail to find", ex);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#findByNamedParam(java.lang.
	 * String,java.lang.String[], java.lang.Object[], int, int)
	 */
	public List findByNamedParam(final String queryString, final String[] paramNames, final Object[] values,
			final int firstResult, final int maxResult) throws DaoException {
		if (paramNames.length != values.length) {
			throw new IllegalArgumentException("Length of paramNames array must match length of values array");
		}
		try {
			Session session = this.getSessionFactory().getCurrentSession();
			Query queryObject = session.createQuery(queryString);
			queryObject.setFirstResult(firstResult);
			queryObject.setMaxResults(maxResult);

			if (values != null) {
				for (int i = 0; i < values.length; i++) {
					applyNamedParameterToQuery(queryObject, paramNames[i], values[i]);
				}
			}
			return queryObject.list();
		} catch (HibernateException ex) {
			log.error("Fail to find by named param");
			throw new DaoException("Fail to find by named param", ex);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#findByValueBean(java.lang.
	 * String, java.lang.Object)
	 */
	public List findByValueBean(final String queryString, final Object valueBean) throws DaoException {
		Session session = this.getSessionFactory().getCurrentSession();
		try {
			Query queryObject = session.createQuery(queryString);

			queryObject.setProperties(valueBean);
			return queryObject.list();
		} catch (HibernateException ex) {
			log.error("Fail to find by valueBean", ex);
			throw new DaoException("Fail to find by valueBeam", ex);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#findByNamedQuery(java.lang.
	 * String)
	 */
	public List findByNamedQuery(String queryName) throws DaoException {
		return findByNamedQuery(queryName, (Object[]) null);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#findByNamedQuery(java.lang.
	 * String, java.lang.Object)
	 */
	public List findByNamedQuery(String queryName, Object value) throws DaoException {
		return findByNamedQuery(queryName, new Object[] { value });
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#findByNamedQuery(java.lang.
	 * String, java.lang.Object[])
	 */
	public List findByNamedQuery(final String queryName, final Object[] values) throws DaoException {
		Session session = this.getSessionFactory().getCurrentSession();
		try {
			Query queryObject = session.getNamedQuery(queryName);

			if (values != null) {
				for (int i = 0; i < values.length; i++) {
					queryObject.setParameter(i, values[i]);
				}
			}
			return queryObject.list();
		} catch (HibernateException ex) {
			log.error("Fail to find by Named query", ex);
			throw new DaoException("Fail to find by Named query", ex);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#findByNamedQueryAndNamedParam(
	 * java.lang.String, java.lang.String, java.lang.Object)
	 */
	public List findByNamedQueryAndNamedParam(String queryName, String paramName, Object value) throws DaoException {
		return findByNamedQueryAndNamedParam(queryName, new String[] { paramName }, new Object[] { value });
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#findByNamedQueryAndNamedParam(
	 * java.lang.String, java.lang.String[], java.lang.Object[])
	 */
	public List findByNamedQueryAndNamedParam(final String queryName, final String[] paramNames, final Object[] values)
			throws DaoException {
		if (paramNames != null && values != null && paramNames.length != values.length) {
			throw new IllegalArgumentException("Length of paramNames array must match length of values array");
		}
		Session session = this.getSessionFactory().getCurrentSession();
		try {
			Query queryObject = session.getNamedQuery(queryName);

			if (values != null) {
				for (int i = 0; i < values.length; i++) {
					applyNamedParameterToQuery(queryObject, paramNames[i], values[i]);
				}
			}
			return queryObject.list();
		} catch (HibernateException ex) {
			log.error("Fail to find by Named query and Named Param", ex);
			throw new DaoException("Fail to find by Named query and Named Param", ex);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#findByNamedQueryAndValueBean(
	 * java.lang.String, java.lang.Object)
	 */
	public List findByNamedQueryAndValueBean(final String queryName, final Object valueBean) throws DaoException {
		Session session = this.getSessionFactory().getCurrentSession();
		try {
			Query queryObject = session.getNamedQuery(queryName);

			queryObject.setProperties(valueBean);
			return queryObject.list();
		} catch (HibernateException ex) {
			log.error("Fail to find by Named query and value bean", ex);
			throw new DaoException("Fail to find by Named query and value bean", ex);
		}

	}

	/**
	 * Apply parameter value to query parameter
	 *
	 * @param queryObject
	 * @param paramName
	 * @param value
	 * @throws HibernateException
	 */
	protected void applyNamedParameterToQuery(Query queryObject, String paramName, Object value)
			throws HibernateException {
		if (value instanceof Collection) {
			queryObject.setParameterList(paramName, (Collection) value);
		} else if (value instanceof Object[]) {
			queryObject.setParameterList(paramName, (Object[]) value);
		} else {
			queryObject.setParameter(paramName, value);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#save(java.lang.Object)
	 */
	public Serializable save(Object persistentObject) throws DaoException {
		try {
			Session session = this.getSessionFactory().getCurrentSession();
			Serializable id = session.save(persistentObject);

			return id;
		} catch (HibernateException ex) {
			log.error("Fail to save persistentObject", ex);
			throw new DaoException("Fail to save persistentObject", ex);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sybase.orm.hibernate.dao.HibernateDao#saveOrUpdate(java.lang.Object)
	 */
	public void saveOrUpdate(Object persistentObject) throws DaoException {
		try {
			Session session = this.getSessionFactory().getCurrentSession();
			session.saveOrUpdate(persistentObject);

		} catch (HibernateException ex) {
			log.error("Fail to save or update persistentObject", ex);
			throw new DaoException("Fail to save or update persistentObject", ex);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#find(java.lang.String,
	 * int, int)
	 */
	public List find(String queryString, int firstResult, int maxResult) throws DaoException {
		return find(queryString, (Object[]) null, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#find(java.lang.String)
	 */
	public List find(String queryString) throws DaoException {
		return find(queryString, (Object[]) null);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#find(java.lang.String,
	 * java.lang.Object)
	 */
	public List find(String queryString, Object value) throws DaoException {
		return find(queryString, new Object[] { value });
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#find(java.lang.String,
	 * java.lang.Object[])
	 */
	public List find(final String queryString, final Object[] values) throws DaoException {
		Session session = this.getSessionFactory().getCurrentSession();
		try {
			Query queryObject = session.createQuery(queryString);

			if (values != null) {
				for (int i = 0; i < values.length; i++) {
					queryObject.setParameter(i, values[i]);
				}
			}
			return queryObject.list();
		} catch (HibernateException ex) {
			log.error("Fail to find by query string", ex);
			throw new DaoException("Fail to find by query string", ex);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#find(java.lang.String,
	 * java.lang.Object[], int, int)
	 */
	public List find(final String queryString, final Object[] values, final int firstResult, final int maxResult)
			throws DaoException {
		Session session = this.getSessionFactory().getCurrentSession();
		try {
			Query queryObject = session.createQuery(queryString).setFirstResult(firstResult).setMaxResults(maxResult);
			if (values != null) {
				for (int i = 0; i < values.length; i++) {
					queryObject.setParameter(i, values[i]);
				}
			}
			return queryObject.list();
		} catch (HibernateException ex) {
			log.error("Fail to find by query string", ex);
			throw new DaoException("Fail to find by query string", ex);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#loadAll(java.lang.Class)
	 */
	public List loadAll(final Class entityClass) throws DaoException {

		try {
			Session session = this.getSessionFactory().getCurrentSession();
			Criteria criteria = session.createCriteria(entityClass);
			return criteria.list();
		} catch (HibernateException ex) {
			log.error("Fail to load all ", ex);
			throw new DaoException("Fail to load all", ex);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sybase.orm.hibernate.dao.HibernateDao#loadAll(java.lang.Class,
	 * int, int)
	 */
	public List loadAll(final Class entityClass, final int firstResult, final int maxResult) throws DaoException {

		try {
			Session session = this.getSessionFactory().getCurrentSession();
			Criteria criteria = session.createCriteria(entityClass).setFirstResult(firstResult)
					.setMaxResults(maxResult);
			return criteria.list();
		} catch (HibernateException ex) {
			log.error("Fail to load all ", ex);
			throw new DaoException("Fail to load all", ex);
		}

	}
}