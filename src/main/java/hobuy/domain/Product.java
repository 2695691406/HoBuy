/***********************************************************************
 * Module:  Product.java
 * Author:  ZD
 * Purpose: Defines the Class Product
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** @pdOid 129e15fa-958e-47b2-8f48-cd1bc9b2c0f6 */
public class Product implements java.io.Serializable {
   /** @pdOid cd6b5141-a2f6-4f6a-bcc5-b762b1cb27c3 */
   private long id;
   /** @pdOid 0da42a2d-af94-4435-8820-3ea9f9eed900 */
   private java.lang.String name;
   /** @pdOid ff8ebb61-ee4c-4206-954d-cba710eacb92 */
   private java.lang.String imgurl;
   /** @pdOid 9edf265b-d4e1-4228-a4f9-df23ebdc0511 */
   private java.lang.String introduce;
   /** @pdOid 12da92d1-686a-466f-906f-29298369858b */
   private int state = 1;
   /** @pdOid 8248686f-6350-4b83-9a3d-dea9975dbb42 */
   private java.lang.String subtitle;
   /** @pdOid bc197884-e550-41dc-a1c0-2ac4a2d13e85 */
   private int evaluate_count = 0;
   /** @pdOid 072fa293-675f-4fbb-ad92-e8f24fb5e79a */
   private double evaluate_level = 5;
   /** @pdOid 6fedd88a-72f7-4210-851d-188719c47017 */
   private int solenumber = 0;
   
   /** @pdRoleInfo migr=no name=Repertory assc=product_repertory coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Repertory> repertory;
   /** @pdRoleInfo migr=no name=Product_evaluate assc=product_evaluate coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Product_evaluate> product_evaluate;
   /** @pdRoleInfo migr=no name=Index_product assc=Reference_27 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Index_product> index_product;
   /** @pdRoleInfo migr=no name=Soler assc=soler_product mult=0..1 side=A */
   public Soler soler;
   /** @pdRoleInfo migr=no name=Clazz assc=clazz_product mult=0..1 side=A */
   public Clazz clazz;
   /** @pdRoleInfo migr=no name=Soler_property assc=Reference_20 mult=0..1 side=A */
   public Soler_property soler_property;
   /** @pdRoleInfo migr=no name=Img_group assc=Reference_21 mult=0..1 side=A */
   public Img_group img_group;
   /** @pdRoleInfo migr=no name=University assc=Reference_31 mult=0..1 side=A */
   public University university;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Product() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid 13918e55-5434-4e08-b2bc-706036c2ecd3 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 2a09b817-53d7-4e4a-aeb1-e3f39e95ff93 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 4759b3ff-b789-439f-a60e-371c5153cbbe */
   public java.lang.String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid d34eb62e-9b04-4877-ba4e-a751b8f7c809 */
   public void setName(java.lang.String newName) {
      name = newName;
   }
   
   /** @pdOid 2e5a89e9-ee8d-4187-b6b7-393c4c4aeaab */
   public java.lang.String getImgurl() {
      return imgurl;
   }
   
   /** @param newImgurl
    * @pdOid 18971a09-355d-461a-9c28-e4346869e1b6 */
   public void setImgurl(java.lang.String newImgurl) {
      imgurl = newImgurl;
   }
   
   /** @pdOid 112377a1-c05c-4a90-a7ac-17abea816b6e */
   public java.lang.String getIntroduce() {
      return introduce;
   }
   
   /** @param newIntroduce
    * @pdOid 158d78d9-71c9-40df-96a6-ec8ab90e7d88 */
   public void setIntroduce(java.lang.String newIntroduce) {
      introduce = newIntroduce;
   }
   
   /** @pdOid 7546fccc-3161-418d-a52a-b1734ee352ac */
   public int getState() {
      return state;
   }
   
   /** @param newState
    * @pdOid 7cdb2758-5333-4ad6-890e-b4b9abd1e184 */
   public void setState(int newState) {
      state = newState;
   }
   
   /** @pdOid 0c17f693-9b6c-4471-b4f9-28113a6057eb */
   public java.lang.String getSubtitle() {
      return subtitle;
   }
   
   /** @param newSubtitle
    * @pdOid d3326b82-5aa1-44b1-afcf-93640dc54ac3 */
   public void setSubtitle(java.lang.String newSubtitle) {
      subtitle = newSubtitle;
   }
   
   /** @pdOid 98d76d8e-b439-4c29-82be-0b8b317543f0 */
   public int getEvaluate_count() {
      return evaluate_count;
   }
   
   /** @param newEvaluate_count
    * @pdOid 0793848c-8ea8-484d-9493-5a3c6187e51a */
   public void setEvaluate_count(int newEvaluate_count) {
      evaluate_count = newEvaluate_count;
   }
   
   /** @pdOid 4cab199f-63ec-43a9-abc5-7e2e5fff690c */
   public double getEvaluate_level() {
      return evaluate_level;
   }
   
   /** @param newEvaluate_level
    * @pdOid a79f4cee-ca6c-4a65-bb51-2378baae7525 */
   public void setEvaluate_level(double newEvaluate_level) {
      evaluate_level = newEvaluate_level;
   }
   
   /** @pdOid 75d35b70-0709-4b6c-ab78-2682d733f6d8 */
   public int getSolenumber() {
      return solenumber;
   }
   
   /** @param newSolenumber
    * @pdOid ed7db6d1-c005-4bc7-bea7-e9de11a74609 */
   public void setSolenumber(int newSolenumber) {
      solenumber = newSolenumber;
   }
   
   
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Repertory> getRepertory() {
      if (repertory == null)
         repertory = new java.util.HashSet<Repertory>();
      return repertory;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorRepertory() {
      if (repertory == null)
         repertory = new java.util.HashSet<Repertory>();
      return repertory.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newRepertory
    */
   public void setRepertory(java.util.Collection<Repertory> newRepertory) {
      //removeAllRepertory();
      this.repertory = newRepertory;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newRepertory
    */
   public void addRepertory(Repertory newRepertory) {
      if (newRepertory == null)
         return;
      if (this.repertory == null)
         this.repertory = new java.util.HashSet<Repertory>();
      if (!this.repertory.contains(newRepertory))
      {
         this.repertory.add(newRepertory);
         newRepertory.setProduct(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldRepertory
    */
   public void removeRepertory(Repertory oldRepertory) {
      if (oldRepertory == null)
         return;
      if (this.repertory != null)
         if (this.repertory.contains(oldRepertory))
         {
            this.repertory.remove(oldRepertory);
            oldRepertory.setProduct((Product)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllRepertory() {
      if (repertory != null)
      {
         Repertory oldRepertory;
         for (java.util.Iterator iter = getIteratorRepertory(); iter.hasNext();)
         {
            oldRepertory = (Repertory)iter.next();
            iter.remove();
            oldRepertory.setProduct((Product)null);
         }
      }
   }
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Product_evaluate> getProduct_evaluate() {
      if (product_evaluate == null)
         product_evaluate = new java.util.HashSet<Product_evaluate>();
      return product_evaluate;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorProduct_evaluate() {
      if (product_evaluate == null)
         product_evaluate = new java.util.HashSet<Product_evaluate>();
      return product_evaluate.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newProduct_evaluate
    */
   public void setProduct_evaluate(java.util.Collection<Product_evaluate> newProduct_evaluate) {
      //removeAllProduct_evaluate();
      this.product_evaluate = newProduct_evaluate;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newProduct_evaluate
    */
   public void addProduct_evaluate(Product_evaluate newProduct_evaluate) {
      if (newProduct_evaluate == null)
         return;
      if (this.product_evaluate == null)
         this.product_evaluate = new java.util.HashSet<Product_evaluate>();
      if (!this.product_evaluate.contains(newProduct_evaluate))
      {
         this.product_evaluate.add(newProduct_evaluate);
         newProduct_evaluate.setProduct(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldProduct_evaluate
    */
   public void removeProduct_evaluate(Product_evaluate oldProduct_evaluate) {
      if (oldProduct_evaluate == null)
         return;
      if (this.product_evaluate != null)
         if (this.product_evaluate.contains(oldProduct_evaluate))
         {
            this.product_evaluate.remove(oldProduct_evaluate);
            oldProduct_evaluate.setProduct((Product)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllProduct_evaluate() {
      if (product_evaluate != null)
      {
         Product_evaluate oldProduct_evaluate;
         for (java.util.Iterator iter = getIteratorProduct_evaluate(); iter.hasNext();)
         {
            oldProduct_evaluate = (Product_evaluate)iter.next();
            iter.remove();
            oldProduct_evaluate.setProduct((Product)null);
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
         newIndex_product.setProduct(this);
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
            oldIndex_product.setProduct((Product)null);
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
            oldIndex_product.setProduct((Product)null);
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
            //oldSoler.removeProduct(this);
         }
         if (newSoler != null)
         {
            this.soler = newSoler;
            //this.soler.addProduct(this);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Clazz getClazz() {
      return clazz;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newClazz
    */
   public void setClazz(Clazz newClazz) {
      if (this.clazz == null || !this.clazz.equals(newClazz))
      {
         if (this.clazz != null)
         {
            Clazz oldClazz = this.clazz;
            this.clazz = null;
            //oldClazz.removeProduct(this);
         }
         if (newClazz != null)
         {
            this.clazz = newClazz;
            //this.clazz.addProduct(this);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Soler_property getSoler_property() {
      return soler_property;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newSoler_property
    */
   public void setSoler_property(Soler_property newSoler_property) {
      if (this.soler_property == null || !this.soler_property.equals(newSoler_property))
      {
         if (this.soler_property != null)
         {
            Soler_property oldSoler_property = this.soler_property;
            this.soler_property = null;
            //oldSoler_property.removeProduct(this);
         }
         if (newSoler_property != null)
         {
            this.soler_property = newSoler_property;
            //this.soler_property.addProduct(this);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Img_group getImg_group() {
      return img_group;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newImg_group
    */
   public void setImg_group(Img_group newImg_group) {
      if (this.img_group == null || !this.img_group.equals(newImg_group))
      {
         if (this.img_group != null)
         {
            Img_group oldImg_group = this.img_group;
            this.img_group = null;
            //oldImg_group.removeProduct(this);
         }
         if (newImg_group != null)
         {
            this.img_group = newImg_group;
            //this.img_group.addProduct(this);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public University getUniversity() {
      return university;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newUniversity
    */
   public void setUniversity(University newUniversity) {
      if (this.university == null || !this.university.equals(newUniversity))
      {
         if (this.university != null)
         {
            University oldUniversity = this.university;
            this.university = null;
            //oldUniversity.removeProduct(this);
         }
         if (newUniversity != null)
         {
            this.university = newUniversity;
            //this.university.addProduct(this);
         }
      }
   }
   
   /**
    * Get value of productPK.
    *
    * @return productPK object
    */
   public ProductPK getProductPK() {
      return new ProductPK(id);
   }
   
   /**
    * Set value of productPK.
    * 
    * @param pk
    */
   public void setProductPK(ProductPK pk) {
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
   
      if (!(other instanceof Product))
         return false;
   
      Product cast = (Product) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.name == null ? cast.getName() != this.name : !this.name.equals( cast.getName()))
         return false;
   
      if (this.imgurl == null ? cast.getImgurl() != this.imgurl : !this.imgurl.equals( cast.getImgurl()))
         return false;
   
      if (this.introduce == null ? cast.getIntroduce() != this.introduce : !this.introduce.equals( cast.getIntroduce()))
         return false;
   
      if (this.state != cast.getState())
         return false;
   
      if (this.subtitle == null ? cast.getSubtitle() != this.subtitle : !this.subtitle.equals( cast.getSubtitle()))
         return false;
   
      if (this.evaluate_count != cast.getEvaluate_count())
         return false;
   
      if (Double.doubleToLongBits(this.evaluate_level) != Double.doubleToLongBits(cast.getEvaluate_level()))
               return false;
   
      if (this.solenumber != cast.getSolenumber())
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
      if (this.imgurl != null) 
         hashCode = 29 * hashCode + imgurl.hashCode();
      if (this.introduce != null) 
         hashCode = 29 * hashCode + introduce.hashCode();
      hashCode = 29 * hashCode + (new Integer(state)).hashCode();
      if (this.subtitle != null) 
         hashCode = 29 * hashCode + subtitle.hashCode();
      hashCode = 29 * hashCode + (new Integer(evaluate_count)).hashCode();
      hashCode = 29 * hashCode + (new Double(evaluate_level)).hashCode();
      hashCode = 29 * hashCode + (new Integer(solenumber)).hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Product: " );
      ret.append( "id='" + id + "'");
      ret.append( "name='" + name + "'");
      ret.append( "imgurl='" + imgurl + "'");
      ret.append( "introduce='" + introduce + "'");
      ret.append( "state='" + state + "'");
      ret.append( "subtitle='" + subtitle + "'");
      ret.append( "evaluate_count='" + evaluate_count + "'");
      ret.append( "evaluate_level='" + evaluate_level + "'");
      ret.append( "solenumber='" + solenumber + "'");
      return ret.toString();
   }

}