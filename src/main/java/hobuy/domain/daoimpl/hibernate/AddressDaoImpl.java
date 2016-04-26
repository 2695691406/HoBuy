/***********************************************************************
 * Module:  AddressDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Address
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

import hobuy.domain.Address;
import hobuy.domain.AddressPK;
import hobuy.domain.dao.AddressDao;

/**
 * Class that implements methods of AddressDao interface
 *
 */
@Repository
public class AddressDaoImpl extends HibernateDaoImpl implements AddressDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#save(hobuy.domain.Address)
	 */
	public Serializable save(Address addressObject) throws DaoException {
		return super.save(addressObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#load(hobuy.domain.AddressPK)
	 */
	public Address load(AddressPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Address.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Address) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#delete(hobuy.domain.Address)
	 */
	public void delete(Address addressObject) throws DaoException {
		super.delete(addressObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#update(hobuy.domain.Address)
	 */
	public void update(Address addressObject) throws DaoException {
		super.update(addressObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#saveOrUpdate(hobuy.domain.Address)
	 */
	public void saveOrUpdate(Address addressObject) throws DaoException {
		super.saveOrUpdate(addressObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Address)
	 */
	public List queryByExample(Address addressObject) throws DaoException {
		return super.queryByExample(Address.class, addressObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#getAddressList()
	 */
	public List getAddressList() throws DaoException {
		return super.loadAll(Address.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#getAddressList(int, int)
	 */
	public List getAddressList(int firstResult, int maxResult) {
		return super.loadAll(Address.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Address.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#findByName(java.lang.String, int, int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Address.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#findByAddress(java.lang.String)
	 */
	public List findByAddress(java.lang.String address) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("address", address));
		return super.findByCriterions(Address.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#findByAddress(java.lang.String, int,
	 * int)
	 */
	public List findByAddress(java.lang.String address, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("address", address));
		return super.findByCriterions(Address.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#findByPhone(java.lang.String)
	 */
	public List findByPhone(java.lang.String phone) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(Address.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#findByPhone(java.lang.String, int, int)
	 */
	public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("phone", phone));
		return super.findByCriterions(Address.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#findByAdditional(java.lang.String)
	 */
	public List findByAdditional(java.lang.String additional) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("additional", additional));
		return super.findByCriterions(Address.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#findByAdditional(java.lang.String, int,
	 * int)
	 */
	public List findByAdditional(java.lang.String additional, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("additional", additional));
		return super.findByCriterions(Address.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#findByPostalcode(java.lang.String)
	 */
	public List findByPostalcode(java.lang.String postalcode) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("postalcode", postalcode));
		return super.findByCriterions(Address.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#findByPostalcode(java.lang.String, int,
	 * int)
	 */
	public List findByPostalcode(java.lang.String postalcode, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("postalcode", postalcode));
		return super.findByCriterions(Address.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#findByUser(hobuy.domain.User)
	 */
	public List findByUser(hobuy.domain.User user) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("user", user));
		return super.findByCriterions(Address.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.AddressDao#findByUser(hobuy.domain.User, int, int)
	 */
	public List findByUser(hobuy.domain.User user, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("user", user));
		return super.findByCriterions(Address.class, cs, firstResult, maxResult);
	}
}