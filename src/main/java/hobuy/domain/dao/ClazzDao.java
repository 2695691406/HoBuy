/***********************************************************************
 * Module:  ClazzDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Clazz
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Clazz;
import hobuy.domain.ClazzPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Clazz
 * 
 */
public interface ClazzDao extends Dao {
   
   /**
    * Save <Code>Clazz</Code> instance
    *
    * @param clazzObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Clazz clazzObject) throws DaoException;
  
   /**
    * Load <Code>Clazz</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Clazz</Code> instance
    * @throws DaoException
    */
   public Clazz load(ClazzPK pk) throws DaoException;

   /**
    * Delete <Code>Clazz</Code> instance from persistence store
    *
    * @param clazzObject
    * @throws DaoException
    */
   public void delete(Clazz clazzObject) throws DaoException;
   
   /**
    * Update <Code>Clazz</Code> instance to persistence store
    *
    * @param clazzObject
    * @throws DaoException
    */
   public void update(Clazz clazzObject) throws DaoException;
   
   /**
    * Save or update <Code>Clazz</Code> instance to persistence store
    *
    * @param clazzObject
    * @throws DaoException
    */
   public void saveOrUpdate(Clazz clazzObject) throws DaoException;

   /**
    * Get all <Code>Clazz</Code> instances from persistence store
    *
    * @return <Code>Clazz</Code> instance list
    * @throws DaoException
    */
   public List getClazzList() throws DaoException;
   
   /**
    * Get all <Code>Clazz</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Clazz</Code> instance list
    * @throws DaoException
    */
   public List getClazzList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Clazz</Code> instances by example instance
    *
    * @param clazzObject example instance
    * @return <Code>Clazz</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Clazz clazzObject) throws DaoException;
   
   /**
    * Find <Code>Clazz</Code> instances from persistence store by type
    *
    * @param type
    * @return <Code>Clazz</Code> instance list
    * @throws DaoException
    */
   public List findByType(int type) throws DaoException;
      
   /**
    * Find <Code>Clazz</Code> instances in range firstResult, maxResult
    * from persistence store by field type
    *
    * @param type
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Clazz</Code> instance list
    * @throws DaoException
    */
   public List findByType(int type, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Clazz</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>Clazz</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>Clazz</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Clazz</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Clazz</Code> instances from persistence store by parent_id
    *
    * @param parent_id
    * @return <Code>Clazz</Code> instance list
    * @throws DaoException
    */
   public List findByParent_id(int parent_id) throws DaoException;
      
   /**
    * Find <Code>Clazz</Code> instances in range firstResult, maxResult
    * from persistence store by field parent_id
    *
    * @param parent_id
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Clazz</Code> instance list
    * @throws DaoException
    */
   public List findByParent_id(int parent_id, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Clazz</Code> instances from persistence store by state
    *
    * @param state
    * @return <Code>Clazz</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state) throws DaoException;
      
   /**
    * Find <Code>Clazz</Code> instances in range firstResult, maxResult
    * from persistence store by field state
    *
    * @param state
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Clazz</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state, int firstResult, int maxResult) throws DaoException;
}