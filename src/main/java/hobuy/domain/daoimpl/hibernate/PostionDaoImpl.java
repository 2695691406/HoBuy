/***********************************************************************
 * Module:  PostionDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Postion
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

import hobuy.domain.Postion;
import hobuy.domain.PostionPK;
import hobuy.domain.dao.PostionDao;

/**
 * Class that implements methods of PostionDao interface
 *
 */
@Repository
public class PostionDaoImpl extends HibernateDaoImpl implements PostionDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#save(hobuy.domain.Postion)
	 */
	public Serializable save(Postion postionObject) throws DaoException {
		return super.save(postionObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#load(hobuy.domain.PostionPK)
	 */
	public Postion load(PostionPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Postion.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Postion) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#delete(hobuy.domain.Postion)
	 */
	public void delete(Postion postionObject) throws DaoException {
		super.delete(postionObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#update(hobuy.domain.Postion)
	 */
	public void update(Postion postionObject) throws DaoException {
		super.update(postionObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#saveOrUpdate(hobuy.domain.Postion)
	 */
	public void saveOrUpdate(Postion postionObject) throws DaoException {
		super.saveOrUpdate(postionObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Postion)
	 */
	public List queryByExample(Postion postionObject) throws DaoException {
		return super.queryByExample(Postion.class, postionObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#getPostionList()
	 */
	public List getPostionList() throws DaoException {
		return super.loadAll(Postion.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#getPostionList(int, int)
	 */
	public List getPostionList(int firstResult, int maxResult) {
		return super.loadAll(Postion.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Postion.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#findByName(java.lang.String, int, int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Postion.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#findByCreatedate(java.util.Date)
	 */
	public List findByCreatedate(java.util.Date createdate) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createdate", createdate));
		return super.findByCriterions(Postion.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#findByCreatedate(java.util.Date, int,
	 * int)
	 */
	public List findByCreatedate(java.util.Date createdate, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createdate", createdate));
		return super.findByCriterions(Postion.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#findByCancledate(java.util.Date)
	 */
	public List findByCancledate(java.util.Date cancledate) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("cancledate", cancledate));
		return super.findByCriterions(Postion.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#findByCancledate(java.util.Date, int,
	 * int)
	 */
	public List findByCancledate(java.util.Date cancledate, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("cancledate", cancledate));
		return super.findByCriterions(Postion.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Postion.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Postion.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#findBySalary(double)
	 */
	public List findBySalary(double salary) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("salary", new Double(salary)));
		return super.findByCriterions(Postion.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#findBySalary(double, int, int)
	 */
	public List findBySalary(double salary, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("salary", new Double(salary)));
		return super.findByCriterions(Postion.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#findByManager(hobuy.domain.Manager)
	 */
	public List findByManager(hobuy.domain.Manager manager) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("manager", manager));
		return super.findByCriterions(Postion.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.PostionDao#findByManager(hobuy.domain.Manager, int,
	 * int)
	 */
	public List findByManager(hobuy.domain.Manager manager, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("manager", manager));
		return super.findByCriterions(Postion.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.PostionDao#findBySupermanager(hobuy.domain.Supermanager)
	 */
	public List findBySupermanager(hobuy.domain.Supermanager supermanager) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("supermanager", supermanager));
		return super.findByCriterions(Postion.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.PostionDao#findBySupermanager(hobuy.domain.Supermanager,
	 * int, int)
	 */
	public List findBySupermanager(hobuy.domain.Supermanager supermanager, int firstResult, int maxResult)
			throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("supermanager", supermanager));
		return super.findByCriterions(Postion.class, cs, firstResult, maxResult);
	}
}