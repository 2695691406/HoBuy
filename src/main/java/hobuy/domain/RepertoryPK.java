/***********************************************************************
 * Module:  RepertoryPK.java
 * Author:  ZD
 * Purpose: Defines the priamry key class for class Repertory
 ***********************************************************************/
 
package hobuy.domain;

import java.util.*;

/**
 * Generated primary key class for Repertory. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 *
 */
public class RepertoryPK implements java.io.Serializable{
   /** @pdOid 22e40e7f-9674-421e-afda-e6d3fb888ea1 */
   private long id;
   
   /**
    * Empty constructor
    *
    */
   public RepertoryPK(){
      // TODO Auto-generated constructor stub
   }
   
   /**
    * Constructor with parameters
    *  
    * @param id parameter to set value of field id
    */
   public RepertoryPK(long id) {
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
   
      RepertoryPK cast = (RepertoryPK) other;
   
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
      ret.append( "hobuy.domain.RepertoryPK: " );
      ret.append( "id='" + id + "'");
      return ret.toString();
   }
}