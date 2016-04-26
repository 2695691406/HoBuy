/***********************************************************************
 * Module:  Soler_property.java
 * Author:  ZD
 * Purpose: Defines the Class Soler_property
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 主要用来自定义商品属性，我们只提供三个。并且属性表要与商品表关联，因为一旦商品使用属性组，则该属性组就不可以删除
 * 
 * @pdOid 6d649728-69c2-4fd1-a539-195b21411090 */
public class Soler_property implements java.io.Serializable {
   /** @pdOid 1d9cd7d5-a977-457a-842a-53e6f026c1ae */
   private long id;
   /** @pdOid 5e0eefdc-1dcf-489e-92e0-ad7c0e7f304b */
   private java.lang.String name;
   /** @pdOid 9939b597-2e38-4807-89dc-3f5acd06e328 */
   private java.lang.String pro1name;
   /** @pdOid 00c54a76-dbf5-4650-8552-4d490886cdc1 */
   private java.lang.String pro2name;
   /** @pdOid 35f991ae-df9b-4d2a-aa6a-df0a2eb8159f */
   private java.lang.String pro3name;
   /** @pdOid 2e7478d2-c3b8-4633-ac30-6f69a2fcbddc */
   private int pcount = 0;
   /** @pdOid 90d12e23-57ab-4073-b20d-f93a4f6f4e45 */
   private int state = 1;
   
   /** @pdRoleInfo migr=no name=Product assc=Reference_20 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Product> product;
   /** @pdRoleInfo migr=no name=Soler assc=soler_property mult=0..1 side=A */
   public Soler soler;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Soler_property() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid da9d4cae-3e7c-4ab1-88c3-3dc74b0effcd */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid c9716fa8-9b26-4aa3-bf87-cb9e5fd664ce */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 52d88488-60cc-46a7-9b41-448bcd9c62bd */
   public java.lang.String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 877d07e3-b766-49bb-b005-1f843a1abdab */
   public void setName(java.lang.String newName) {
      name = newName;
   }
   
   /** @pdOid 44818d9b-79c0-4757-9674-5b2fe01b32d2 */
   public java.lang.String getPro1name() {
      return pro1name;
   }
   
   /** @param newPro1name
    * @pdOid 116a5151-9d10-4a05-9b49-d72e49738f65 */
   public void setPro1name(java.lang.String newPro1name) {
      pro1name = newPro1name;
   }
   
   /** @pdOid 1c8f5ced-6184-4506-824a-34bad211204b */
   public java.lang.String getPro2name() {
      return pro2name;
   }
   
   /** @param newPro2name
    * @pdOid 19ba8df8-a5a9-459a-982c-33cc2aa87428 */
   public void setPro2name(java.lang.String newPro2name) {
      pro2name = newPro2name;
   }
   
   /** @pdOid 391c5002-2cdb-440c-ac19-a49b7b1312e3 */
   public java.lang.String getPro3name() {
      return pro3name;
   }
   
   /** @param newPro3name
    * @pdOid a534ee83-ed01-4884-908c-b466ae6efb35 */
   public void setPro3name(java.lang.String newPro3name) {
      pro3name = newPro3name;
   }
   
   /** @pdOid 96f0e947-b073-4d2c-8c1b-a38bb8f9b8af */
   public int getPcount() {
      return pcount;
   }
   
   /** @param newPcount
    * @pdOid 6b05c44d-6dcf-4078-9143-102d98141426 */
   public void setPcount(int newPcount) {
      pcount = newPcount;
   }
   
   /** @pdOid 252eb444-a4da-49dd-b693-192e7447045c */
   public int getState() {
      return state;
   }
   
   /** @param newState
    * @pdOid 3c958858-3d2f-4f76-b30d-aea1461aa3ec */
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
         newProduct.setSoler_property(this);
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
            oldProduct.setSoler_property((Soler_property)null);
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
            oldProduct.setSoler_property((Soler_property)null);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Soler getSoler() {
      return soler;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newSoler
    */
   public void setSoler(Soler newSoler) {
      if (this.soler == null || !this.soler.equals(newSoler))
      {
         if (this.soler != null)
         {
            Soler oldSoler = this.soler;
            this.soler = null;
            //oldSoler.removeSoler_property(this);
         }
         if (newSoler != null)
         {
            this.soler = newSoler;
            //this.soler.addSoler_property(this);
         }
      }
   }
   
   /**
    * Get value of soler_propertyPK.
    *
    * @return soler_propertyPK object
    */
   public Soler_propertyPK getSoler_propertyPK() {
      return new Soler_propertyPK(id);
   }
   
   /**
    * Set value of soler_propertyPK.
    * 
    * @param pk
    */
   public void setSoler_propertyPK(Soler_propertyPK pk) {
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
   
      if (!(other instanceof Soler_property))
         return false;
   
      Soler_property cast = (Soler_property) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.name == null ? cast.getName() != this.name : !this.name.equals( cast.getName()))
         return false;
   
      if (this.pro1name == null ? cast.getPro1name() != this.pro1name : !this.pro1name.equals( cast.getPro1name()))
         return false;
   
      if (this.pro2name == null ? cast.getPro2name() != this.pro2name : !this.pro2name.equals( cast.getPro2name()))
         return false;
   
      if (this.pro3name == null ? cast.getPro3name() != this.pro3name : !this.pro3name.equals( cast.getPro3name()))
         return false;
   
      if (this.pcount != cast.getPcount())
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
      if (this.name != null) 
         hashCode = 29 * hashCode + name.hashCode();
      if (this.pro1name != null) 
         hashCode = 29 * hashCode + pro1name.hashCode();
      if (this.pro2name != null) 
         hashCode = 29 * hashCode + pro2name.hashCode();
      if (this.pro3name != null) 
         hashCode = 29 * hashCode + pro3name.hashCode();
      hashCode = 29 * hashCode + (new Integer(pcount)).hashCode();
      hashCode = 29 * hashCode + (new Integer(state)).hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Soler_property: " );
      ret.append( "id='" + id + "'");
      ret.append( "name='" + name + "'");
      ret.append( "pro1name='" + pro1name + "'");
      ret.append( "pro2name='" + pro2name + "'");
      ret.append( "pro3name='" + pro3name + "'");
      ret.append( "pcount='" + pcount + "'");
      ret.append( "state='" + state + "'");
      return ret.toString();
   }

}