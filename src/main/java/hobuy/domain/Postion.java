/***********************************************************************
 * Module:  Postion.java
 * Author:  ZD
 * Purpose: Defines the Class Postion
 ***********************************************************************/

package hobuy.domain;

import java.util.*;

/** 职位表
 * 
 * @pdOid 1dba108d-b1d6-49df-9085-cdd3b0407356 */
public class Postion implements java.io.Serializable {
   /** @pdOid ee82a68e-2a8c-4b8d-8007-e150cb7322cc */
   private long id;
   /** @pdOid 50e97751-c022-44cc-9873-d279aa49243d */
   private java.lang.String name;
   /** @pdOid 598579dd-26e4-47a8-9499-9b94fff4e17b */
   private java.util.Date createdate;
   /** @pdOid b4f32e5a-dc8c-4903-86e6-1178bbccd79b */
   private java.util.Date cancledate;
   /** @pdOid 4f3d4b16-b3f5-49e4-8c58-72c0d8c14cc5 */
   private int state = 1;
   /** @pdOid 5de6be92-e86c-4508-880d-fc6538258e56 */
   private double salary = 0;
   
   /** @pdRoleInfo migr=no name=Worker assc=Reference_32 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Worker> worker;
   /** @pdRoleInfo migr=no name=Manager assc=Reference_35 mult=0..1 side=A */
   public Manager manager;
   /** @pdRoleInfo migr=no name=Supermanager assc=Reference_37 mult=0..1 side=A */
   public Supermanager supermanager;
   
   /**
    * Empty constructor which is required by Hibernate
    *
    */
   public Postion() {
      // TODO Auto-generated constructor stub
   }
   /** @pdOid bc71bbad-ebed-44e7-a839-f1c49461c0d1 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 716f6b22-121f-4a52-bb94-d1ea4bdade15 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid ee954483-dcac-4ebd-bb81-baaf5b33345e */
   public java.lang.String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 22b987d1-e08a-49e4-826c-efa5c717516a */
   public void setName(java.lang.String newName) {
      name = newName;
   }
   
   /** @pdOid b7a78215-ffd0-4d92-9e34-b3ac5f51474e */
   public java.util.Date getCreatedate() {
      return createdate;
   }
   
   /** @param newCreatedate
    * @pdOid 2cea91a9-fd08-40b9-8a31-9c2e8cda1d83 */
   public void setCreatedate(java.util.Date newCreatedate) {
      createdate = newCreatedate;
   }
   
   /** @pdOid 6ba4eb1b-ecf3-48c7-a78b-32c91d520b3e */
   public java.util.Date getCancledate() {
      return cancledate;
   }
   
   /** @param newCancledate
    * @pdOid df698950-626d-45bb-acb6-bd1390857c16 */
   public void setCancledate(java.util.Date newCancledate) {
      cancledate = newCancledate;
   }
   
   /** @pdOid d86a0db7-dae2-4800-81e5-4fdbfe7a4035 */
   public int getState() {
      return state;
   }
   
   /** @param newState
    * @pdOid 1d226217-87f1-4925-8bb2-aac5078cd632 */
   public void setState(int newState) {
      state = newState;
   }
   
   /** @pdOid 0a4277fd-1030-4648-8102-e5bc28121a5a */
   public double getSalary() {
      return salary;
   }
   
   /** @param newSalary
    * @pdOid 4e10e79d-f82e-4fd2-ac34-e03cefa5476e */
   public void setSalary(double newSalary) {
      salary = newSalary;
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
         newWorker.setPostion(this);
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
            oldWorker.setPostion((Postion)null);
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
            oldWorker.setPostion((Postion)null);
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
            //oldManager.removePostion(this);
         }
         if (newManager != null)
         {
            this.manager = newManager;
            //this.manager.addPostion(this);
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
            //oldSupermanager.removePostion(this);
         }
         if (newSupermanager != null)
         {
            this.supermanager = newSupermanager;
            //this.supermanager.addPostion(this);
         }
      }
   }
   
   /**
    * Get value of postionPK.
    *
    * @return postionPK object
    */
   public PostionPK getPostionPK() {
      return new PostionPK(id);
   }
   
   /**
    * Set value of postionPK.
    * 
    * @param pk
    */
   public void setPostionPK(PostionPK pk) {
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
   
      if (!(other instanceof Postion))
         return false;
   
      Postion cast = (Postion) other;
   
      if (this.id != cast.getId())
         return false;
   
      if (this.name == null ? cast.getName() != this.name : !this.name.equals( cast.getName()))
         return false;
   
      if (this.createdate == null ? cast.getCreatedate() != this.createdate : !(com.sybase.orm.util.Util.compareDate(this.createdate,  cast.getCreatedate(), java.util.Calendar.SECOND) == 0))
         return false;
   
      if (this.cancledate == null ? cast.getCancledate() != this.cancledate : !(com.sybase.orm.util.Util.compareDate(this.cancledate,  cast.getCancledate(), java.util.Calendar.SECOND) == 0))
         return false;
   
      if (this.state != cast.getState())
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
      hashCode = 29 * hashCode + (new Long(id)).hashCode();
      if (this.name != null) 
         hashCode = 29 * hashCode + name.hashCode();
      if (this.createdate != null) 
         hashCode = 29 * hashCode + createdate.hashCode();
      if (this.cancledate != null) 
         hashCode = 29 * hashCode + cancledate.hashCode();
      hashCode = 29 * hashCode + (new Integer(state)).hashCode();
      hashCode = 29 * hashCode + (new Double(salary)).hashCode();
      return hashCode;
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
      StringBuffer ret = new StringBuffer();
      ret.append( "hobuy.domain.Postion: " );
      ret.append( "id='" + id + "'");
      ret.append( "name='" + name + "'");
      ret.append( "createdate='" + createdate + "'");
      ret.append( "cancledate='" + cancledate + "'");
      ret.append( "state='" + state + "'");
      ret.append( "salary='" + salary + "'");
      return ret.toString();
   }

}