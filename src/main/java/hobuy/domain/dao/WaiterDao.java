/***********************************************************************
 * Module:  WaiterDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Waiter
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Waiter;
import hobuy.domain.WaiterPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Waiter
 * 
 */
public interface WaiterDao extends Dao {
   
   /**
    * Save <Code>Waiter</Code> instance
    *
    * @param waiterObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Waiter waiterObject) throws DaoException;
  
   /**
    * Load <Code>Waiter</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Waiter</Code> instance
    * @throws DaoException
    */
   public Waiter load(WaiterPK pk) throws DaoException;

   /**
    * Delete <Code>Waiter</Code> instance from persistence store
    *
    * @param waiterObject
    * @throws DaoException
    */
   public void delete(Waiter waiterObject) throws DaoException;
   
   /**
    * Update <Code>Waiter</Code> instance to persistence store
    *
    * @param waiterObject
    * @throws DaoException
    */
   public void update(Waiter waiterObject) throws DaoException;
   
   /**
    * Save or update <Code>Waiter</Code> instance to persistence store
    *
    * @param waiterObject
    * @throws DaoException
    */
   public void saveOrUpdate(Waiter waiterObject) throws DaoException;

   /**
    * Get all <Code>Waiter</Code> instances from persistence store
    *
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List getWaiterList() throws DaoException;
   
   /**
    * Get all <Code>Waiter</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List getWaiterList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Waiter</Code> instances by example instance
    *
    * @param waiterObject example instance
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Waiter waiterObject) throws DaoException;
   
   /**
    * Find <Code>Waiter</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>Waiter</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Waiter</Code> instances from persistence store by phone
    *
    * @param phone
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone) throws DaoException;
      
   /**
    * Find <Code>Waiter</Code> instances in range firstResult, maxResult
    * from persistence store by field phone
    *
    * @param phone
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Waiter</Code> instances from persistence store by account
    *
    * @param account
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List findByAccount(long account) throws DaoException;
      
   /**
    * Find <Code>Waiter</Code> instances in range firstResult, maxResult
    * from persistence store by field account
    *
    * @param account
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List findByAccount(long account, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Waiter</Code> instances from persistence store by type
    *
    * @param type
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List findByType(int type) throws DaoException;
      
   /**
    * Find <Code>Waiter</Code> instances in range firstResult, maxResult
    * from persistence store by field type
    *
    * @param type
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List findByType(int type, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Waiter</Code> instances from persistence store by state
    *
    * @param state
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state) throws DaoException;
      
   /**
    * Find <Code>Waiter</Code> instances in range firstResult, maxResult
    * from persistence store by field state
    *
    * @param state
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Waiter</Code> instances from persistence store by Soler
    *
    * @param soler
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List findBySoler(hobuy.domain.Soler soler) throws DaoException;
   
   /**
    * Find <Code>Waiter</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Soler
    *
    * @param soler
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Waiter</Code> instance list
    * @throws DaoException
    */
   public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException;
}