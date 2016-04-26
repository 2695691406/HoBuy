/***********************************************************************
 * Module:  University.java
 * Author:  ZD
 * Purpose: Defines the Class University
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 大学表主要用来辅助固定的大学，商品展示，由于网站只是校内服务，以大学分区很合适
 * 
 * @pdOid b48b1436-34e5-4fc6-b2cc-13073c34d048 */
public class University implements java.io.Serializable {
   /** @pdOid 2152fb1d-831c-4902-b164-3f42587a502b */
   private int id;
   /** @pdOid 56964383-6cd4-476d-b0e7-de05147fdf23 */
   private java.lang.String name;
   
   /** @pdRoleInfo migr=no name=User assc=Reference_29 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<User> user;
   /** @pdRoleInfo migr=no name=Soler assc=Reference_30 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Soler> soler;
   /** @pdRoleInfo migr=no name=Product assc=Reference_31 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Product> product;
   /** @pdRoleInfo migr=no name=Index_product assc=Reference_43 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Index_product> index_product;
   /** @pdRoleInfo migr=no name=City assc=Reference_28 mult=0..1 side=A */
   public City city;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public University() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid ae22532f-936e-4838-bbf0-20d04528267b */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 98577f3c-bbe9-4918-af6a-d33388d0bf86 */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid d4567c43-2725-47ac-8e0d-ee3802102dc9 */
   public java.lang.String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 286fe4f5-529c-4eb3-bd8e-e074240526ec */
   public void setName(java.lang.String newName) {
      name = newName;
   }
   
   
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<User> getUser() {
      if (user == null)
         user = new java.util.HashSet<User>();
      return user;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorUser() {
      if (user == null)
         user = new java.util.HashSet<User>();
      return user.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newUser
    */
   public void setUser(java.util.Collection<User> newUser) {
      //removeAllUser();
      this.user = newUser;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newUser
    */
   public void addUser(User newUser) {
      if (newUser == null)
         return;
      if (this.user == null)
         this.user = new java.util.HashSet<User>();
      if (!this.user.contains(newUser))
      {
         this.user.add(newUser);
         newUser.setUniversity(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldUser
    */
   public void removeUser(User oldUser) {
      if (oldUser == null)
         return;
      if (this.user != null)
         if (this.user.contains(oldUser))
         {
            this.user.remove(oldUser);
            oldUser.setUniversity((University)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllUser() {
      if (user != null)
      {
         User oldUser;
         for (java.util.Iterator iter = getIteratorUser(); iter.hasNext();)
         {
            oldUser = (User)iter.next();
            iter.remove();
            oldUser.setUniversity((University)null);
         }
      }
   }
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Soler> getSoler() {
      if (soler == null)
         soler = new java.util.HashSet<Soler>();
      return soler;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorSoler() {
      if (soler == null)
         soler = new java.util.HashSet<Soler>();
      return soler.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newSoler
    */
   public void setSoler(java.util.Collection<Soler> newSoler) {
      //removeAllSoler();
      this.soler = newSoler;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newSoler
    */
   public void addSoler(Soler newSoler) {
      if (newSoler == null)
         return;
      if (this.soler == null)
         this.soler = new java.util.HashSet<Soler>();
      if (!this.soler.contains(newSoler))
      {
         this.soler.add(newSoler);
         newSoler.setUniversity(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldSoler
    */
   public void removeSoler(Soler oldSoler) {
      if (oldSoler == null)
         return;
      if (this.soler != null)
         if (this.soler.contains(oldSoler))
         {
            this.soler.remove(oldSoler);
            oldSoler.setUniversity((University)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllSoler() {
      if (soler != null)
      {
         Soler oldSoler;
         for (java.util.Iterator iter = getIteratorSoler(); iter.hasNext();)
         {
            oldSoler = (Soler)iter.next();
            iter.remove();
            oldSoler.setUniversity((University)null);
         }
      }
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
         newProduct.setUniversity(this);
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
            oldProduct.setUniversity((University)null);
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
            oldProduct.setUniversity((University)null);
         }
      }
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
         newIndex_product.setUniversity(this);
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
            oldIndex_product.setUniversity((University)null);
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
            oldIndex_product.setUniversity((University)null);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public City getCity() {
      return city;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newCity
    */
   public void setCity(City newCity) {
      if (this.city == null || !this.city.equals(newCity))
      {
         if (this.city != null)
         {
            City oldCity = this.city;
            this.city = null;
            //oldCity.removeUniversity(this);
         }
         if (newCity != null)
         {
            this.city = newCity;
            //this.city.addUniversity(this);
         }
      }
   }
   
   /**
    * Get value of universityPK.
    *
    * @return universityPK object
    */
   public UniversityPK getUniversityPK() {
      return new UniversityPK(id);
   }
   
   /**
    * Set value of universityPK.
    * 
    * @param pk
    */
   public void setUniversityPK(UniversityPK pk) {
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
   
      if (!(other instanceof University))
         return false;
   
      University cast = (University) other;
   
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
      hashCode = 29 * hashCode + (new Integer(id)).hashCode();
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
      ret.append( "hobuy.domain.University: " );
      ret.append( "id='" + id + "'");
      ret.append( "name='" + name + "'");
      return ret.toString();
   }

}