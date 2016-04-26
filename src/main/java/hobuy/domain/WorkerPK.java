/***********************************************************************
 * Module:  WorkerPK.java
 * Author:  ZD
 * Purpose: Defines the priamry key class for class Worker
 ***********************************************************************/
 
package hobuy.domain;

import java.util.*;

/**
 * Generated primary key class for Worker. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 *
 */
public class WorkerPK implements java.io.Serializable{
   /** @pdOid 81349948-f99e-4044-af2c-6c90257fdb5c */
   private java.lang.String id;
   
   /**
    * Empty constructor
    *
    */
   public WorkerPK(){
      // TODO Auto-generated constructor stub
   }
   
   /**
    * Constructor with parameters
    *  
    * @param id parameter to set value of field id
    */
   public WorkerPK(java.lang.String id) {
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
   
      WorkerPK cast = (WorkerPK) other;
   
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
      ret.append( "hobuy.domain.WorkerPK: " );
      ret.append( "id='" + id + "'");
      return ret.toString();
   }
}