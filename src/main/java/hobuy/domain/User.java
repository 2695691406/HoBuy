/***********************************************************************
 * Module:  User.java
 * Author:  ZD
 * Purpose: Defines the Class User
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** @pdOid 10fe7504-404d-4e27-ab55-bd7fd20594a4 */
public class User implements java.io.Serializable {
   /** @pdOid 2aa432bd-c21a-4893-a930-51800d8fe48e */
   private long id;
   /** @pdOid efd62b3f-ac52-4f97-bc4a-ce19aad245b9 */
   private java.lang.String photoimg;
   /** @pdOid f26985a1-f900-44c1-be95-3c9bbd173447 */
   private java.lang.String email;
   /** @pdOid 65401906-d953-41f6-ba5d-7a3407d915e9 */
   private java.lang.String pwd;
   /** @pdOid f096f617-7629-4153-b363-a916da874256 */
   private java.lang.String name;
   /** @pdOid 6cc3ce24-3f4e-4492-b8bc-de43a0ec4357 */
   private java.lang.String phone;
   /** @pdOid 2ba43b6f-0cbb-40f4-bb02-f66984808540 */
   private java.util.Date createtime;
   /** @pdOid 3ab73a82-31ce-4ada-a967-26990be8c2ce */
   private int state = 1;
   /** @pdOid abff2b62-ab89-4fdb-97a0-982b4a85bb3c */
   private byte arrage = 1;
   /** @pdOid 0d1285c5-bc00-4927-9e7d-2346cb081cab */
   private double reputaion = 5;
   /** @pdOid daec8c53-a9b5-4040-993e-5c7323a9964e */
   private int count = 0;
   /** @pdOid f7ec3236-4dbf-40cd-8510-d4621392e082 */
   private int authentication = 0;
   
   /** @pdRoleInfo migr=no name=Product_evaluate assc=user_evaluate_product coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Product_evaluate> product_evaluate;
   /** @pdRoleInfo migr=no name=Order assc=Reference_8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Order> order;
   /** @pdRoleInfo migr=no name=Address assc=Reference_10 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Address> address;
   /** @pdRoleInfo migr=no name=Soler_evaluate assc=Reference_13 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Soler_evaluate> soler_evaluate;
   /** @pdRoleInfo migr=no name=User_evaluate assc=Reference_16 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<User_evaluate> user_evaluate;
   /** @pdRoleInfo migr=no name=Shoppingcart assc=Reference_18 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Shoppingcart> shoppingcart;
   /** @pdRoleInfo migr=no name=University assc=Reference_29 mult=0..1 side=A */
   public University university;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public User() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid e867eadf-074b-4c13-bcfb-e832b032bdca */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 1361bdab-a96a-4112-a0d6-28147bfeb72f */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid edb49c94-9831-459e-b3d4-1685cc614295 */
   public java.lang.String getPhotoimg() {
      return photoimg;
   }
   
   /** @param newPhotoimg
    * @pdOid 818b9e92-759e-4647-a64f-a6b1e94327c9 */
   public void setPhotoimg(java.lang.String newPhotoimg) {
      photoimg = newPhotoimg;
   }
   
   /** @pdOid 781813b2-3d1c-491e-b7f0-5a59de215e3a */
   public java.lang.String getEmail() {
      return email;
   }
   
   /** @param newEmail
    * @pdOid b96cf801-16cd-4399-b607-74241be82488 */
   public void setEmail(java.lang.String newEmail) {
      email = newEmail;
   }
   
   /** @pdOid ed4487c4-c9f4-4c94-b06b-8ad4dda50589 */
   public java.lang.String getPwd() {
      return pwd;
   }
   
   /** @param newPwd
    * @pdOid b532323e-7293-4fde-b37a-ac21052d63cf */
   public void setPwd(java.lang.String newPwd) {
      pwd = newPwd;
   }
   
   /** @pdOid 205b33c1-c72e-4525-a087-342a43b4a3db */
   public java.lang.String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 0dfb44ee-e855-48c2-8ddc-827f41a494a4 */
   public void setName(java.lang.String newName) {
      name = newName;
   }
   
   /** @pdOid 5c93f7fb-0832-434c-b70d-938ba8851cb3 */
   public java.lang.String getPhone() {
      return phone;
   }
   
   /** @param newPhone
    * @pdOid 670e9bcd-bc00-42aa-8b0e-159194a656ed */
   public void setPhone(java.lang.String newPhone) {
      phone = newPhone;
   }
   
   /** @pdOid 84d2afc4-6fb5-4596-a5d1-42c2cd0f3d73 */
   public java.util.Date getCreatetime() {
      return createtime;
   }
   
   /** @param newCreatetime
    * @pdOid 920276b5-7790-4c5f-8e6a-eea9b3d6edb9 */
   public void setCreatetime(java.util.Date newCreatetime) {
      createtime = newCreatetime;
   }
   
   /** @pdOid 8f642e26-28d0-4d20-bc2d-a3b0d7d25d5c */
   public int getState() {
      return state;
   }
   
   /** @param newState
    * @pdOid e6a51060-ce15-44f0-b01a-e36387960655 */
   public void setState(int newState) {
      state = newState;
   }
   
   /** @pdOid 471d7aa9-03be-4fee-a263-4de521f4e219 */
   public byte getArrage() {
      return arrage;
   }
   
   /** @param newArrage
    * @pdOid 906327bb-ca6e-497e-b7ec-0fca37c4e1a5 */
   public void setArrage(byte newArrage) {
      arrage = newArrage;
   }
   
   /** @pdOid d01d37aa-a141-4d43-be32-20883fda1efa */
   public double getReputaion() {
      return reputaion;
   }
   
   /** @param newReputaion
    * @pdOid 15d90059-0b16-47e8-8f9b-947437cc6665 */
   public void setReputaion(double newReputaion) {
      reputaion = newReputaion;
   }
   
   /** @pdOid 01ad9751-392c-44f1-a4c0-06dbcb2fcc2a */
   public int getCount() {
      return count;
   }
   
   /** @param newCount
    * @pdOid 1c7fe85d-9738-484f-925f-1b1361ebb7c1 */
   public void setCount(int newCount) {
      count = newCount;
   }
   
   /** @pdOid 384279a3-b7f8-42ed-b553-7780e465a622 */
   public int getAuthentication() {
      return authentication;
   }
   
   /** @param newAuthentication
    * @pdOid 8c8e4ca5-82b0-4520-bd43-148fb1d68a76 */
   public void setAuthentication(int newAuthentication) {
      authentication = newAuthentication;
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
         newProduct_evaluate.setUser(this);
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
            oldProduct_evaluate.setUser((User)null);
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
            oldProduct_evaluate.setUser((User)null);
         }
      }
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
         newOrder.setUser(this);
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
            oldOrder.setUser((User)null);
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
            oldOrder.setUser((User)null);
         }
      }
   }
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Address> getAddress() {
      if (address == null)
         address = new java.util.HashSet<Address>();
      return address;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorAddress() {
      if (address == null)
         address = new java.util.HashSet<Address>();
      return address.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newAddress
    */
   public void setAddress(java.util.Collection<Address> newAddress) {
      //removeAllAddress();
      this.address = newAddress;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newAddress
    */
   public void addAddress(Address newAddress) {
      if (newAddress == null)
         return;
      if (this.address == null)
         this.address = new java.util.HashSet<Address>();
      if (!this.address.contains(newAddress))
      {
         this.address.add(newAddress);
         newAddress.setUser(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldAddress
    */
   public void removeAddress(Address oldAddress) {
      if (oldAddress == null)
         return;
      if (this.address != null)
         if (this.address.contains(oldAddress))
         {
            this.address.remove(oldAddress);
            oldAddress.setUser((User)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllAddress() {
      if (address != null)
      {
         Address oldAddress;
         for (java.util.Iterator iter = getIteratorAddress(); iter.hasNext();)
         {
            oldAddress = (Address)iter.next();
            iter.remove();
            oldAddress.setUser((User)null);
         }
      }
   }
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Soler_evaluate> getSoler_evaluate() {
      if (soler_evaluate == null)
         soler_evaluate = new java.util.HashSet<Soler_evaluate>();
      return soler_evaluate;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorSoler_evaluate() {
      if (soler_evaluate == null)
         soler_evaluate = new java.util.HashSet<Soler_evaluate>();
      return soler_evaluate.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newSoler_evaluate
    */
   public void setSoler_evaluate(java.util.Collection<Soler_evaluate> newSoler_evaluate) {
      //removeAllSoler_evaluate();
      this.soler_evaluate = newSoler_evaluate;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newSoler_evaluate
    */
   public void addSoler_evaluate(Soler_evaluate newSoler_evaluate) {
      if (newSoler_evaluate == null)
         return;
      if (this.soler_evaluate == null)
         this.soler_evaluate = new java.util.HashSet<Soler_evaluate>();
      if (!this.soler_evaluate.contains(newSoler_evaluate))
      {
         this.soler_evaluate.add(newSoler_evaluate);
         newSoler_evaluate.setUser(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldSoler_evaluate
    */
   public void removeSoler_evaluate(Soler_evaluate oldSoler_evaluate) {
      if (oldSoler_evaluate == null)
         return;
      if (this.soler_evaluate != null)
         if (this.soler_evaluate.contains(oldSoler_evaluate))
         {
            this.soler_evaluate.remove(oldSoler_evaluate);
            oldSoler_evaluate.setUser((User)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllSoler_evaluate() {
      if (soler_evaluate != null)
      {
         Soler_evaluate oldSoler_evaluate;
         for (java.util.Iterator iter = getIteratorSoler_evaluate(); iter.hasNext();)
         {
            oldSoler_evaluate = (Soler_evaluate)iter.next();
            iter.remove();
            oldSoler_evaluate.setUser((User)null);
         }
      }
   }
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<User_evaluate> getUser_evaluate() {
      if (user_evaluate == null)
         user_evaluate = new java.util.HashSet<User_evaluate>();
      return user_evaluate;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorUser_evaluate() {
      if (user_evaluate == null)
         user_evaluate = new java.util.HashSet<User_evaluate>();
      return user_evaluate.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newUser_evaluate
    */
   public void setUser_evaluate(java.util.Collection<User_evaluate> newUser_evaluate) {
      //removeAllUser_evaluate();
      this.user_evaluate = newUser_evaluate;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newUser_evaluate
    */
   public void addUser_evaluate(User_evaluate newUser_evaluate) {
      if (newUser_evaluate == null)
         return;
      if (this.user_evaluate == null)
         this.user_evaluate = new java.util.HashSet<User_evaluate>();
      if (!this.user_evaluate.contains(newUser_evaluate))
      {
         this.user_evaluate.add(newUser_evaluate);
         newUser_evaluate.setUser(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldUser_evaluate
    */
   public void removeUser_evaluate(User_evaluate oldUser_evaluate) {
      if (oldUser_evaluate == null)
         return;
      if (this.user_evaluate != null)
         if (this.user_evaluate.contains(oldUser_evaluate))
         {
            this.user_evaluate.remove(oldUser_evaluate);
            oldUser_evaluate.setUser((User)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllUser_evaluate() {
      if (user_evaluate != null)
      {
         User_evaluate oldUser_evaluate;
         for (java.util.Iterator iter = getIteratorUser_evaluate(); iter.hasNext();)
         {
            oldUser_evaluate = (User_evaluate)iter.next();
            iter.remove();
            oldUser_evaluate.setUser((User)null);
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
         newShoppingcart.setUser(this);
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
            oldShoppingcart.setUser((User)null);
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
            oldShoppingcart.setUser((User)null);
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
            //oldUniversity.removeUser(this);
         }
         if (newUniversity != null)
         {
            this.university = newUniversity;
            //this.university.addUser(this);
         }
      }
   }
   
   /**
    * Get value of userPK.
    *
    * @return userPK object
    */
   public UserPK getUserPK() {
      return new UserPK(id);
   }
   
   /**
    * Set value of userPK.
    * 
    * @param pk
    */
   public void setUserPK(UserPK pk) {
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
   
      if (!(other instanceof User))
         return false;
   
      User cast = (User) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.photoimg == null ? cast.getPhotoimg() != this.photoimg : !this.photoimg.equals( cast.getPhotoimg()))
         return false;
   
      if (this.email == null ? cast.getEmail() != this.email : !this.email.equals( cast.getEmail()))
         return false;
   
      if (this.pwd == null ? cast.getPwd() != this.pwd : !this.pwd.equals( cast.getPwd()))
         return false;
   
      if (this.name == null ? cast.getName() != this.name : !this.name.equals( cast.getName()))
         return false;
   
      if (this.phone == null ? cast.getPhone() != this.phone : !this.phone.equals( cast.getPhone()))
         return false;
   
      if (this.createtime == null ? cast.getCreatetime() != this.createtime : !(com.sybase.orm.util.Util.compareDate(this.createtime,  cast.getCreatetime(), java.util.Calendar.SECOND) == 0))
         return false;
   
      if (this.state != cast.getState())
         return false;
   
      if (this.arrage != cast.getArrage())
         return false;
   
      if (Double.doubleToLongBits(this.reputaion) != Double.doubleToLongBits(cast.getReputaion()))
               return false;
   
      if (this.count != cast.getCount())
         return false;
   
      if (this.authentication != cast.getAuthentication())
         return false;
   
      return true;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
      int hashCode = 0;
      hashCode = 29 * hashCode + (new Long(id)).hashCode();
      if (this.photoimg != null) 
         hashCode = 29 * hashCode + photoimg.hashCode();
      if (this.email != null) 
         hashCode = 29 * hashCode + email.hashCode();
      if (this.pwd != null) 
         hashCode = 29 * hashCode + pwd.hashCode();
      if (this.name != null) 
         hashCode = 29 * hashCode + name.hashCode();
      if (this.phone != null) 
         hashCode = 29 * hashCode + phone.hashCode();
      if (this.createtime != null) 
         hashCode = 29 * hashCode + createtime.hashCode();
      hashCode = 29 * hashCode + (new Integer(state)).hashCode();
      hashCode = 29 * hashCode + (new Byte(arrage)).hashCode();
      hashCode = 29 * hashCode + (new Double(reputaion)).hashCode();
      hashCode = 29 * hashCode + (new Integer(count)).hashCode();
      hashCode = 29 * hashCode + (new Integer(authentication)).hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.User: " );
      ret.append( "id='" + id + "'");
      ret.append( "photoimg='" + photoimg + "'");
      ret.append( "email='" + email + "'");
      ret.append( "pwd='" + pwd + "'");
      ret.append( "name='" + name + "'");
      ret.append( "phone='" + phone + "'");
      ret.append( "createtime='" + createtime + "'");
      ret.append( "state='" + state + "'");
      ret.append( "arrage='" + arrage + "'");
      ret.append( "reputaion='" + reputaion + "'");
      ret.append( "count='" + count + "'");
      ret.append( "authentication='" + authentication + "'");
      return ret.toString();
   }

}