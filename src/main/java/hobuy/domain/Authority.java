/***********************************************************************
 * Module:  Authority.java
 * Author:  ZD
 * Purpose: Defines the Class Authority
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 一级权限
 * *最高权限
 * 二级权限
 * *人力主管权限
 * *技术主管权限
 * *业务主管权限
 * *财务主管权限
 * *市场主管权限
 * 三级权限
 * *人力调度管理者
 * *人力招聘管理者
 * *前台技术管理者
 * *后台技术管理者
 * *运维技术管理者
 * *商业合作管理者
 * *市场推广管理者
 * 
 * 
 * 
 * @pdOid eeeb59b2-07c2-4010-bff3-c98de46a55c7 */
public class Authority implements java.io.Serializable {
   /** @pdOid 0754c473-4951-4eb9-b9bc-70b06746dc65 */
   private int id;
   /** @pdOid 97a4e5a2-8ef4-451d-9cd9-2617fa371006 */
   private java.lang.String name;
   /** @pdOid b19fc7da-2bff-4e27-8b01-aef01bcf2685 */
   private java.lang.String introduce;
   /** @pdOid 05088abd-bc26-42d0-bcd0-37cd90b8c176 */
   private int level;
   
   /** @pdRoleInfo migr=no name=Supermanager assc=Reference_41 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Supermanager> supermanager;
   /** @pdRoleInfo migr=no name=Manager assc=Reference_42 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Manager> manager;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Authority() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid 4e1bbf01-4b07-4647-bdf1-c0b01f1681e5 */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 02b16631-994f-40c1-bda4-f68649d4c36f */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid b5729c60-6cf9-400f-82de-99433cac2cf9 */
   public java.lang.String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid c29a1309-3486-4358-96a8-018b5675e403 */
   public void setName(java.lang.String newName) {
      name = newName;
   }
   
   /** @pdOid af6826e3-c53b-450c-8df2-617e000b87d9 */
   public java.lang.String getIntroduce() {
      return introduce;
   }
   
   /** @param newIntroduce
    * @pdOid 3e88b283-70bb-420f-b2c1-35ca96218866 */
   public void setIntroduce(java.lang.String newIntroduce) {
      introduce = newIntroduce;
   }
   
   /** @pdOid 04a729d5-d9ad-4d02-81d9-aa529ca7dd04 */
   public int getLevel() {
      return level;
   }
   
   /** @param newLevel
    * @pdOid 08e8b9ad-03e0-415a-8038-dd6dc36c5445 */
   public void setLevel(int newLevel) {
      level = newLevel;
   }
   
   
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Supermanager> getSupermanager() {
      if (supermanager == null)
         supermanager = new java.util.HashSet<Supermanager>();
      return supermanager;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorSupermanager() {
      if (supermanager == null)
         supermanager = new java.util.HashSet<Supermanager>();
      return supermanager.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newSupermanager
    */
   public void setSupermanager(java.util.Collection<Supermanager> newSupermanager) {
      //removeAllSupermanager();
      this.supermanager = newSupermanager;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newSupermanager
    */
   public void addSupermanager(Supermanager newSupermanager) {
      if (newSupermanager == null)
         return;
      if (this.supermanager == null)
         this.supermanager = new java.util.HashSet<Supermanager>();
      if (!this.supermanager.contains(newSupermanager))
      {
         this.supermanager.add(newSupermanager);
         newSupermanager.setAuthority(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldSupermanager
    */
   public void removeSupermanager(Supermanager oldSupermanager) {
      if (oldSupermanager == null)
         return;
      if (this.supermanager != null)
         if (this.supermanager.contains(oldSupermanager))
         {
            this.supermanager.remove(oldSupermanager);
            oldSupermanager.setAuthority((Authority)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllSupermanager() {
      if (supermanager != null)
      {
         Supermanager oldSupermanager;
         for (java.util.Iterator iter = getIteratorSupermanager(); iter.hasNext();)
         {
            oldSupermanager = (Supermanager)iter.next();
            iter.remove();
            oldSupermanager.setAuthority((Authority)null);
         }
      }
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
         newManager.setAuthority(this);
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
            oldManager.setAuthority((Authority)null);
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
            oldManager.setAuthority((Authority)null);
         }
      }
   }
   
   /**
    * Get value of authorityPK.
    *
    * @return authorityPK object
    */
   public AuthorityPK getAuthorityPK() {
      return new AuthorityPK(id);
   }
   
   /**
    * Set value of authorityPK.
    * 
    * @param pk
    */
   public void setAuthorityPK(AuthorityPK pk) {
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
   
      if (!(other instanceof Authority))
         return false;
   
      Authority cast = (Authority) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.name == null ? cast.getName() != this.name : !this.name.equals( cast.getName()))
         return false;
   
      if (this.introduce == null ? cast.getIntroduce() != this.introduce : !this.introduce.equals( cast.getIntroduce()))
         return false;
   
      if (this.level != cast.getLevel())
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
      if (this.introduce != null) 
         hashCode = 29 * hashCode + introduce.hashCode();
      hashCode = 29 * hashCode + (new Integer(level)).hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Authority: " );
      ret.append( "id='" + id + "'");
      ret.append( "name='" + name + "'");
      ret.append( "introduce='" + introduce + "'");
      ret.append( "level='" + level + "'");
      return ret.toString();
   }

}