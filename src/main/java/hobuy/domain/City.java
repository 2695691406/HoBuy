/***********************************************************************
 * Module:  City.java
 * Author:  ZD
 * Purpose: Defines the Class City
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 各城市代号表
 * 
 * @pdOid 904421df-49b1-4939-9cdd-8adbb6653c07 */
public class City implements java.io.Serializable {
   /** @pdOid 69f5b19e-d845-4dd6-9879-088b2f3e1679 */
   private long id;
   /** @pdOid b5304b09-52b2-4ae1-8fb0-0a0cb1d3447b */
   private java.lang.String name;
   
   /** @pdRoleInfo migr=no name=University assc=Reference_28 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<University> university;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public City() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid a0af84b0-a730-4ab6-bfb4-3ac3d1ae5b1d */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid ab88899b-d51e-46ed-97f3-4b2c7fba3e00 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 0daefb23-3775-46d0-b968-51bc3dc70dc5 */
   public java.lang.String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid c1947392-65ee-4408-be21-99d2821f3699 */
   public void setName(java.lang.String newName) {
      name = newName;
   }
   
   
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<University> getUniversity() {
      if (university == null)
         university = new java.util.HashSet<University>();
      return university;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorUniversity() {
      if (university == null)
         university = new java.util.HashSet<University>();
      return university.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newUniversity
    */
   public void setUniversity(java.util.Collection<University> newUniversity) {
      //removeAllUniversity();
      this.university = newUniversity;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newUniversity
    */
   public void addUniversity(University newUniversity) {
      if (newUniversity == null)
         return;
      if (this.university == null)
         this.university = new java.util.HashSet<University>();
      if (!this.university.contains(newUniversity))
      {
         this.university.add(newUniversity);
         newUniversity.setCity(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldUniversity
    */
   public void removeUniversity(University oldUniversity) {
      if (oldUniversity == null)
         return;
      if (this.university != null)
         if (this.university.contains(oldUniversity))
         {
            this.university.remove(oldUniversity);
            oldUniversity.setCity((City)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllUniversity() {
      if (university != null)
      {
         University oldUniversity;
         for (java.util.Iterator iter = getIteratorUniversity(); iter.hasNext();)
         {
            oldUniversity = (University)iter.next();
            iter.remove();
            oldUniversity.setCity((City)null);
         }
      }
   }
   
   /**
    * Get value of cityPK.
    *
    * @return cityPK object
    */
   public CityPK getCityPK() {
      return new CityPK(id);
   }
   
   /**
    * Set value of cityPK.
    * 
    * @param pk
    */
   public void setCityPK(CityPK pk) {
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
   
      if (!(other instanceof City))
         return false;
   
      City cast = (City) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.name == null ? cast.getName() != this.name : !this.name.equals( cast.getName()))
         return false;
   
      return true;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
      int hashCode = 0;
      hashCode = 29 * hashCode + (new Long(id)).hashCode();
      if (this.name != null) 
         hashCode = 29 * hashCode + name.hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.City: " );
      ret.append( "id='" + id + "'");
      ret.append( "name='" + name + "'");
      return ret.toString();
   }

}