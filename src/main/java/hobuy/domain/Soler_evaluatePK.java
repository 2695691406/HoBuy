/***********************************************************************
 * Module:  Soler_evaluatePK.java
 * Author:  ZD
 * Purpose: Defines the priamry key class for class Soler_evaluate
 ***********************************************************************/
 
package hobuy.domain;

import java.util.*;

/**
 * Generated primary key class for Soler_evaluate. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 *
 */
public class Soler_evaluatePK implements java.io.Serializable{
   /** @pdOid 80fb84f2-c8e5-4c9a-aaac-a1a8823cff5d */
   private long id;
   
   /**
    * Empty constructor
    *
    */
   public Soler_evaluatePK(){
      // TODO Auto-generated constructor stub
   }
   
   /**
    * Constructor with parameters
    *  
    * @param id parameter to set value of field id
    */
   public Soler_evaluatePK(long id) {
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
   
      Soler_evaluatePK cast = (Soler_evaluatePK) other;
   
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
      ret.append( "hobuy.domain.Soler_evaluatePK: " );
      ret.append( "id='" + id + "'");
      return ret.toString();
   }
}