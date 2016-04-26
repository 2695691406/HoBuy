/***********************************************************************
 * Module:  SolerWorker.java
 * Author:  ZD
 * Purpose: Defines the Class SolerWorker
 ***********************************************************************/

package hobuy.domain;

import java.util.Date;

/**
 * 这个表是配送人员表
 * 
 * @pdOid 821b5e41-14e8-4640-87d6-2111e8dd4cd6
 */
public class SolerWorker implements java.io.Serializable {
	/** @pdOid 2aa40a16-068c-400e-92f8-39a4581b4c3f */
	private long id;
	/** @pdOid 842b5139-7d3a-4d9b-8dae-b748e42317bf */
	private java.lang.String name;
	/** @pdOid 0d2759d9-8c26-418e-bc9c-fd16bf22d7f3 */
	private java.lang.String phone;
	/** @pdOid 20f265af-735a-4215-a603-208bc3f8602d */
	private int state = 1;
	/** @pdOid 7ffba025-5610-42d2-866a-1482096f9cd2 */
	private byte workstate;
	/** @pdOid be773b61-11dd-47e3-ae0a-f020a4bc9f85 */
	private double reputation = 5.0;
	/** @pdOid c93a52ed-b35d-4e40-a750-a6bed046de64 */
	private int send_count;
	/** @pdOid a11fcea5-e798-44f6-89a3-3c3981c93939 */
	private java.util.Date createdate = new Date();
	/** @pdOid 1405364c-37a1-48bc-b4b0-4eeb6270f851 */
	private java.util.Date offdate;
	/** @pdOid d3f2ba04-3e46-45f9-9092-337e44fe4530 */
	private int type = 0;
	/** @pdOid cc51ea33-2cb5-439d-89a8-88ff7a586d75 */
	private java.lang.String account;

	/**
	 * @pdRoleInfo migr=no name=Order assc=Reference_47
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	public java.util.Collection<Order> order;
	/** @pdRoleInfo migr=no name=Soler assc=Reference_45 mult=0..1 side=A */
	public Soler soler;

	/**
	 * Empty constructor which is required by Hibernate
	 *
	 */
	public SolerWorker() {
		// TODO Auto-generated constructor stub
	}

	/** @pdOid 45d4f075-05f2-4da0-800b-ff0280d98cfd */
	public long getId() {
		return id;
	}

	/**
	 * @param newId
	 * @pdOid 1059e737-f1e5-44ba-a01e-b3482b392c77
	 */
	public void setId(long newId) {
		id = newId;
	}

	/** @pdOid 42ba507e-362e-4ce2-afa4-73d94f59663e */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * @param newName
	 * @pdOid fa4eb2a1-225d-46ad-a2cc-4bc6423111c7
	 */
	public void setName(java.lang.String newName) {
		name = newName;
	}

	/** @pdOid be9a3472-b0f5-4dcd-a051-603d449be15d */
	public java.lang.String getPhone() {
		return phone;
	}

	/**
	 * @param newPhone
	 * @pdOid 3cae3033-5cb9-4fed-80de-7aec2925ebc0
	 */
	public void setPhone(java.lang.String newPhone) {
		phone = newPhone;
	}

	/** @pdOid 3becf5f6-2fcd-47f0-8334-47ff0ab6294f */
	public int getState() {
		return state;
	}

	/**
	 * @param newState
	 * @pdOid c0aee20b-c0a5-42d5-afdc-b9026eec9f11
	 */
	public void setState(int newState) {
		state = newState;
	}

	/** @pdOid 0a565e1f-7fb1-45b8-af0c-abc62860166b */
	public byte getWorkstate() {
		return workstate;
	}

	/**
	 * @param newWorkstate
	 * @pdOid b7b0e4aa-8009-4644-88ce-bf25b1f3d48d
	 */
	public void setWorkstate(byte newWorkstate) {
		workstate = newWorkstate;
	}

	/** @pdOid 0f8a5de2-be62-43dc-b3b8-27b4ca0d573c */
	public double getReputation() {
		return reputation;
	}

	/**
	 * @param newReputation
	 * @pdOid b924b7a8-961e-4bde-a493-51a0c1ed5b38
	 */
	public void setReputation(double newReputation) {
		reputation = newReputation;
	}

	/** @pdOid 84d46177-c673-49d4-b386-1ddefe3f0283 */
	public int getSend_count() {
		return send_count;
	}

	/**
	 * @param newSend_count
	 * @pdOid 62254a52-1bff-4e98-ace2-661aa60c923d
	 */
	public void setSend_count(int newSend_count) {
		send_count = newSend_count;
	}

	/** @pdOid 68520f89-9830-43df-bbd6-1d8e708fae4f */
	public java.util.Date getCreatedate() {
		return createdate;
	}

	/**
	 * @param newCreatedate
	 * @pdOid 57955b0c-7299-4cb8-9c9c-9b5026192a7f
	 */
	public void setCreatedate(java.util.Date newCreatedate) {
		createdate = newCreatedate;
	}

	/** @pdOid b488aae3-2e3b-4a3d-9d5b-a53c02612d3e */
	public java.util.Date getOffdate() {
		return offdate;
	}

	/**
	 * @param newOffdate
	 * @pdOid c359d4f6-06f6-4478-b22d-b6c0f2b6afd1
	 */
	public void setOffdate(java.util.Date newOffdate) {
		offdate = newOffdate;
	}

	/** @pdOid 58676c32-4aa4-4282-a2d5-f163fde1a5cf */
	public int getType() {
		return type;
	}

	/**
	 * @param newType
	 * @pdOid 38bf3c76-9207-4550-8321-5214fe9e9f55
	 */
	public void setType(int newType) {
		type = newType;
	}

	/** @pdOid a4fc15ef-f89d-4acb-9a14-3ee6daf4ec9e */
	public java.lang.String getAccount() {
		return account;
	}

	/**
	 * @param newAccount
	 * @pdOid 12c12585-208d-49ae-84f0-e2c4bedb3769
	 */
	public void setAccount(java.lang.String newAccount) {
		account = newAccount;
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
		// removeAllOrder();
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
		if (!this.order.contains(newOrder)) {
			this.order.add(newOrder);
			newOrder.setSolerWorker(this);
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
			if (this.order.contains(oldOrder)) {
				this.order.remove(oldOrder);
				oldOrder.setSolerWorker((SolerWorker) null);
			}
	}

	/**
	 * @pdGenerated default removeAll
	 */
	public void removeAllOrder() {
		if (order != null) {
			Order oldOrder;
			for (java.util.Iterator iter = getIteratorOrder(); iter.hasNext();) {
				oldOrder = (Order) iter.next();
				iter.remove();
				oldOrder.setSolerWorker((SolerWorker) null);
			}
		}
	}

	/**
	 * @pdGenerated default parent getter
	 */
	public Soler getSoler() {
		return soler;
	}

	/**
	 * @pdGenerated default parent setter
	 * @param newSoler
	 */
	public void setSoler(Soler newSoler) {
		if (this.soler == null || !this.soler.equals(newSoler)) {
			if (this.soler != null) {
				Soler oldSoler = this.soler;
				this.soler = null;
				// oldSoler.removeSolerWorker(this);
			}
			if (newSoler != null) {
				this.soler = newSoler;
				// this.soler.addSolerWorker(this);
			}
		}
	}

	/**
	 * Get value of solerWorkerPK.
	 *
	 * @return solerWorkerPK object
	 */
	public SolerWorkerPK getSolerWorkerPK() {
		return new SolerWorkerPK(id);
	}

	/**
	 * Set value of solerWorkerPK.
	 * 
	 * @param pk
	 */
	public void setSolerWorkerPK(SolerWorkerPK pk) {
		if (pk != null) {
			this.id = pk.getId();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {

		if (other == null)
			return false;

		if (other == this)
			return true;

		if (!(other instanceof SolerWorker))
			return false;

		SolerWorker cast = (SolerWorker) other;

		if (this.id != cast.getId())
			return false;

		if (this.name == null ? cast.getName() != this.name : !this.name.equals(cast.getName()))
			return false;

		if (this.phone == null ? cast.getPhone() != this.phone : !this.phone.equals(cast.getPhone()))
			return false;

		if (this.state != cast.getState())
			return false;

		if (this.workstate != cast.getWorkstate())
			return false;

		if (Double.doubleToLongBits(this.reputation) != Double.doubleToLongBits(cast.getReputation()))
			return false;

		if (this.send_count != cast.getSend_count())
			return false;

		if (this.createdate == null ? cast.getCreatedate() != this.createdate
				: !(com.sybase.orm.util.Util.compareDate(this.createdate, cast.getCreatedate(),
						java.util.Calendar.SECOND) == 0))
			return false;

		if (this.offdate == null ? cast.getOffdate() != this.offdate
				: !(com.sybase.orm.util.Util.compareDate(this.offdate, cast.getOffdate(),
						java.util.Calendar.SECOND) == 0))
			return false;

		if (this.type != cast.getType())
			return false;

		if (this.account == null ? cast.getAccount() != this.account : !this.account.equals(cast.getAccount()))
			return false;

		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (new Long(id)).hashCode();
		if (this.name != null)
			hashCode = 29 * hashCode + name.hashCode();
		if (this.phone != null)
			hashCode = 29 * hashCode + phone.hashCode();
		hashCode = 29 * hashCode + (new Integer(state)).hashCode();
		hashCode = 29 * hashCode + (new Byte(workstate)).hashCode();
		hashCode = 29 * hashCode + (new Double(reputation)).hashCode();
		hashCode = 29 * hashCode + (new Integer(send_count)).hashCode();
		if (this.createdate != null)
			hashCode = 29 * hashCode + createdate.hashCode();
		if (this.offdate != null)
			hashCode = 29 * hashCode + offdate.hashCode();
		hashCode = 29 * hashCode + (new Integer(type)).hashCode();
		if (this.account != null)
			hashCode = 29 * hashCode + account.hashCode();
		return hashCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		ret.append("hobuy.domain.SolerWorker: ");
		ret.append("id='" + id + "'");
		ret.append("name='" + name + "'");
		ret.append("phone='" + phone + "'");
		ret.append("state='" + state + "'");
		ret.append("workstate='" + workstate + "'");
		ret.append("reputation='" + reputation + "'");
		ret.append("send_count='" + send_count + "'");
		ret.append("createdate='" + createdate + "'");
		ret.append("offdate='" + offdate + "'");
		ret.append("type='" + type + "'");
		ret.append("account='" + account + "'");
		return ret.toString();
	}

}