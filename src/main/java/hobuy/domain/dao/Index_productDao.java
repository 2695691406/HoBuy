/***********************************************************************
 * Module:  Index_productDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Index_product
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Index_product;
import hobuy.domain.Index_productPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Index_product
 * 
 */
public interface Index_productDao extends Dao {
   
   /**
    * Save <Code>Index_product</Code> instance
    *
    * @param index_productObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Index_product index_productObject) throws DaoException;
  
   /**
    * Load <Code>Index_product</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Index_product</Code> instance
    * @throws DaoException
    */
   public Index_product load(Index_productPK pk) throws DaoException;

   /**
    * Delete <Code>Index_product</Code> instance from persistence store
    *
    * @param index_productObject
    * @throws DaoException
    */
   public void delete(Index_product index_productObject) throws DaoException;
   
   /**
    * Update <Code>Index_product</Code> instance to persistence store
    *
    * @param index_productObject
    * @throws DaoException
    */
   public void update(Index_product index_productObject) throws DaoException;
   
   /**
    * Save or update <Code>Index_product</Code> instance to persistence store
    *
    * @param index_productObject
    * @throws DaoException
    */
   public void saveOrUpdate(Index_product index_productObject) throws DaoException;

   /**
    * Get all <Code>Index_product</Code> instances from persistence store
    *
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List getIndex_productList() throws DaoException;
   
   /**
    * Get all <Code>Index_product</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List getIndex_productList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Index_product</Code> instances by example instance
    *
    * @param index_productObject example instance
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Index_product index_productObject) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances from persistence store by startdate
    *
    * @param startdate
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByStartdate(java.util.Date startdate) throws DaoException;
      
   /**
    * Find <Code>Index_product</Code> instances in range firstResult, maxResult
    * from persistence store by field startdate
    *
    * @param startdate
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByStartdate(java.util.Date startdate, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances from persistence store by enddate
    *
    * @param enddate
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByEnddate(java.util.Date enddate) throws DaoException;
      
   /**
    * Find <Code>Index_product</Code> instances in range firstResult, maxResult
    * from persistence store by field enddate
    *
    * @param enddate
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByEnddate(java.util.Date enddate, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances from persistence store by imgurl
    *
    * @param imgurl
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByImgurl(java.lang.String imgurl) throws DaoException;
      
   /**
    * Find <Code>Index_product</Code> instances in range firstResult, maxResult
    * from persistence store by field imgurl
    *
    * @param imgurl
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByImgurl(java.lang.String imgurl, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances from persistence store by createtime
    *
    * @param createtime
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByCreatetime(java.util.Date createtime) throws DaoException;
      
   /**
    * Find <Code>Index_product</Code> instances in range firstResult, maxResult
    * from persistence store by field createtime
    *
    * @param createtime
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByCreatetime(java.util.Date createtime, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances from persistence store by state
    *
    * @param state
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state) throws DaoException;
      
   /**
    * Find <Code>Index_product</Code> instances in range firstResult, maxResult
    * from persistence store by field state
    *
    * @param state
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances from persistence store by price
    *
    * @param price
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByPrice(double price) throws DaoException;
      
   /**
    * Find <Code>Index_product</Code> instances in range firstResult, maxResult
    * from persistence store by field price
    *
    * @param price
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByPrice(double price, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances from persistence store by Index_postion
    *
    * @param index_postion
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByIndex_postion(hobuy.domain.Index_postion index_postion) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Index_postion
    *
    * @param index_postion
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByIndex_postion(hobuy.domain.Index_postion index_postion, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances from persistence store by Product
    *
    * @param product
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByProduct(hobuy.domain.Product product) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Product
    *
    * @param product
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByProduct(hobuy.domain.Product product, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances from persistence store by Worker
    *
    * @param worker
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByWorker(hobuy.domain.Worker worker) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Worker
    *
    * @param worker
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByWorker(hobuy.domain.Worker worker, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances from persistence store by University
    *
    * @param university
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByUniversity(hobuy.domain.University university) throws DaoException;
   
   /**
    * Find <Code>Index_product</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by University
    *
    * @param university
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_product</Code> instance list
    * @throws DaoException
    */
   public List findByUniversity(hobuy.domain.University university, int firstResult, int maxResult) throws DaoException;
}