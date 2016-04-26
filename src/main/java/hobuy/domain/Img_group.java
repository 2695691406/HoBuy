/***********************************************************************
 * Module:  Img_group.java
 * Author:  ZD
 * Purpose: Defines the Class Img_group
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** @pdOid d0bd5e4d-63d3-4f87-984d-2e78ff3d5063 */
public class Img_group implements java.io.Serializable {
   /** @pdOid 10127c1e-0c8a-4e5f-9de3-738b58476e28 */
   private long id;
   /** @pdOid 27fbe39c-ab90-4006-b2fb-18806e13608a */
   private java.lang.String img1url;
   /** @pdOid 9f62d3f7-9ca1-41d8-a781-d93e06966ad9 */
   private java.lang.String img2url;
   /** @pdOid 1a27c537-8e05-4a40-9112-a141f3d03842 */
   private java.lang.String img3url;
   /** @pdOid 15e40f99-2deb-4d86-8e5b-6c2e885b869d */
   private java.lang.String img4url;
   /** @pdOid 2295c6c5-2770-4e58-a651-1fe02705cc85 */
   private java.lang.String img5url;
   
   /** @pdRoleInfo migr=no name=Product assc=Reference_21 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Product> product;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Img_group() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid b7bdde1f-ad69-496e-8ee8-bf04108f3eb6 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 89bc58f3-1aea-4a38-ab0e-a69ef77b07a4 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 409ab404-90ca-40c2-9a6f-065836b8577f */
   public java.lang.String getImg1url() {
      return img1url;
   }
   
   /** @param newImg1url
    * @pdOid 6472a747-41a2-4124-820b-763684ee1ef1 */
   public void setImg1url(java.lang.String newImg1url) {
      img1url = newImg1url;
   }
   
   /** @pdOid cbf5f8b6-0672-4a86-9322-de94a7b08abb */
   public java.lang.String getImg2url() {
      return img2url;
   }
   
   /** @param newImg2url
    * @pdOid 0061a097-addd-4f5d-ba2e-9b85a57c36c4 */
   public void setImg2url(java.lang.String newImg2url) {
      img2url = newImg2url;
   }
   
   /** @pdOid 4944e9ff-c16c-47ac-8b6a-504fc910e9bf */
   public java.lang.String getImg3url() {
      return img3url;
   }
   
   /** @param newImg3url
    * @pdOid 1c934e19-6a6d-4088-b7a4-f8a620db6a4c */
   public void setImg3url(java.lang.String newImg3url) {
      img3url = newImg3url;
   }
   
   /** @pdOid 24ac6ebc-f422-4862-85f0-b1ed2f413b07 */
   public java.lang.String getImg4url() {
      return img4url;
   }
   
   /** @param newImg4url
    * @pdOid 8feb743f-79f7-4d34-897a-ffd66e61fa11 */
   public void setImg4url(java.lang.String newImg4url) {
      img4url = newImg4url;
   }
   
   /** @pdOid 04ff4678-c779-4c78-be50-49ca6183bcf4 */
   public java.lang.String getImg5url() {
      return img5url;
   }
   
   /** @param newImg5url
    * @pdOid 8cb56413-629d-443d-9504-204e2d441dda */
   public void setImg5url(java.lang.String newImg5url) {
      img5url = newImg5url;
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
         newProduct.setImg_group(this);
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
            oldProduct.setImg_group((Img_group)null);
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
            oldProduct.setImg_group((Img_group)null);
         }
      }
   }
   
   /**
    * Get value of img_groupPK.
    *
    * @return img_groupPK object
    */
   public Img_groupPK getImg_groupPK() {
      return new Img_groupPK(id);
   }
   
   /**
    * Set value of img_groupPK.
    * 
    * @param pk
    */
   public void setImg_groupPK(Img_groupPK pk) {
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
   
      if (!(other instanceof Img_group))
         return false;
   
      Img_group cast = (Img_group) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.img1url == null ? cast.getImg1url() != this.img1url : !this.img1url.equals( cast.getImg1url()))
         return false;
   
      if (this.img2url == null ? cast.getImg2url() != this.img2url : !this.img2url.equals( cast.getImg2url()))
         return false;
   
      if (this.img3url == null ? cast.getImg3url() != this.img3url : !this.img3url.equals( cast.getImg3url()))
         return false;
   
      if (this.img4url == null ? cast.getImg4url() != this.img4url : !this.img4url.equals( cast.getImg4url()))
         return false;
   
      if (this.img5url == null ? cast.getImg5url() != this.img5url : !this.img5url.equals( cast.getImg5url()))
         return false;
   
      return true;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
      int hashCode = 0;
      hashCode = 29 * hashCode + (new Long(id)).hashCode();
      if (this.img1url != null) 
         hashCode = 29 * hashCode + img1url.hashCode();
      if (this.img2url != null) 
         hashCode = 29 * hashCode + img2url.hashCode();
      if (this.img3url != null) 
         hashCode = 29 * hashCode + img3url.hashCode();
      if (this.img4url != null) 
         hashCode = 29 * hashCode + img4url.hashCode();
      if (this.img5url != null) 
         hashCode = 29 * hashCode + img5url.hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Img_group: " );
      ret.append( "id='" + id + "'");
      ret.append( "img1url='" + img1url + "'");
      ret.append( "img2url='" + img2url + "'");
      ret.append( "img3url='" + img3url + "'");
      ret.append( "img4url='" + img4url + "'");
      ret.append( "img5url='" + img5url + "'");
      return ret.toString();
   }

}