/***********************************************************************
 * Module:  WorkerDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Worker
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Worker;
import hobuy.domain.WorkerPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Worker
 * 
 */
public interface WorkerDao extends Dao {
   
   /**
    * Save <Code>Worker</Code> instance
    *
    * @param workerObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Worker workerObject) throws DaoException;
  
   /**
    * Load <Code>Worker</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Worker</Code> instance
    * @throws DaoException
    */
   public Worker load(WorkerPK pk) throws DaoException;

   /**
    * Delete <Code>Worker</Code> instance from persistence store
    *
    * @param workerObject
    * @throws DaoException
    */
   public void delete(Worker workerObject) throws DaoException;
   
   /**
    * Update <Code>Worker</Code> instance to persistence store
    *
    * @param workerObject
    * @throws DaoException
    */
   public void update(Worker workerObject) throws DaoException;
   
   /**
    * Save or update <Code>Worker</Code> instance to persistence store
    *
    * @param workerObject
    * @throws DaoException
    */
   public void saveOrUpdate(Worker workerObject) throws DaoException;

   /**
    * Get all <Code>Worker</Code> instances from persistence store
    *
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List getWorkerList() throws DaoException;
   
   /**
    * Get all <Code>Worker</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List getWorkerList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Worker</Code> instances by example instance
    *
    * @param workerObject example instance
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Worker workerObject) throws DaoException;
   
   /**
    * Find <Code>Worker</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>Worker</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Worker</Code> instances from persistence store by phone
    *
    * @param phone
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone) throws DaoException;
      
   /**
    * Find <Code>Worker</Code> instances in range firstResult, maxResult
    * from persistence store by field phone
    *
    * @param phone
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Worker</Code> instances from persistence store by instate
    *
    * @param instate
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByInstate(java.util.Date instate) throws DaoException;
      
   /**
    * Find <Code>Worker</Code> instances in range firstResult, maxResult
    * from persistence store by field instate
    *
    * @param instate
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByInstate(java.util.Date instate, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Worker</Code> instances from persistence store by outstate
    *
    * @param outstate
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByOutstate(java.util.Date outstate) throws DaoException;
      
   /**
    * Find <Code>Worker</Code> instances in range firstResult, maxResult
    * from persistence store by field outstate
    *
    * @param outstate
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByOutstate(java.util.Date outstate, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Worker</Code> instances from persistence store by allowid
    *
    * @param allowid
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByAllowid(java.lang.String allowid) throws DaoException;
      
   /**
    * Find <Code>Worker</Code> instances in range firstResult, maxResult
    * from persistence store by field allowid
    *
    * @param allowid
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByAllowid(java.lang.String allowid, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Worker</Code> instances from persistence store by state
    *
    * @param state
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state) throws DaoException;
      
   /**
    * Find <Code>Worker</Code> instances in range firstResult, maxResult
    * from persistence store by field state
    *
    * @param state
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Worker</Code> instances from persistence store by introduce
    *
    * @param introduce
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByIntroduce(java.lang.String introduce) throws DaoException;
      
   /**
    * Find <Code>Worker</Code> instances in range firstResult, maxResult
    * from persistence store by field introduce
    *
    * @param introduce
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByIntroduce(java.lang.String introduce, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Worker</Code> instances from persistence store by materialurl
    *
    * @param materialurl
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByMaterialurl(java.lang.String materialurl) throws DaoException;
      
   /**
    * Find <Code>Worker</Code> instances in range firstResult, maxResult
    * from persistence store by field materialurl
    *
    * @param materialurl
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByMaterialurl(java.lang.String materialurl, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Worker</Code> instances from persistence store by salary
    *
    * @param salary
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findBySalary(double salary) throws DaoException;
      
   /**
    * Find <Code>Worker</Code> instances in range firstResult, maxResult
    * from persistence store by field salary
    *
    * @param salary
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findBySalary(double salary, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Worker</Code> instances from persistence store by Postion
    *
    * @param postion
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByPostion(hobuy.domain.Postion postion) throws DaoException;
   
   /**
    * Find <Code>Worker</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Postion
    *
    * @param postion
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByPostion(hobuy.domain.Postion postion, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Worker</Code> instances from persistence store by Manager
    *
    * @param manager
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByManager(hobuy.domain.Manager manager) throws DaoException;
   
   /**
    * Find <Code>Worker</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Manager
    *
    * @param manager
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Worker</Code> instance list
    * @throws DaoException
    */
   public List findByManager(hobuy.domain.Manager manager, int firstResult, int maxResult) throws DaoException;
}