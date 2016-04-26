/***********************************************************************
 * Module:  UserDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class User
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.User;
import hobuy.domain.UserPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class User
 * 
 */
public interface UserDao extends Dao {
   
   /**
    * Save <Code>User</Code> instance
    *
    * @param userObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(User userObject) throws DaoException;
  
   /**
    * Load <Code>User</Code> instance by primary key
    *
    * @param pk
    * @return <Code>User</Code> instance
    * @throws DaoException
    */
   public User load(UserPK pk) throws DaoException;

   /**
    * Delete <Code>User</Code> instance from persistence store
    *
    * @param userObject
    * @throws DaoException
    */
   public void delete(User userObject) throws DaoException;
   
   /**
    * Update <Code>User</Code> instance to persistence store
    *
    * @param userObject
    * @throws DaoException
    */
   public void update(User userObject) throws DaoException;
   
   /**
    * Save or update <Code>User</Code> instance to persistence store
    *
    * @param userObject
    * @throws DaoException
    */
   public void saveOrUpdate(User userObject) throws DaoException;

   /**
    * Get all <Code>User</Code> instances from persistence store
    *
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List getUserList() throws DaoException;
   
   /**
    * Get all <Code>User</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List getUserList(int firstResult, int maxResult);
   
   /**
    * Query <Code>User</Code> instances by example instance
    *
    * @param userObject example instance
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(User userObject) throws DaoException;
   
   /**
    * Find <Code>User</Code> instances from persistence store by photoimg
    *
    * @param photoimg
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByPhotoimg(java.lang.String photoimg) throws DaoException;
      
   /**
    * Find <Code>User</Code> instances in range firstResult, maxResult
    * from persistence store by field photoimg
    *
    * @param photoimg
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByPhotoimg(java.lang.String photoimg, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User</Code> instances from persistence store by email
    *
    * @param email
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByEmail(java.lang.String email) throws DaoException;
      
   /**
    * Find <Code>User</Code> instances in range firstResult, maxResult
    * from persistence store by field email
    *
    * @param email
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByEmail(java.lang.String email, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User</Code> instances from persistence store by pwd
    *
    * @param pwd
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByPwd(java.lang.String pwd) throws DaoException;
      
   /**
    * Find <Code>User</Code> instances in range firstResult, maxResult
    * from persistence store by field pwd
    *
    * @param pwd
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByPwd(java.lang.String pwd, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User</Code> instances from persistence store by name
    *
    * @param name
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name) throws DaoException;
      
   /**
    * Find <Code>User</Code> instances in range firstResult, maxResult
    * from persistence store by field name
    *
    * @param name
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User</Code> instances from persistence store by phone
    *
    * @param phone
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone) throws DaoException;
      
   /**
    * Find <Code>User</Code> instances in range firstResult, maxResult
    * from persistence store by field phone
    *
    * @param phone
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByPhone(java.lang.String phone, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User</Code> instances from persistence store by createtime
    *
    * @param createtime
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByCreatetime(java.util.Date createtime) throws DaoException;
      
   /**
    * Find <Code>User</Code> instances in range firstResult, maxResult
    * from persistence store by field createtime
    *
    * @param createtime
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByCreatetime(java.util.Date createtime, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User</Code> instances from persistence store by state
    *
    * @param state
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state) throws DaoException;
      
   /**
    * Find <Code>User</Code> instances in range firstResult, maxResult
    * from persistence store by field state
    *
    * @param state
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByState(int state, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User</Code> instances from persistence store by arrage
    *
    * @param arrage
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByArrage(byte arrage) throws DaoException;
      
   /**
    * Find <Code>User</Code> instances in range firstResult, maxResult
    * from persistence store by field arrage
    *
    * @param arrage
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByArrage(byte arrage, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User</Code> instances from persistence store by reputaion
    *
    * @param reputaion
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByReputaion(double reputaion) throws DaoException;
      
   /**
    * Find <Code>User</Code> instances in range firstResult, maxResult
    * from persistence store by field reputaion
    *
    * @param reputaion
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByReputaion(double reputaion, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User</Code> instances from persistence store by count
    *
    * @param count
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByCount(int count) throws DaoException;
      
   /**
    * Find <Code>User</Code> instances in range firstResult, maxResult
    * from persistence store by field count
    *
    * @param count
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByCount(int count, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User</Code> instances from persistence store by authentication
    *
    * @param authentication
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByAuthentication(int authentication) throws DaoException;
      
   /**
    * Find <Code>User</Code> instances in range firstResult, maxResult
    * from persistence store by field authentication
    *
    * @param authentication
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByAuthentication(int authentication, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>User</Code> instances from persistence store by University
    *
    * @param university
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByUniversity(hobuy.domain.University university) throws DaoException;
   
   /**
    * Find <Code>User</Code> instances  instances in range firstResult, maxResult 
    * from persistence store by University
    *
    * @param university
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>User</Code> instance list
    * @throws DaoException
    */
   public List findByUniversity(hobuy.domain.University university, int firstResult, int maxResult) throws DaoException;
}