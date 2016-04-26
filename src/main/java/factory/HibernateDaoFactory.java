/***********************************************************************
 * Module:  HibernateDaoFactory.java
 * Author:  ZD
 * Purpose: Defines Hibernate implmentation of Dao factory
 ***********************************************************************/
 
package factory;

import hobuy.domain.dao.SolerDao;
import hobuy.domain.dao.UserDao;
import hobuy.domain.dao.WaiterDao;
import hobuy.domain.dao.Img_groupDao;
import hobuy.domain.dao.Order_productDao;
import hobuy.domain.dao.OrderDao;
import hobuy.domain.dao.ShoppingcartDao;
import hobuy.domain.dao.Product_evaluateDao;
import hobuy.domain.dao.ClazzDao;
import hobuy.domain.dao.RepertoryDao;
import hobuy.domain.dao.ProductDao;
import hobuy.domain.dao.Soler_propertyDao;
import hobuy.domain.dao.Soler_evaluateDao;
import hobuy.domain.dao.User_evaluateDao;
import hobuy.domain.dao.AddressDao;
import hobuy.domain.daoimpl.hibernate.SolerDaoImpl;
import hobuy.domain.daoimpl.hibernate.UserDaoImpl;
import hobuy.domain.daoimpl.hibernate.WaiterDaoImpl;
import hobuy.domain.daoimpl.hibernate.Img_groupDaoImpl;
import hobuy.domain.daoimpl.hibernate.Order_productDaoImpl;
import hobuy.domain.daoimpl.hibernate.OrderDaoImpl;
import hobuy.domain.daoimpl.hibernate.ShoppingcartDaoImpl;
import hobuy.domain.daoimpl.hibernate.Product_evaluateDaoImpl;
import hobuy.domain.daoimpl.hibernate.ClazzDaoImpl;
import hobuy.domain.daoimpl.hibernate.RepertoryDaoImpl;
import hobuy.domain.daoimpl.hibernate.ProductDaoImpl;
import hobuy.domain.daoimpl.hibernate.Soler_propertyDaoImpl;
import hobuy.domain.daoimpl.hibernate.Soler_evaluateDaoImpl;
import hobuy.domain.daoimpl.hibernate.User_evaluateDaoImpl;
import hobuy.domain.daoimpl.hibernate.AddressDaoImpl;

/**
 * Dao factory to provide data access by Hibernate.
 *
 */
public class HibernateDaoFactory extends DaoFactory {

   /**
    * Empty constructor
    */
   public HibernateDaoFactory() {
      super();       
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getSolerDao()
    */
   public SolerDao getSolerDao() {
      return new SolerDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getUserDao()
    */
   public UserDao getUserDao() {
      return new UserDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getWaiterDao()
    */
   public WaiterDao getWaiterDao() {
      return new WaiterDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getImg_groupDao()
    */
   public Img_groupDao getImg_groupDao() {
      return new Img_groupDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getOrder_productDao()
    */
   public Order_productDao getOrder_productDao() {
      return new Order_productDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getOrderDao()
    */
   public OrderDao getOrderDao() {
      return new OrderDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getShoppingcartDao()
    */
   public ShoppingcartDao getShoppingcartDao() {
      return new ShoppingcartDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getProduct_evaluateDao()
    */
   public Product_evaluateDao getProduct_evaluateDao() {
      return new Product_evaluateDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getClazzDao()
    */
   public ClazzDao getClazzDao() {
      return new ClazzDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getRepertoryDao()
    */
   public RepertoryDao getRepertoryDao() {
      return new RepertoryDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getProductDao()
    */
   public ProductDao getProductDao() {
      return new ProductDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getSoler_propertyDao()
    */
   public Soler_propertyDao getSoler_propertyDao() {
      return new Soler_propertyDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getSoler_evaluateDao()
    */
   public Soler_evaluateDao getSoler_evaluateDao() {
      return new Soler_evaluateDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getUser_evaluateDao()
    */
   public User_evaluateDao getUser_evaluateDao() {
      return new User_evaluateDaoImpl();
   }
   
   /* (non-Javadoc)
    * @see factory.DaoFactory#getAddressDao()
    */
   public AddressDao getAddressDao() {
      return new AddressDaoImpl();
   }

}