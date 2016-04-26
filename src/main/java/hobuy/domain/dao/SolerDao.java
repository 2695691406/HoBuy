/***********************************************************************
 * Module:  SolerDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Soler
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Soler;
import hobuy.domain.SolerPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Soler
 * 
 */
public interface SolerDao extends Dao {
   
   /**
    * Save <Code>Soler</Code> instance
    *
    * @param solerObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Soler solerObject) throws DaoException;
  
   /**
    * Load <Code>Soler</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Soler</Code> instance
    * @throws DaoException
    */
   public Soler load(SolerPK pk) throws DaoException;

   /**
    * Delete <Code>Soler</Code> instance from persistence store
    *
    * @param solerObject
    * @throws DaoException
    */
   public void delete(Soler solerObject) throws DaoException;
   
   /**
    * Update <Code>Soler</Code> instance to persistence store
    *
    * @param solerObject
    * @throws DaoException
    */
   public void update(Soler solerObject) throws DaoException;
   
   /**
    * Save or update <Code>Soler</Code> instance to persistence store
    *
    * @param solerObject
    * @throws DaoException
    */
   public void saveOrUpdate(Soler solerObject) throws DaoException;

   /**
    * Get all <Code>Soler</Code> instances from persistence store
    *
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List getSolerList() throws DaoException;
   
   /**
    * Get all <Code>Soler</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List getSolerList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Soler</Code> instances by example instance
    *
    * @param solerObject example instance
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Soler solerObject) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by photoimg
    *
    * @param photoimg
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByPhotoimg(java.lang.String photoimg) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field photoimg
    *
    * @param photoimg
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByPhotoimg(java.lang.String photoimg, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by email
    *
    * @param email
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByEmail(java.lang.String email) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field email
    *
    * @param email
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByEmail(java.lang.String email, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by pwd
    *
    * @param pwd
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByPwd(java.lang.String pwd) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field pwd
    *
    * @param pwd
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByPwd(java.lang.String pwd, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by phone
    *
    * @param phone
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field phone
    *
    * @param phone
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by introduce
    *
    * @param introduce
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByIntroduce(java.lang.String introduce) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field introduce
    *
    * @param introduce
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByIntroduce(java.lang.String introduce, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by address
    *
    * @param address
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByAddress(java.lang.String address) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field address
    *
    * @param address
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByAddress(java.lang.String address, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by createtime
    *
    * @param createtime
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByCreatetime(java.util.Date createtime) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field createtime
    *
    * @param createtime
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByCreatetime(java.util.Date createtime, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by state
    *
    * @param state
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field state
    *
    * @param state
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by arrage
    *
    * @param arrage
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByArrage(byte arrage) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field arrage
    *
    * @param arrage
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByArrage(byte arrage, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by reputaion
    *
    * @param reputaion
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByReputaion(double reputaion) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field reputaion
    *
    * @param reputaion
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByReputaion(double reputaion, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by count
    *
    * @param count
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByCount(int count) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field count
    *
    * @param count
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByCount(int count, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by authentication
    *
    * @param authentication
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByAuthentication(int authentication) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field authentication
    *
    * @param authentication
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByAuthentication(int authentication, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by type
    *
    * @param type
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByType(int type) throws DaoException;
      
   /**
    * Find <Code>Soler</Code> instances in range firstResult, maxResult
    * from persistence store by field type
    *
    * @param type
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByType(int type, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances from persistence store by University
    *
    * @param university
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByUniversity(hobuy.domain.University university) throws DaoException;
   
   /**
    * Find <Code>Soler</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by University
    *
    * @param university
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Soler</Code> instance list
    * @throws DaoException
    */
   public List findByUniversity(hobuy.domain.University university, int firstResult, int maxResult) throws DaoException;
}