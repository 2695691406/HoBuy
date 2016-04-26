/***********************************************************************
 * Module:  UserDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class User
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

import hobuy.domain.User;
import hobuy.domain.UserPK;
import hobuy.domain.dao.UserDao;

/**
 * Class that implements methods of UserDao interface
 *
 */
@Repository
public class UserDaoImpl extends HibernateDaoImpl implements UserDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#save(hobuy.domain.User)
	 */
	public Serializable save(User userObject) throws DaoException {
		return super.save(userObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#load(hobuy.domain.UserPK)
	 */
	public User load(UserPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(User.class, cs);
		return (((list != null) && (list.size() > 0)) ? (User) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#delete(hobuy.domain.User)
	 */
	public void delete(User userObject) throws DaoException {
		super.delete(userObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#update(hobuy.domain.User)
	 */
	public void update(User userObject) throws DaoException {
		super.update(userObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#saveOrUpdate(hobuy.domain.User)
	 */
	public void saveOrUpdate(User userObject) throws DaoException {
		super.saveOrUpdate(userObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#queryByExample(java.lang.Class,
	 * hobuy.domain.User)
	 */
	public List queryByExample(User userObject) throws DaoException {
		return super.queryByExample(User.class, userObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#getUserList()
	 */
	public List getUserList() throws DaoException {
		return super.loadAll(User.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#getUserList(int, int)
	 */
	public List getUserList(int firstResult, int maxResult) {
		return super.loadAll(User.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByPhotoimg(java.lang.String)
	 */
	public List findByPhotoimg(java.lang.String photoimg) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("photoimg", photoimg));
		return super.findByCriterions(User.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByPhotoimg(java.lang.String, int, int)
	 */
	public List findByPhotoimg(java.lang.String photoimg, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("photoimg", photoimg));
		return super.findByCriterions(User.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByEmail(java.lang.String)
	 */
	public List findByEmail(java.lang.String email) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("email", email));
		return super.findByCriterions(User.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByEmail(java.lang.String, int, int)
	 */
	public List findByEmail(java.lang.String email, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("email", email));
		return super.findByCriterions(User.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByPwd(java.lang.String)
	 */
	public List findByPwd(java.lang.String pwd) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pwd", pwd));
		return super.findByCriterions(User.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByPwd(java.lang.String, int, int)
	 */
	public List findByPwd(java.lang.String pwd, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("pwd", pwd));
		return super.findByCriterions(User.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(User.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByName(java.lang.String, int, int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(User.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByPhone(java.lang.String)
	 */
	public List findByPhone(java.lang.String phone) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(User.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByPhone(java.lang.String, int, int)
	 */
	public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(User.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByCreatetime(java.util.Date)
	 */
	public List findByCreatetime(java.util.Date createtime) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createtime", createtime));
		return super.findByCriterions(User.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByCreatetime(java.util.Date, int, int)
	 */
	public List findByCreatetime(java.util.Date createtime, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("createtime", createtime));
		return super.findByCriterions(User.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(User.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(User.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByArrage(byte)
	 */
	public List findByArrage(byte arrage) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("arrage", new Byte(arrage)));
		return super.findByCriterions(User.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByArrage(byte, int, int)
	 */
	public List findByArrage(byte arrage, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("arrage", new Byte(arrage)));
		return super.findByCriterions(User.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByReputaion(double)
	 */
	public List findByReputaion(double reputaion) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("reputaion", new Double(reputaion)));
		return super.findByCriterions(User.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByReputaion(double, int, int)
	 */
	public List findByReputaion(double reputaion, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("reputaion", new Double(reputaion)));
		return super.findByCriterions(User.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByCount(int)
	 */
	public List findByCount(int count) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("count", new Integer(count)));
		return super.findByCriterions(User.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByCount(int, int, int)
	 */
	public List findByCount(int count, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("count", new Integer(count)));
		return super.findByCriterions(User.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByAuthentication(int)
	 */
	public List findByAuthentication(int authentication) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("authentication", new Integer(authentication)));
		return super.findByCriterions(User.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByAuthentication(int, int, int)
	 */
	public List findByAuthentication(int authentication, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("authentication", new Integer(authentication)));
		return super.findByCriterions(User.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByUniversity(hobuy.domain.University)
	 */
	public List findByUniversity(hobuy.domain.University university) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("university", university));
		return super.findByCriterions(User.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.UserDao#findByUniversity(hobuy.domain.University,
	 * int, int)
	 */
	public List findByUniversity(hobuy.domain.University university, int firstResult, int maxResult)
			throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("university", university));
		return super.findByCriterions(User.class, cs, firstResult, maxResult);
	}

}