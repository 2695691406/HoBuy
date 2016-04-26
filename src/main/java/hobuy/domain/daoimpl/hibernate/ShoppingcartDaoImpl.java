/***********************************************************************
 * Module:  ShoppingcartDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Shoppingcart
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

import hobuy.domain.Repertory;
import hobuy.domain.Shoppingcart;
import hobuy.domain.ShoppingcartPK;
import hobuy.domain.User;
import hobuy.domain.dao.ShoppingcartDao;

/**
 * Class that implements methods of ShoppingcartDao interface
 *
 */
@Repository
public class ShoppingcartDaoImpl extends HibernateDaoImpl implements ShoppingcartDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#save(hobuy.domain.Shoppingcart)
	 */
	public Serializable save(Shoppingcart shoppingcartObject) throws DaoException {
		return super.save(shoppingcartObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#load(hobuy.domain.ShoppingcartPK)
	 */
	public Shoppingcart load(ShoppingcartPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Shoppingcart.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Shoppingcart) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#delete(hobuy.domain.Shoppingcart)
	 */
	public void delete(Shoppingcart shoppingcartObject) throws DaoException {
		super.delete(shoppingcartObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#update(hobuy.domain.Shoppingcart)
	 */
	public void update(Shoppingcart shoppingcartObject) throws DaoException {
		super.update(shoppingcartObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.ShoppingcartDao#saveOrUpdate(hobuy.domain.Shoppingcart)
	 */
	public void saveOrUpdate(Shoppingcart shoppingcartObject) throws DaoException {
		super.saveOrUpdate(shoppingcartObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Shoppingcart)
	 */
	public List queryByExample(Shoppingcart shoppingcartObject) throws DaoException {
		return super.queryByExample(Shoppingcart.class, shoppingcartObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#getShoppingcartList()
	 */
	public List getShoppingcartList() throws DaoException {
		return super.loadAll(Shoppingcart.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#getShoppingcartList(int, int)
	 */
	public List getShoppingcartList(int firstResult, int maxResult) {
		return super.loadAll(Shoppingcart.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#findBySum(int)
	 */
	public List findBySum(int sum) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("sum", new Integer(sum)));
		return super.findByCriterions(Shoppingcart.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#findBySum(int, int, int)
	 */
	public List findBySum(int sum, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("sum", new Integer(sum)));
		return super.findByCriterions(Shoppingcart.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#findByCreatetime(java.util.Date)
	 */
	public List findByCreatetime(java.util.Date createtime) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createtime", createtime));
		return super.findByCriterions(Shoppingcart.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#findByCreatetime(java.util.Date,
	 * int, int)
	 */
	public List findByCreatetime(java.util.Date createtime, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createtime", createtime));
		return super.findByCriterions(Shoppingcart.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Shoppingcart.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Shoppingcart.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#findByUser(hobuy.domain.User)
	 */
	public List findByUser(hobuy.domain.User user) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("user", user));
		return super.findByCriterions(Shoppingcart.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ShoppingcartDao#findByUser(hobuy.domain.User, int,
	 * int)
	 */
	public List findByUser(hobuy.domain.User user, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("user", user));
		return super.findByCriterions(Shoppingcart.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.ShoppingcartDao#findByRepertory(hobuy.domain.Repertory)
	 */
	public List findByRepertory(hobuy.domain.Repertory repertory) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("repertory", repertory));
		return super.findByCriterions(Shoppingcart.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.ShoppingcartDao#findByRepertory(hobuy.domain.Repertory,
	 * int, int)
	 */
	public List findByRepertory(hobuy.domain.Repertory repertory, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("repertory", repertory));
		return super.findByCriterions(Shoppingcart.class, cs, firstResult, maxResult);
	}

	public Shoppingcart findByUserAndRepertory(User user, Repertory repertory) {
		// TODO Auto-generated method stub
		List cs = new ArrayList();
		cs.add(Restrictions.eq("repertory", repertory));
		cs.add(Restrictions.eq("user", user));
		List<Shoppingcart> shoppingcarts = super.findByCriterions(Shoppingcart.class, cs, 0, 1);
		if (shoppingcarts == null || shoppingcarts.size() < 1) {
			return null;
		}
		return shoppingcarts.get(0);
	}
}