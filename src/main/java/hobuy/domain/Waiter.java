/***********************************************************************
 * Module:  Waiter.java
 * Author:  ZD
 * Purpose: Defines the Class Waiter
 ***********************************************************************/

package hobuy.domain;

/** @pdOid 0f865dce-1e9d-4aa8-b098-cabd27dccc9b */
public class Waiter implements java.io.Serializable {
	/** @pdOid 340e7a9d-acf4-44f6-9f18-cd43525c58f1 */
	private long id;
	/** @pdOid 11a2b040-9e36-43d0-b307-621fe2e63b78 */
	private java.lang.String name;
	/** @pdOid 39452ea1-d0b5-46a6-8395-e7956c19ed4c */
	private java.lang.String phone;
	/** @pdOid 04b56556-c968-48c2-be26-7966f58c5e54 */
	private long account;
	/** @pdOid 3e23dbb0-33f7-45ab-b5a3-e853c192a9d4 */
	private int type;
	/** @pdOid 6bf8b970-1593-4f23-93e9-393adc1afcdf */
	private int state = 1;

	/** @pdRoleInfo migr=no name=Soler assc=Reference_22 mult=0..1 side=A */
	public Soler soler;

	/**
	 * Empty constructor which is required by Hibernate
	 *
	 */
	public Waiter() {
		// TODO Auto-generated constructor stub
	}

	/** @pdOid 2f62d4a8-e238-4cf1-859d-e86ea105e95c */
	public long getId() {
		return id;
	}

	/**
	 * @param newId
	 * @pdOid 77a3295b-130a-4fef-bacb-9b02c41bba13
	 */
	public void setId(long newId) {
		id = newId;
	}

	/** @pdOid a445ab76-e4a1-4c3d-9907-2e7667fa2793 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * @param newName
	 * @pdOid 10524802-cb7a-44c2-9daf-34ddb24d1f59
	 */
	public void setName(java.lang.String newName) {
		name = newName;
	}

	/** @pdOid 0a8d7a32-e5be-478f-8354-91998d653867 */
	public java.lang.String getPhone() {
		return phone;
	}

	/**
	 * @param newPhone
	 * @pdOid c5b5a3ae-62fb-47fc-8dda-b227481fb2a4
	 */
	public void setPhone(java.lang.String newPhone) {
		phone = newPhone;
	}

	/** @pdOid 6bc21bee-e67a-47e5-8482-40269dff3961 */
	public long getAccount() {
		return account;
	}

	/**
	 * @param newAccount
	 * @pdOid 81c4aba3-4ce4-4db9-a141-40296ef5b0a8
	 */
	public void setAccount(long newAccount) {
		account = newAccount;
	}

	/** @pdOid 72383444-fbf7-4304-a0c1-353912cc8917 */
	public int getType() {
		return type;
	}

	/**
	 * @param newType
	 * @pdOid ac808b27-2b03-418a-89df-ccc82a728894
	 */
	public void setType(int newType) {
		type = newType;
	}

	/** @pdOid dbecaf02-a2b2-46a7-b91e-d0500efd8067 */
	public int getState() {
		return state;
	}

	/**
	 * @param newState
	 * @pdOid b6d8dbd8-2153-4ff2-b0e8-e7b595d80eca
	 */
	public void setState(int newState) {
		state = newState;
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
				// oldSoler.removeWaiter(this);
			}
			if (newSoler != null) {
				this.soler = newSoler;
				// this.soler.addWaiter(this);
			}
		}
	}

	/**
	 * Get value of waiterPK.
	 *
	 * @return waiterPK object
	 */
	public WaiterPK getWaiterPK() {
		return new WaiterPK(id);
	}

	/**
	 * Set value of waiterPK.
	 * 
	 * @param pk
	 */
	public void setWaiterPK(WaiterPK pk) {
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

		if (!(other instanceof Waiter))
			return false;

		Waiter cast = (Waiter) other;

		if (this.id != cast.getId())
			return false;

		if (this.name == null ? cast.getName() != this.name : !this.name.equals(cast.getName()))
			return false;

		if (this.phone == null ? cast.getPhone() != this.phone : !this.phone.equals(cast.getPhone()))
			return false;

		if (this.account != cast.getAccount())
			return false;

		if (this.type != cast.getType())
			return false;

		if (this.state != cast.getState())
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
		hashCode = 29 * hashCode + (new Long(account)).hashCode();
		hashCode = 29 * hashCode + (new Integer(type)).hashCode();
		hashCode = 29 * hashCode + (new Integer(state)).hashCode();
		return hashCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		ret.append("hobuy.domain.Waiter: ");
		ret.append("id='" + id + "'");
		ret.append("name='" + name + "'");
		ret.append("phone='" + phone + "'");
		ret.append("account='" + account + "'");
		ret.append("type='" + type + "'");
		ret.append("state='" + state + "'");
		return ret.toString();
	}

}