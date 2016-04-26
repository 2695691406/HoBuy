/***********************************************************************
 * Module:  User_evaluateDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class User_evaluate
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.User_evaluate;
import hobuy.domain.User_evaluatePK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class User_evaluate
 * 
 */
public interface User_evaluateDao extends Dao {
   
   /**
    * Save <Code>User_evaluate</Code> instance
    *
    * @param user_evaluateObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(User_evaluate user_evaluateObject) throws DaoException;
  
   /**
    * Load <Code>User_evaluate</Code> instance by primary key
    *
    * @param pk
    * @return <Code>User_evaluate</Code> instance
    * @throws DaoException
    */
   public User_evaluate load(User_evaluatePK pk) throws DaoException;

   /**
    * Delete <Code>User_evaluate</Code> instance from persistence store
    *
    * @param user_evaluateObject
    * @throws DaoException
    */
   public void delete(User_evaluate user_evaluateObject) throws DaoException;
   
   /**
    * Update <Code>User_evaluate</Code> instance to persistence store
    *
    * @param user_evaluateObject
    * @throws DaoException
    */
   public void update(User_evaluate user_evaluateObject) throws DaoException;
   
   /**
    * Save or update <Code>User_evaluate</Code> instance to persistence store
    *
    * @param user_evaluateObject
    * @throws DaoException
    */
   public void saveOrUpdate(User_evaluate user_evaluateObject) throws DaoException;

   /**
    * Get all <Code>User_evaluate</Code> instances from persistence store
    *
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List getUser_evaluateList() throws DaoException;
   
   /**
    * Get all <Code>User_evaluate</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List getUser_evaluateList(int firstResult, int maxResult);
   
   /**
    * Query <Code>User_evaluate</Code> instances by example instance
    *
    * @param user_evaluateObject example instance
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(User_evaluate user_evaluateObject) throws DaoException;
   
   /**
    * Find <Code>User_evaluate</Code> instances from persistence store by time
    *
    * @param time
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByTime(java.util.Date time) throws DaoException;
      
   /**
    * Find <Code>User_evaluate</Code> instances in range firstResult, maxResult
    * from persistence store by field time
    *
    * @param time
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByTime(java.util.Date time, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User_evaluate</Code> instances from persistence store by content
    *
    * @param content
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByContent(java.lang.String content) throws DaoException;
      
   /**
    * Find <Code>User_evaluate</Code> instances in range firstResult, maxResult
    * from persistence store by field content
    *
    * @param content
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByContent(java.lang.String content, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User_evaluate</Code> instances from persistence store by evaluate_level
    *
    * @param evaluate_level
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByEvaluate_level(int evaluate_level) throws DaoException;
      
   /**
    * Find <Code>User_evaluate</Code> instances in range firstResult, maxResult
    * from persistence store by field evaluate_level
    *
    * @param evaluate_level
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByEvaluate_level(int evaluate_level, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User_evaluate</Code> instances from persistence store by Soler
    *
    * @param soler
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findBySoler(hobuy.domain.Soler soler) throws DaoException;
   
   /**
    * Find <Code>User_evaluate</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Soler
    *
    * @param soler
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User_evaluate</Code> instances from persistence store by User
    *
    * @param user
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByUser(hobuy.domain.User user) throws DaoException;
   
   /**
    * Find <Code>User_evaluate</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by User
    *
    * @param user
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByUser(hobuy.domain.User user, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User_evaluate</Code> instances from persistence store by Order
    *
    * @param order
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByOrder(hobuy.domain.Order order) throws DaoException;
   
   /**
    * Find <Code>User_evaluate</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Order
    *
    * @param order
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByOrder(hobuy.domain.Order order, int firstResult, int maxResult) throws DaoException;
}