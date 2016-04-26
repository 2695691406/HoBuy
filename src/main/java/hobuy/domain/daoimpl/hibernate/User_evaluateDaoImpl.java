/***********************************************************************
 * Module:  User_evaluateDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class User_evaluate
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

import hobuy.domain.User_evaluate;
import hobuy.domain.User_evaluatePK;
import hobuy.domain.dao.User_evaluateDao;

/**
 * Class that implements methods of User_evaluateDao interface
 *
 */
@Repository
public class User_evaluateDaoImpl extends HibernateDaoImpl implements User_evaluateDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#save(hobuy.domain.User_evaluate)
	 */
	public Serializable save(User_evaluate user_evaluateObject) throws DaoException {
		return super.save(user_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#load(hobuy.domain.User_evaluatePK)
	 */
	public User_evaluate load(User_evaluatePK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(User_evaluate.class, cs);
		return (((list != null) && (list.size() > 0)) ? (User_evaluate) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#delete(hobuy.domain.User_evaluate)
	 */
	public void delete(User_evaluate user_evaluateObject) throws DaoException {
		super.delete(user_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#update(hobuy.domain.User_evaluate)
	 */
	public void update(User_evaluate user_evaluateObject) throws DaoException {
		super.update(user_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#saveOrUpdate(hobuy.domain.
	 * User_evaluate)
	 */
	public void saveOrUpdate(User_evaluate user_evaluateObject) throws DaoException {
		super.saveOrUpdate(user_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#queryByExample(java.lang.Class,
	 * hobuy.domain.User_evaluate)
	 */
	public List queryByExample(User_evaluate user_evaluateObject) throws DaoException {
		return super.queryByExample(User_evaluate.class, user_evaluateObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#getUser_evaluateList()
	 */
	public List getUser_evaluateList() throws DaoException {
		return super.loadAll(User_evaluate.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#getUser_evaluateList(int, int)
	 */
	public List getUser_evaluateList(int firstResult, int maxResult) {
		return super.loadAll(User_evaluate.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#findByTime(java.util.Date)
	 */
	public List findByTime(java.util.Date time) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("time", time));
		return super.findByCriterions(User_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#findByTime(java.util.Date, int,
	 * int)
	 */
	public List findByTime(java.util.Date time, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("time", time));
		return super.findByCriterions(User_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#findByContent(java.lang.String)
	 */
	public List findByContent(java.lang.String content) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("content", content));
		return super.findByCriterions(User_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#findByContent(java.lang.String,
	 * int, int)
	 */
	public List findByContent(java.lang.String content, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("content", content));
		return super.findByCriterions(User_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#findByEvaluate_level(int)
	 */
	public List findByEvaluate_level(int evaluate_level) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("evaluate_level", new Integer(evaluate_level)));
		return super.findByCriterions(User_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#findByEvaluate_level(int, int,
	 * int)
	 */
	public List findByEvaluate_level(int evaluate_level, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("evaluate_level", new Integer(evaluate_level)));
		return super.findByCriterions(User_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#findBySoler(hobuy.domain.Soler)
	 */
	public List findBySoler(hobuy.domain.Soler soler) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(User_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#findBySoler(hobuy.domain.Soler,
	 * int, int)
	 */
	public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(User_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#findByUser(hobuy.domain.User)
	 */
	public List findByUser(hobuy.domain.User user) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("user", user));
		return super.findByCriterions(User_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#findByUser(hobuy.domain.User, int,
	 * int)
	 */
	public List findByUser(hobuy.domain.User user, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("user", user));
		return super.findByCriterions(User_evaluate.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#findByOrder(hobuy.domain.Order)
	 */
	public List findByOrder(hobuy.domain.Order order) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("order", order));
		return super.findByCriterions(User_evaluate.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.User_evaluateDao#findByOrder(hobuy.domain.Order,
	 * int, int)
	 */
	public List findByOrder(hobuy.domain.Order order, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("order", order));
		return super.findByCriterions(User_evaluate.class, cs, firstResult, maxResult);
	}
}