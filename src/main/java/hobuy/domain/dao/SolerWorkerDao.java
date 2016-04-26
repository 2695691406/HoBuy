/***********************************************************************
 * Module:  SolerWorkerDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class SolerWorker
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.SolerWorker;
import hobuy.domain.SolerWorkerPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class SolerWorker
 * 
 */
public interface SolerWorkerDao extends Dao {
   
   /**
    * Save <Code>SolerWorker</Code> instance
    *
    * @param solerWorkerObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(SolerWorker solerWorkerObject) throws DaoException;
  
   /**
    * Load <Code>SolerWorker</Code> instance by primary key
    *
    * @param pk
    * @return <Code>SolerWorker</Code> instance
    * @throws DaoException
    */
   public SolerWorker load(SolerWorkerPK pk) throws DaoException;

   /**
    * Delete <Code>SolerWorker</Code> instance from persistence store
    *
    * @param solerWorkerObject
    * @throws DaoException
    */
   public void delete(SolerWorker solerWorkerObject) throws DaoException;
   
   /**
    * Update <Code>SolerWorker</Code> instance to persistence store
    *
    * @param solerWorkerObject
    * @throws DaoException
    */
   public void update(SolerWorker solerWorkerObject) throws DaoException;
   
   /**
    * Save or update <Code>SolerWorker</Code> instance to persistence store
    *
    * @param solerWorkerObject
    * @throws DaoException
    */
   public void saveOrUpdate(SolerWorker solerWorkerObject) throws DaoException;

   /**
    * Get all <Code>SolerWorker</Code> instances from persistence store
    *
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List getSolerWorkerList() throws DaoException;
   
   /**
    * Get all <Code>SolerWorker</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List getSolerWorkerList(int firstResult, int maxResult);
   
   /**
    * Query <Code>SolerWorker</Code> instances by example instance
    *
    * @param solerWorkerObject example instance
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(SolerWorker solerWorkerObject) throws DaoException;
   
   /**
    * Find <Code>SolerWorker</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>SolerWorker</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>SolerWorker</Code> instances from persistence store by phone
    *
    * @param phone
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone) throws DaoException;
      
   /**
    * Find <Code>SolerWorker</Code> instances in range firstResult, maxResult
    * from persistence store by field phone
    *
    * @param phone
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>SolerWorker</Code> instances from persistence store by state
    *
    * @param state
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state) throws DaoException;
      
   /**
    * Find <Code>SolerWorker</Code> instances in range firstResult, maxResult
    * from persistence store by field state
    *
    * @param state
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>SolerWorker</Code> instances from persistence store by workstate
    *
    * @param workstate
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByWorkstate(byte workstate) throws DaoException;
      
   /**
    * Find <Code>SolerWorker</Code> instances in range firstResult, maxResult
    * from persistence store by field workstate
    *
    * @param workstate
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByWorkstate(byte workstate, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>SolerWorker</Code> instances from persistence store by reputation
    *
    * @param reputation
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByReputation(double reputation) throws DaoException;
      
   /**
    * Find <Code>SolerWorker</Code> instances in range firstResult, maxResult
    * from persistence store by field reputation
    *
    * @param reputation
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByReputation(double reputation, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>SolerWorker</Code> instances from persistence store by send_count
    *
    * @param send_count
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findBySend_count(int send_count) throws DaoException;
      
   /**
    * Find <Code>SolerWorker</Code> instances in range firstResult, maxResult
    * from persistence store by field send_count
    *
    * @param send_count
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findBySend_count(int send_count, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>SolerWorker</Code> instances from persistence store by createdate
    *
    * @param createdate
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByCreatedate(java.util.Date createdate) throws DaoException;
      
   /**
    * Find <Code>SolerWorker</Code> instances in range firstResult, maxResult
    * from persistence store by field createdate
    *
    * @param createdate
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByCreatedate(java.util.Date createdate, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>SolerWorker</Code> instances from persistence store by offdate
    *
    * @param offdate
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByOffdate(java.util.Date offdate) throws DaoException;
      
   /**
    * Find <Code>SolerWorker</Code> instances in range firstResult, maxResult
    * from persistence store by field offdate
    *
    * @param offdate
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByOffdate(java.util.Date offdate, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>SolerWorker</Code> instances from persistence store by type
    *
    * @param type
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByType(int type) throws DaoException;
      
   /**
    * Find <Code>SolerWorker</Code> instances in range firstResult, maxResult
    * from persistence store by field type
    *
    * @param type
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByType(int type, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>SolerWorker</Code> instances from persistence store by account
    *
    * @param account
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByAccount(java.lang.String account) throws DaoException;
      
   /**
    * Find <Code>SolerWorker</Code> instances in range firstResult, maxResult
    * from persistence store by field account
    *
    * @param account
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findByAccount(java.lang.String account, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>SolerWorker</Code> instances from persistence store by Soler
    *
    * @param soler
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findBySoler(hobuy.domain.Soler soler) throws DaoException;
   
   /**
    * Find <Code>SolerWorker</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Soler
    *
    * @param soler
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>SolerWorker</Code> instance list
    * @throws DaoException
    */
   public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException;
}