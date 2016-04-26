/***********************************************************************
 * Module:  Img_groupDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Img_group
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

import hobuy.domain.Img_group;
import hobuy.domain.Img_groupPK;
import hobuy.domain.dao.Img_groupDao;

/**
 * Class that implements methods of Img_groupDao interface
 *
 */
@Repository
public class Img_groupDaoImpl extends HibernateDaoImpl implements Img_groupDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#save(hobuy.domain.Img_group)
	 */
	public Serializable save(Img_group img_groupObject) throws DaoException {
		return super.save(img_groupObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#load(hobuy.domain.Img_groupPK)
	 */
	public Img_group load(Img_groupPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Img_group.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Img_group) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#delete(hobuy.domain.Img_group)
	 */
	public void delete(Img_group img_groupObject) throws DaoException {
		super.delete(img_groupObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#update(hobuy.domain.Img_group)
	 */
	public void update(Img_group img_groupObject) throws DaoException {
		super.update(img_groupObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#saveOrUpdate(hobuy.domain.Img_group)
	 */
	public void saveOrUpdate(Img_group img_groupObject) throws DaoException {
		super.saveOrUpdate(img_groupObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Img_group)
	 */
	public List queryByExample(Img_group img_groupObject) throws DaoException {
		return super.queryByExample(Img_group.class, img_groupObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#getImg_groupList()
	 */
	public List getImg_groupList() throws DaoException {
		return super.loadAll(Img_group.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#getImg_groupList(int, int)
	 */
	public List getImg_groupList(int firstResult, int maxResult) {
		return super.loadAll(Img_group.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#findByImg1url(java.lang.String)
	 */
	public List findByImg1url(java.lang.String img1url) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("img1url", img1url));
		return super.findByCriterions(Img_group.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#findByImg1url(java.lang.String, int,
	 * int)
	 */
	public List findByImg1url(java.lang.String img1url, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("img1url", img1url));
		return super.findByCriterions(Img_group.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#findByImg2url(java.lang.String)
	 */
	public List findByImg2url(java.lang.String img2url) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("img2url", img2url));
		return super.findByCriterions(Img_group.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#findByImg2url(java.lang.String, int,
	 * int)
	 */
	public List findByImg2url(java.lang.String img2url, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("img2url", img2url));
		return super.findByCriterions(Img_group.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#findByImg3url(java.lang.String)
	 */
	public List findByImg3url(java.lang.String img3url) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("img3url", img3url));
		return super.findByCriterions(Img_group.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#findByImg3url(java.lang.String, int,
	 * int)
	 */
	public List findByImg3url(java.lang.String img3url, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("img3url", img3url));
		return super.findByCriterions(Img_group.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#findByImg4url(java.lang.String)
	 */
	public List findByImg4url(java.lang.String img4url) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("img4url", img4url));
		return super.findByCriterions(Img_group.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#findByImg4url(java.lang.String, int,
	 * int)
	 */
	public List findByImg4url(java.lang.String img4url, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("img4url", img4url));
		return super.findByCriterions(Img_group.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#findByImg5url(java.lang.String)
	 */
	public List findByImg5url(java.lang.String img5url) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("img5url", img5url));
		return super.findByCriterions(Img_group.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.Img_groupDao#findByImg5url(java.lang.String, int,
	 * int)
	 */
	public List findByImg5url(java.lang.String img5url, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("img5url", img5url));
		return super.findByCriterions(Img_group.class, cs, firstResult, maxResult);
	}
}