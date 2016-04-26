/***********************************************************************
 * Module:  UniversityDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class University
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

import hobuy.domain.University;
import hobuy.domain.UniversityPK;
import hobuy.domain.dao.UniversityDao;

/**
 * Class that implements methods of UniversityDao interface
 *
 */
@Repository
public class UniversityDaoImpl extends HibernateDaoImpl implements UniversityDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UniversityDao#save(hobuy.domain.University)
	 */
	public Serializable save(University universityObject) throws DaoException {
		return super.save(universityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UniversityDao#load(hobuy.domain.UniversityPK)
	 */
	public University load(UniversityPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Integer(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(University.class, cs);
		return (((list != null) && (list.size() > 0)) ? (University) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UniversityDao#delete(hobuy.domain.University)
	 */
	public void delete(University universityObject) throws DaoException {
		super.delete(universityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UniversityDao#update(hobuy.domain.University)
	 */
	public void update(University universityObject) throws DaoException {
		super.update(universityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UniversityDao#saveOrUpdate(hobuy.domain.University)
	 */
	public void saveOrUpdate(University universityObject) throws DaoException {
		super.saveOrUpdate(universityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UniversityDao#queryByExample(java.lang.Class,
	 * hobuy.domain.University)
	 */
	public List queryByExample(University universityObject) throws DaoException {
		return super.queryByExample(University.class, universityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UniversityDao#getUniversityList()
	 */
	public List getUniversityList() throws DaoException {
		return super.loadAll(University.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UniversityDao#getUniversityList(int, int)
	 */
	public List getUniversityList(int firstResult, int maxResult) {
		return super.loadAll(University.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UniversityDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(University.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UniversityDao#findByName(java.lang.String, int,
	 * int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(University.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UniversityDao#findByCity(hobuy.domain.City)
	 */
	public List findByCity(hobuy.domain.City city) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("city", city));
		return super.findByCriterions(University.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UniversityDao#findByCity(hobuy.domain.City, int,
	 * int)
	 */
	public List findByCity(hobuy.domain.City city, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("city", city));
		return super.findByCriterions(University.class, cs, firstResult, maxResult);
	}
}