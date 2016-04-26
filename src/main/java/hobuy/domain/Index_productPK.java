/***********************************************************************
 * Module:  Index_productPK.java
 * Author:  ZD
 * Purpose: Defines the priamry key class for class Index_product
 ***********************************************************************/
 
package hobuy.domain;

import java.util.*;

/**
 * Generated primary key class for Index_product. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 *
 */
public class Index_productPK implements java.io.Serializable{
   /** @pdOid a5d23f2f-3baa-4069-9d67-1e371aee6c52 */
   private int id;
   
   /**
    * Empty constructor
    *
    */
   public Index_productPK(){
      // TODO Auto-generated constructor stub
   }
   
   /**
    * Constructor with parameters
    *  
    * @param id parameter to set value of field id
    */
   public Index_productPK(int id) {
      this.id = id;
   }

   /**
    * Get value of id
    *
    * @return id 
    */
   public int getId()
   {
      return id;
   }
   
   /**
    * Set value of id
    *
    * @param newId 
    */
   public void setId(int newId)
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
   
      Index_productPK cast = (Index_productPK) other;
   
      if (this.id != cast.getId())
         return false;
   
      return true;
   }

   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
      int _hashCode = 0;
      _hashCode = 29 * _hashCode + (new Integer(id)).hashCode();
      return _hashCode;
   }

  
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Index_productPK: " );
      ret.append( "id='" + id + "'");
      return ret.toString();
   }
}