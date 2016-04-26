/***********************************************************************
 * Module:  UniversityDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class University
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.University;
import hobuy.domain.UniversityPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class University
 * 
 */
public interface UniversityDao extends Dao {
   
   /**
    * Save <Code>University</Code> instance
    *
    * @param universityObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(University universityObject) throws DaoException;
  
   /**
    * Load <Code>University</Code> instance by primary key
    *
    * @param pk
    * @return <Code>University</Code> instance
    * @throws DaoException
    */
   public University load(UniversityPK pk) throws DaoException;

   /**
    * Delete <Code>University</Code> instance from persistence store
    *
    * @param universityObject
    * @throws DaoException
    */
   public void delete(University universityObject) throws DaoException;
   
   /**
    * Update <Code>University</Code> instance to persistence store
    *
    * @param universityObject
    * @throws DaoException
    */
   public void update(University universityObject) throws DaoException;
   
   /**
    * Save or update <Code>University</Code> instance to persistence store
    *
    * @param universityObject
    * @throws DaoException
    */
   public void saveOrUpdate(University universityObject) throws DaoException;

   /**
    * Get all <Code>University</Code> instances from persistence store
    *
    * @return <Code>University</Code> instance list
    * @throws DaoException
    */
   public List getUniversityList() throws DaoException;
   
   /**
    * Get all <Code>University</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>University</Code> instance list
    * @throws DaoException
    */
   public List getUniversityList(int firstResult, int maxResult);
   
   /**
    * Query <Code>University</Code> instances by example instance
    *
    * @param universityObject example instance
    * @return <Code>University</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(University universityObject) throws DaoException;
   
   /**
    * Find <Code>University</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>University</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>University</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>University</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>University</Code> instances from persistence store by City
    *
    * @param city
    * @return <Code>University</Code> instance list
    * @throws DaoException
    */
   public List findByCity(hobuy.domain.City city) throws DaoException;
   
   /**
    * Find <Code>University</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by City
    *
    * @param city
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>University</Code> instance list
    * @throws DaoException
    */
   public List findByCity(hobuy.domain.City city, int firstResult, int maxResult) throws DaoException;
}