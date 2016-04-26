/***********************************************************************
 * Module:  Soler_evaluate.java
 * Author:  ZD
 * Purpose: Defines the Class Soler_evaluate
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 商家评价表，每个用户可以拥有多个评价，评价包含评价内容，评价等级，评价人，评价时间，评价订单号
 * 
 * @pdOid f3034462-398d-45bf-a61f-2863e8f9ebaa */
public class Soler_evaluate implements java.io.Serializable {
   /** @pdOid 80fb84f2-c8e5-4c9a-aaac-a1a8823cff5d */
   private long id;
   /** @pdOid 7ed2cc68-fa84-4db6-9e50-5345dc22d6ec */
   private java.util.Date time;
   /** @pdOid d73c1efa-9101-49eb-b5da-5e787ef4ef33 */
   private java.lang.String content;
   /** @pdOid 85094cae-605b-4abc-9f30-c9c086df321f */
   private int evaluate_level;
   
   /** @pdRoleInfo migr=no name=Soler assc=Reference_12 mult=0..1 side=A */
   public Soler soler;
   /** @pdRoleInfo migr=no name=User assc=Reference_13 mult=0..1 side=A */
   public User user;
   /** @pdRoleInfo migr=no name=Order assc=Reference_14 mult=0..1 side=A */
   public Order order;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Soler_evaluate() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid 47290983-b671-493e-9810-61ad615c25da */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid e5b17135-c75c-4659-859a-cef379b48705 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid d2381b6d-fb9b-437e-a9a4-b3449dff3fb7 */
   public java.util.Date getTime() {
      return time;
   }
   
   /** @param newTime
    * @pdOid f03bf3f2-628d-41b5-853e-a240c0f87f54 */
   public void setTime(java.util.Date newTime) {
      time = newTime;
   }
   
   /** @pdOid bf7ed3f0-8d1d-4f5b-8e0d-b8adb1400f17 */
   public java.lang.String getContent() {
      return content;
   }
   
   /** @param newContent
    * @pdOid 7c9ce4a4-5e52-418d-85a4-b441c83a2d59 */
   public void setContent(java.lang.String newContent) {
      content = newContent;
   }
   
   /** @pdOid 3efd78b4-8f0a-4e61-88eb-cff738cc8b9e */
   public int getEvaluate_level() {
      return evaluate_level;
   }
   
   /** @param newEvaluate_level
    * @pdOid 0c51c84e-b372-4091-b0db-2bd0a0e0f9ca */
   public void setEvaluate_level(int newEvaluate_level) {
      evaluate_level = newEvaluate_level;
   }
   
   
   /**
    * @pdGenerated default parent getter
    */
   public Soler getSoler() {
      return soler;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newSoler
    */
   public void setSoler(Soler newSoler) {
      if (this.soler == null || !this.soler.equals(newSoler))
      {
         if (this.soler != null)
         {
            Soler oldSoler = this.soler;
            this.soler = null;
            //oldSoler.removeSoler_evaluate(this);
         }
         if (newSoler != null)
         {
            this.soler = newSoler;
            //this.soler.addSoler_evaluate(this);
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
            //oldUser.removeSoler_evaluate(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            //this.user.addSoler_evaluate(this);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Order getOrder() {
      return order;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newOrder
    */
   public void setOrder(Order newOrder) {
      if (this.order == null || !this.order.equals(newOrder))
      {
         if (this.order != null)
         {
            Order oldOrder = this.order;
            this.order = null;
            //oldOrder.removeSoler_evaluate(this);
         }
         if (newOrder != null)
         {
            this.order = newOrder;
            //this.order.addSoler_evaluate(this);
         }
      }
   }
   
   /**
    * Get value of soler_evaluatePK.
    *
    * @return soler_evaluatePK object
    */
   public Soler_evaluatePK getSoler_evaluatePK() {
      return new Soler_evaluatePK(id);
   }
   
   /**
    * Set value of soler_evaluatePK.
    * 
    * @param pk
    */
   public void setSoler_evaluatePK(Soler_evaluatePK pk) {
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
   
      if (!(other instanceof Soler_evaluate))
         return false;
   
      Soler_evaluate cast = (Soler_evaluate) other;
   
      if (this.id != cast.getId())
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
      ret.append( "hobuy.domain.Soler_evaluate: " );
      ret.append( "id='" + id + "'");
      ret.append( "time='" + time + "'");
      ret.append( "content='" + content + "'");
      ret.append( "evaluate_level='" + evaluate_level + "'");
      return ret.toString();
   }

}