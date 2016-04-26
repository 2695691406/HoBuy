/***********************************************************************
 * Module:  WaiterDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Waiter
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

import hobuy.domain.Waiter;
import hobuy.domain.WaiterPK;
import hobuy.domain.dao.WaiterDao;

/**
 * Class that implements methods of WaiterDao interface
 *
 */
@Repository
public class WaiterDaoImpl extends HibernateDaoImpl implements WaiterDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#save(hobuy.domain.Waiter)
	 */
	public Serializable save(Waiter waiterObject) throws DaoException {
		return super.save(waiterObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#load(hobuy.domain.WaiterPK)
	 */
	public Waiter load(WaiterPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Waiter.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Waiter) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#delete(hobuy.domain.Waiter)
	 */
	public void delete(Waiter waiterObject) throws DaoException {
		super.delete(waiterObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#update(hobuy.domain.Waiter)
	 */
	public void update(Waiter waiterObject) throws DaoException {
		super.update(waiterObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#saveOrUpdate(hobuy.domain.Waiter)
	 */
	public void saveOrUpdate(Waiter waiterObject) throws DaoException {
		super.saveOrUpdate(waiterObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Waiter)
	 */
	public List queryByExample(Waiter waiterObject) throws DaoException {
		return super.queryByExample(Waiter.class, waiterObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#getWaiterList()
	 */
	public List getWaiterList() throws DaoException {
		return super.loadAll(Waiter.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#getWaiterList(int, int)
	 */
	public List getWaiterList(int firstResult, int maxResult) {
		return super.loadAll(Waiter.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Waiter.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#findByName(java.lang.String, int, int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Waiter.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#findByPhone(java.lang.String)
	 */
	public List findByPhone(java.lang.String phone) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(Waiter.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#findByPhone(java.lang.String, int, int)
	 */
	public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(Waiter.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#findByAccount(long)
	 */
	public List findByAccount(long account) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("account", new Long(account)));
		return super.findByCriterions(Waiter.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#findByAccount(long, int, int)
	 */
	public List findByAccount(long account, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("account", new Long(account)));
		return super.findByCriterions(Waiter.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#findByType(int)
	 */
	public List findByType(int type) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("type", new Integer(type)));
		return super.findByCriterions(Waiter.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#findByType(int, int, int)
	 */
	public List findByType(int type, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("type", new Integer(type)));
		return super.findByCriterions(Waiter.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Waiter.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Waiter.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#findBySoler(hobuy.domain.Soler)
	 */
	public List findBySoler(hobuy.domain.Soler soler) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(Waiter.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WaiterDao#findBySoler(hobuy.domain.Soler, int, int)
	 */
	public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(Waiter.class, cs, firstResult, maxResult);
	}
}