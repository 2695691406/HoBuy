/***********************************************************************
 * Module:  ManagerDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Manager
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Manager;
import hobuy.domain.ManagerPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Manager
 * 
 */
public interface ManagerDao extends Dao {
   
   /**
    * Save <Code>Manager</Code> instance
    *
    * @param managerObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Manager managerObject) throws DaoException;
  
   /**
    * Load <Code>Manager</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Manager</Code> instance
    * @throws DaoException
    */
   public Manager load(ManagerPK pk) throws DaoException;

   /**
    * Delete <Code>Manager</Code> instance from persistence store
    *
    * @param managerObject
    * @throws DaoException
    */
   public void delete(Manager managerObject) throws DaoException;
   
   /**
    * Update <Code>Manager</Code> instance to persistence store
    *
    * @param managerObject
    * @throws DaoException
    */
   public void update(Manager managerObject) throws DaoException;
   
   /**
    * Save or update <Code>Manager</Code> instance to persistence store
    *
    * @param managerObject
    * @throws DaoException
    */
   public void saveOrUpdate(Manager managerObject) throws DaoException;

   /**
    * Get all <Code>Manager</Code> instances from persistence store
    *
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List getManagerList() throws DaoException;
   
   /**
    * Get all <Code>Manager</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List getManagerList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Manager</Code> instances by example instance
    *
    * @param managerObject example instance
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Manager managerObject) throws DaoException;
   
   /**
    * Find <Code>Manager</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>Manager</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Manager</Code> instances from persistence store by phone
    *
    * @param phone
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone) throws DaoException;
      
   /**
    * Find <Code>Manager</Code> instances in range firstResult, maxResult
    * from persistence store by field phone
    *
    * @param phone
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Manager</Code> instances from persistence store by instate
    *
    * @param instate
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByInstate(java.util.Date instate) throws DaoException;
      
   /**
    * Find <Code>Manager</Code> instances in range firstResult, maxResult
    * from persistence store by field instate
    *
    * @param instate
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByInstate(java.util.Date instate, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Manager</Code> instances from persistence store by outstate
    *
    * @param outstate
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByOutstate(java.util.Date outstate) throws DaoException;
      
   /**
    * Find <Code>Manager</Code> instances in range firstResult, maxResult
    * from persistence store by field outstate
    *
    * @param outstate
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByOutstate(java.util.Date outstate, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Manager</Code> instances from persistence store by state
    *
    * @param state
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state) throws DaoException;
      
   /**
    * Find <Code>Manager</Code> instances in range firstResult, maxResult
    * from persistence store by field state
    *
    * @param state
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Manager</Code> instances from persistence store by introduce
    *
    * @param introduce
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByIntroduce(java.lang.String introduce) throws DaoException;
      
   /**
    * Find <Code>Manager</Code> instances in range firstResult, maxResult
    * from persistence store by field introduce
    *
    * @param introduce
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByIntroduce(java.lang.String introduce, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Manager</Code> instances from persistence store by materialurl
    *
    * @param materialurl
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByMaterialurl(java.lang.String materialurl) throws DaoException;
      
   /**
    * Find <Code>Manager</Code> instances in range firstResult, maxResult
    * from persistence store by field materialurl
    *
    * @param materialurl
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByMaterialurl(java.lang.String materialurl, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Manager</Code> instances from persistence store by salary
    *
    * @param salary
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findBySalary(double salary) throws DaoException;
      
   /**
    * Find <Code>Manager</Code> instances in range firstResult, maxResult
    * from persistence store by field salary
    *
    * @param salary
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findBySalary(double salary, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Manager</Code> instances from persistence store by super_manager
    *
    * @param super_manager
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findBySuper_manager(java.lang.String super_manager) throws DaoException;
      
   /**
    * Find <Code>Manager</Code> instances in range firstResult, maxResult
    * from persistence store by field super_manager
    *
    * @param super_manager
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findBySuper_manager(java.lang.String super_manager, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Manager</Code> instances from persistence store by Supermanager
    *
    * @param supermanager
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findBySupermanager(hobuy.domain.Supermanager supermanager) throws DaoException;
   
   /**
    * Find <Code>Manager</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Supermanager
    *
    * @param supermanager
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findBySupermanager(hobuy.domain.Supermanager supermanager, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Manager</Code> instances from persistence store by Authority
    *
    * @param authority
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByAuthority(hobuy.domain.Authority authority) throws DaoException;
   
   /**
    * Find <Code>Manager</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Authority
    *
    * @param authority
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Manager</Code> instance list
    * @throws DaoException
    */
   public List findByAuthority(hobuy.domain.Authority authority, int firstResult, int maxResult) throws DaoException;
}