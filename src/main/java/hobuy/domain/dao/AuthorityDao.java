/***********************************************************************
 * Module:  AuthorityDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Authority
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Authority;
import hobuy.domain.AuthorityPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Authority
 * 
 */
public interface AuthorityDao extends Dao {
   
   /**
    * Save <Code>Authority</Code> instance
    *
    * @param authorityObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Authority authorityObject) throws DaoException;
  
   /**
    * Load <Code>Authority</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Authority</Code> instance
    * @throws DaoException
    */
   public Authority load(AuthorityPK pk) throws DaoException;

   /**
    * Delete <Code>Authority</Code> instance from persistence store
    *
    * @param authorityObject
    * @throws DaoException
    */
   public void delete(Authority authorityObject) throws DaoException;
   
   /**
    * Update <Code>Authority</Code> instance to persistence store
    *
    * @param authorityObject
    * @throws DaoException
    */
   public void update(Authority authorityObject) throws DaoException;
   
   /**
    * Save or update <Code>Authority</Code> instance to persistence store
    *
    * @param authorityObject
    * @throws DaoException
    */
   public void saveOrUpdate(Authority authorityObject) throws DaoException;

   /**
    * Get all <Code>Authority</Code> instances from persistence store
    *
    * @return <Code>Authority</Code> instance list
    * @throws DaoException
    */
   public List getAuthorityList() throws DaoException;
   
   /**
    * Get all <Code>Authority</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Authority</Code> instance list
    * @throws DaoException
    */
   public List getAuthorityList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Authority</Code> instances by example instance
    *
    * @param authorityObject example instance
    * @return <Code>Authority</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Authority authorityObject) throws DaoException;
   
   /**
    * Find <Code>Authority</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>Authority</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>Authority</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Authority</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Authority</Code> instances from persistence store by introduce
    *
    * @param introduce
    * @return <Code>Authority</Code> instance list
    * @throws DaoException
    */
   public List findByIntroduce(java.lang.String introduce) throws DaoException;
      
   /**
    * Find <Code>Authority</Code> instances in range firstResult, maxResult
    * from persistence store by field introduce
    *
    * @param introduce
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Authority</Code> instance list
    * @throws DaoException
    */
   public List findByIntroduce(java.lang.String introduce, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Authority</Code> instances from persistence store by level
    *
    * @param level
    * @return <Code>Authority</Code> instance list
    * @throws DaoException
    */
   public List findByLevel(int level) throws DaoException;
      
   /**
    * Find <Code>Authority</Code> instances in range firstResult, maxResult
    * from persistence store by field level
    *
    * @param level
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Authority</Code> instance list
    * @throws DaoException
    */
   public List findByLevel(int level, int firstResult, int maxResult) throws DaoException;
}