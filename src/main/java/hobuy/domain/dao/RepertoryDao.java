/***********************************************************************
 * Module:  RepertoryDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Repertory
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Repertory;
import hobuy.domain.RepertoryPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Repertory
 * 
 */
public interface RepertoryDao extends Dao {
   
   /**
    * Save <Code>Repertory</Code> instance
    *
    * @param repertoryObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Repertory repertoryObject) throws DaoException;
  
   /**
    * Load <Code>Repertory</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Repertory</Code> instance
    * @throws DaoException
    */
   public Repertory load(RepertoryPK pk) throws DaoException;

   /**
    * Delete <Code>Repertory</Code> instance from persistence store
    *
    * @param repertoryObject
    * @throws DaoException
    */
   public void delete(Repertory repertoryObject) throws DaoException;
   
   /**
    * Update <Code>Repertory</Code> instance to persistence store
    *
    * @param repertoryObject
    * @throws DaoException
    */
   public void update(Repertory repertoryObject) throws DaoException;
   
   /**
    * Save or update <Code>Repertory</Code> instance to persistence store
    *
    * @param repertoryObject
    * @throws DaoException
    */
   public void saveOrUpdate(Repertory repertoryObject) throws DaoException;

   /**
    * Get all <Code>Repertory</Code> instances from persistence store
    *
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List getRepertoryList() throws DaoException;
   
   /**
    * Get all <Code>Repertory</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List getRepertoryList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Repertory</Code> instances by example instance
    *
    * @param repertoryObject example instance
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Repertory repertoryObject) throws DaoException;
   
   /**
    * Find <Code>Repertory</Code> instances from persistence store by pro1
    *
    * @param pro1
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByPro1(java.lang.String pro1) throws DaoException;
      
   /**
    * Find <Code>Repertory</Code> instances in range firstResult, maxResult
    * from persistence store by field pro1
    *
    * @param pro1
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByPro1(java.lang.String pro1, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Repertory</Code> instances from persistence store by pro2
    *
    * @param pro2
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByPro2(java.lang.String pro2) throws DaoException;
      
   /**
    * Find <Code>Repertory</Code> instances in range firstResult, maxResult
    * from persistence store by field pro2
    *
    * @param pro2
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByPro2(java.lang.String pro2, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Repertory</Code> instances from persistence store by pro3
    *
    * @param pro3
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByPro3(java.lang.String pro3) throws DaoException;
      
   /**
    * Find <Code>Repertory</Code> instances in range firstResult, maxResult
    * from persistence store by field pro3
    *
    * @param pro3
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByPro3(java.lang.String pro3, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Repertory</Code> instances from persistence store by bid
    *
    * @param bid
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByBid(double bid) throws DaoException;
      
   /**
    * Find <Code>Repertory</Code> instances in range firstResult, maxResult
    * from persistence store by field bid
    *
    * @param bid
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByBid(double bid, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Repertory</Code> instances from persistence store by price
    *
    * @param price
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByPrice(double price) throws DaoException;
      
   /**
    * Find <Code>Repertory</Code> instances in range firstResult, maxResult
    * from persistence store by field price
    *
    * @param price
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByPrice(double price, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Repertory</Code> instances from persistence store by sole_number
    *
    * @param sole_number
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findBySole_number(int sole_number) throws DaoException;
      
   /**
    * Find <Code>Repertory</Code> instances in range firstResult, maxResult
    * from persistence store by field sole_number
    *
    * @param sole_number
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findBySole_number(int sole_number, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Repertory</Code> instances from persistence store by repertory_nubmer
    *
    * @param repertory_nubmer
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByRepertory_nubmer(int repertory_nubmer) throws DaoException;
      
   /**
    * Find <Code>Repertory</Code> instances in range firstResult, maxResult
    * from persistence store by field repertory_nubmer
    *
    * @param repertory_nubmer
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByRepertory_nubmer(int repertory_nubmer, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Repertory</Code> instances from persistence store by state
    *
    * @param state
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state) throws DaoException;
      
   /**
    * Find <Code>Repertory</Code> instances in range firstResult, maxResult
    * from persistence store by field state
    *
    * @param state
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Repertory</Code> instances from persistence store by imgurl
    *
    * @param imgurl
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByImgurl(java.lang.String imgurl) throws DaoException;
      
   /**
    * Find <Code>Repertory</Code> instances in range firstResult, maxResult
    * from persistence store by field imgurl
    *
    * @param imgurl
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByImgurl(java.lang.String imgurl, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Repertory</Code> instances from persistence store by Product
    *
    * @param product
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByProduct(hobuy.domain.Product product) throws DaoException;
   
   /**
    * Find <Code>Repertory</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Product
    *
    * @param product
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Repertory</Code> instance list
    * @throws DaoException
    */
   public List findByProduct(hobuy.domain.Product product, int firstResult, int maxResult) throws DaoException;
}