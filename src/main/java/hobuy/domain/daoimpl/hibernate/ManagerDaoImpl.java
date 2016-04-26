/***********************************************************************
 * Module:  ManagerDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Manager
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

import hobuy.domain.Manager;
import hobuy.domain.ManagerPK;
import hobuy.domain.dao.ManagerDao;

/**
 * Class that implements methods of ManagerDao interface
 *
 */
@Repository
public class ManagerDaoImpl extends HibernateDaoImpl implements ManagerDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#save(hobuy.domain.Manager)
	 */
	public Serializable save(Manager managerObject) throws DaoException {
		return super.save(managerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#load(hobuy.domain.ManagerPK)
	 */
	public Manager load(ManagerPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { pk.getId() };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Manager.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Manager) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#delete(hobuy.domain.Manager)
	 */
	public void delete(Manager managerObject) throws DaoException {
		super.delete(managerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#update(hobuy.domain.Manager)
	 */
	public void update(Manager managerObject) throws DaoException {
		super.update(managerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#saveOrUpdate(hobuy.domain.Manager)
	 */
	public void saveOrUpdate(Manager managerObject) throws DaoException {
		super.saveOrUpdate(managerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Manager)
	 */
	public List queryByExample(Manager managerObject) throws DaoException {
		return super.queryByExample(Manager.class, managerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#getManagerList()
	 */
	public List getManagerList() throws DaoException {
		return super.loadAll(Manager.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#getManagerList(int, int)
	 */
	public List getManagerList(int firstResult, int maxResult) {
		return super.loadAll(Manager.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Manager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByName(java.lang.String, int, int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Manager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByPhone(java.lang.String)
	 */
	public List findByPhone(java.lang.String phone) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(Manager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByPhone(java.lang.String, int, int)
	 */
	public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(Manager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByInstate(java.util.Date)
	 */
	public List findByInstate(java.util.Date instate) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("instate", instate));
		return super.findByCriterions(Manager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByInstate(java.util.Date, int, int)
	 */
	public List findByInstate(java.util.Date instate, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("instate", instate));
		return super.findByCriterions(Manager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByOutstate(java.util.Date)
	 */
	public List findByOutstate(java.util.Date outstate) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("outstate", outstate));
		return super.findByCriterions(Manager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByOutstate(java.util.Date, int, int)
	 */
	public List findByOutstate(java.util.Date outstate, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("outstate", outstate));
		return super.findByCriterions(Manager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Manager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Manager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByIntroduce(java.lang.String)
	 */
	public List findByIntroduce(java.lang.String introduce) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("introduce", introduce));
		return super.findByCriterions(Manager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByIntroduce(java.lang.String, int,
	 * int)
	 */
	public List findByIntroduce(java.lang.String introduce, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("introduce", introduce));
		return super.findByCriterions(Manager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByMaterialurl(java.lang.String)
	 */
	public List findByMaterialurl(java.lang.String materialurl) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("materialurl", materialurl));
		return super.findByCriterions(Manager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByMaterialurl(java.lang.String, int,
	 * int)
	 */
	public List findByMaterialurl(java.lang.String materialurl, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("materialurl", materialurl));
		return super.findByCriterions(Manager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findBySalary(double)
	 */
	public List findBySalary(double salary) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("salary", new Double(salary)));
		return super.findByCriterions(Manager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findBySalary(double, int, int)
	 */
	public List findBySalary(double salary, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("salary", new Double(salary)));
		return super.findByCriterions(Manager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findBySuper_manager(java.lang.String)
	 */
	public List findBySuper_manager(java.lang.String super_manager) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("super_manager", super_manager));
		return super.findByCriterions(Manager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findBySuper_manager(java.lang.String,
	 * int, int)
	 */
	public List findBySuper_manager(java.lang.String super_manager, int firstResult, int maxResult)
			throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("super_manager", super_manager));
		return super.findByCriterions(Manager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.ManagerDao#findBySupermanager(hobuy.domain.Supermanager)
	 */
	public List findBySupermanager(hobuy.domain.Supermanager supermanager) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("supermanager", supermanager));
		return super.findByCriterions(Manager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.ManagerDao#findBySupermanager(hobuy.domain.Supermanager,
	 * int, int)
	 */
	public List findBySupermanager(hobuy.domain.Supermanager supermanager, int firstResult, int maxResult)
			throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("supermanager", supermanager));
		return super.findByCriterions(Manager.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByAuthority(hobuy.domain.Authority)
	 */
	public List findByAuthority(hobuy.domain.Authority authority) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("authority", authority));
		return super.findByCriterions(Manager.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ManagerDao#findByAuthority(hobuy.domain.Authority,
	 * int, int)
	 */
	public List findByAuthority(hobuy.domain.Authority authority, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("authority", authority));
		return super.findByCriterions(Manager.class, cs, firstResult, maxResult);
	}
}