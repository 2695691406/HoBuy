/***********************************************************************
 * Module:  Address.java
 * Author:  ZD
 * Purpose: Defines the Class Address
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 用户可以有多个地址
 * 
 * @pdOid c056a1da-162e-499f-9bed-755fe6bee60d */
public class Address implements java.io.Serializable {
   /** @pdOid 606d9fb3-2dd1-43a6-9ba6-2cbeb8fa3b7d */
   private long id;
   /** @pdOid b3102841-82c3-44aa-adb9-e1e52b7ac8ca */
   private java.lang.String name;
   /** @pdOid e293eeb7-9a8e-44df-b204-7fb65b0f6257 */
   private java.lang.String address;
   /** @pdOid 45dc5d27-e659-4d46-910b-9a508bd3cbe9 */
   private java.lang.String phone;
   /** @pdOid 18c4680f-6e6a-45a6-a46f-614da7cb55fd */
   private java.lang.String additional;
   /** @pdOid 74b5ee90-2c6a-48b2-85d8-945f5a51099e */
   private java.lang.String postalcode;
   
   /** @pdRoleInfo migr=no name=Order assc=Reference_9 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Order> order;
   /** @pdRoleInfo migr=no name=User assc=Reference_10 mult=0..1 side=A */
   public User user;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Address() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid 5c25e2bc-4995-4f14-9d28-6f53d8a37dea */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid e403f6e5-7149-4664-b130-16adefc3bb08 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 66611e46-f338-4f72-9ebc-abf4c0061cb8 */
   public java.lang.String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid c3120486-496b-4839-9acb-9d92b691a4a4 */
   public void setName(java.lang.String newName) {
      name = newName;
   }
   
   /** @pdOid 1bffdda7-e820-4539-ae54-33db6821b68e */
   public java.lang.String getAddress() {
      return address;
   }
   
   /** @param newAddress
    * @pdOid 6199fbfc-ad38-4a12-bca0-74e6caaa30db */
   public void setAddress(java.lang.String newAddress) {
      address = newAddress;
   }
   
   /** @pdOid a936dd65-fffe-4d9b-8350-b585b1698c25 */
   public java.lang.String getPhone() {
      return phone;
   }
   
   /** @param newPhone
    * @pdOid 8ff48d8f-19ec-4620-ad80-b2293c0e1090 */
   public void setPhone(java.lang.String newPhone) {
      phone = newPhone;
   }
   
   /** @pdOid 6920da8c-1873-4658-bd18-8dd0a1b54a99 */
   public java.lang.String getAdditional() {
      return additional;
   }
   
   /** @param newAdditional
    * @pdOid 95b2bf8c-7e2e-46d7-9a2e-d39f93ed5d3b */
   public void setAdditional(java.lang.String newAdditional) {
      additional = newAdditional;
   }
   
   /** @pdOid f9158f85-6b77-44c6-aa94-177ebb6f1664 */
   public java.lang.String getPostalcode() {
      return postalcode;
   }
   
   /** @param newPostalcode
    * @pdOid 823a65b0-b9e2-45a5-9569-0c84ab7d5dcc */
   public void setPostalcode(java.lang.String newPostalcode) {
      postalcode = newPostalcode;
   }
   
   
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Order> getOrder() {
      if (order == null)
         order = new java.util.HashSet<Order>();
      return order;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorOrder() {
      if (order == null)
         order = new java.util.HashSet<Order>();
      return order.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newOrder
    */
   public void setOrder(java.util.Collection<Order> newOrder) {
      //removeAllOrder();
      this.order = newOrder;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newOrder
    */
   public void addOrder(Order newOrder) {
      if (newOrder == null)
         return;
      if (this.order == null)
         this.order = new java.util.HashSet<Order>();
      if (!this.order.contains(newOrder))
      {
         this.order.add(newOrder);
         newOrder.setAddress(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldOrder
    */
   public void removeOrder(Order oldOrder) {
      if (oldOrder == null)
         return;
      if (this.order != null)
         if (this.order.contains(oldOrder))
         {
            this.order.remove(oldOrder);
            oldOrder.setAddress((Address)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllOrder() {
      if (order != null)
      {
         Order oldOrder;
         for (java.util.Iterator iter = getIteratorOrder(); iter.hasNext();)
         {
            oldOrder = (Order)iter.next();
            iter.remove();
            oldOrder.setAddress((Address)null);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public User getUser() {
      return user;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newUser
    */
   public void setUser(User newUser) {
      if (this.user == null || !this.user.equals(newUser))
      {
         if (this.user != null)
         {
            User oldUser = this.user;
            this.user = null;
            //oldUser.removeAddress(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            //this.user.addAddress(this);
         }
      }
   }
   
   /**
    * Get value of addressPK.
    *
    * @return addressPK object
    */
   public AddressPK getAddressPK() {
      return new AddressPK(id);
   }
   
   /**
    * Set value of addressPK.
    * 
    * @param pk
    */
   public void setAddressPK(AddressPK pk) {
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
   
      if (!(other instanceof Address))
         return false;
   
      Address cast = (Address) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.name == null ? cast.getName() != this.name : !this.name.equals( cast.getName()))
         return false;
   
      if (this.address == null ? cast.getAddress() != this.address : !this.address.equals( cast.getAddress()))
         return false;
   
      if (this.phone == null ? cast.getPhone() != this.phone : !this.phone.equals( cast.getPhone()))
         return false;
   
      if (this.additional == null ? cast.getAdditional() != this.additional : !this.additional.equals( cast.getAdditional()))
         return false;
   
      if (this.postalcode == null ? cast.getPostalcode() != this.postalcode : !this.postalcode.equals( cast.getPostalcode()))
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
      if (this.address != null) 
         hashCode = 29 * hashCode + address.hashCode();
      if (this.phone != null) 
         hashCode = 29 * hashCode + phone.hashCode();
      if (this.additional != null) 
         hashCode = 29 * hashCode + additional.hashCode();
      if (this.postalcode != null) 
         hashCode = 29 * hashCode + postalcode.hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Address: " );
      ret.append( "id='" + id + "'");
      ret.append( "name='" + name + "'");
      ret.append( "address='" + address + "'");
      ret.append( "phone='" + phone + "'");
      ret.append( "additional='" + additional + "'");
      ret.append( "postalcode='" + postalcode + "'");
      return ret.toString();
   }

}