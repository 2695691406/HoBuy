/***********************************************************************
 * Module:  Index_product.java
 * Author:  ZD
 * Purpose: Defines the Class Index_product
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 主页显示商品
 * 
 * @pdOid 03780535-b032-4eab-a4e8-a1368e7740ae */
public class Index_product implements java.io.Serializable {
   /** @pdOid a5d23f2f-3baa-4069-9d67-1e371aee6c52 */
   private int id;
   /** @pdOid 738e2428-8b3c-4f3f-befe-863bf3a9c266 */
   private java.util.Date startdate;
   /** @pdOid 8cbfac6c-e8c5-4f48-b50d-a68509bb5265 */
   private java.util.Date enddate;
   /** @pdOid f2d6d8df-621d-4c8c-8c9e-d59df7c84dfd */
   private java.lang.String imgurl;
   /** @pdOid e90f85f0-f30a-456a-b8c9-f6303d9cab3d */
   private java.util.Date createtime;
   /** @pdOid 2f2e1595-5b37-41e3-a1ca-d2eafe12b657 */
   private int state = 0;
   /** @pdOid 03dc29a9-653f-4c8a-a06a-32d00c27ebee */
   private double price = 0;
   
   /** @pdRoleInfo migr=no name=Index_postion assc=Reference_26 mult=0..1 side=A */
   public Index_postion index_postion;
   /** @pdRoleInfo migr=no name=Product assc=Reference_27 mult=0..1 side=A */
   public Product product;
   /** @pdRoleInfo migr=no name=Worker assc=Reference_39 mult=0..1 side=A */
   public Worker worker;
   /** @pdRoleInfo migr=no name=University assc=Reference_43 mult=0..1 side=A */
   public University university;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Index_product() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid 00437f3f-37fe-4d0f-a43b-334b8badd66b */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid e4f5b89d-6936-49e7-b97c-fc20038aae2a */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid 37f731bd-7fe3-4a4b-a7b9-b92ea03b16c3 */
   public java.util.Date getStartdate() {
      return startdate;
   }
   
   /** @param newStartdate
    * @pdOid fc10eb06-b328-47b7-859d-ecf69de34759 */
   public void setStartdate(java.util.Date newStartdate) {
      startdate = newStartdate;
   }
   
   /** @pdOid 1aeff3b5-675e-4057-97a8-d8bde501244b */
   public java.util.Date getEnddate() {
      return enddate;
   }
   
   /** @param newEnddate
    * @pdOid d5b80417-b4c8-48b6-91f9-8865a2e274d2 */
   public void setEnddate(java.util.Date newEnddate) {
      enddate = newEnddate;
   }
   
   /** @pdOid 4100b182-fd87-4801-8533-02646f7dcbf7 */
   public java.lang.String getImgurl() {
      return imgurl;
   }
   
   /** @param newImgurl
    * @pdOid c9dc1507-6ea8-49b7-8601-fcb028809b08 */
   public void setImgurl(java.lang.String newImgurl) {
      imgurl = newImgurl;
   }
   
   /** @pdOid 1a5d0c05-6c1a-466a-9ff7-daf28a89d0cc */
   public java.util.Date getCreatetime() {
      return createtime;
   }
   
   /** @param newCreatetime
    * @pdOid 752d62a1-8200-4202-b6cc-0b40f54f1a49 */
   public void setCreatetime(java.util.Date newCreatetime) {
      createtime = newCreatetime;
   }
   
   /** @pdOid 8621fa20-23a5-40ac-b022-0078c90b25e9 */
   public int getState() {
      return state;
   }
   
   /** @param newState
    * @pdOid c1cacdf7-beb5-420e-b519-3a92e7ec7f1a */
   public void setState(int newState) {
      state = newState;
   }
   
   /** @pdOid 9f14c7f4-5b5c-4b5b-9717-19dc019c98dd */
   public double getPrice() {
      return price;
   }
   
   /** @param newPrice
    * @pdOid 724f4718-3ff9-4492-abb6-d08c5dd1d29f */
   public void setPrice(double newPrice) {
      price = newPrice;
   }
   
   
   /**
    * @pdGenerated default parent getter
    */
   public Index_postion getIndex_postion() {
      return index_postion;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newIndex_postion
    */
   public void setIndex_postion(Index_postion newIndex_postion) {
      if (this.index_postion == null || !this.index_postion.equals(newIndex_postion))
      {
         if (this.index_postion != null)
         {
            Index_postion oldIndex_postion = this.index_postion;
            this.index_postion = null;
            //oldIndex_postion.removeIndex_product(this);
         }
         if (newIndex_postion != null)
         {
            this.index_postion = newIndex_postion;
            //this.index_postion.addIndex_product(this);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Product getProduct() {
      return product;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newProduct
    */
   public void setProduct(Product newProduct) {
      if (this.product == null || !this.product.equals(newProduct))
      {
         if (this.product != null)
         {
            Product oldProduct = this.product;
            this.product = null;
            //oldProduct.removeIndex_product(this);
         }
         if (newProduct != null)
         {
            this.product = newProduct;
            //this.product.addIndex_product(this);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Worker getWorker() {
      return worker;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newWorker
    */
   public void setWorker(Worker newWorker) {
      if (this.worker == null || !this.worker.equals(newWorker))
      {
         if (this.worker != null)
         {
            Worker oldWorker = this.worker;
            this.worker = null;
            //oldWorker.removeIndex_product(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            //this.worker.addIndex_product(this);
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
            //oldUniversity.removeIndex_product(this);
         }
         if (newUniversity != null)
         {
            this.university = newUniversity;
            //this.university.addIndex_product(this);
         }
      }
   }
   
   /**
    * Get value of index_productPK.
    *
    * @return index_productPK object
    */
   public Index_productPK getIndex_productPK() {
      return new Index_productPK(id);
   }
   
   /**
    * Set value of index_productPK.
    * 
    * @param pk
    */
   public void setIndex_productPK(Index_productPK pk) {
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
   
      if (!(other instanceof Index_product))
         return false;
   
      Index_product cast = (Index_product) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.startdate == null ? cast.getStartdate() != this.startdate : !(com.sybase.orm.util.Util.compareDate(this.startdate,  cast.getStartdate(), java.util.Calendar.SECOND) == 0))
         return false;
   
      if (this.enddate == null ? cast.getEnddate() != this.enddate : !(com.sybase.orm.util.Util.compareDate(this.enddate,  cast.getEnddate(), java.util.Calendar.SECOND) == 0))
         return false;
   
      if (this.imgurl == null ? cast.getImgurl() != this.imgurl : !this.imgurl.equals( cast.getImgurl()))
         return false;
   
      if (this.createtime == null ? cast.getCreatetime() != this.createtime : !(com.sybase.orm.util.Util.compareDate(this.createtime,  cast.getCreatetime(), java.util.Calendar.SECOND) == 0))
         return false;
   
      if (this.state != cast.getState())
         return false;
   
      if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(cast.getPrice()))
               return false;
   
      return true;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
      int hashCode = 0;
      hashCode = 29 * hashCode + (new Integer(id)).hashCode();
      if (this.startdate != null) 
         hashCode = 29 * hashCode + startdate.hashCode();
      if (this.enddate != null) 
         hashCode = 29 * hashCode + enddate.hashCode();
      if (this.imgurl != null) 
         hashCode = 29 * hashCode + imgurl.hashCode();
      if (this.createtime != null) 
         hashCode = 29 * hashCode + createtime.hashCode();
      hashCode = 29 * hashCode + (new Integer(state)).hashCode();
      hashCode = 29 * hashCode + (new Double(price)).hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Index_product: " );
      ret.append( "id='" + id + "'");
      ret.append( "startdate='" + startdate + "'");
      ret.append( "enddate='" + enddate + "'");
      ret.append( "imgurl='" + imgurl + "'");
      ret.append( "createtime='" + createtime + "'");
      ret.append( "state='" + state + "'");
      ret.append( "price='" + price + "'");
      return ret.toString();
   }

}