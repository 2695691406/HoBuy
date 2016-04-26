/***********************************************************************
 * Module:  Soler_evaluateDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Soler_evaluate
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

import hobuy.domain.Soler_evaluate;
import hobuy.domain.Soler_evaluatePK;
import hobuy.domain.dao.Soler_evaluateDao;

/**
 * Class that implements methods of Soler_evaluateDao interface
 *
 */
@Repository
public class Soler_evaluateDaoImpl extends HibernateDaoImpl implements Soler_evaluateDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#save(hobuy.domain.Soler_evaluate)
	 */
	public Serializable save(Soler_evaluate soler_evaluateObject) throws DaoException {
		return super.save(soler_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Soler_evaluateDao#load(hobuy.domain.Soler_evaluatePK)
	 */
	public Soler_evaluate load(Soler_evaluatePK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Soler_evaluate.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Soler_evaluate) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Soler_evaluateDao#delete(hobuy.domain.Soler_evaluate)
	 */
	public void delete(Soler_evaluate soler_evaluateObject) throws DaoException {
		super.delete(soler_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Soler_evaluateDao#update(hobuy.domain.Soler_evaluate)
	 */
	public void update(Soler_evaluate soler_evaluateObject) throws DaoException {
		super.update(soler_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#saveOrUpdate(hobuy.domain.
	 * Soler_evaluate)
	 */
	public void saveOrUpdate(Soler_evaluate soler_evaluateObject) throws DaoException {
		super.saveOrUpdate(soler_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Soler_evaluate)
	 */
	public List queryByExample(Soler_evaluate soler_evaluateObject) throws DaoException {
		return super.queryByExample(Soler_evaluate.class, soler_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#getSoler_evaluateList()
	 */
	public List getSoler_evaluateList() throws DaoException {
		return super.loadAll(Soler_evaluate.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#getSoler_evaluateList(int, int)
	 */
	public List getSoler_evaluateList(int firstResult, int maxResult) {
		return super.loadAll(Soler_evaluate.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#findByTime(java.util.Date)
	 */
	public List findByTime(java.util.Date time) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("time", time));
		return super.findByCriterions(Soler_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#findByTime(java.util.Date, int,
	 * int)
	 */
	public List findByTime(java.util.Date time, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("time", time));
		return super.findByCriterions(Soler_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#findByContent(java.lang.String)
	 */
	public List findByContent(java.lang.String content) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("content", content));
		return super.findByCriterions(Soler_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#findByContent(java.lang.String,
	 * int, int)
	 */
	public List findByContent(java.lang.String content, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("content", content));
		return super.findByCriterions(Soler_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#findByEvaluate_level(int)
	 */
	public List findByEvaluate_level(int evaluate_level) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("evaluate_level", new Integer(evaluate_level)));
		return super.findByCriterions(Soler_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#findByEvaluate_level(int, int,
	 * int)
	 */
	public List findByEvaluate_level(int evaluate_level, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("evaluate_level", new Integer(evaluate_level)));
		return super.findByCriterions(Soler_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#findBySoler(hobuy.domain.Soler)
	 */
	public List findBySoler(hobuy.domain.Soler soler) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(Soler_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#findBySoler(hobuy.domain.Soler,
	 * int, int)
	 */
	public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(Soler_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#findByUser(hobuy.domain.User)
	 */
	public List findByUser(hobuy.domain.User user) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("user", user));
		return super.findByCriterions(Soler_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#findByUser(hobuy.domain.User,
	 * int, int)
	 */
	public List findByUser(hobuy.domain.User user, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("user", user));
		return super.findByCriterions(Soler_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#findByOrder(hobuy.domain.Order)
	 */
	public List findByOrder(hobuy.domain.Order order) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("order", order));
		return super.findByCriterions(Soler_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_evaluateDao#findByOrder(hobuy.domain.Order,
	 * int, int)
	 */
	public List findByOrder(hobuy.domain.Order order, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("order", order));
		return super.findByCriterions(Soler_evaluate.class, cs, firstResult, maxResult);
	}
}