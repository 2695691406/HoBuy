/***********************************************************************
 * Module:  User_evaluate.java
 * Author:  ZD
 * Purpose: Defines the Class User_evaluate
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 用户评价表，每个用户可以拥有多个评价，评价包含评价内容，评价等级，评价人，评价时间，评价订单号
 * 
 * @pdOid db9265a1-787c-4262-b440-a0e32f26355b */
public class User_evaluate implements java.io.Serializable {
   /** @pdOid e869bab5-f8c8-4139-9a54-861f65e9ce1f */
   private long id;
   /** @pdOid f73df0d1-f1a6-4b0a-9c05-74c3e7ea3749 */
   private java.util.Date time;
   /** @pdOid 0c5e0305-0a36-4ff3-ac6c-8ba0ea9af9f6 */
   private java.lang.String content;
   /** @pdOid 7c8d5670-23f0-4287-9bd3-0c0c39089c18 */
   private int evaluate_level;
   
   /** @pdRoleInfo migr=no name=Soler assc=Reference_15 mult=0..1 side=A */
   public Soler soler;
   /** @pdRoleInfo migr=no name=User assc=Reference_16 mult=0..1 side=A */
   public User user;
   /** @pdRoleInfo migr=no name=Order assc=Reference_17 mult=0..1 side=A */
   public Order order;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public User_evaluate() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid 0f6254f8-676b-4465-b282-94e23eb7b27c */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 4a108129-002a-4221-96d3-27daca2bf1b1 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 4e7dd66f-642b-4bf1-ad8d-6c5827a39467 */
   public java.util.Date getTime() {
      return time;
   }
   
   /** @param newTime
    * @pdOid f135318d-b013-4ee8-babb-81e5ceb1371d */
   public void setTime(java.util.Date newTime) {
      time = newTime;
   }
   
   /** @pdOid 0f2aab89-b256-4bc4-91bc-ad9fff381e06 */
   public java.lang.String getContent() {
      return content;
   }
   
   /** @param newContent
    * @pdOid dd8ff476-3211-467f-bb13-7b2c900ee5b9 */
   public void setContent(java.lang.String newContent) {
      content = newContent;
   }
   
   /** @pdOid c03d0d23-02f4-451a-8156-b26c2802e368 */
   public int getEvaluate_level() {
      return evaluate_level;
   }
   
   /** @param newEvaluate_level
    * @pdOid fc3f38c4-81fb-4f69-ab95-1a4311240b33 */
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
            //oldSoler.removeUser_evaluate(this);
         }
         if (newSoler != null)
         {
            this.soler = newSoler;
            //this.soler.addUser_evaluate(this);
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
            //oldUser.removeUser_evaluate(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            //this.user.addUser_evaluate(this);
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
            //oldOrder.removeUser_evaluate(this);
         }
         if (newOrder != null)
         {
            this.order = newOrder;
            //this.order.addUser_evaluate(this);
         }
      }
   }
   
   /**
    * Get value of user_evaluatePK.
    *
    * @return user_evaluatePK object
    */
   public User_evaluatePK getUser_evaluatePK() {
      return new User_evaluatePK(id);
   }
   
   /**
    * Set value of user_evaluatePK.
    * 
    * @param pk
    */
   public void setUser_evaluatePK(User_evaluatePK pk) {
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
   
      if (!(other instanceof User_evaluate))
         return false;
   
      User_evaluate cast = (User_evaluate) other;
   
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
      ret.append( "hobuy.domain.User_evaluate: " );
      ret.append( "id='" + id + "'");
      ret.append( "time='" + time + "'");
      ret.append( "content='" + content + "'");
      ret.append( "evaluate_level='" + evaluate_level + "'");
      return ret.toString();
   }

}