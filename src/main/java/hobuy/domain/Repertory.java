/***********************************************************************
 * Module:  Repertory.java
 * Author:  ZD
 * Purpose: Defines the Class Repertory
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** @pdOid 43251fd6-1aba-458f-8b18-d39294b87f56 */
public class Repertory implements java.io.Serializable {
   /** @pdOid 22e40e7f-9674-421e-afda-e6d3fb888ea1 */
   private long id;
   /** @pdOid 78aeaba3-dc46-4a77-8a25-915ce91cd0f3 */
   private java.lang.String pro1;
   /** @pdOid 48203abc-8671-4a19-a283-9ad946c42adb */
   private java.lang.String pro2;
   /** @pdOid 0fefd778-6e79-4c61-965e-457de71b4b5d */
   private java.lang.String pro3;
   /** 这里他是促销价格
    * 
    * @pdOid 7dfc9ce5-927a-46fe-904e-53d9ac57f462 */
   private double bid;
   /** @pdOid 2cabdb4b-e53b-466a-acd2-12be4868c4f5 */
   private double price = 0.0;
   /** @pdOid 9199bdb0-f422-42f7-be02-560d7164ec82 */
   private int sole_number = 0;
   /** @pdOid 48833d57-34bc-4a23-91d3-3aae24e22fc8 */
   private int repertory_nubmer = 0;
   /** 0表示商品被删除
    * 1表示正在销售
    * 2表示正在促销
    * 
    * @pdOid c3286aa1-0ef8-4bc5-a50f-8a57db74ad80 */
   private int state = 1;
   /** @pdOid a4a5fb82-659e-4aba-814c-66a13567b7cd */
   private java.lang.String imgurl;
   
   /** @pdRoleInfo migr=no name=Order_product assc=Reference_11 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Order_product> order_product;
   /** @pdRoleInfo migr=no name=Shoppingcart assc=Reference_19 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Shoppingcart> shoppingcart;
   /** @pdRoleInfo migr=no name=Product assc=product_repertory mult=0..1 side=A */
   public Product product;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Repertory() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid f98768f7-3339-40e3-a790-646c72d087a0 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid c1a609b6-8f9d-4a46-8fc4-b14cea6974cc */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 60b1e83c-f7be-4bd8-b223-275df713ffc5 */
   public java.lang.String getPro1() {
      return pro1;
   }
   
   /** @param newPro1
    * @pdOid 661f34e6-d26b-4a71-ac8e-8c88db7b734a */
   public void setPro1(java.lang.String newPro1) {
      pro1 = newPro1;
   }
   
   /** @pdOid 38b89c6b-a62b-4cd3-af09-4c5c916da402 */
   public java.lang.String getPro2() {
      return pro2;
   }
   
   /** @param newPro2
    * @pdOid 6347165a-6e9f-49dd-8ab6-1bb1f343a68f */
   public void setPro2(java.lang.String newPro2) {
      pro2 = newPro2;
   }
   
   /** @pdOid 819f1919-9e4f-48d8-ad47-d8843035f45e */
   public java.lang.String getPro3() {
      return pro3;
   }
   
   /** @param newPro3
    * @pdOid a7a94929-c60c-451b-819e-deb599899575 */
   public void setPro3(java.lang.String newPro3) {
      pro3 = newPro3;
   }
   
   /** @pdOid 4a8b6985-879c-4e9f-bc59-71ebb0d0d8dc */
   public double getBid() {
      return bid;
   }
   
   /** @param newBid
    * @pdOid 03c0c383-2560-4dff-9ec2-b28ab5088930 */
   public void setBid(double newBid) {
      bid = newBid;
   }
   
   /** @pdOid accb296e-1760-400d-b939-ff8393c1d6e0 */
   public double getPrice() {
      return price;
   }
   
   /** @param newPrice
    * @pdOid c603c5e8-825b-42fd-8365-715bd59e4a3c */
   public void setPrice(double newPrice) {
      price = newPrice;
   }
   
   /** @pdOid a054054a-7536-4400-aa16-f9db8c655bcb */
   public int getSole_number() {
      return sole_number;
   }
   
   /** @param newSole_number
    * @pdOid a9feea3a-d91e-4246-8230-0119438b171b */
   public void setSole_number(int newSole_number) {
      sole_number = newSole_number;
   }
   
   /** @pdOid 2f3d5e1a-9871-4af3-90d2-9cc67bd5bd00 */
   public int getRepertory_nubmer() {
      return repertory_nubmer;
   }
   
   /** @param newRepertory_nubmer
    * @pdOid f3bfeeb2-85f5-42d5-80ef-a03a4bbfa5ff */
   public void setRepertory_nubmer(int newRepertory_nubmer) {
      repertory_nubmer = newRepertory_nubmer;
   }
   
   /** @pdOid a2e401e5-5089-48f9-802e-1d1a1d73136a */
   public int getState() {
      return state;
   }
   
   /** @param newState
    * @pdOid 932b12ea-eb01-410d-9596-4f4f8677cbe8 */
   public void setState(int newState) {
      state = newState;
   }
   
   /** @pdOid 833a9ca7-8ba5-4abe-8c4f-3ec8da383c99 */
   public java.lang.String getImgurl() {
      return imgurl;
   }
   
   /** @param newImgurl
    * @pdOid e33aebd6-2208-468c-ae13-28000ee06180 */
   public void setImgurl(java.lang.String newImgurl) {
      imgurl = newImgurl;
   }
   
   
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Order_product> getOrder_product() {
      if (order_product == null)
         order_product = new java.util.HashSet<Order_product>();
      return order_product;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorOrder_product() {
      if (order_product == null)
         order_product = new java.util.HashSet<Order_product>();
      return order_product.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newOrder_product
    */
   public void setOrder_product(java.util.Collection<Order_product> newOrder_product) {
      //removeAllOrder_product();
      this.order_product = newOrder_product;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newOrder_product
    */
   public void addOrder_product(Order_product newOrder_product) {
      if (newOrder_product == null)
         return;
      if (this.order_product == null)
         this.order_product = new java.util.HashSet<Order_product>();
      if (!this.order_product.contains(newOrder_product))
      {
         this.order_product.add(newOrder_product);
         newOrder_product.setRepertory(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldOrder_product
    */
   public void removeOrder_product(Order_product oldOrder_product) {
      if (oldOrder_product == null)
         return;
      if (this.order_product != null)
         if (this.order_product.contains(oldOrder_product))
         {
            this.order_product.remove(oldOrder_product);
            oldOrder_product.setRepertory((Repertory)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllOrder_product() {
      if (order_product != null)
      {
         Order_product oldOrder_product;
         for (java.util.Iterator iter = getIteratorOrder_product(); iter.hasNext();)
         {
            oldOrder_product = (Order_product)iter.next();
            iter.remove();
            oldOrder_product.setRepertory((Repertory)null);
         }
      }
   }
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Shoppingcart> getShoppingcart() {
      if (shoppingcart == null)
         shoppingcart = new java.util.HashSet<Shoppingcart>();
      return shoppingcart;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorShoppingcart() {
      if (shoppingcart == null)
         shoppingcart = new java.util.HashSet<Shoppingcart>();
      return shoppingcart.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newShoppingcart
    */
   public void setShoppingcart(java.util.Collection<Shoppingcart> newShoppingcart) {
      //removeAllShoppingcart();
      this.shoppingcart = newShoppingcart;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newShoppingcart
    */
   public void addShoppingcart(Shoppingcart newShoppingcart) {
      if (newShoppingcart == null)
         return;
      if (this.shoppingcart == null)
         this.shoppingcart = new java.util.HashSet<Shoppingcart>();
      if (!this.shoppingcart.contains(newShoppingcart))
      {
         this.shoppingcart.add(newShoppingcart);
         newShoppingcart.setRepertory(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldShoppingcart
    */
   public void removeShoppingcart(Shoppingcart oldShoppingcart) {
      if (oldShoppingcart == null)
         return;
      if (this.shoppingcart != null)
         if (this.shoppingcart.contains(oldShoppingcart))
         {
            this.shoppingcart.remove(oldShoppingcart);
            oldShoppingcart.setRepertory((Repertory)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllShoppingcart() {
      if (shoppingcart != null)
      {
         Shoppingcart oldShoppingcart;
         for (java.util.Iterator iter = getIteratorShoppingcart(); iter.hasNext();)
         {
            oldShoppingcart = (Shoppingcart)iter.next();
            iter.remove();
            oldShoppingcart.setRepertory((Repertory)null);
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
            //oldProduct.removeRepertory(this);
         }
         if (newProduct != null)
         {
            this.product = newProduct;
            //this.product.addRepertory(this);
         }
      }
   }
   
   /**
    * Get value of repertoryPK.
    *
    * @return repertoryPK object
    */
   public RepertoryPK getRepertoryPK() {
      return new RepertoryPK(id);
   }
   
   /**
    * Set value of repertoryPK.
    * 
    * @param pk
    */
   public void setRepertoryPK(RepertoryPK pk) {
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
   
      if (!(other instanceof Repertory))
         return false;
   
      Repertory cast = (Repertory) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.pro1 == null ? cast.getPro1() != this.pro1 : !this.pro1.equals( cast.getPro1()))
         return false;
   
      if (this.pro2 == null ? cast.getPro2() != this.pro2 : !this.pro2.equals( cast.getPro2()))
         return false;
   
      if (this.pro3 == null ? cast.getPro3() != this.pro3 : !this.pro3.equals( cast.getPro3()))
         return false;
   
      if (Double.doubleToLongBits(this.bid) != Double.doubleToLongBits(cast.getBid()))
               return false;
   
      if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(cast.getPrice()))
               return false;
   
      if (this.sole_number != cast.getSole_number())
         return false;
   
      if (this.repertory_nubmer != cast.getRepertory_nubmer())
         return false;
   
      if (this.state != cast.getState())
         return false;
   
      if (this.imgurl == null ? cast.getImgurl() != this.imgurl : !this.imgurl.equals( cast.getImgurl()))
         return false;
   
      return true;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
      int hashCode = 0;
      hashCode = 29 * hashCode + (new Long(id)).hashCode();
      if (this.pro1 != null) 
         hashCode = 29 * hashCode + pro1.hashCode();
      if (this.pro2 != null) 
         hashCode = 29 * hashCode + pro2.hashCode();
      if (this.pro3 != null) 
         hashCode = 29 * hashCode + pro3.hashCode();
      hashCode = 29 * hashCode + (new Double(bid)).hashCode();
      hashCode = 29 * hashCode + (new Double(price)).hashCode();
      hashCode = 29 * hashCode + (new Integer(sole_number)).hashCode();
      hashCode = 29 * hashCode + (new Integer(repertory_nubmer)).hashCode();
      hashCode = 29 * hashCode + (new Integer(state)).hashCode();
      if (this.imgurl != null) 
         hashCode = 29 * hashCode + imgurl.hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Repertory: " );
      ret.append( "id='" + id + "'");
      ret.append( "pro1='" + pro1 + "'");
      ret.append( "pro2='" + pro2 + "'");
      ret.append( "pro3='" + pro3 + "'");
      ret.append( "bid='" + bid + "'");
      ret.append( "price='" + price + "'");
      ret.append( "sole_number='" + sole_number + "'");
      ret.append( "repertory_nubmer='" + repertory_nubmer + "'");
      ret.append( "state='" + state + "'");
      ret.append( "imgurl='" + imgurl + "'");
      return ret.toString();
   }

}