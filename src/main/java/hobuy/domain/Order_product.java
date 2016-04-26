/***********************************************************************
 * Module:  Order_product.java
 * Author:  ZD
 * Purpose: Defines the Class Order_product
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** @pdOid 9b8cc614-cee4-4540-b280-0889f0a07625 */
public class Order_product implements java.io.Serializable {
   /** @pdOid cffd1d05-a6d6-4d1e-91ec-0a12ce467e94 */
   private long id;
   /** @pdOid cf671af4-9d71-4ddf-bfb5-e08f435d3ec9 */
   private int pnum;
   /** @pdOid 449f6262-9300-49ed-95a7-5182655eeeb1 */
   private double price;
   
   /** @pdRoleInfo migr=no name=Order assc=order_order_product mult=0..1 side=A */
   public Order order;
   /** @pdRoleInfo migr=no name=Repertory assc=Reference_11 mult=0..1 side=A */
   public Repertory repertory;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Order_product() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid 9ec185dd-a0fb-4417-a1bf-4d183327345b */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 8bd1e4b6-fee4-4843-953c-821d6c616679 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 13261a34-cd29-4c05-8cd4-2d6ca86f469e */
   public int getPnum() {
      return pnum;
   }
   
   /** @param newPnum
    * @pdOid a2aadb15-50fe-44f7-a839-60588b151148 */
   public void setPnum(int newPnum) {
      pnum = newPnum;
   }
   
   /** @pdOid 6b93f633-fd1d-4161-a87b-ce981973fe10 */
   public double getPrice() {
      return price;
   }
   
   /** @param newPrice
    * @pdOid d00d359f-a0d1-49ff-aa6d-d6bd1a448544 */
   public void setPrice(double newPrice) {
      price = newPrice;
   }
   
   
   /**
    * @pdGenerated default parent getter
    */
   public Order getOrder() {
      return order;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newOrder
    */
   public void setOrder(Order newOrder) {
      if (this.order == null || !this.order.equals(newOrder))
      {
         if (this.order != null)
         {
            Order oldOrder = this.order;
            this.order = null;
            //oldOrder.removeOrder_product(this);
         }
         if (newOrder != null)
         {
            this.order = newOrder;
            //this.order.addOrder_product(this);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Repertory getRepertory() {
      return repertory;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newRepertory
    */
   public void setRepertory(Repertory newRepertory) {
      if (this.repertory == null || !this.repertory.equals(newRepertory))
      {
         if (this.repertory != null)
         {
            Repertory oldRepertory = this.repertory;
            this.repertory = null;
            //oldRepertory.removeOrder_product(this);
         }
         if (newRepertory != null)
         {
            this.repertory = newRepertory;
            //this.repertory.addOrder_product(this);
         }
      }
   }
   
   /**
    * Get value of order_productPK.
    *
    * @return order_productPK object
    */
   public Order_productPK getOrder_productPK() {
      return new Order_productPK(id);
   }
   
   /**
    * Set value of order_productPK.
    * 
    * @param pk
    */
   public void setOrder_productPK(Order_productPK pk) {
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
   
      if (!(other instanceof Order_product))
         return false;
   
      Order_product cast = (Order_product) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.pnum != cast.getPnum())
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
      hashCode = 29 * hashCode + (new Long(id)).hashCode();
      hashCode = 29 * hashCode + (new Integer(pnum)).hashCode();
      hashCode = 29 * hashCode + (new Double(price)).hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Order_product: " );
      ret.append( "id='" + id + "'");
      ret.append( "pnum='" + pnum + "'");
      ret.append( "price='" + price + "'");
      return ret.toString();
   }

}