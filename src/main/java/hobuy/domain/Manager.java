/***********************************************************************
 * Module:  Manager.java
 * Author:  ZD
 * Purpose: Defines the Class Manager
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 管理人员表
 * 前端技术管理人
 * 后台javaEE技术管理人
 * 运维技术管理人（数据库和大数据，以及网站监控和维护）
 * 网站优化管理人
 * 商业合作业务管理人
 * 人力调度管理人
 * 市场宣传管理人
 * 
 * 
 * @pdOid 4a97f506-7069-4fbd-86f7-9d8bf016c821 */
public class Manager implements java.io.Serializable {
   /** @pdOid d2e72a45-97e2-4848-a443-535b04efef7e */
   private java.lang.String id;
   /** @pdOid 1a3a296b-c2a5-4683-81f1-442f95b0e609 */
   private java.lang.String name;
   /** @pdOid 673c2f43-a690-4594-a2e5-912258f8cb59 */
   private java.lang.String phone;
   /** @pdOid f21abe07-a99a-4879-a990-ac19726b9cc9 */
   private java.util.Date instate;
   /** @pdOid 7976879f-5749-4b9b-a014-dfa2453a09ab */
   private java.util.Date outstate;
   /** @pdOid 04edb92f-d846-4292-90b9-e51391a27e57 */
   private int state = 1;
   /** @pdOid 705ccd08-4988-4328-9b92-173e20a81a72 */
   private java.lang.String introduce;
   /** 个人材料，例如简历等
    * 
    * @pdOid e206726e-c3bc-4171-95af-2951b3d7ab94 */
   private java.lang.String materialurl;
   /** @pdOid 8b665e83-9a77-4af0-816a-ad5f03c353c9 */
   private double salary = 0;
   /** @pdOid fc0cf734-361a-4fce-9c36-abf0b4813bee */
   private java.lang.String super_manager;
   
   /** @pdRoleInfo migr=no name=Worker assc=Reference_34 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Worker> worker;
   /** @pdRoleInfo migr=no name=Postion assc=Reference_35 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Postion> postion;
   /** @pdRoleInfo migr=no name=Index_postion assc=Reference_40 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Index_postion> index_postion;
   /** @pdRoleInfo migr=no name=Supermanager assc=Reference_36 mult=0..1 side=A */
   public Supermanager supermanager;
   /** @pdRoleInfo migr=no name=Authority assc=Reference_42 mult=0..1 side=A */
   public Authority authority;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Manager() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid 4ec119e7-a718-4554-9898-7182af3197cd */
   public java.lang.String getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 62bb38be-0bb4-4350-b608-cb8eba4b6a85 */
   public void setId(java.lang.String newId) {
      id = newId;
   }
   
   /** @pdOid 41ba4732-619c-4926-958a-86ac9babf45b */
   public java.lang.String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 408c6284-9652-4f9c-af7e-78bae56644cc */
   public void setName(java.lang.String newName) {
      name = newName;
   }
   
   /** @pdOid 9bf9c57f-6a50-4f60-bf52-5473dda12e16 */
   public java.lang.String getPhone() {
      return phone;
   }
   
   /** @param newPhone
    * @pdOid 62f1d7f0-c059-4097-b736-a1f7142756bc */
   public void setPhone(java.lang.String newPhone) {
      phone = newPhone;
   }
   
   /** @pdOid 99f1a3c2-ce9f-45a4-baa8-3c3662c0ce1c */
   public java.util.Date getInstate() {
      return instate;
   }
   
   /** @param newInstate
    * @pdOid 170b1e37-7cee-4116-95ce-cd03cbff3a5c */
   public void setInstate(java.util.Date newInstate) {
      instate = newInstate;
   }
   
   /** @pdOid 2858f3d4-b87a-4c87-9072-3205d5aa755b */
   public java.util.Date getOutstate() {
      return outstate;
   }
   
   /** @param newOutstate
    * @pdOid ebb9cacb-49ef-49f2-8095-e731d8234354 */
   public void setOutstate(java.util.Date newOutstate) {
      outstate = newOutstate;
   }
   
   /** @pdOid b9fa6022-3f88-4084-813c-93a1230c78af */
   public int getState() {
      return state;
   }
   
   /** @param newState
    * @pdOid a3a3bbb5-9565-43fc-897f-cfdf610764f1 */
   public void setState(int newState) {
      state = newState;
   }
   
   /** @pdOid 1ec09055-3f75-42de-9ec9-1b7bdc7d1f75 */
   public java.lang.String getIntroduce() {
      return introduce;
   }
   
   /** @param newIntroduce
    * @pdOid 05edab8d-c432-46cb-ab73-aebfcf92a421 */
   public void setIntroduce(java.lang.String newIntroduce) {
      introduce = newIntroduce;
   }
   
   /** @pdOid 0982c34d-b0d6-4f9c-874a-badcc6972cdc */
   public java.lang.String getMaterialurl() {
      return materialurl;
   }
   
   /** @param newMaterialurl
    * @pdOid 3af20e09-4a60-4a11-ba13-a2ce4fac8aae */
   public void setMaterialurl(java.lang.String newMaterialurl) {
      materialurl = newMaterialurl;
   }
   
   /** @pdOid 85aa9b0b-6e33-4aad-aac5-d485caba64fe */
   public double getSalary() {
      return salary;
   }
   
   /** @param newSalary
    * @pdOid 387f2c83-3865-4cc6-b875-19f0db42b549 */
   public void setSalary(double newSalary) {
      salary = newSalary;
   }
   
   /** @pdOid 7c1af080-4818-457b-b618-0a4f957f0dac */
   public java.lang.String getSuper_manager() {
      return super_manager;
   }
   
   /** @param newSuper_manager
    * @pdOid c2a7457a-b8f5-4f9e-8df5-7c7620af0530 */
   public void setSuper_manager(java.lang.String newSuper_manager) {
      super_manager = newSuper_manager;
   }
   
   
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Worker> getWorker() {
      if (worker == null)
         worker = new java.util.HashSet<Worker>();
      return worker;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorWorker() {
      if (worker == null)
         worker = new java.util.HashSet<Worker>();
      return worker.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newWorker
    */
   public void setWorker(java.util.Collection<Worker> newWorker) {
      //removeAllWorker();
      this.worker = newWorker;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newWorker
    */
   public void addWorker(Worker newWorker) {
      if (newWorker == null)
         return;
      if (this.worker == null)
         this.worker = new java.util.HashSet<Worker>();
      if (!this.worker.contains(newWorker))
      {
         this.worker.add(newWorker);
         newWorker.setManager(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldWorker
    */
   public void removeWorker(Worker oldWorker) {
      if (oldWorker == null)
         return;
      if (this.worker != null)
         if (this.worker.contains(oldWorker))
         {
            this.worker.remove(oldWorker);
            oldWorker.setManager((Manager)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllWorker() {
      if (worker != null)
      {
         Worker oldWorker;
         for (java.util.Iterator iter = getIteratorWorker(); iter.hasNext();)
         {
            oldWorker = (Worker)iter.next();
            iter.remove();
            oldWorker.setManager((Manager)null);
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
         newPostion.setManager(this);
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
            oldPostion.setManager((Manager)null);
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
            oldPostion.setManager((Manager)null);
         }
      }
   }
   /**
    * @pdGenerated default getter
    */
   public java.util.Collection<Index_postion> getIndex_postion() {
      if (index_postion == null)
         index_postion = new java.util.HashSet<Index_postion>();
      return index_postion;
   }
   
   /**
    * @pdGenerated default iterator getter
    */
   public java.util.Iterator getIteratorIndex_postion() {
      if (index_postion == null)
         index_postion = new java.util.HashSet<Index_postion>();
      return index_postion.iterator();
   }
   
   /** 
    * @pdGenerated default setter
    * @param newIndex_postion
    */
   public void setIndex_postion(java.util.Collection<Index_postion> newIndex_postion) {
      //removeAllIndex_postion();
      this.index_postion = newIndex_postion;   
   }
   
   /** 
    * @pdGenerated default add
    * @param newIndex_postion
    */
   public void addIndex_postion(Index_postion newIndex_postion) {
      if (newIndex_postion == null)
         return;
      if (this.index_postion == null)
         this.index_postion = new java.util.HashSet<Index_postion>();
      if (!this.index_postion.contains(newIndex_postion))
      {
         this.index_postion.add(newIndex_postion);
         newIndex_postion.setManager(this);
      }
   }
   
   /** 
    * @pdGenerated default remove
    * @param oldIndex_postion
    */
   public void removeIndex_postion(Index_postion oldIndex_postion) {
      if (oldIndex_postion == null)
         return;
      if (this.index_postion != null)
         if (this.index_postion.contains(oldIndex_postion))
         {
            this.index_postion.remove(oldIndex_postion);
            oldIndex_postion.setManager((Manager)null);
         }
   }
   
   /**
    * @pdGenerated default removeAll
    */
   public void removeAllIndex_postion() {
      if (index_postion != null)
      {
         Index_postion oldIndex_postion;
         for (java.util.Iterator iter = getIteratorIndex_postion(); iter.hasNext();)
         {
            oldIndex_postion = (Index_postion)iter.next();
            iter.remove();
            oldIndex_postion.setManager((Manager)null);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Supermanager getSupermanager() {
      return supermanager;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newSupermanager
    */
   public void setSupermanager(Supermanager newSupermanager) {
      if (this.supermanager == null || !this.supermanager.equals(newSupermanager))
      {
         if (this.supermanager != null)
         {
            Supermanager oldSupermanager = this.supermanager;
            this.supermanager = null;
            //oldSupermanager.removeManager(this);
         }
         if (newSupermanager != null)
         {
            this.supermanager = newSupermanager;
            //this.supermanager.addManager(this);
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
            //oldAuthority.removeManager(this);
         }
         if (newAuthority != null)
         {
            this.authority = newAuthority;
            //this.authority.addManager(this);
         }
      }
   }
   
   /**
    * Get value of managerPK.
    *
    * @return managerPK object
    */
   public ManagerPK getManagerPK() {
      return new ManagerPK(id);
   }
   
   /**
    * Set value of managerPK.
    * 
    * @param pk
    */
   public void setManagerPK(ManagerPK pk) {
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
   
      if (!(other instanceof Manager))
         return false;
   
      Manager cast = (Manager) other;
   
      if (this.id == null ? cast.getId() != this.id : !this.id.equals( cast.getId()))
         return false;
   
      if (this.name == null ? cast.getName() != this.name : !this.name.equals( cast.getName()))
         return false;
   
      if (this.phone == null ? cast.getPhone() != this.phone : !this.phone.equals( cast.getPhone()))
         return false;
   
      if (this.instate == null ? cast.getInstate() != this.instate : !(com.sybase.orm.util.Util.compareDate(this.instate,  cast.getInstate(), java.util.Calendar.SECOND) == 0))
         return false;
   
      if (this.outstate == null ? cast.getOutstate() != this.outstate : !(com.sybase.orm.util.Util.compareDate(this.outstate,  cast.getOutstate(), java.util.Calendar.SECOND) == 0))
         return false;
   
      if (this.state != cast.getState())
         return false;
   
      if (this.introduce == null ? cast.getIntroduce() != this.introduce : !this.introduce.equals( cast.getIntroduce()))
         return false;
   
      if (this.materialurl == null ? cast.getMaterialurl() != this.materialurl : !this.materialurl.equals( cast.getMaterialurl()))
         return false;
   
      if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(cast.getSalary()))
               return false;
   
      if (this.super_manager == null ? cast.getSuper_manager() != this.super_manager : !this.super_manager.equals( cast.getSuper_manager()))
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
      if (this.phone != null) 
         hashCode = 29 * hashCode + phone.hashCode();
      if (this.instate != null) 
         hashCode = 29 * hashCode + instate.hashCode();
      if (this.outstate != null) 
         hashCode = 29 * hashCode + outstate.hashCode();
      hashCode = 29 * hashCode + (new Integer(state)).hashCode();
      if (this.introduce != null) 
         hashCode = 29 * hashCode + introduce.hashCode();
      if (this.materialurl != null) 
         hashCode = 29 * hashCode + materialurl.hashCode();
      hashCode = 29 * hashCode + (new Double(salary)).hashCode();
      if (this.super_manager != null) 
         hashCode = 29 * hashCode + super_manager.hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Manager: " );
      ret.append( "id='" + id + "'");
      ret.append( "name='" + name + "'");
      ret.append( "phone='" + phone + "'");
      ret.append( "instate='" + instate + "'");
      ret.append( "outstate='" + outstate + "'");
      ret.append( "state='" + state + "'");
      ret.append( "introduce='" + introduce + "'");
      ret.append( "materialurl='" + materialurl + "'");
      ret.append( "salary='" + salary + "'");
      ret.append( "super_manager='" + super_manager + "'");
      return ret.toString();
   }

}