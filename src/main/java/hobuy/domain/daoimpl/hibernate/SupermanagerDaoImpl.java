/***********************************************************************
 * Module:  SupermanagerDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Supermanager
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

import hobuy.domain.Supermanager;
import hobuy.domain.SupermanagerPK;
import hobuy.domain.dao.SupermanagerDao;

/**
 * Class that implements methods of SupermanagerDao interface
 *
 */
@Repository
public class SupermanagerDaoImpl extends HibernateDaoImpl implements SupermanagerDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#save(hobuy.domain.Supermanager)
	 */
	public Serializable save(Supermanager supermanagerObject) throws DaoException {
		return super.save(supermanagerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#load(hobuy.domain.SupermanagerPK)
	 */
	public Supermanager load(SupermanagerPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { pk.getId() };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Supermanager.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Supermanager) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#delete(hobuy.domain.Supermanager)
	 */
	public void delete(Supermanager supermanagerObject) throws DaoException {
		super.delete(supermanagerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#update(hobuy.domain.Supermanager)
	 */
	public void update(Supermanager supermanagerObject) throws DaoException {
		super.update(supermanagerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.SupermanagerDao#saveOrUpdate(hobuy.domain.Supermanager)
	 */
	public void saveOrUpdate(Supermanager supermanagerObject) throws DaoException {
		super.saveOrUpdate(supermanagerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Supermanager)
	 */
	public List queryByExample(Supermanager supermanagerObject) throws DaoException {
		return super.queryByExample(Supermanager.class, supermanagerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#getSupermanagerList()
	 */
	public List getSupermanagerList() throws DaoException {
		return super.loadAll(Supermanager.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#getSupermanagerList(int, int)
	 */
	public List getSupermanagerList(int firstResult, int maxResult) {
		return super.loadAll(Supermanager.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Supermanager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByName(java.lang.String, int,
	 * int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Supermanager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByCreatetime(java.util.Date)
	 */
	public List findByCreatetime(java.util.Date createtime) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createtime", createtime));
		return super.findByCriterions(Supermanager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByCreatetime(java.util.Date,
	 * int, int)
	 */
	public List findByCreatetime(java.util.Date createtime, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createtime", createtime));
		return super.findByCriterions(Supermanager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByLeavetime(java.util.Date)
	 */
	public List findByLeavetime(java.util.Date leavetime) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("leavetime", leavetime));
		return super.findByCriterions(Supermanager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByLeavetime(java.util.Date,
	 * int, int)
	 */
	public List findByLeavetime(java.util.Date leavetime, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("leavetime", leavetime));
		return super.findByCriterions(Supermanager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByLevel(int)
	 */
	public List findByLevel(int level) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("level", new Integer(level)));
		return super.findByCriterions(Supermanager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByLevel(int, int, int)
	 */
	public List findByLevel(int level, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("level", new Integer(level)));
		return super.findByCriterions(Supermanager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByPhone(java.lang.String)
	 */
	public List findByPhone(java.lang.String phone) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(Supermanager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByPhone(java.lang.String, int,
	 * int)
	 */
	public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(Supermanager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByAddress(java.lang.String)
	 */
	public List findByAddress(java.lang.String address) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("address", address));
		return super.findByCriterions(Supermanager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByAddress(java.lang.String,
	 * int, int)
	 */
	public List findByAddress(java.lang.String address, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("address", address));
		return super.findByCriterions(Supermanager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Supermanager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SupermanagerDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Supermanager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.SupermanagerDao#findByAuthority(hobuy.domain.Authority)
	 */
	public List findByAuthority(hobuy.domain.Authority authority) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("authority", authority));
		return super.findByCriterions(Supermanager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.SupermanagerDao#findByAuthority(hobuy.domain.Authority,
	 * int, int)
	 */
	public List findByAuthority(hobuy.domain.Authority authority, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("authority", authority));
		return super.findByCriterions(Supermanager.class, cs, firstResult, maxResult);
	}
}