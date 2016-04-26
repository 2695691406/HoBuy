/***********************************************************************
 * Module:  PostionDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Postion
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Postion;
import hobuy.domain.PostionPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Postion
 * 
 */
public interface PostionDao extends Dao {
   
   /**
    * Save <Code>Postion</Code> instance
    *
    * @param postionObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Postion postionObject) throws DaoException;
  
   /**
    * Load <Code>Postion</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Postion</Code> instance
    * @throws DaoException
    */
   public Postion load(PostionPK pk) throws DaoException;

   /**
    * Delete <Code>Postion</Code> instance from persistence store
    *
    * @param postionObject
    * @throws DaoException
    */
   public void delete(Postion postionObject) throws DaoException;
   
   /**
    * Update <Code>Postion</Code> instance to persistence store
    *
    * @param postionObject
    * @throws DaoException
    */
   public void update(Postion postionObject) throws DaoException;
   
   /**
    * Save or update <Code>Postion</Code> instance to persistence store
    *
    * @param postionObject
    * @throws DaoException
    */
   public void saveOrUpdate(Postion postionObject) throws DaoException;

   /**
    * Get all <Code>Postion</Code> instances from persistence store
    *
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List getPostionList() throws DaoException;
   
   /**
    * Get all <Code>Postion</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List getPostionList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Postion</Code> instances by example instance
    *
    * @param postionObject example instance
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Postion postionObject) throws DaoException;
   
   /**
    * Find <Code>Postion</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>Postion</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Postion</Code> instances from persistence store by createdate
    *
    * @param createdate
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findByCreatedate(java.util.Date createdate) throws DaoException;
      
   /**
    * Find <Code>Postion</Code> instances in range firstResult, maxResult
    * from persistence store by field createdate
    *
    * @param createdate
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findByCreatedate(java.util.Date createdate, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Postion</Code> instances from persistence store by cancledate
    *
    * @param cancledate
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findByCancledate(java.util.Date cancledate) throws DaoException;
      
   /**
    * Find <Code>Postion</Code> instances in range firstResult, maxResult
    * from persistence store by field cancledate
    *
    * @param cancledate
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findByCancledate(java.util.Date cancledate, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Postion</Code> instances from persistence store by state
    *
    * @param state
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state) throws DaoException;
      
   /**
    * Find <Code>Postion</Code> instances in range firstResult, maxResult
    * from persistence store by field state
    *
    * @param state
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Postion</Code> instances from persistence store by salary
    *
    * @param salary
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findBySalary(double salary) throws DaoException;
      
   /**
    * Find <Code>Postion</Code> instances in range firstResult, maxResult
    * from persistence store by field salary
    *
    * @param salary
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findBySalary(double salary, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Postion</Code> instances from persistence store by Manager
    *
    * @param manager
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findByManager(hobuy.domain.Manager manager) throws DaoException;
   
   /**
    * Find <Code>Postion</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Manager
    *
    * @param manager
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findByManager(hobuy.domain.Manager manager, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Postion</Code> instances from persistence store by Supermanager
    *
    * @param supermanager
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findBySupermanager(hobuy.domain.Supermanager supermanager) throws DaoException;
   
   /**
    * Find <Code>Postion</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Supermanager
    *
    * @param supermanager
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Postion</Code> instance list
    * @throws DaoException
    */
   public List findBySupermanager(hobuy.domain.Supermanager supermanager, int firstResult, int maxResult) throws DaoException;
}