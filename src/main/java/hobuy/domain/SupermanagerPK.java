/***********************************************************************
 * Module:  SupermanagerPK.java
 * Author:  ZD
 * Purpose: Defines the priamry key class for class Supermanager
 ***********************************************************************/
 
package hobuy.domain;

import java.util.*;

/**
 * Generated primary key class for Supermanager. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 *
 */
public class SupermanagerPK implements java.io.Serializable{
   /** @pdOid c27ca9cd-87c8-4c39-aeb6-2a366e241da7 */
   private java.lang.String id;
   
   /**
    * Empty constructor
    *
    */
   public SupermanagerPK(){
      // TODO Auto-generated constructor stub
   }
   
   /**
    * Constructor with parameters
    *  
    * @param id parameter to set value of field id
    */
   public SupermanagerPK(java.lang.String id) {
      this.id = id;
   }

   /**
    * Get value of id
    *
    * @return id 
    */
   public java.lang.String getId()
   {
      return id;
   }
   
   /**
    * Set value of id
    *
    * @param newId 
    */
   public void setId(java.lang.String newId)
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
   
      SupermanagerPK cast = (SupermanagerPK) other;
   
      if (this.id == null ? cast.getId() != this.id : !this.id.equals( cast.getId()))
         return false;
   
      return true;
   }

   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
      int _hashCode = 0;
      if (this.id != null) 
         _hashCode = 29 * _hashCode + id.hashCode();
      return _hashCode;
   }

  
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.SupermanagerPK: " );
      ret.append( "id='" + id + "'");
      return ret.toString();
   }
}