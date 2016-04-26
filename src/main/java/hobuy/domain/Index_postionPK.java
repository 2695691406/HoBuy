/***********************************************************************
 * Module:  Index_postionPK.java
 * Author:  ZD
 * Purpose: Defines the priamry key class for class Index_postion
 ***********************************************************************/
 
package hobuy.domain;

import java.util.*;

/**
 * Generated primary key class for Index_postion. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 *
 */
public class Index_postionPK implements java.io.Serializable{
   /** @pdOid 4fa91cba-31c3-4193-ac07-b6adb0f39baa */
   private long id;
   
   /**
    * Empty constructor
    *
    */
   public Index_postionPK(){
      // TODO Auto-generated constructor stub
   }
   
   /**
    * Constructor with parameters
    *  
    * @param id parameter to set value of field id
    */
   public Index_postionPK(long id) {
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
   
      Index_postionPK cast = (Index_postionPK) other;
   
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
      ret.append( "hobuy.domain.Index_postionPK: " );
      ret.append( "id='" + id + "'");
      return ret.toString();
   }
}