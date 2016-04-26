/***********************************************************************
 * Module:  Img_groupDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Img_group
 ***********************************************************************/
 
package hobuy.domain.dao;

import java.util.*;
import java.io.Serializable;
import hobuy.domain.Img_group;
import hobuy.domain.Img_groupPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

/**
 * dao interface that defines data access methods for class Img_group
 * 
 */
public interface Img_groupDao extends Dao {
   
   /**
    * Save <Code>Img_group</Code> instance
    *
    * @param img_groupObject
    * @return identifier
    * @throws DaoException
    */
   public Serializable save(Img_group img_groupObject) throws DaoException;
  
   /**
    * Load <Code>Img_group</Code> instance by primary key
    *
    * @param pk
    * @return <Code>Img_group</Code> instance
    * @throws DaoException
    */
   public Img_group load(Img_groupPK pk) throws DaoException;

   /**
    * Delete <Code>Img_group</Code> instance from persistence store
    *
    * @param img_groupObject
    * @throws DaoException
    */
   public void delete(Img_group img_groupObject) throws DaoException;
   
   /**
    * Update <Code>Img_group</Code> instance to persistence store
    *
    * @param img_groupObject
    * @throws DaoException
    */
   public void update(Img_group img_groupObject) throws DaoException;
   
   /**
    * Save or update <Code>Img_group</Code> instance to persistence store
    *
    * @param img_groupObject
    * @throws DaoException
    */
   public void saveOrUpdate(Img_group img_groupObject) throws DaoException;

   /**
    * Get all <Code>Img_group</Code> instances from persistence store
    *
    * @return <Code>Img_group</Code> instance list
    * @throws DaoException
    */
   public List getImg_groupList() throws DaoException;
   
   /**
    * Get all <Code>Img_group</Code> instances from persistence store by range
    *
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Img_group</Code> instance list
    * @throws DaoException
    */
   public List getImg_groupList(int firstResult, int maxResult);
   
   /**
    * Query <Code>Img_group</Code> instances by example instance
    *
    * @param img_groupObject example instance
    * @return <Code>Img_group</Code> instance list
    * @throws DaoException
    */
   public List queryByExample(Img_group img_groupObject) throws DaoException;
   
   /**
    * Find <Code>Img_group</Code> instances from persistence store by img1url
    *
    * @param img1url
    * @return <Code>Img_group</Code> instance list
    * @throws DaoException
    */
   public List findByImg1url(java.lang.String img1url) throws DaoException;
      
   /**
    * Find <Code>Img_group</Code> instances in range firstResult, maxResult
    * from persistence store by field img1url
    *
    * @param img1url
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Img_group</Code> instance list
    * @throws DaoException
    */
   public List findByImg1url(java.lang.String img1url, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Img_group</Code> instances from persistence store by img2url
    *
    * @param img2url
    * @return <Code>Img_group</Code> instance list
    * @throws DaoException
    */
   public List findByImg2url(java.lang.String img2url) throws DaoException;
      
   /**
    * Find <Code>Img_group</Code> instances in range firstResult, maxResult
    * from persistence store by field img2url
    *
    * @param img2url
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Img_group</Code> instance list
    * @throws DaoException
    */
   public List findByImg2url(java.lang.String img2url, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Img_group</Code> instances from persistence store by img3url
    *
    * @param img3url
    * @return <Code>Img_group</Code> instance list
    * @throws DaoException
    */
   public List findByImg3url(java.lang.String img3url) throws DaoException;
      
   /**
    * Find <Code>Img_group</Code> instances in range firstResult, maxResult
    * from persistence store by field img3url
    *
    * @param img3url
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Img_group</Code> instance list
    * @throws DaoException
    */
   public List findByImg3url(java.lang.String img3url, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Img_group</Code> instances from persistence store by img4url
    *
    * @param img4url
    * @return <Code>Img_group</Code> instance list
    * @throws DaoException
    */
   public List findByImg4url(java.lang.String img4url) throws DaoException;
      
   /**
    * Find <Code>Img_group</Code> instances in range firstResult, maxResult
    * from persistence store by field img4url
    *
    * @param img4url
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Img_group</Code> instance list
    * @throws DaoException
    */
   public List findByImg4url(java.lang.String img4url, int firstResult, int maxResult) throws DaoException;
   
   /**
    * Find <Code>Img_group</Code> instances from persistence store by img5url
    *
    * @param img5url
    * @return <Code>Img_group</Code> instance list
    * @throws DaoException
    */
   public List findByImg5url(java.lang.String img5url) throws DaoException;
      
   /**
    * Find <Code>Img_group</Code> instances in range firstResult, maxResult
    * from persistence store by field img5url
    *
    * @param img5url
    * @param firstResult first result to return
    * @param maxResult max result to return
    * @return <Code>Img_group</Code> instance list
    * @throws DaoException
    */
   public List findByImg5url(java.lang.String img5url, int firstResult, int maxResult) throws DaoException;
}