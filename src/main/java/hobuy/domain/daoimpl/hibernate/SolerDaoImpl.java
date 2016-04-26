/***********************************************************************
 * Module:  SolerDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Soler
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

import hobuy.domain.Soler;
import hobuy.domain.SolerPK;
import hobuy.domain.dao.SolerDao;

/**
 * Class that implements methods of SolerDao interface
 *
 */
@Repository
public class SolerDaoImpl extends HibernateDaoImpl implements SolerDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#save(hobuy.domain.Soler)
	 */
	public Serializable save(Soler solerObject) throws DaoException {
		return super.save(solerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#load(hobuy.domain.SolerPK)
	 */
	public Soler load(SolerPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Soler.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Soler) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#delete(hobuy.domain.Soler)
	 */
	public void delete(Soler solerObject) throws DaoException {
		super.delete(solerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#update(hobuy.domain.Soler)
	 */
	public void update(Soler solerObject) throws DaoException {
		super.update(solerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#saveOrUpdate(hobuy.domain.Soler)
	 */
	public void saveOrUpdate(Soler solerObject) throws DaoException {
		super.saveOrUpdate(solerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Soler)
	 */
	public List queryByExample(Soler solerObject) throws DaoException {
		return super.queryByExample(Soler.class, solerObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#getSolerList()
	 */
	public List getSolerList() throws DaoException {
		return super.loadAll(Soler.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#getSolerList(int, int)
	 */
	public List getSolerList(int firstResult, int maxResult) {
		return super.loadAll(Soler.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByPhotoimg(java.lang.String)
	 */
	public List findByPhotoimg(java.lang.String photoimg) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("photoimg", photoimg));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByPhotoimg(java.lang.String, int, int)
	 */
	public List findByPhotoimg(java.lang.String photoimg, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("photoimg", photoimg));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByEmail(java.lang.String)
	 */
	public List findByEmail(java.lang.String email) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("email", email));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByEmail(java.lang.String, int, int)
	 */
	public List findByEmail(java.lang.String email, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("email", email));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByPwd(java.lang.String)
	 */
	public List findByPwd(java.lang.String pwd) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pwd", pwd));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByPwd(java.lang.String, int, int)
	 */
	public List findByPwd(java.lang.String pwd, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pwd", pwd));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByName(java.lang.String, int, int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByPhone(java.lang.String)
	 */
	public List findByPhone(java.lang.String phone) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByPhone(java.lang.String, int, int)
	 */
	public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByIntroduce(java.lang.String)
	 */
	public List findByIntroduce(java.lang.String introduce) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("introduce", introduce));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByIntroduce(java.lang.String, int,
	 * int)
	 */
	public List findByIntroduce(java.lang.String introduce, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("introduce", introduce));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByAddress(java.lang.String)
	 */
	public List findByAddress(java.lang.String address) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("address", address));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByAddress(java.lang.String, int, int)
	 */
	public List findByAddress(java.lang.String address, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("address", address));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByCreatetime(java.util.Date)
	 */
	public List findByCreatetime(java.util.Date createtime) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createtime", createtime));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByCreatetime(java.util.Date, int, int)
	 */
	public List findByCreatetime(java.util.Date createtime, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createtime", createtime));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByArrage(byte)
	 */
	public List findByArrage(byte arrage) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("arrage", new Byte(arrage)));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByArrage(byte, int, int)
	 */
	public List findByArrage(byte arrage, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("arrage", new Byte(arrage)));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByReputaion(double)
	 */
	public List findByReputaion(double reputaion) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("reputaion", new Double(reputaion)));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByReputaion(double, int, int)
	 */
	public List findByReputaion(double reputaion, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("reputaion", new Double(reputaion)));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByCount(int)
	 */
	public List findByCount(int count) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("count", new Integer(count)));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByCount(int, int, int)
	 */
	public List findByCount(int count, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("count", new Integer(count)));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByAuthentication(int)
	 */
	public List findByAuthentication(int authentication) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("authentication", new Integer(authentication)));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByAuthentication(int, int, int)
	 */
	public List findByAuthentication(int authentication, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("authentication", new Integer(authentication)));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByType(int)
	 */
	public List findByType(int type) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("type", new Integer(type)));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByType(int, int, int)
	 */
	public List findByType(int type, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("type", new Integer(type)));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByUniversity(hobuy.domain.University)
	 */
	public List findByUniversity(hobuy.domain.University university) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("university", university));
		return super.findByCriterions(Soler.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.SolerDao#findByUniversity(hobuy.domain.University,
	 * int, int)
	 */
	public List findByUniversity(hobuy.domain.University university, int firstResult, int maxResult)
			throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("university", university));
		return super.findByCriterions(Soler.class, cs, firstResult, maxResult);
	}
}