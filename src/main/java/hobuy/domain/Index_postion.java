/***********************************************************************
 * Module:  Index_postion.java
 * Author:  ZD
 * Purpose: Defines the Class Index_postion
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 主页位置表
 * 
 * @pdOid 74807b51-ddd0-4523-a5f4-cd5ea47dfd2b */
public class Index_postion implements java.io.Serializable {
   /** @pdOid 4fa91cba-31c3-4193-ac07-b6adb0f39baa */
   private long id;
   /** @pdOid 2e7b524f-dc75-4a70-8c60-cc8c92e5bf63 */
   private java.lang.String name;
   /** @pdOid 29de98c8-de3d-49c8-b451-589a23b6bfba */
   private java.lang.String introduce;
   /** @pdOid ee9e627c-9c7f-4031-b9df-f4eae5c1fd7c */
   private java.lang.String postionname;
   
   /** @pdRoleInfo migr=no name=Index_product assc=Reference_26 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Index_product> index_product;
   /** @pdRoleInfo migr=no name=Manager assc=Reference_40 mult=0..1 side=A */
   public Manager manager;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Index_postion() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid c2914bfc-3d21-41e5-b653-d26c063b5936 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 4e1da60c-6ba9-4451-9115-7bfd574f4f56 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 13b64656-1b47-4f73-a0bf-5f9c589376b9 */
   public java.lang.String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 4067120f-7374-4e45-90d2-72853f525d3a */
   public void setName(java.lang.String newName) {
      name = newName;
   }
   
   /** @pdOid 2167a03b-f225-45b6-9ce1-8e7daabcab2f */
   public java.lang.String getIntroduce() {
      return introduce;
   }
   
   /** @param newIntroduce
    * @pdOid 6375bdaa-c7cb-4442-b0cd-5dbb5fb42f08 */
   public void setIntroduce(java.lang.String newIntroduce) {
      introduce = newIntroduce;
   }
   
   /** @pdOid ac70bad0-5ccc-4e79-8326-57158595f37f */
   public java.lang.String getPostionname() {
      return postionname;
   }
   
   /** @param newPostionname
    * @pdOid 56900607-8940-48d7-bd09-ffffbdde27d5 */
   public void setPostionname(java.lang.String newPostionname) {
      postionname = newPostionname;
   }
   
   
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Index_product> getIndex_product() {
      if (index_product == null)
         index_product = new java.util.HashSet<Index_product>();
      return index_product;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorIndex_product() {
      if (index_product == null)
         index_product = new java.util.HashSet<Index_product>();
      return index_product.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newIndex_product
    */
   public void setIndex_product(java.util.Collection<Index_product> newIndex_product) {
      //removeAllIndex_product();
      this.index_product = newIndex_product;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newIndex_product
    */
   public void addIndex_product(Index_product newIndex_product) {
      if (newIndex_product == null)
         return;
      if (this.index_product == null)
         this.index_product = new java.util.HashSet<Index_product>();
      if (!this.index_product.contains(newIndex_product))
      {
         this.index_product.add(newIndex_product);
         newIndex_product.setIndex_postion(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldIndex_product
    */
   public void removeIndex_product(Index_product oldIndex_product) {
      if (oldIndex_product == null)
         return;
      if (this.index_product != null)
         if (this.index_product.contains(oldIndex_product))
         {
            this.index_product.remove(oldIndex_product);
            oldIndex_product.setIndex_postion((Index_postion)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllIndex_product() {
      if (index_product != null)
      {
         Index_product oldIndex_product;
         for (java.util.Iterator iter = getIteratorIndex_product(); iter.hasNext();)
         {
            oldIndex_product = (Index_product)iter.next();
            iter.remove();
            oldIndex_product.setIndex_postion((Index_postion)null);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Manager getManager() {
      return manager;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newManager
    */
   public void setManager(Manager newManager) {
      if (this.manager == null || !this.manager.equals(newManager))
      {
         if (this.manager != null)
         {
            Manager oldManager = this.manager;
            this.manager = null;
            //oldManager.removeIndex_postion(this);
         }
         if (newManager != null)
         {
            this.manager = newManager;
            //this.manager.addIndex_postion(this);
         }
      }
   }
   
   /**
    * Get value of index_postionPK.
    *
    * @return index_postionPK object
    */
   public Index_postionPK getIndex_postionPK() {
      return new Index_postionPK(id);
   }
   
   /**
    * Set value of index_postionPK.
    * 
    * @param pk
    */
   public void setIndex_postionPK(Index_postionPK pk) {
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
   
      if (!(other instanceof Index_postion))
         return false;
   
      Index_postion cast = (Index_postion) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.name == null ? cast.getName() != this.name : !this.name.equals( cast.getName()))
         return false;
   
      if (this.introduce == null ? cast.getIntroduce() != this.introduce : !this.introduce.equals( cast.getIntroduce()))
         return false;
   
      if (this.postionname == null ? cast.getPostionname() != this.postionname : !this.postionname.equals( cast.getPostionname()))
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
      if (this.introduce != null) 
         hashCode = 29 * hashCode + introduce.hashCode();
      if (this.postionname != null) 
         hashCode = 29 * hashCode + postionname.hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Index_postion: " );
      ret.append( "id='" + id + "'");
      ret.append( "name='" + name + "'");
      ret.append( "introduce='" + introduce + "'");
      ret.append( "postionname='" + postionname + "'");
      return ret.toString();
   }

}