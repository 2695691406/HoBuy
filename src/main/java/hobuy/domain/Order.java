/***********************************************************************
 * Module:  Order.java
 * Author:  ZD
 * Purpose: Defines the Class Order
 ***********************************************************************/

package hobuy.domain;

import java.util.Date;

/**
 * 订单表包含用户订单信息，商品信息放到额外的表中，方便整合商品
 * 
 * @pdOid c7a71fcd-6f1d-4941-bdbe-8567b13eedcb
 */
public class Order implements java.io.Serializable {
	/** @pdOid 6458345e-07c4-44f3-9c5c-4d71554b7379 */
	private long id;
	/** @pdOid 33b82e9c-be04-4ef6-bd93-f53864b01059 */
	private double price;
	/** @pdOid 10cf2772-8aca-4d42-a7a3-b647923d9999 */
	private java.lang.String couriernum;
	/** @pdOid ee8aa88d-b38c-481b-ba0c-2dd20a51118f */
	private java.util.Date createtime = new Date();
	/** @pdOid 9054e0a3-5275-40d7-a244-796b3c5da4a2 */
	private int type;
	/** @pdOid f0eabd46-0089-464e-91d2-aafd646cbcab */
	private int state = 0;
	/** @pdOid 1718353f-bb44-43ce-9668-c7fcd7c7d317 */
	private byte printstate = 0;

	/**
	 * @pdRoleInfo migr=no name=Order_product assc=order_order_product
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	public java.util.Collection<Order_product> order_product;
	/**
	 * @pdRoleInfo migr=no name=Soler_evaluate assc=Reference_14
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	public java.util.Collection<Soler_evaluate> soler_evaluate;
	/**
	 * @pdRoleInfo migr=no name=User_evaluate assc=Reference_17
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	public java.util.Collection<User_evaluate> user_evaluate;
	/** @pdRoleInfo migr=no name=User assc=Reference_8 mult=0..1 side=A */
	public User user;
	/** @pdRoleInfo migr=no name=Address assc=Reference_9 mult=0..1 side=A */
	public Address address;
	/** @pdRoleInfo migr=no name=Soler assc=Reference_23 mult=0..1 side=A */
	public Soler soler;
	/**
	 * @pdRoleInfo migr=no name=SolerWorker assc=Reference_47 mult=0..1 side=A
	 */
	public SolerWorker solerWorker;

	/**
	 * Empty constructor which is required by Hibernate
	 *
	 */
	public Order() {
		// TODO Auto-generated constructor stub
	}

	/** @pdOid abfd8e5b-d5a8-43f5-981d-80108b7a157f */
	public long getId() {
		return id;
	}

	/**
	 * @param newId
	 * @pdOid 1df0c6f4-07fb-443d-b5c9-86ee21034c2a
	 */
	public void setId(long newId) {
		id = newId;
	}

	/** @pdOid 8b2a8b24-7af5-4f32-a953-3c92dc65c00d */
	public double getPrice() {
		return price;
	}

	/**
	 * @param newPrice
	 * @pdOid d4ef3b38-506c-47e2-9e6a-a654384544c7
	 */
	public void setPrice(double newPrice) {
		price = newPrice;
	}

	/** @pdOid 7de9a92c-8759-4498-958c-865d5edb3ada */
	public java.lang.String getCouriernum() {
		return couriernum;
	}

	/**
	 * @param newCouriernum
	 * @pdOid 585990c9-2b74-4c40-91d7-78fb8120e7cf
	 */
	public void setCouriernum(java.lang.String newCouriernum) {
		couriernum = newCouriernum;
	}

	/** @pdOid e5dcf3fb-9c9e-4ee9-b21a-cb42eb472a2f */
	public java.util.Date getCreatetime() {
		return createtime;
	}

	/**
	 * @param newCreatetime
	 * @pdOid dc877699-b314-471a-b9c4-b124f314cb2a
	 */
	public void setCreatetime(java.util.Date newCreatetime) {
		createtime = newCreatetime;
	}

	/** @pdOid 379e4891-66c5-4e16-ab23-25469f163b7b */
	public int getType() {
		return type;
	}

	/**
	 * @param newType
	 * @pdOid 0d5bc06d-0ee1-4c23-9c8b-27bd43f031fd
	 */
	public void setType(int newType) {
		type = newType;
	}

	/** @pdOid 75e4a7ec-92da-4cfd-85bf-bcb03f458175 */
	public int getState() {
		return state;
	}

	/**
	 * @param newState
	 * @pdOid f9d5ef3f-d4c5-4993-9018-1e26ca4900c4
	 */
	public void setState(int newState) {
		state = newState;
	}

	/** @pdOid a8337c8c-9925-43a4-ac04-f3d04d6c7e50 */
	public byte getPrintstate() {
		return printstate;
	}

	/**
	 * @param newPrintstate
	 * @pdOid 83d8f9d5-3893-4cc0-b77a-32b68eb530c9
	 */
	public void setPrintstate(byte newPrintstate) {
		printstate = newPrintstate;
	}

	/**
	 * @pdGenerated default getter
	 */
	public java.util.Collection<Order_product> getOrder_product() {
		if (order_product == null)
			order_product = new java.util.HashSet<Order_product>();
		return order_product;
	}

	/**
	 * @pdGenerated default iterator getter
	 */
	public java.util.Iterator getIteratorOrder_product() {
		if (order_product == null)
			order_product = new java.util.HashSet<Order_product>();
		return order_product.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newOrder_product
	 */
	public void setOrder_product(java.util.Collection<Order_product> newOrder_product) {
		// removeAllOrder_product();
		this.order_product = newOrder_product;
	}

	/**
	 * @pdGenerated default add
	 * @param newOrder_product
	 */
	public void addOrder_product(Order_product newOrder_product) {
		if (newOrder_product == null)
			return;
		if (this.order_product == null)
			this.order_product = new java.util.HashSet<Order_product>();
		if (!this.order_product.contains(newOrder_product)) {
			this.order_product.add(newOrder_product);
			newOrder_product.setOrder(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldOrder_product
	 */
	public void removeOrder_product(Order_product oldOrder_product) {
		if (oldOrder_product == null)
			return;
		if (this.order_product != null)
			if (this.order_product.contains(oldOrder_product)) {
				this.order_product.remove(oldOrder_product);
				oldOrder_product.setOrder((Order) null);
			}
	}

	/**
	 * @pdGenerated default removeAll
	 */
	public void removeAllOrder_product() {
		if (order_product != null) {
			Order_product oldOrder_product;
			for (java.util.Iterator iter = getIteratorOrder_product(); iter.hasNext();) {
				oldOrder_product = (Order_product) iter.next();
				iter.remove();
				oldOrder_product.setOrder((Order) null);
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
		// removeAllSoler_evaluate();
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
		if (!this.soler_evaluate.contains(newSoler_evaluate)) {
			this.soler_evaluate.add(newSoler_evaluate);
			newSoler_evaluate.setOrder(this);
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
			if (this.soler_evaluate.contains(oldSoler_evaluate)) {
				this.soler_evaluate.remove(oldSoler_evaluate);
				oldSoler_evaluate.setOrder((Order) null);
			}
	}

	/**
	 * @pdGenerated default removeAll
	 */
	public void removeAllSoler_evaluate() {
		if (soler_evaluate != null) {
			Soler_evaluate oldSoler_evaluate;
			for (java.util.Iterator iter = getIteratorSoler_evaluate(); iter.hasNext();) {
				oldSoler_evaluate = (Soler_evaluate) iter.next();
				iter.remove();
				oldSoler_evaluate.setOrder((Order) null);
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
		// removeAllUser_evaluate();
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
		if (!this.user_evaluate.contains(newUser_evaluate)) {
			this.user_evaluate.add(newUser_evaluate);
			newUser_evaluate.setOrder(this);
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
			if (this.user_evaluate.contains(oldUser_evaluate)) {
				this.user_evaluate.remove(oldUser_evaluate);
				oldUser_evaluate.setOrder((Order) null);
			}
	}

	/**
	 * @pdGenerated default removeAll
	 */
	public void removeAllUser_evaluate() {
		if (user_evaluate != null) {
			User_evaluate oldUser_evaluate;
			for (java.util.Iterator iter = getIteratorUser_evaluate(); iter.hasNext();) {
				oldUser_evaluate = (User_evaluate) iter.next();
				iter.remove();
				oldUser_evaluate.setOrder((Order) null);
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
		if (this.user == null || !this.user.equals(newUser)) {
			if (this.user != null) {
				User oldUser = this.user;
				this.user = null;
				// oldUser.removeOrder(this);
			}
			if (newUser != null) {
				this.user = newUser;
				// this.user.addOrder(this);
			}
		}
	}

	/**
	 * @pdGenerated default parent getter
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @pdGenerated default parent setter
	 * @param newAddress
	 */
	public void setAddress(Address newAddress) {
		if (this.address == null || !this.address.equals(newAddress)) {
			if (this.address != null) {
				Address oldAddress = this.address;
				this.address = null;
				// oldAddress.removeOrder(this);
			}
			if (newAddress != null) {
				this.address = newAddress;
				// this.address.addOrder(this);
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
				// oldSoler.removeOrder(this);
			}
			if (newSoler != null) {
				this.soler = newSoler;
				// this.soler.addOrder(this);
			}
		}
	}

	/**
	 * @pdGenerated default parent getter
	 */
	public SolerWorker getSolerWorker() {
		return solerWorker;
	}

	/**
	 * @pdGenerated default parent setter
	 * @param newSolerWorker
	 */
	public void setSolerWorker(SolerWorker newSolerWorker) {
		if (this.solerWorker == null || !this.solerWorker.equals(newSolerWorker)) {
			if (this.solerWorker != null) {
				SolerWorker oldSolerWorker = this.solerWorker;
				this.solerWorker = null;
				// oldSolerWorker.removeOrder(this);
			}
			if (newSolerWorker != null) {
				this.solerWorker = newSolerWorker;
				// this.solerWorker.addOrder(this);
			}
		}
	}

	/**
	 * Get value of orderPK.
	 *
	 * @return orderPK object
	 */
	public OrderPK getOrderPK() {
		return new OrderPK(id);
	}

	/**
	 * Set value of orderPK.
	 * 
	 * @param pk
	 */
	public void setOrderPK(OrderPK pk) {
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

		if (!(other instanceof Order))
			return false;

		Order cast = (Order) other;

		if (this.id != cast.getId())
			return false;

		if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(cast.getPrice()))
			return false;

		if (this.couriernum == null ? cast.getCouriernum() != this.couriernum
				: !this.couriernum.equals(cast.getCouriernum()))
			return false;

		if (this.createtime == null ? cast.getCreatetime() != this.createtime
				: !(com.sybase.orm.util.Util.compareDate(this.createtime, cast.getCreatetime(),
						java.util.Calendar.SECOND) == 0))
			return false;

		if (this.type != cast.getType())
			return false;

		if (this.state != cast.getState())
			return false;

		if (this.printstate != cast.getPrintstate())
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
		hashCode = 29 * hashCode + (new Double(price)).hashCode();
		if (this.couriernum != null)
			hashCode = 29 * hashCode + couriernum.hashCode();
		if (this.createtime != null)
			hashCode = 29 * hashCode + createtime.hashCode();
		hashCode = 29 * hashCode + (new Integer(type)).hashCode();
		hashCode = 29 * hashCode + (new Integer(state)).hashCode();
		hashCode = 29 * hashCode + (new Byte(printstate)).hashCode();
		return hashCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		ret.append("hobuy.domain.Order: ");
		ret.append("id='" + id + "'");
		ret.append("price='" + price + "'");
		ret.append("couriernum='" + couriernum + "'");
		ret.append("createtime='" + createtime + "'");
		ret.append("type='" + type + "'");
		ret.append("state='" + state + "'");
		ret.append("printstate='" + printstate + "'");
		return ret.toString();
	}

}