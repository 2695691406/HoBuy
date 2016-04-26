/***********************************************************************
 * Module:  Product_evaluate.java
 * Author:  ZD
 * Purpose: Defines the Class Product_evaluate
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 商品评价表，每个商品可以拥有多个评价，评价包含评价内容，评价等级，评价人，评价时间，评价订单号，评价商品
 * 
 * @pdOid 3b261272-bd98-4fa6-ba91-3d0fdc0a544c */
public class Product_evaluate implements java.io.Serializable {
   /** @pdOid 37a9172c-7959-45a6-9a12-f61444a482ff */
   private long id;
   /** @pdOid 2ad3d323-70fc-47e6-8885-bbfc77dcf637 */
   private long order_id;
   /** @pdOid a1e6f079-5e97-4047-8cea-3b6942f0e9b2 */
   private java.util.Date time;
   /** @pdOid d2ca35cd-fac5-496a-8ff4-afd9d0fe88d9 */
   private java.lang.String content;
   /** @pdOid f0c7dd98-1aa6-41a5-a867-17d4041308cd */
   private int evaluate_level;
   
   /** @pdRoleInfo migr=no name=Product assc=product_evaluate mult=0..1 side=A */
   public Product product;
   /** @pdRoleInfo migr=no name=User assc=user_evaluate_product mult=0..1 side=A */
   public User user;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Product_evaluate() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid 77b39168-569b-44a9-9057-3b5b3d03eb22 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 318a8852-1139-4ddb-8aab-55feabc4db24 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid a11b51bd-624b-422f-a3fc-2aa090a01f05 */
   public long getOrder_id() {
      return order_id;
   }
   
   /** @param newOrder_id
    * @pdOid 08367e18-c65f-461f-a742-d9468fca24cb */
   public void setOrder_id(long newOrder_id) {
      order_id = newOrder_id;
   }
   
   /** @pdOid 94df1e3f-a4f7-4d7f-ac39-571366f06791 */
   public java.util.Date getTime() {
      return time;
   }
   
   /** @param newTime
    * @pdOid 9a76fe2f-5893-491e-bc70-a22caa2bf542 */
   public void setTime(java.util.Date newTime) {
      time = newTime;
   }
   
   /** @pdOid c27be723-4f70-4ce9-af3f-3fd13fe2a022 */
   public java.lang.String getContent() {
      return content;
   }
   
   /** @param newContent
    * @pdOid 9f0d7afe-bc6d-46cf-8998-28ad7a29315b */
   public void setContent(java.lang.String newContent) {
      content = newContent;
   }
   
   /** @pdOid 04a53b3a-65a5-457d-90b1-1b58962db878 */
   public int getEvaluate_level() {
      return evaluate_level;
   }
   
   /** @param newEvaluate_level
    * @pdOid 15cb7f11-20b8-4487-8316-95b2890f21ed */
   public void setEvaluate_level(int newEvaluate_level) {
      evaluate_level = newEvaluate_level;
   }
   
   
   /**
    * @pdGenerated default parent getter
    */
   public Product getProduct() {
      return product;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newProduct
    */
   public void setProduct(Product newProduct) {
      if (this.product == null || !this.product.equals(newProduct))
      {
         if (this.product != null)
         {
            Product oldProduct = this.product;
            this.product = null;
            //oldProduct.removeProduct_evaluate(this);
         }
         if (newProduct != null)
         {
            this.product = newProduct;
            //this.product.addProduct_evaluate(this);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public User getUser() {
      return user;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newUser
    */
   public void setUser(User newUser) {
      if (this.user == null || !this.user.equals(newUser))
      {
         if (this.user != null)
         {
            User oldUser = this.user;
            this.user = null;
            //oldUser.removeProduct_evaluate(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            //this.user.addProduct_evaluate(this);
         }
      }
   }
   
   /**
    * Get value of product_evaluatePK.
    *
    * @return product_evaluatePK object
    */
   public Product_evaluatePK getProduct_evaluatePK() {
      return new Product_evaluatePK(id);
   }
   
   /**
    * Set value of product_evaluatePK.
    * 
    * @param pk
    */
   public void setProduct_evaluatePK(Product_evaluatePK pk) {
      if (pk != null) {
         this.id = pk.getId();
      }
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#equals(java.lang.Object)
    */
   public boolean equals(Object other) {
   
      if (other == null)
         return false;
      
      if (other == this)
         return true;   
   
      if (!(other instanceof Product_evaluate))
         return false;
   
      Product_evaluate cast = (Product_evaluate) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.order_id != cast.getOrder_id())
         return false;
   
      if (this.time == null ? cast.getTime() != this.time : !(com.sybase.orm.util.Util.compareDate(this.time,  cast.getTime(), java.util.Calendar.SECOND) == 0))
         return false;
   
      if (this.content == null ? cast.getContent() != this.content : !this.content.equals( cast.getContent()))
         return false;
   
      if (this.evaluate_level != cast.getEvaluate_level())
         return false;
   
      return true;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
      int hashCode = 0;
      hashCode = 29 * hashCode + (new Long(id)).hashCode();
      hashCode = 29 * hashCode + (new Long(order_id)).hashCode();
      if (this.time != null) 
         hashCode = 29 * hashCode + time.hashCode();
      if (this.content != null) 
         hashCode = 29 * hashCode + content.hashCode();
      hashCode = 29 * hashCode + (new Integer(evaluate_level)).hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Product_evaluate: " );
      ret.append( "id='" + id + "'");
      ret.append( "order_id='" + order_id + "'");
      ret.append( "time='" + time + "'");
      ret.append( "content='" + content + "'");
      ret.append( "evaluate_level='" + evaluate_level + "'");
      return ret.toString();
   }

}