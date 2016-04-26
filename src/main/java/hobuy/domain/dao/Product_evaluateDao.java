/***********************************************************************
 * Module:  Product_evaluateDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Product_evaluate
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Product_evaluate;
import hobuy.domain.Product_evaluatePK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Product_evaluate
 * 
 */
public interface Product_evaluateDao extends Dao {
   
   /**
    * Save <Code>Product_evaluate</Code> instance
    *
    * @param product_evaluateObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Product_evaluate product_evaluateObject) throws DaoException;
  
   /**
    * Load <Code>Product_evaluate</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Product_evaluate</Code> instance
    * @throws DaoException
    */
   public Product_evaluate load(Product_evaluatePK pk) throws DaoException;

   /**
    * Delete <Code>Product_evaluate</Code> instance from persistence store
    *
    * @param product_evaluateObject
    * @throws DaoException
    */
   public void delete(Product_evaluate product_evaluateObject) throws DaoException;
   
   /**
    * Update <Code>Product_evaluate</Code> instance to persistence store
    *
    * @param product_evaluateObject
    * @throws DaoException
    */
   public void update(Product_evaluate product_evaluateObject) throws DaoException;
   
   /**
    * Save or update <Code>Product_evaluate</Code> instance to persistence store
    *
    * @param product_evaluateObject
    * @throws DaoException
    */
   public void saveOrUpdate(Product_evaluate product_evaluateObject) throws DaoException;

   /**
    * Get all <Code>Product_evaluate</Code> instances from persistence store
    *
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List getProduct_evaluateList() throws DaoException;
   
   /**
    * Get all <Code>Product_evaluate</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List getProduct_evaluateList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Product_evaluate</Code> instances by example instance
    *
    * @param product_evaluateObject example instance
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Product_evaluate product_evaluateObject) throws DaoException;
   
   /**
    * Find <Code>Product_evaluate</Code> instances from persistence store by order_id
    *
    * @param order_id
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByOrder_id(long order_id) throws DaoException;
      
   /**
    * Find <Code>Product_evaluate</Code> instances in range firstResult, maxResult
    * from persistence store by field order_id
    *
    * @param order_id
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByOrder_id(long order_id, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Product_evaluate</Code> instances from persistence store by time
    *
    * @param time
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByTime(java.util.Date time) throws DaoException;
      
   /**
    * Find <Code>Product_evaluate</Code> instances in range firstResult, maxResult
    * from persistence store by field time
    *
    * @param time
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByTime(java.util.Date time, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Product_evaluate</Code> instances from persistence store by content
    *
    * @param content
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByContent(java.lang.String content) throws DaoException;
      
   /**
    * Find <Code>Product_evaluate</Code> instances in range firstResult, maxResult
    * from persistence store by field content
    *
    * @param content
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByContent(java.lang.String content, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Product_evaluate</Code> instances from persistence store by evaluate_level
    *
    * @param evaluate_level
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByEvaluate_level(int evaluate_level) throws DaoException;
      
   /**
    * Find <Code>Product_evaluate</Code> instances in range firstResult, maxResult
    * from persistence store by field evaluate_level
    *
    * @param evaluate_level
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByEvaluate_level(int evaluate_level, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Product_evaluate</Code> instances from persistence store by Product
    *
    * @param product
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByProduct(hobuy.domain.Product product) throws DaoException;
   
   /**
    * Find <Code>Product_evaluate</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Product
    *
    * @param product
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByProduct(hobuy.domain.Product product, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Product_evaluate</Code> instances from persistence store by User
    *
    * @param user
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByUser(hobuy.domain.User user) throws DaoException;
   
   /**
    * Find <Code>Product_evaluate</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by User
    *
    * @param user
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Product_evaluate</Code> instance list
    * @throws DaoException
    */
   public List findByUser(hobuy.domain.User user, int firstResult, int maxResult) throws DaoException;
}