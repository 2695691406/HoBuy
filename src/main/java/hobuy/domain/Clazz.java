/***********************************************************************
 * Module:  Clazz.java
 * Author:  ZD
 * Purpose: Defines the Class Clazz
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 商品类别
 * 
 * @pdOid 84dfbd06-2ef5-41e4-ad97-e70ea11ae49d */
public class Clazz implements java.io.Serializable {
   /** @pdOid 379b385b-8be2-44a1-90de-9e0fbcb0adeb */
   private long id;
   /** @pdOid 5a97bde0-f3dc-40ba-a636-fd11c001550d */
   private int type;
   /** @pdOid 79262b01-4351-421c-91cb-add1e9decd9f */
   private java.lang.String name;
   /** @pdOid cc7c5cc6-8d1c-41d5-8fd5-9c60fa7bcab5 */
   private int parent_id;
   /** @pdOid 4a393135-4641-4d98-984a-96f57c028b47 */
   private int state;
   
   /** @pdRoleInfo migr=no name=Product assc=clazz_product coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Product> product;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Clazz() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid dd7fcfc3-bf84-4850-ac97-66757cc2377c */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid cc7100bb-1436-4ece-afc0-34570fc2345c */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid ba5cebc8-245a-401c-a9c1-ad2d4dc4b84f */
   public int getType() {
      return type;
   }
   
   /** @param newType
    * @pdOid 6e351629-9d5d-43c5-a8da-06c9c20c1b89 */
   public void setType(int newType) {
      type = newType;
   }
   
   /** @pdOid 784380ed-b213-4939-95f2-39b5867048ad */
   public java.lang.String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 522262f0-0f7a-4cfe-b5f7-47c15d70b551 */
   public void setName(java.lang.String newName) {
      name = newName;
   }
   
   /** @pdOid 382ebbec-823e-4496-af9c-0106c33587de */
   public int getParent_id() {
      return parent_id;
   }
   
   /** @param newParent_id
    * @pdOid 2210e916-10ad-4fdb-a694-6fb5d4e02b78 */
   public void setParent_id(int newParent_id) {
      parent_id = newParent_id;
   }
   
   /** @pdOid 723edbc3-19f4-4216-be0d-2024592f7083 */
   public int getState() {
      return state;
   }
   
   /** @param newState
    * @pdOid 947cb055-9679-42b6-af28-8d8b501c783b */
   public void setState(int newState) {
      state = newState;
   }
   
   
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Product> getProduct() {
      if (product == null)
         product = new java.util.HashSet<Product>();
      return product;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorProduct() {
      if (product == null)
         product = new java.util.HashSet<Product>();
      return product.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newProduct
    */
   public void setProduct(java.util.Collection<Product> newProduct) {
      //removeAllProduct();
      this.product = newProduct;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newProduct
    */
   public void addProduct(Product newProduct) {
      if (newProduct == null)
         return;
      if (this.product == null)
         this.product = new java.util.HashSet<Product>();
      if (!this.product.contains(newProduct))
      {
         this.product.add(newProduct);
         newProduct.setClazz(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldProduct
    */
   public void removeProduct(Product oldProduct) {
      if (oldProduct == null)
         return;
      if (this.product != null)
         if (this.product.contains(oldProduct))
         {
            this.product.remove(oldProduct);
            oldProduct.setClazz((Clazz)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllProduct() {
      if (product != null)
      {
         Product oldProduct;
         for (java.util.Iterator iter = getIteratorProduct(); iter.hasNext();)
         {
            oldProduct = (Product)iter.next();
            iter.remove();
            oldProduct.setClazz((Clazz)null);
         }
      }
   }
   
   /**
    * Get value of clazzPK.
    *
    * @return clazzPK object
    */
   public ClazzPK getClazzPK() {
      return new ClazzPK(id);
   }
   
   /**
    * Set value of clazzPK.
    * 
    * @param pk
    */
   public void setClazzPK(ClazzPK pk) {
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
   
      if (!(other instanceof Clazz))
         return false;
   
      Clazz cast = (Clazz) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.type != cast.getType())
         return false;
   
      if (this.name == null ? cast.getName() != this.name : !this.name.equals( cast.getName()))
         return false;
   
      if (this.parent_id != cast.getParent_id())
         return false;
   
      if (this.state != cast.getState())
         return false;
   
      return true;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
      int hashCode = 0;
      hashCode = 29 * hashCode + (new Long(id)).hashCode();
      hashCode = 29 * hashCode + (new Integer(type)).hashCode();
      if (this.name != null) 
         hashCode = 29 * hashCode + name.hashCode();
      hashCode = 29 * hashCode + (new Integer(parent_id)).hashCode();
      hashCode = 29 * hashCode + (new Integer(state)).hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Clazz: " );
      ret.append( "id='" + id + "'");
      ret.append( "type='" + type + "'");
      ret.append( "name='" + name + "'");
      ret.append( "parent_id='" + parent_id + "'");
      ret.append( "state='" + state + "'");
      return ret.toString();
   }

}