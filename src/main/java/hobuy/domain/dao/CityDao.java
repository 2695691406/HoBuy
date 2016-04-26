/***********************************************************************
 * Module:  CityDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class City
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.City;
import hobuy.domain.CityPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class City
 * 
 */
public interface CityDao extends Dao {
   
   /**
    * Save <Code>City</Code> instance
    *
    * @param cityObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(City cityObject) throws DaoException;
  
   /**
    * Load <Code>City</Code> instance by primary key
    *
    * @param pk
    * @return <Code>City</Code> instance
    * @throws DaoException
    */
   public City load(CityPK pk) throws DaoException;

   /**
    * Delete <Code>City</Code> instance from persistence store
    *
    * @param cityObject
    * @throws DaoException
    */
   public void delete(City cityObject) throws DaoException;
   
   /**
    * Update <Code>City</Code> instance to persistence store
    *
    * @param cityObject
    * @throws DaoException
    */
   public void update(City cityObject) throws DaoException;
   
   /**
    * Save or update <Code>City</Code> instance to persistence store
    *
    * @param cityObject
    * @throws DaoException
    */
   public void saveOrUpdate(City cityObject) throws DaoException;

   /**
    * Get all <Code>City</Code> instances from persistence store
    *
    * @return <Code>City</Code> instance list
    * @throws DaoException
    */
   public List getCityList() throws DaoException;
   
   /**
    * Get all <Code>City</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>City</Code> instance list
    * @throws DaoException
    */
   public List getCityList(int firstResult, int maxResult);
   
   /**
    * Query <Code>City</Code> instances by example instance
    *
    * @param cityObject example instance
    * @return <Code>City</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(City cityObject) throws DaoException;
   
   /**
    * Find <Code>City</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>City</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>City</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>City</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
}