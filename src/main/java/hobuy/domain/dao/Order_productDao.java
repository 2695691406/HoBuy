/***********************************************************************
 * Module:  Order_productDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Order_product
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Order_product;
import hobuy.domain.Order_productPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Order_product
 * 
 */
public interface Order_productDao extends Dao {
   
   /**
    * Save <Code>Order_product</Code> instance
    *
    * @param order_productObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Order_product order_productObject) throws DaoException;
  
   /**
    * Load <Code>Order_product</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Order_product</Code> instance
    * @throws DaoException
    */
   public Order_product load(Order_productPK pk) throws DaoException;

   /**
    * Delete <Code>Order_product</Code> instance from persistence store
    *
    * @param order_productObject
    * @throws DaoException
    */
   public void delete(Order_product order_productObject) throws DaoException;
   
   /**
    * Update <Code>Order_product</Code> instance to persistence store
    *
    * @param order_productObject
    * @throws DaoException
    */
   public void update(Order_product order_productObject) throws DaoException;
   
   /**
    * Save or update <Code>Order_product</Code> instance to persistence store
    *
    * @param order_productObject
    * @throws DaoException
    */
   public void saveOrUpdate(Order_product order_productObject) throws DaoException;

   /**
    * Get all <Code>Order_product</Code> instances from persistence store
    *
    * @return <Code>Order_product</Code> instance list
    * @throws DaoException
    */
   public List getOrder_productList() throws DaoException;
   
   /**
    * Get all <Code>Order_product</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Order_product</Code> instance list
    * @throws DaoException
    */
   public List getOrder_productList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Order_product</Code> instances by example instance
    *
    * @param order_productObject example instance
    * @return <Code>Order_product</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Order_product order_productObject) throws DaoException;
   
   /**
    * Find <Code>Order_product</Code> instances from persistence store by pnum
    *
    * @param pnum
    * @return <Code>Order_product</Code> instance list
    * @throws DaoException
    */
   public List findByPnum(int pnum) throws DaoException;
      
   /**
    * Find <Code>Order_product</Code> instances in range firstResult, maxResult
    * from persistence store by field pnum
    *
    * @param pnum
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Order_product</Code> instance list
    * @throws DaoException
    */
   public List findByPnum(int pnum, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Order_product</Code> instances from persistence store by price
    *
    * @param price
    * @return <Code>Order_product</Code> instance list
    * @throws DaoException
    */
   public List findByPrice(double price) throws DaoException;
      
   /**
    * Find <Code>Order_product</Code> instances in range firstResult, maxResult
    * from persistence store by field price
    *
    * @param price
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Order_product</Code> instance list
    * @throws DaoException
    */
   public List findByPrice(double price, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Order_product</Code> instances from persistence store by Order
    *
    * @param order
    * @return <Code>Order_product</Code> instance list
    * @throws DaoException
    */
   public List findByOrder(hobuy.domain.Order order) throws DaoException;
   
   /**
    * Find <Code>Order_product</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Order
    *
    * @param order
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Order_product</Code> instance list
    * @throws DaoException
    */
   public List findByOrder(hobuy.domain.Order order, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Order_product</Code> instances from persistence store by Repertory
    *
    * @param repertory
    * @return <Code>Order_product</Code> instance list
    * @throws DaoException
    */
   public List findByRepertory(hobuy.domain.Repertory repertory) throws DaoException;
   
   /**
    * Find <Code>Order_product</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Repertory
    *
    * @param repertory
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Order_product</Code> instance list
    * @throws DaoException
    */
   public List findByRepertory(hobuy.domain.Repertory repertory, int firstResult, int maxResult) throws DaoException;
}