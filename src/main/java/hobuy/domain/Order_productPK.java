/***********************************************************************
 * Module:  Order_productPK.java
 * Author:  ZD
 * Purpose: Defines the priamry key class for class Order_product
 ***********************************************************************/
 
package hobuy.domain;

import java.util.*;

/**
 * Generated primary key class for Order_product. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 *
 */
public class Order_productPK implements java.io.Serializable{
   /** @pdOid cffd1d05-a6d6-4d1e-91ec-0a12ce467e94 */
   private long id;
   
   /**
    * Empty constructor
    *
    */
   public Order_productPK(){
      // TODO Auto-generated constructor stub
   }
   
   /**
    * Constructor with parameters
    *  
    * @param id parameter to set value of field id
    */
   public Order_productPK(long id) {
      this.id = id;
   }

   /**
    * Get value of id
    *
    * @return id 
    */
   public long getId()
   {
      return id;
   }
   
   /**
    * Set value of id
    *
    * @param newId 
    */
   public void setId(long newId)
   {
      this.id = newId;
   }

   /* (non-Javadoc)
    * @see java.lang.Object#equals(java.lang.Object)
    */
   public boolean equals(Object other) {
   
      if (other == null) {
         return false;
      }
      
      if (other == this) {
         return true;
      }
      
      if (! (other.getClass() ==  getClass()))
         return false;
   
      Order_productPK cast = (Order_productPK) other;
   
      if (this.id != cast.getId())
         return false;
   
      return true;
   }

   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
      int _hashCode = 0;
      _hashCode = 29 * _hashCode + (new Long(id)).hashCode();
      return _hashCode;
   }

  
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Order_productPK: " );
      ret.append( "id='" + id + "'");
      return ret.toString();
   }
}