/***********************************************************************
 * Module:  AuthorityPK.java
 * Author:  ZD
 * Purpose: Defines the priamry key class for class Authority
 ***********************************************************************/
 
package hobuy.domain;

import java.util.*;

/**
 * Generated primary key class for Authority. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 *
 */
public class AuthorityPK implements java.io.Serializable{
   /** @pdOid 0754c473-4951-4eb9-b9bc-70b06746dc65 */
   private int id;
   
   /**
    * Empty constructor
    *
    */
   public AuthorityPK(){
      // TODO Auto-generated constructor stub
   }
   
   /**
    * Constructor with parameters
    *  
    * @param id parameter to set value of field id
    */
   public AuthorityPK(int id) {
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
   
      AuthorityPK cast = (AuthorityPK) other;
   
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
      ret.append( "hobuy.domain.AuthorityPK: " );
      ret.append( "id='" + id + "'");
      return ret.toString();
   }
}