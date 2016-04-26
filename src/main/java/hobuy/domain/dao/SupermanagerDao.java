/***********************************************************************
 * Module:  SupermanagerDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Supermanager
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Supermanager;
import hobuy.domain.SupermanagerPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Supermanager
 * 
 */
public interface SupermanagerDao extends Dao {
   
   /**
    * Save <Code>Supermanager</Code> instance
    *
    * @param supermanagerObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Supermanager supermanagerObject) throws DaoException;
  
   /**
    * Load <Code>Supermanager</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Supermanager</Code> instance
    * @throws DaoException
    */
   public Supermanager load(SupermanagerPK pk) throws DaoException;

   /**
    * Delete <Code>Supermanager</Code> instance from persistence store
    *
    * @param supermanagerObject
    * @throws DaoException
    */
   public void delete(Supermanager supermanagerObject) throws DaoException;
   
   /**
    * Update <Code>Supermanager</Code> instance to persistence store
    *
    * @param supermanagerObject
    * @throws DaoException
    */
   public void update(Supermanager supermanagerObject) throws DaoException;
   
   /**
    * Save or update <Code>Supermanager</Code> instance to persistence store
    *
    * @param supermanagerObject
    * @throws DaoException
    */
   public void saveOrUpdate(Supermanager supermanagerObject) throws DaoException;

   /**
    * Get all <Code>Supermanager</Code> instances from persistence store
    *
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List getSupermanagerList() throws DaoException;
   
   /**
    * Get all <Code>Supermanager</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List getSupermanagerList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Supermanager</Code> instances by example instance
    *
    * @param supermanagerObject example instance
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Supermanager supermanagerObject) throws DaoException;
   
   /**
    * Find <Code>Supermanager</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>Supermanager</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Supermanager</Code> instances from persistence store by createtime
    *
    * @param createtime
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByCreatetime(java.util.Date createtime) throws DaoException;
      
   /**
    * Find <Code>Supermanager</Code> instances in range firstResult, maxResult
    * from persistence store by field createtime
    *
    * @param createtime
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByCreatetime(java.util.Date createtime, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Supermanager</Code> instances from persistence store by leavetime
    *
    * @param leavetime
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByLeavetime(java.util.Date leavetime) throws DaoException;
      
   /**
    * Find <Code>Supermanager</Code> instances in range firstResult, maxResult
    * from persistence store by field leavetime
    *
    * @param leavetime
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByLeavetime(java.util.Date leavetime, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Supermanager</Code> instances from persistence store by level
    *
    * @param level
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByLevel(int level) throws DaoException;
      
   /**
    * Find <Code>Supermanager</Code> instances in range firstResult, maxResult
    * from persistence store by field level
    *
    * @param level
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByLevel(int level, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Supermanager</Code> instances from persistence store by phone
    *
    * @param phone
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone) throws DaoException;
      
   /**
    * Find <Code>Supermanager</Code> instances in range firstResult, maxResult
    * from persistence store by field phone
    *
    * @param phone
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Supermanager</Code> instances from persistence store by address
    *
    * @param address
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByAddress(java.lang.String address) throws DaoException;
      
   /**
    * Find <Code>Supermanager</Code> instances in range firstResult, maxResult
    * from persistence store by field address
    *
    * @param address
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByAddress(java.lang.String address, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Supermanager</Code> instances from persistence store by state
    *
    * @param state
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state) throws DaoException;
      
   /**
    * Find <Code>Supermanager</Code> instances in range firstResult, maxResult
    * from persistence store by field state
    *
    * @param state
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Supermanager</Code> instances from persistence store by Authority
    *
    * @param authority
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByAuthority(hobuy.domain.Authority authority) throws DaoException;
   
   /**
    * Find <Code>Supermanager</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Authority
    *
    * @param authority
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Supermanager</Code> instance list
    * @throws DaoException
    */
   public List findByAuthority(hobuy.domain.Authority authority, int firstResult, int maxResult) throws DaoException;
}