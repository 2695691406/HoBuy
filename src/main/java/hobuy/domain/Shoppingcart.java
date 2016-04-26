/***********************************************************************
 * Module:  Shoppingcart.java
 * Author:  ZD
 * Purpose: Defines the Class Shoppingcart
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 购物车表，为了方便分析用户的购买意向，我们将购物车单独作为一个表，此数据用来分析用户购买意向。
 * 
 * @pdOid 50d9a576-b845-47dd-94f5-4ec62e9ad2b6 */
public class Shoppingcart implements java.io.Serializable {
   /** @pdOid f70daba1-e5da-4a9e-a922-84fa7333d09e */
   private long id;
   /** @pdOid ebdb9371-c5c1-49c2-8913-f78afa779c5e */
   private int sum;
   /** @pdOid b3bbc4ac-fbf7-462d-bfd7-9105dd4c183f */
   private java.util.Date createtime;
   /** @pdOid f311a70e-ffcf-4ffe-8033-9569900cb775 */
   private int state = 1;
   
   /** @pdRoleInfo migr=no name=User assc=Reference_18 mult=0..1 side=A */
   public User user;
   /** @pdRoleInfo migr=no name=Repertory assc=Reference_19 mult=0..1 side=A */
   public Repertory repertory;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Shoppingcart() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid 5f9f38c2-feec-42b2-a21f-27819e46aec5 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 9c761012-ecdf-422d-98c6-9c83aa7827f1 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 631215ec-2eaf-4782-967c-c52248ef52b5 */
   public int getSum() {
      return sum;
   }
   
   /** @param newSum
    * @pdOid 4e0dfc31-1d01-45e0-8662-e9ecf3afc293 */
   public void setSum(int newSum) {
      sum = newSum;
   }
   
   /** @pdOid 302f4263-4685-4b90-8b5c-a9b8ec2709a9 */
   public java.util.Date getCreatetime() {
      return createtime;
   }
   
   /** @param newCreatetime
    * @pdOid 549fd80d-891a-4edc-a575-6ebc5164ed02 */
   public void setCreatetime(java.util.Date newCreatetime) {
      createtime = newCreatetime;
   }
   
   /** @pdOid 09aea3ff-d40e-41ab-a31a-67aa522a895c */
   public int getState() {
      return state;
   }
   
   /** @param newState
    * @pdOid ca12128e-6f0c-43a0-b3a9-5637187b0a44 */
   public void setState(int newState) {
      state = newState;
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
            //oldUser.removeShoppingcart(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            //this.user.addShoppingcart(this);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Repertory getRepertory() {
      return repertory;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newRepertory
    */
   public void setRepertory(Repertory newRepertory) {
      if (this.repertory == null || !this.repertory.equals(newRepertory))
      {
         if (this.repertory != null)
         {
            Repertory oldRepertory = this.repertory;
            this.repertory = null;
            //oldRepertory.removeShoppingcart(this);
         }
         if (newRepertory != null)
         {
            this.repertory = newRepertory;
            //this.repertory.addShoppingcart(this);
         }
      }
   }
   
   /**
    * Get value of shoppingcartPK.
    *
    * @return shoppingcartPK object
    */
   public ShoppingcartPK getShoppingcartPK() {
      return new ShoppingcartPK(id);
   }
   
   /**
    * Set value of shoppingcartPK.
    * 
    * @param pk
    */
   public void setShoppingcartPK(ShoppingcartPK pk) {
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
   
      if (!(other instanceof Shoppingcart))
         return false;
   
      Shoppingcart cast = (Shoppingcart) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.sum != cast.getSum())
         return false;
   
      if (this.createtime == null ? cast.getCreatetime() != this.createtime : !(com.sybase.orm.util.Util.compareDate(this.createtime,  cast.getCreatetime(), java.util.Calendar.SECOND) == 0))
         return false;
   
      if (this.state != cast.getState())
         return false;
   
      return true;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
      int hashCode = 0;
      hashCode = 29 * hashCode + (new Long(id)).hashCode();
      hashCode = 29 * hashCode + (new Integer(sum)).hashCode();
      if (this.createtime != null) 
         hashCode = 29 * hashCode + createtime.hashCode();
      hashCode = 29 * hashCode + (new Integer(state)).hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Shoppingcart: " );
      ret.append( "id='" + id + "'");
      ret.append( "sum='" + sum + "'");
      ret.append( "createtime='" + createtime + "'");
      ret.append( "state='" + state + "'");
      return ret.toString();
   }

}