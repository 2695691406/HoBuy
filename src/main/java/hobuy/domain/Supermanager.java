/***********************************************************************
 * Module:  Supermanager.java
 * Author:  ZD
 * Purpose: Defines the Class Supermanager
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 公司高层
 * 技术主管
 * 人力主管
 * 业务主管
 * 宣传主管
 * 财务主管
 * 
 * 
 * @pdOid e2834ced-733c-436b-a35c-a2593e7900e2 */
public class Supermanager implements java.io.Serializable {
   /** @pdOid c27ca9cd-87c8-4c39-aeb6-2a366e241da7 */
   private java.lang.String id;
   /** @pdOid 54072ce8-c98d-4e42-a0be-13692b1bb9a9 */
   private java.lang.String name;
   /** @pdOid c441c672-c549-4366-b8b1-e3f69f3e8fde */
   private java.util.Date createtime;
   /** @pdOid 60456e9c-986b-4c1c-a6a8-2205b50152f6 */
   private java.util.Date leavetime;
   /** @pdOid 147e6a69-aa10-410c-84d6-ca0aa09a6afb */
   private int level = 0;
   /** @pdOid dfe341f2-95d3-4e0d-baa9-54ec9477fa85 */
   private java.lang.String phone;
   /** @pdOid db4f5053-56ec-4661-8c88-78001fed66be */
   private java.lang.String address;
   /** @pdOid c4e3d40c-3b31-44d8-a61d-91d9380c5d74 */
   private int state;
   
   /** @pdRoleInfo migr=no name=Manager assc=Reference_36 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Manager> manager;
   /** @pdRoleInfo migr=no name=Postion assc=Reference_37 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Postion> postion;
   /** @pdRoleInfo migr=no name=Authority assc=Reference_41 mult=0..1 side=A */
   public Authority authority;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Supermanager() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid db1f5ba2-45b4-4a35-9980-d4f4848d8892 */
   public java.lang.String getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid edf921bf-08e7-4c66-97fb-9256c26ef5fd */
   public void setId(java.lang.String newId) {
      id = newId;
   }
   
   /** @pdOid 29cc4584-12ab-42c1-9e35-775c3aea8016 */
   public java.lang.String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 51f5873e-f5ce-4a0f-aeca-8e02087a3394 */
   public void setName(java.lang.String newName) {
      name = newName;
   }
   
   /** @pdOid 206e26ec-f000-4000-868b-745af0122a35 */
   public java.util.Date getCreatetime() {
      return createtime;
   }
   
   /** @param newCreatetime
    * @pdOid 6c41c6de-620a-4963-a116-2d5b4060f514 */
   public void setCreatetime(java.util.Date newCreatetime) {
      createtime = newCreatetime;
   }
   
   /** @pdOid 12bc7bbb-9224-4815-8e10-3a8b42f35828 */
   public java.util.Date getLeavetime() {
      return leavetime;
   }
   
   /** @param newLeavetime
    * @pdOid 3d84e111-cd39-4de9-b351-c34dafc97297 */
   public void setLeavetime(java.util.Date newLeavetime) {
      leavetime = newLeavetime;
   }
   
   /** @pdOid 22d86040-f622-4b60-86a7-e03deb5076b2 */
   public int getLevel() {
      return level;
   }
   
   /** @param newLevel
    * @pdOid f41bcf02-9eac-4375-b9e6-2f27b8af48b3 */
   public void setLevel(int newLevel) {
      level = newLevel;
   }
   
   /** @pdOid 26c90661-c8b0-436b-a5a2-685202eae2f2 */
   public java.lang.String getPhone() {
      return phone;
   }
   
   /** @param newPhone
    * @pdOid bec67fe3-8281-4b80-b41b-203d5a780e85 */
   public void setPhone(java.lang.String newPhone) {
      phone = newPhone;
   }
   
   /** @pdOid 9b31ffb7-4e42-4166-bc00-507fab1dd84f */
   public java.lang.String getAddress() {
      return address;
   }
   
   /** @param newAddress
    * @pdOid c6afc132-f8e6-43d0-b0c5-04e374a1bd2c */
   public void setAddress(java.lang.String newAddress) {
      address = newAddress;
   }
   
   /** @pdOid 66df5e21-af52-46de-9127-68dd8c004f8a */
   public int getState() {
      return state;
   }
   
   /** @param newState
    * @pdOid df0f2d4e-085b-45f8-9d8a-9e573a39174a */
   public void setState(int newState) {
      state = newState;
   }
   
   
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Manager> getManager() {
      if (manager == null)
         manager = new java.util.HashSet<Manager>();
      return manager;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorManager() {
      if (manager == null)
         manager = new java.util.HashSet<Manager>();
      return manager.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newManager
    */
   public void setManager(java.util.Collection<Manager> newManager) {
      //removeAllManager();
      this.manager = newManager;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newManager
    */
   public void addManager(Manager newManager) {
      if (newManager == null)
         return;
      if (this.manager == null)
         this.manager = new java.util.HashSet<Manager>();
      if (!this.manager.contains(newManager))
      {
         this.manager.add(newManager);
         newManager.setSupermanager(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldManager
    */
   public void removeManager(Manager oldManager) {
      if (oldManager == null)
         return;
      if (this.manager != null)
         if (this.manager.contains(oldManager))
         {
            this.manager.remove(oldManager);
            oldManager.setSupermanager((Supermanager)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllManager() {
      if (manager != null)
      {
         Manager oldManager;
         for (java.util.Iterator iter = getIteratorManager(); iter.hasNext();)
         {
            oldManager = (Manager)iter.next();
            iter.remove();
            oldManager.setSupermanager((Supermanager)null);
         }
      }
   }
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Postion> getPostion() {
      if (postion == null)
         postion = new java.util.HashSet<Postion>();
      return postion;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorPostion() {
      if (postion == null)
         postion = new java.util.HashSet<Postion>();
      return postion.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newPostion
    */
   public void setPostion(java.util.Collection<Postion> newPostion) {
      //removeAllPostion();
      this.postion = newPostion;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newPostion
    */
   public void addPostion(Postion newPostion) {
      if (newPostion == null)
         return;
      if (this.postion == null)
         this.postion = new java.util.HashSet<Postion>();
      if (!this.postion.contains(newPostion))
      {
         this.postion.add(newPostion);
         newPostion.setSupermanager(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldPostion
    */
   public void removePostion(Postion oldPostion) {
      if (oldPostion == null)
         return;
      if (this.postion != null)
         if (this.postion.contains(oldPostion))
         {
            this.postion.remove(oldPostion);
            oldPostion.setSupermanager((Supermanager)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllPostion() {
      if (postion != null)
      {
         Postion oldPostion;
         for (java.util.Iterator iter = getIteratorPostion(); iter.hasNext();)
         {
            oldPostion = (Postion)iter.next();
            iter.remove();
            oldPostion.setSupermanager((Supermanager)null);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Authority getAuthority() {
      return authority;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newAuthority
    */
   public void setAuthority(Authority newAuthority) {
      if (this.authority == null || !this.authority.equals(newAuthority))
      {
         if (this.authority != null)
         {
            Authority oldAuthority = this.authority;
            this.authority = null;
            //oldAuthority.removeSupermanager(this);
         }
         if (newAuthority != null)
         {
            this.authority = newAuthority;
            //this.authority.addSupermanager(this);
         }
      }
   }
   
   /**
    * Get value of supermanagerPK.
    *
    * @return supermanagerPK object
    */
   public SupermanagerPK getSupermanagerPK() {
      return new SupermanagerPK(id);
   }
   
   /**
    * Set value of supermanagerPK.
    * 
    * @param pk
    */
   public void setSupermanagerPK(SupermanagerPK pk) {
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
   
      if (!(other instanceof Supermanager))
         return false;
   
      Supermanager cast = (Supermanager) other;
   
      if (this.id == null ? cast.getId() != this.id : !this.id.equals( cast.getId()))
         return false;
   
      if (this.name == null ? cast.getName() != this.name : !this.name.equals( cast.getName()))
         return false;
   
      if (this.createtime == null ? cast.getCreatetime() != this.createtime : !(com.sybase.orm.util.Util.compareDate(this.createtime,  cast.getCreatetime(), java.util.Calendar.SECOND) == 0))
         return false;
   
      if (this.leavetime == null ? cast.getLeavetime() != this.leavetime : !(com.sybase.orm.util.Util.compareDate(this.leavetime,  cast.getLeavetime(), java.util.Calendar.SECOND) == 0))
         return false;
   
      if (this.level != cast.getLevel())
         return false;
   
      if (this.phone == null ? cast.getPhone() != this.phone : !this.phone.equals( cast.getPhone()))
         return false;
   
      if (this.address == null ? cast.getAddress() != this.address : !this.address.equals( cast.getAddress()))
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
      if (this.id != null) 
         hashCode = 29 * hashCode + id.hashCode();
      if (this.name != null) 
         hashCode = 29 * hashCode + name.hashCode();
      if (this.createtime != null) 
         hashCode = 29 * hashCode + createtime.hashCode();
      if (this.leavetime != null) 
         hashCode = 29 * hashCode + leavetime.hashCode();
      hashCode = 29 * hashCode + (new Integer(level)).hashCode();
      if (this.phone != null) 
         hashCode = 29 * hashCode + phone.hashCode();
      if (this.address != null) 
         hashCode = 29 * hashCode + address.hashCode();
      hashCode = 29 * hashCode + (new Integer(state)).hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Supermanager: " );
      ret.append( "id='" + id + "'");
      ret.append( "name='" + name + "'");
      ret.append( "createtime='" + createtime + "'");
      ret.append( "leavetime='" + leavetime + "'");
      ret.append( "level='" + level + "'");
      ret.append( "phone='" + phone + "'");
      ret.append( "address='" + address + "'");
      ret.append( "state='" + state + "'");
      return ret.toString();
   }

}