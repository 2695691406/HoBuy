/***********************************************************************
 * Module:  SolerWorkerDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class SolerWorker
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

import hobuy.domain.SolerWorker;
import hobuy.domain.SolerWorkerPK;
import hobuy.domain.dao.SolerWorkerDao;

/**
 * Class that implements methods of SolerWorkerDao interface
 *
 */
@Repository
public class SolerWorkerDaoImpl extends HibernateDaoImpl implements SolerWorkerDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#save(hobuy.domain.SolerWorker)
	 */
	public Serializable save(SolerWorker solerWorkerObject) throws DaoException {
		return super.save(solerWorkerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#load(hobuy.domain.SolerWorkerPK)
	 */
	public SolerWorker load(SolerWorkerPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(SolerWorker.class, cs);
		return (((list != null) && (list.size() > 0)) ? (SolerWorker) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#delete(hobuy.domain.SolerWorker)
	 */
	public void delete(SolerWorker solerWorkerObject) throws DaoException {
		super.delete(solerWorkerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#update(hobuy.domain.SolerWorker)
	 */
	public void update(SolerWorker solerWorkerObject) throws DaoException {
		super.update(solerWorkerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.SolerWorkerDao#saveOrUpdate(hobuy.domain.SolerWorker)
	 */
	public void saveOrUpdate(SolerWorker solerWorkerObject) throws DaoException {
		super.saveOrUpdate(solerWorkerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#queryByExample(java.lang.Class,
	 * hobuy.domain.SolerWorker)
	 */
	public List queryByExample(SolerWorker solerWorkerObject) throws DaoException {
		return super.queryByExample(SolerWorker.class, solerWorkerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#getSolerWorkerList()
	 */
	public List getSolerWorkerList() throws DaoException {
		return super.loadAll(SolerWorker.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#getSolerWorkerList(int, int)
	 */
	public List getSolerWorkerList(int firstResult, int maxResult) {
		return super.loadAll(SolerWorker.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(SolerWorker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByName(java.lang.String, int,
	 * int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(SolerWorker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByPhone(java.lang.String)
	 */
	public List findByPhone(java.lang.String phone) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(SolerWorker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByPhone(java.lang.String, int,
	 * int)
	 */
	public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(SolerWorker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(SolerWorker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(SolerWorker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByWorkstate(byte)
	 */
	public List findByWorkstate(byte workstate) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("workstate", new Byte(workstate)));
		return super.findByCriterions(SolerWorker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByWorkstate(byte, int, int)
	 */
	public List findByWorkstate(byte workstate, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("workstate", new Byte(workstate)));
		return super.findByCriterions(SolerWorker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByReputation(double)
	 */
	public List findByReputation(double reputation) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("reputation", new Double(reputation)));
		return super.findByCriterions(SolerWorker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByReputation(double, int, int)
	 */
	public List findByReputation(double reputation, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("reputation", new Double(reputation)));
		return super.findByCriterions(SolerWorker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findBySend_count(int)
	 */
	public List findBySend_count(int send_count) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("send_count", new Integer(send_count)));
		return super.findByCriterions(SolerWorker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findBySend_count(int, int, int)
	 */
	public List findBySend_count(int send_count, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("send_count", new Integer(send_count)));
		return super.findByCriterions(SolerWorker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByCreatedate(java.util.Date)
	 */
	public List findByCreatedate(java.util.Date createdate) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createdate", createdate));
		return super.findByCriterions(SolerWorker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByCreatedate(java.util.Date,
	 * int, int)
	 */
	public List findByCreatedate(java.util.Date createdate, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createdate", createdate));
		return super.findByCriterions(SolerWorker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByOffdate(java.util.Date)
	 */
	public List findByOffdate(java.util.Date offdate) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("offdate", offdate));
		return super.findByCriterions(SolerWorker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByOffdate(java.util.Date, int,
	 * int)
	 */
	public List findByOffdate(java.util.Date offdate, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("offdate", offdate));
		return super.findByCriterions(SolerWorker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByType(int)
	 */
	public List findByType(int type) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("type", new Integer(type)));
		return super.findByCriterions(SolerWorker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByType(int, int, int)
	 */
	public List findByType(int type, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("type", new Integer(type)));
		return super.findByCriterions(SolerWorker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByAccount(java.lang.String)
	 */
	public List findByAccount(java.lang.String account) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("account", account));
		return super.findByCriterions(SolerWorker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findByAccount(java.lang.String, int,
	 * int)
	 */
	public List findByAccount(java.lang.String account, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("account", account));
		return super.findByCriterions(SolerWorker.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findBySoler(hobuy.domain.Soler)
	 */
	public List findBySoler(hobuy.domain.Soler soler) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(SolerWorker.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerWorkerDao#findBySoler(hobuy.domain.Soler, int,
	 * int)
	 */
	public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(SolerWorker.class, cs, firstResult, maxResult);
	}
}