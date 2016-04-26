/***********************************************************************
 * Module:  DaoFactory.java
 * Author:  ZD
 * Purpose: Defines Dao factory class
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

/**
 * Abstract factory class that defines Dao creation interface.
 *
 */
public abstract class DaoFactory {
 
   /**
    * Static function to get concrete Dao factory implementation
    *
    * @return Dao factory implementation
    */
   public static DaoFactory getDaoFactory(){        
      // Get Dao factory type
      String type = System.getProperty("DAOFactoryType","Hibernate");
      if (type.equalsIgnoreCase("Hibernate")) {
         return new HibernateDaoFactory();  
      }         
      // Default
      return new HibernateDaoFactory();        
   }

   /**
    * Empty constructor
    */
   public DaoFactory() {
      super();       
   }
   

   /**
    * Get concrete <Code>SolerDao</Code> implementation
    *
    * @return concrete <Code>SolerDao</Code> implementation
    */
   public abstract SolerDao getSolerDao();
   
   /**
    * Get concrete <Code>UserDao</Code> implementation
    *
    * @return concrete <Code>UserDao</Code> implementation
    */
   public abstract UserDao getUserDao();
   
   /**
    * Get concrete <Code>WaiterDao</Code> implementation
    *
    * @return concrete <Code>WaiterDao</Code> implementation
    */
   public abstract WaiterDao getWaiterDao();
   
   /**
    * Get concrete <Code>Img_groupDao</Code> implementation
    *
    * @return concrete <Code>Img_groupDao</Code> implementation
    */
   public abstract Img_groupDao getImg_groupDao();
   
   /**
    * Get concrete <Code>Order_productDao</Code> implementation
    *
    * @return concrete <Code>Order_productDao</Code> implementation
    */
   public abstract Order_productDao getOrder_productDao();
   
   /**
    * Get concrete <Code>OrderDao</Code> implementation
    *
    * @return concrete <Code>OrderDao</Code> implementation
    */
   public abstract OrderDao getOrderDao();
   
   /**
    * Get concrete <Code>ShoppingcartDao</Code> implementation
    *
    * @return concrete <Code>ShoppingcartDao</Code> implementation
    */
   public abstract ShoppingcartDao getShoppingcartDao();
   
   /**
    * Get concrete <Code>Product_evaluateDao</Code> implementation
    *
    * @return concrete <Code>Product_evaluateDao</Code> implementation
    */
   public abstract Product_evaluateDao getProduct_evaluateDao();
   
   /**
    * Get concrete <Code>ClazzDao</Code> implementation
    *
    * @return concrete <Code>ClazzDao</Code> implementation
    */
   public abstract ClazzDao getClazzDao();
   
   /**
    * Get concrete <Code>RepertoryDao</Code> implementation
    *
    * @return concrete <Code>RepertoryDao</Code> implementation
    */
   public abstract RepertoryDao getRepertoryDao();
   
   /**
    * Get concrete <Code>ProductDao</Code> implementation
    *
    * @return concrete <Code>ProductDao</Code> implementation
    */
   public abstract ProductDao getProductDao();
   
   /**
    * Get concrete <Code>Soler_propertyDao</Code> implementation
    *
    * @return concrete <Code>Soler_propertyDao</Code> implementation
    */
   public abstract Soler_propertyDao getSoler_propertyDao();
   
   /**
    * Get concrete <Code>Soler_evaluateDao</Code> implementation
    *
    * @return concrete <Code>Soler_evaluateDao</Code> implementation
    */
   public abstract Soler_evaluateDao getSoler_evaluateDao();
   
   /**
    * Get concrete <Code>User_evaluateDao</Code> implementation
    *
    * @return concrete <Code>User_evaluateDao</Code> implementation
    */
   public abstract User_evaluateDao getUser_evaluateDao();
   
   /**
    * Get concrete <Code>AddressDao</Code> implementation
    *
    * @return concrete <Code>AddressDao</Code> implementation
    */
   public abstract AddressDao getAddressDao();

}