/***********************************************************************
 * Module:  Index_postionDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Index_postion
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Index_postion;
import hobuy.domain.Index_postionPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Index_postion
 * 
 */
public interface Index_postionDao extends Dao {
   
   /**
    * Save <Code>Index_postion</Code> instance
    *
    * @param index_postionObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Index_postion index_postionObject) throws DaoException;
  
   /**
    * Load <Code>Index_postion</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Index_postion</Code> instance
    * @throws DaoException
    */
   public Index_postion load(Index_postionPK pk) throws DaoException;

   /**
    * Delete <Code>Index_postion</Code> instance from persistence store
    *
    * @param index_postionObject
    * @throws DaoException
    */
   public void delete(Index_postion index_postionObject) throws DaoException;
   
   /**
    * Update <Code>Index_postion</Code> instance to persistence store
    *
    * @param index_postionObject
    * @throws DaoException
    */
   public void update(Index_postion index_postionObject) throws DaoException;
   
   /**
    * Save or update <Code>Index_postion</Code> instance to persistence store
    *
    * @param index_postionObject
    * @throws DaoException
    */
   public void saveOrUpdate(Index_postion index_postionObject) throws DaoException;

   /**
    * Get all <Code>Index_postion</Code> instances from persistence store
    *
    * @return <Code>Index_postion</Code> instance list
    * @throws DaoException
    */
   public List getIndex_postionList() throws DaoException;
   
   /**
    * Get all <Code>Index_postion</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_postion</Code> instance list
    * @throws DaoException
    */
   public List getIndex_postionList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Index_postion</Code> instances by example instance
    *
    * @param index_postionObject example instance
    * @return <Code>Index_postion</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Index_postion index_postionObject) throws DaoException;
   
   /**
    * Find <Code>Index_postion</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>Index_postion</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>Index_postion</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_postion</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Index_postion</Code> instances from persistence store by introduce
    *
    * @param introduce
    * @return <Code>Index_postion</Code> instance list
    * @throws DaoException
    */
   public List findByIntroduce(java.lang.String introduce) throws DaoException;
      
   /**
    * Find <Code>Index_postion</Code> instances in range firstResult, maxResult
    * from persistence store by field introduce
    *
    * @param introduce
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_postion</Code> instance list
    * @throws DaoException
    */
   public List findByIntroduce(java.lang.String introduce, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Index_postion</Code> instances from persistence store by postionname
    *
    * @param postionname
    * @return <Code>Index_postion</Code> instance list
    * @throws DaoException
    */
   public List findByPostionname(java.lang.String postionname) throws DaoException;
      
   /**
    * Find <Code>Index_postion</Code> instances in range firstResult, maxResult
    * from persistence store by field postionname
    *
    * @param postionname
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_postion</Code> instance list
    * @throws DaoException
    */
   public List findByPostionname(java.lang.String postionname, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Index_postion</Code> instances from persistence store by Manager
    *
    * @param manager
    * @return <Code>Index_postion</Code> instance list
    * @throws DaoException
    */
   public List findByManager(hobuy.domain.Manager manager) throws DaoException;
   
   /**
    * Find <Code>Index_postion</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by Manager
    *
    * @param manager
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Index_postion</Code> instance list
    * @throws DaoException
    */
   public List findByManager(hobuy.domain.Manager manager, int firstResult, int maxResult) throws DaoException;
}