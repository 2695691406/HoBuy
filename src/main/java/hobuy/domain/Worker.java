/***********************************************************************
 * Module:  Worker.java
 * Author:  ZD
 * Purpose: Defines the Class Worker
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 工作人员表
 * 
 * @pdOid 2956401d-1014-44ab-83ce-33c52f3e1446 */
public class Worker implements java.io.Serializable {
   /** @pdOid 81349948-f99e-4044-af2c-6c90257fdb5c */
   private java.lang.String id;
   /** @pdOid c1855f80-e782-4ec3-8b6d-74fb4366c953 */
   private java.lang.String name;
   /** @pdOid b0e53861-9dd8-4daf-aadb-f9ab1416b739 */
   private java.lang.String phone;
   /** @pdOid a582b502-83cb-471c-ba3e-bde516939d77 */
   private java.util.Date instate;
   /** @pdOid 154f8986-ca71-47dc-bd41-2c72404fe373 */
   private java.util.Date outstate;
   /** 批准人
    * 
    * @pdOid 8f2d9fe4-792e-499b-9852-b6215606ca34 */
   private java.lang.String allowid;
   /** @pdOid 128cb4b3-5ea3-4f95-9549-ee6511164484 */
   private int state = 1;
   /** @pdOid d36e8f80-fb2c-421e-95fa-6d143b703f82 */
   private java.lang.String introduce;
   /** 个人材料，例如简历等
    * 
    * @pdOid ac79192b-8ea9-441d-ac0a-358f2af07735 */
   private java.lang.String materialurl;
   /** @pdOid bb78c344-4e53-4096-88f8-b1f8d7b4afb6 */
   private double salary = 0;
   
   /** @pdRoleInfo migr=no name=Index_product assc=Reference_39 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Index_product> index_product;
   /** @pdRoleInfo migr=no name=Postion assc=Reference_32 mult=0..1 side=A */
   public Postion postion;
   /** @pdRoleInfo migr=no name=Manager assc=Reference_34 mult=0..1 side=A */
   public Manager manager;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Worker() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid 53665cb9-9ff6-42f7-9a45-fb7e3aebf8e1 */
   public java.lang.String getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid c9837485-02f5-4c39-bb98-0cc8c3fbed45 */
   public void setId(java.lang.String newId) {
      id = newId;
   }
   
   /** @pdOid 5b686d4c-40d3-4f05-a146-f97c9dfc5d9a */
   public java.lang.String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 929d16a2-8afd-41c9-9df0-d9823d1c0132 */
   public void setName(java.lang.String newName) {
      name = newName;
   }
   
   /** @pdOid 9f4d3513-d3ca-4bad-9196-a0055abef4c4 */
   public java.lang.String getPhone() {
      return phone;
   }
   
   /** @param newPhone
    * @pdOid 3c10f806-ad0b-45dc-858d-75992122d1bf */
   public void setPhone(java.lang.String newPhone) {
      phone = newPhone;
   }
   
   /** @pdOid 2d936523-b3ea-4b9a-a24e-e9d0ba1d1750 */
   public java.util.Date getInstate() {
      return instate;
   }
   
   /** @param newInstate
    * @pdOid 7c0ff38a-129a-4be7-bb86-c8447e3a701f */
   public void setInstate(java.util.Date newInstate) {
      instate = newInstate;
   }
   
   /** @pdOid 5157b0a1-d32f-4241-ab99-19bd025970ed */
   public java.util.Date getOutstate() {
      return outstate;
   }
   
   /** @param newOutstate
    * @pdOid 8e452783-5240-4876-8b4f-e7d37966196a */
   public void setOutstate(java.util.Date newOutstate) {
      outstate = newOutstate;
   }
   
   /** @pdOid a20b0564-d5da-4df5-ac1b-eb1b3e9cd19c */
   public java.lang.String getAllowid() {
      return allowid;
   }
   
   /** @param newAllowid
    * @pdOid 35797c7e-64e3-46b0-b234-689f56c72061 */
   public void setAllowid(java.lang.String newAllowid) {
      allowid = newAllowid;
   }
   
   /** @pdOid 78d34c44-fd61-4b64-8ac1-98598ae4145f */
   public int getState() {
      return state;
   }
   
   /** @param newState
    * @pdOid b3fd79dc-e2e2-4d80-be30-cd60c6a9bbc1 */
   public void setState(int newState) {
      state = newState;
   }
   
   /** @pdOid 37c76537-6236-4739-a460-648eae4e3c9b */
   public java.lang.String getIntroduce() {
      return introduce;
   }
   
   /** @param newIntroduce
    * @pdOid b9ac3de1-540e-45dd-bac9-38aa8d1ae531 */
   public void setIntroduce(java.lang.String newIntroduce) {
      introduce = newIntroduce;
   }
   
   /** @pdOid 1ef6bdde-b782-486b-b968-3ea29e45dab6 */
   public java.lang.String getMaterialurl() {
      return materialurl;
   }
   
   /** @param newMaterialurl
    * @pdOid d663da5e-5d1c-4cd5-a6dd-89bf39c23a4f */
   public void setMaterialurl(java.lang.String newMaterialurl) {
      materialurl = newMaterialurl;
   }
   
   /** @pdOid 820f3298-48b8-488a-adcf-6c6c8adc2b94 */
   public double getSalary() {
      return salary;
   }
   
   /** @param newSalary
    * @pdOid 7d94b3a6-09ec-4e2c-b5ce-1672e9215636 */
   public void setSalary(double newSalary) {
      salary = newSalary;
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
         newIndex_product.setWorker(this);
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
            oldIndex_product.setWorker((Worker)null);
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
            oldIndex_product.setWorker((Worker)null);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Postion getPostion() {
      return postion;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newPostion
    */
   public void setPostion(Postion newPostion) {
      if (this.postion == null || !this.postion.equals(newPostion))
      {
         if (this.postion != null)
         {
            Postion oldPostion = this.postion;
            this.postion = null;
            //oldPostion.removeWorker(this);
         }
         if (newPostion != null)
         {
            this.postion = newPostion;
            //this.postion.addWorker(this);
         }
      }
   }
   /**
    * @pdGenerated default parent getter
    */
   public Manager getManager() {
      return manager;
   }
   
   /**
    * @pdGenerated default parent setter
    * @param newManager
    */
   public void setManager(Manager newManager) {
      if (this.manager == null || !this.manager.equals(newManager))
      {
         if (this.manager != null)
         {
            Manager oldManager = this.manager;
            this.manager = null;
            //oldManager.removeWorker(this);
         }
         if (newManager != null)
         {
            this.manager = newManager;
            //this.manager.addWorker(this);
         }
      }
   }
   
   /**
    * Get value of workerPK.
    *
    * @return workerPK object
    */
   public WorkerPK getWorkerPK() {
      return new WorkerPK(id);
   }
   
   /**
    * Set value of workerPK.
    * 
    * @param pk
    */
   public void setWorkerPK(WorkerPK pk) {
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
   
      if (!(other instanceof Worker))
         return false;
   
      Worker cast = (Worker) other;
   
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
   
      if (this.allowid == null ? cast.getAllowid() != this.allowid : !this.allowid.equals( cast.getAllowid()))
         return false;
   
      if (this.state != cast.getState())
         return false;
   
      if (this.introduce == null ? cast.getIntroduce() != this.introduce : !this.introduce.equals( cast.getIntroduce()))
         return false;
   
      if (this.materialurl == null ? cast.getMaterialurl() != this.materialurl : !this.materialurl.equals( cast.getMaterialurl()))
         return false;
   
      if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(cast.getSalary()))
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
      if (this.allowid != null) 
         hashCode = 29 * hashCode + allowid.hashCode();
      hashCode = 29 * hashCode + (new Integer(state)).hashCode();
      if (this.introduce != null) 
         hashCode = 29 * hashCode + introduce.hashCode();
      if (this.materialurl != null) 
         hashCode = 29 * hashCode + materialurl.hashCode();
      hashCode = 29 * hashCode + (new Double(salary)).hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Worker: " );
      ret.append( "id='" + id + "'");
      ret.append( "name='" + name + "'");
      ret.append( "phone='" + phone + "'");
      ret.append( "instate='" + instate + "'");
      ret.append( "outstate='" + outstate + "'");
      ret.append( "allowid='" + allowid + "'");
      ret.append( "state='" + state + "'");
      ret.append( "introduce='" + introduce + "'");
      ret.append( "materialurl='" + materialurl + "'");
      ret.append( "salary='" + salary + "'");
      return ret.toString();
   }

}