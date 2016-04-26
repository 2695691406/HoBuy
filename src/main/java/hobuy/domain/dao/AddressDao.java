/***********************************************************************
 * Module:  AddressDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Address
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Address;
import hobuy.domain.AddressPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Address
 * 
 */
public interface AddressDao extends Dao {
   
   /**
    * Save <Code>Address</Code> instance
    *
    * @param addressObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Address addressObject) throws DaoException;
  
   /**
    * Load <Code>Address</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Address</Code> instance
    * @throws DaoException
    */
   public Address load(AddressPK pk) throws DaoException;

   /**
    * Delete <Code>Address</Code> instance from persistence store
    *
    * @param addressObject
    * @throws DaoException
    */
   public void delete(Address addressObject) throws DaoException;
   
   /**
    * Update <Code>Address</Code> instance to persistence store
    *
    * @param addressObject
    * @throws DaoException
    */
   public void update(Address addressObject) throws DaoException;
   
   /**
    * Save or update <Code>Address</Code> instance to persistence store
    *
    * @param addressObject
    * @throws DaoException
    */
   public void saveOrUpdate(Address addressObject) throws DaoException;

   /**
    * Get all <Code>Address</Code> instances from persistence store
    *
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List getAddressList() throws DaoException;
   
   /**
    * Get all <Code>Address</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List getAddressList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Address</Code> instances by example instance
    *
    * @param addressObject example instance
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Address addressObject) throws DaoException;
   
   /**
    * Find <Code>Address</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>Address</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Address</Code> instances from persistence store by address
    *
    * @param address
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List findByAddress(java.lang.String address) throws DaoException;
      
   /**
    * Find <Code>Address</Code> instances in range firstResult, maxResult
    * from persistence store by field address
    *
    * @param address
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List findByAddress(java.lang.String address, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Address</Code> instances from persistence store by phone
    *
    * @param phone
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone) throws DaoException;
      
   /**
    * Find <Code>Address</Code> instances in range firstResult, maxResult
    * from persistence store by field phone
    *
    * @param phone
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Address</Code> instances from persistence store by additional
    *
    * @param additional
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List findByAdditional(java.lang.String additional) throws DaoException;
      
   /**
    * Find <Code>Address</Code> instances in range firstResult, maxResult
    * from persistence store by field additional
    *
    * @param additional
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List findByAdditional(java.lang.String additional, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Address</Code> instances from persistence store by postalcode
    *
    * @param postalcode
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List findByPostalcode(java.lang.String postalcode) throws DaoException;
      
   /**
    * Find <Code>Address</Code> instances in range firstResult, maxResult
    * from persistence store by field postalcode
    *
    * @param postalcode
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List findByPostalcode(java.lang.String postalcode, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Address</Code> instances from persistence store by User
    *
    * @param user
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List findByUser(hobuy.domain.User user) throws DaoException;
   
   /**
    * Find <Code>Address</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by User
    *
    * @param user
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Address</Code> instance list
    * @throws DaoException
    */
   public List findByUser(hobuy.domain.User user, int firstResult, int maxResult) throws DaoException;
}