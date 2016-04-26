/***********************************************************************
 * Module:  AuthorityDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Authority
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

import hobuy.domain.Authority;
import hobuy.domain.AuthorityPK;
import hobuy.domain.dao.AuthorityDao;

/**
 * Class that implements methods of AuthorityDao interface
 *
 */
@Repository
public class AuthorityDaoImpl extends HibernateDaoImpl implements AuthorityDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#save(hobuy.domain.Authority)
	 */
	public Serializable save(Authority authorityObject) throws DaoException {
		return super.save(authorityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#load(hobuy.domain.AuthorityPK)
	 */
	public Authority load(AuthorityPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Integer(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Authority.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Authority) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#delete(hobuy.domain.Authority)
	 */
	public void delete(Authority authorityObject) throws DaoException {
		super.delete(authorityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#update(hobuy.domain.Authority)
	 */
	public void update(Authority authorityObject) throws DaoException {
		super.update(authorityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#saveOrUpdate(hobuy.domain.Authority)
	 */
	public void saveOrUpdate(Authority authorityObject) throws DaoException {
		super.saveOrUpdate(authorityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Authority)
	 */
	public List queryByExample(Authority authorityObject) throws DaoException {
		return super.queryByExample(Authority.class, authorityObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#getAuthorityList()
	 */
	public List getAuthorityList() throws DaoException {
		return super.loadAll(Authority.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#getAuthorityList(int, int)
	 */
	public List getAuthorityList(int firstResult, int maxResult) {
		return super.loadAll(Authority.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Authority.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#findByName(java.lang.String, int, int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Authority.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#findByIntroduce(java.lang.String)
	 */
	public List findByIntroduce(java.lang.String introduce) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("introduce", introduce));
		return super.findByCriterions(Authority.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#findByIntroduce(java.lang.String, int,
	 * int)
	 */
	public List findByIntroduce(java.lang.String introduce, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("introduce", introduce));
		return super.findByCriterions(Authority.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#findByLevel(int)
	 */
	public List findByLevel(int level) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("level", new Integer(level)));
		return super.findByCriterions(Authority.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AuthorityDao#findByLevel(int, int, int)
	 */
	public List findByLevel(int level, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("level", new Integer(level)));
		return super.findByCriterions(Authority.class, cs, firstResult, maxResult);
	}
}