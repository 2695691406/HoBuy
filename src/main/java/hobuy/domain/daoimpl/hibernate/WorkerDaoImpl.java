/***********************************************************************
 * Module:  WorkerDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Worker
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

import hobuy.domain.Worker;
import hobuy.domain.WorkerPK;
import hobuy.domain.dao.WorkerDao;

/**
 * Class that implements methods of WorkerDao interface
 *
 */
@Repository
public class WorkerDaoImpl extends HibernateDaoImpl implements WorkerDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#save(hobuy.domain.Worker)
	 */
	public Serializable save(Worker workerObject) throws DaoException {
		return super.save(workerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#load(hobuy.domain.WorkerPK)
	 */
	public Worker load(WorkerPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { pk.getId() };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Worker.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Worker) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#delete(hobuy.domain.Worker)
	 */
	public void delete(Worker workerObject) throws DaoException {
		super.delete(workerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#update(hobuy.domain.Worker)
	 */
	public void update(Worker workerObject) throws DaoException {
		super.update(workerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#saveOrUpdate(hobuy.domain.Worker)
	 */
	public void saveOrUpdate(Worker workerObject) throws DaoException {
		super.saveOrUpdate(workerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Worker)
	 */
	public List queryByExample(Worker workerObject) throws DaoException {
		return super.queryByExample(Worker.class, workerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#getWorkerList()
	 */
	public List getWorkerList() throws DaoException {
		return super.loadAll(Worker.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#getWorkerList(int, int)
	 */
	public List getWorkerList(int firstResult, int maxResult) {
		return super.loadAll(Worker.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Worker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByName(java.lang.String, int, int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Worker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByPhone(java.lang.String)
	 */
	public List findByPhone(java.lang.String phone) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(Worker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByPhone(java.lang.String, int, int)
	 */
	public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(Worker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByInstate(java.util.Date)
	 */
	public List findByInstate(java.util.Date instate) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("instate", instate));
		return super.findByCriterions(Worker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByInstate(java.util.Date, int, int)
	 */
	public List findByInstate(java.util.Date instate, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("instate", instate));
		return super.findByCriterions(Worker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByOutstate(java.util.Date)
	 */
	public List findByOutstate(java.util.Date outstate) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("outstate", outstate));
		return super.findByCriterions(Worker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByOutstate(java.util.Date, int, int)
	 */
	public List findByOutstate(java.util.Date outstate, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("outstate", outstate));
		return super.findByCriterions(Worker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByAllowid(java.lang.String)
	 */
	public List findByAllowid(java.lang.String allowid) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("allowid", allowid));
		return super.findByCriterions(Worker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByAllowid(java.lang.String, int, int)
	 */
	public List findByAllowid(java.lang.String allowid, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("allowid", allowid));
		return super.findByCriterions(Worker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Worker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Worker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByIntroduce(java.lang.String)
	 */
	public List findByIntroduce(java.lang.String introduce) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("introduce", introduce));
		return super.findByCriterions(Worker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByIntroduce(java.lang.String, int,
	 * int)
	 */
	public List findByIntroduce(java.lang.String introduce, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("introduce", introduce));
		return super.findByCriterions(Worker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByMaterialurl(java.lang.String)
	 */
	public List findByMaterialurl(java.lang.String materialurl) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("materialurl", materialurl));
		return super.findByCriterions(Worker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByMaterialurl(java.lang.String, int,
	 * int)
	 */
	public List findByMaterialurl(java.lang.String materialurl, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("materialurl", materialurl));
		return super.findByCriterions(Worker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findBySalary(double)
	 */
	public List findBySalary(double salary) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("salary", new Double(salary)));
		return super.findByCriterions(Worker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findBySalary(double, int, int)
	 */
	public List findBySalary(double salary, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("salary", new Double(salary)));
		return super.findByCriterions(Worker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByPostion(hobuy.domain.Postion)
	 */
	public List findByPostion(hobuy.domain.Postion postion) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("postion", postion));
		return super.findByCriterions(Worker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByPostion(hobuy.domain.Postion, int,
	 * int)
	 */
	public List findByPostion(hobuy.domain.Postion postion, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("postion", postion));
		return super.findByCriterions(Worker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByManager(hobuy.domain.Manager)
	 */
	public List findByManager(hobuy.domain.Manager manager) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("manager", manager));
		return super.findByCriterions(Worker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.WorkerDao#findByManager(hobuy.domain.Manager, int,
	 * int)
	 */
	public List findByManager(hobuy.domain.Manager manager, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("manager", manager));
		return super.findByCriterions(Worker.class, cs, firstResult, maxResult);
	}
}