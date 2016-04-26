/***********************************************************************
 * Module:  CityDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class City
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

import hobuy.domain.City;
import hobuy.domain.CityPK;
import hobuy.domain.dao.CityDao;

/**
 * Class that implements methods of CityDao interface
 *
 */
@Repository
public class CityDaoImpl extends HibernateDaoImpl implements CityDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.CityDao#save(hobuy.domain.City)
	 */
	public Serializable save(City cityObject) throws DaoException {
		return super.save(cityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.CityDao#load(hobuy.domain.CityPK)
	 */
	public City load(CityPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(City.class, cs);
		return (((list != null) && (list.size() > 0)) ? (City) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.CityDao#delete(hobuy.domain.City)
	 */
	public void delete(City cityObject) throws DaoException {
		super.delete(cityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.CityDao#update(hobuy.domain.City)
	 */
	public void update(City cityObject) throws DaoException {
		super.update(cityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.CityDao#saveOrUpdate(hobuy.domain.City)
	 */
	public void saveOrUpdate(City cityObject) throws DaoException {
		super.saveOrUpdate(cityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.CityDao#queryByExample(java.lang.Class,
	 * hobuy.domain.City)
	 */
	public List queryByExample(City cityObject) throws DaoException {
		return super.queryByExample(City.class, cityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.CityDao#getCityList()
	 */
	public List getCityList() throws DaoException {
		return super.loadAll(City.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.CityDao#getCityList(int, int)
	 */
	public List getCityList(int firstResult, int maxResult) {
		return super.loadAll(City.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.CityDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(City.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.CityDao#findByName(java.lang.String, int, int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(City.class, cs, firstResult, maxResult);
	}
}