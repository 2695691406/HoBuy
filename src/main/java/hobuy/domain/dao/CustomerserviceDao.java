/***********************************************************************
 * Module:  CustomerserviceDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Customerservice
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Customerservice;
import hobuy.domain.CustomerservicePK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Customerservice
 * 
 */
public interface CustomerserviceDao extends Dao {
   
   /**
    * Save <Code>Customerservice</Code> instance
    *
    * @param customerserviceObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Customerservice customerserviceObject) throws DaoException;
  
   /**
    * Load <Code>Customerservice</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Customerservice</Code> instance
    * @throws DaoException
    */
   public Customerservice load(CustomerservicePK pk) throws DaoException;

   /**
    * Delete <Code>Customerservice</Code> instance from persistence store
    *
    * @param customerserviceObject
    * @throws DaoException
    */
   public void delete(Customerservice customerserviceObject) throws DaoException;
   
   /**
    * Update <Code>Customerservice</Code> instance to persistence store
    *
    * @param customerserviceObject
    * @throws DaoException
    */
   public void update(Customerservice customerserviceObject) throws DaoException;
   
   /**
    * Save or update <Code>Customerservice</Code> instance to persistence store
    *
    * @param customerserviceObject
    * @throws DaoException
    */
   public void saveOrUpdate(Customerservice customerserviceObject) throws DaoException;

   /**
    * Get all <Code>Customerservice</Code> instances from persistence store
    *
    * @return <Code>Customerservice</Code> instance list
    * @throws DaoException
    */
   public List getCustomerserviceList() throws DaoException;
   
   /**
    * Get all <Code>Customerservice</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Customerservice</Code> instance list
    * @throws DaoException
    */
   public List getCustomerserviceList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Customerservice</Code> instances by example instance
    *
    * @param customerserviceObject example instance
    * @return <Code>Customerservice</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Customerservice customerserviceObject) throws DaoException;
   
   /**
    * Find <Code>Customerservice</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>Customerservice</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>Customerservice</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Customerservice</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Customerservice</Code> instances from persistence store by phone
    *
    * @param phone
    * @return <Code>Customerservice</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone) throws DaoException;
      
   /**
    * Find <Code>Customerservice</Code> instances in range firstResult, maxResult
    * from persistence store by field phone
    *
    * @param phone
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Customerservice</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Customerservice</Code> instances from persistence store by account
    *
    * @param account
    * @return <Code>Customerservice</Code> instance list
    * @throws DaoException
    */
   public List findByAccount(long account) throws DaoException;
      
   /**
    * Find <Code>Customerservice</Code> instances in range firstResult, maxResult
    * from persistence store by field account
    *
    * @param account
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Customerservice</Code> instance list
    * @throws DaoException
    */
   public List findByAccount(long account, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Customerservice</Code> instances from persistence store by type
    *
    * @param type
    * @return <Code>Customerservice</Code> instance list
    * @throws DaoException
    */
   public List findByType(int type) throws DaoException;
      
   /**
    * Find <Code>Customerservice</Code> instances in range firstResult, maxResult
    * from persistence store by field type
    *
    * @param type
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Customerservice</Code> instance list
    * @throws DaoException
    */
   public List findByType(int type, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Customerservice</Code> instances from persistence store by Soler
    *
    * @param soler
    * @return <Code>Customerservice</Code> instance list
    * @throws DaoException
    */
   public List findBySoler(hobuy.domain.Soler soler) throws DaoException;
   
   /**
    * Find <Code>Customerservice</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Soler
    *
    * @param soler
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Customerservice</Code> instance list
    * @throws DaoException
    */
   public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException;
}