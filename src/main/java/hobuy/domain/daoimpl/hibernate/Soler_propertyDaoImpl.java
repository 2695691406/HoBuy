/***********************************************************************
 * Module:  Soler_propertyDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Soler_property
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

import hobuy.domain.Soler_property;
import hobuy.domain.Soler_propertyPK;
import hobuy.domain.dao.Soler_propertyDao;

/**
 * Class that implements methods of Soler_propertyDao interface
 *
 */
@Repository
public class Soler_propertyDaoImpl extends HibernateDaoImpl implements Soler_propertyDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#save(hobuy.domain.Soler_property)
	 */
	public Serializable save(Soler_property soler_propertyObject) throws DaoException {
		return super.save(soler_propertyObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Soler_propertyDao#load(hobuy.domain.Soler_propertyPK)
	 */
	public Soler_property load(Soler_propertyPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Soler_property.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Soler_property) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Soler_propertyDao#delete(hobuy.domain.Soler_property)
	 */
	public void delete(Soler_property soler_propertyObject) throws DaoException {
		super.delete(soler_propertyObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.Soler_propertyDao#update(hobuy.domain.Soler_property)
	 */
	public void update(Soler_property soler_propertyObject) throws DaoException {
		super.update(soler_propertyObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#saveOrUpdate(hobuy.domain.
	 * Soler_property)
	 */
	public void saveOrUpdate(Soler_property soler_propertyObject) throws DaoException {
		super.saveOrUpdate(soler_propertyObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Soler_property)
	 */
	public List queryByExample(Soler_property soler_propertyObject) throws DaoException {
		return super.queryByExample(Soler_property.class, soler_propertyObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#getSoler_propertyList()
	 */
	public List getSoler_propertyList() throws DaoException {
		return super.loadAll(Soler_property.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#getSoler_propertyList(int, int)
	 */
	public List getSoler_propertyList(int firstResult, int maxResult) {
		return super.loadAll(Soler_property.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Soler_property.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findByName(java.lang.String, int,
	 * int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Soler_property.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findByPro1name(java.lang.String)
	 */
	public List findByPro1name(java.lang.String pro1name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pro1name", pro1name));
		return super.findByCriterions(Soler_property.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findByPro1name(java.lang.String,
	 * int, int)
	 */
	public List findByPro1name(java.lang.String pro1name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pro1name", pro1name));
		return super.findByCriterions(Soler_property.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findByPro2name(java.lang.String)
	 */
	public List findByPro2name(java.lang.String pro2name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pro2name", pro2name));
		return super.findByCriterions(Soler_property.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findByPro2name(java.lang.String,
	 * int, int)
	 */
	public List findByPro2name(java.lang.String pro2name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pro2name", pro2name));
		return super.findByCriterions(Soler_property.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findByPro3name(java.lang.String)
	 */
	public List findByPro3name(java.lang.String pro3name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pro3name", pro3name));
		return super.findByCriterions(Soler_property.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findByPro3name(java.lang.String,
	 * int, int)
	 */
	public List findByPro3name(java.lang.String pro3name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pro3name", pro3name));
		return super.findByCriterions(Soler_property.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findByPcount(int)
	 */
	public List findByPcount(int pcount) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pcount", new Integer(pcount)));
		return super.findByCriterions(Soler_property.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findByPcount(int, int, int)
	 */
	public List findByPcount(int pcount, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pcount", new Integer(pcount)));
		return super.findByCriterions(Soler_property.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Soler_property.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Soler_property.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findBySoler(hobuy.domain.Soler)
	 */
	public List findBySoler(hobuy.domain.Soler soler) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(Soler_property.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Soler_propertyDao#findBySoler(hobuy.domain.Soler,
	 * int, int)
	 */
	public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(Soler_property.class, cs, firstResult, maxResult);
	}

	public List findBySoler(hobuy.domain.Soler soler, int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		cs.add(Restrictions.eq("state", state));
		return super.findByCriterions(Soler_property.class, cs);
	}

	public List findBySoler(hobuy.domain.Soler soler, int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		cs.add(Restrictions.eq("state", state));
		return super.findByCriterions(Soler_property.class, cs, firstResult, maxResult);
	}
}