/***********************************************************************
 * Module:  Soler.java
 * Author:  ZD
 * Purpose: Defines the Class Soler
 ***********************************************************************/

package hobuy.domain;

import java.util.Date;

/** @pdOid 10df1350-4c72-4577-b6f1-2ab2bd1426b5 */
public class Soler implements java.io.Serializable {
	/** @pdOid a39d7691-6493-4052-85ec-aa2e41bc81dd */
	private long id;
	/** @pdOid 98db64f8-1923-47cb-adc0-d748942603cc */
	private java.lang.String photoimg;
	/** @pdOid 2e0d23ba-6b56-4455-be28-437b0b285b74 */
	private java.lang.String email;
	/** @pdOid 2c3aef84-110b-490a-98f3-1138e6823b30 */
	private java.lang.String pwd;
	/** @pdOid 4051ff1d-f420-4318-9853-d7e60ae10a9c */
	private java.lang.String name;
	/** @pdOid 2c13a09b-0e9d-466d-93d4-1414d91f760c */
	private java.lang.String phone;
	/** @pdOid a1de52ba-0c8e-4f31-af8a-4d79745f8dea */
	private java.lang.String introduce;
	/** @pdOid 3d50e8ca-9b8e-4c1c-a899-dd3ea6b6441e */
	private java.lang.String address;
	/** @pdOid dbe4c749-83e2-499e-acb7-d1aa361806c4 */
	private java.util.Date createtime = new Date();
	/** @pdOid 33e99a3d-2435-48c3-8a43-d57a98e02c5c */
	private int state = 1;
	/** @pdOid d8e3ec1c-e3f0-426f-a49c-db3a1955cf7b */
	private byte arrage = 1;
	/** @pdOid 852bf164-7536-4148-b9a0-c3888690c2a2 */
	private double reputaion = 5;
	/** @pdOid ad10c350-228c-4223-bee3-11fd473139f2 */
	private int count = 0;
	/** @pdOid ab96b3d9-0bc3-4f32-9a5c-2966f04243cc */
	private int authentication = 0;
	/** @pdOid 1983bf3b-757a-4a4a-a12a-30b57cb2b902 */
	private int type = 0;

	/**
	 * @pdRoleInfo migr=no name=Product assc=soler_product
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	public java.util.Collection<Product> product;
	/**
	 * @pdRoleInfo migr=no name=Soler_property assc=soler_property
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	public java.util.Collection<Soler_property> soler_property;
	/**
	 * @pdRoleInfo migr=no name=Soler_evaluate assc=Reference_12
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	public java.util.Collection<Soler_evaluate> soler_evaluate;
	/**
	 * @pdRoleInfo migr=no name=User_evaluate assc=Reference_15
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	public java.util.Collection<User_evaluate> user_evaluate;
	/**
	 * @pdRoleInfo migr=no name=Waiter assc=Reference_22
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	public java.util.Collection<Waiter> waiter;
	/**
	 * @pdRoleInfo migr=no name=Order assc=Reference_23
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	public java.util.Collection<Order> order;
	/**
	 * @pdRoleInfo migr=no name=SolerWorker assc=Reference_45
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	public java.util.Collection<SolerWorker> solerWorker;
	/**
	 * @pdRoleInfo migr=no name=University assc=Reference_30 mult=0..1 side=A
	 */
	public University university;

	/**
	 * Empty constructor which is required by Hibernate
	 *
	 */
	public Soler() {
		// TODO Auto-generated constructor stub
	}

	/** @pdOid afe37c34-5e5b-4b0a-969e-acffb3a6e03b */
	public long getId() {
		return id;
	}

	/**
	 * @param newId
	 * @pdOid 5959ed11-557f-43a2-840f-aaded13bca5f
	 */
	public void setId(long newId) {
		id = newId;
	}

	/** @pdOid f3337e89-64fe-499a-b9c4-cc0eec15cfa0 */
	public java.lang.String getPhotoimg() {
		return photoimg;
	}

	/**
	 * @param newPhotoimg
	 * @pdOid 6969607d-17ce-4bf5-ae73-7efe168e7d3e
	 */
	public void setPhotoimg(java.lang.String newPhotoimg) {
		photoimg = newPhotoimg;
	}

	/** @pdOid 33d880ec-3eea-4848-a693-dbb29ad91d29 */
	public java.lang.String getEmail() {
		return email;
	}

	/**
	 * @param newEmail
	 * @pdOid 263f8ede-6063-46fa-a24f-d0c92280bad3
	 */
	public void setEmail(java.lang.String newEmail) {
		email = newEmail;
	}

	/** @pdOid 31149d23-7567-4860-bda8-b578b51dc121 */
	public java.lang.String getPwd() {
		return pwd;
	}

	/**
	 * @param newPwd
	 * @pdOid 1dfef191-c4d4-42f4-90f2-7f09f2d780b8
	 */
	public void setPwd(java.lang.String newPwd) {
		pwd = newPwd;
	}

	/** @pdOid d2ecc89b-0b5f-4585-99a3-eacdf6e8f4cf */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * @param newName
	 * @pdOid 053574cf-21b5-462b-8fbb-c852f917b580
	 */
	public void setName(java.lang.String newName) {
		name = newName;
	}

	/** @pdOid a7531844-bd75-45d8-82e7-84f4896017f6 */
	public java.lang.String getPhone() {
		return phone;
	}

	/**
	 * @param newPhone
	 * @pdOid 5097a361-2003-4aad-93f1-cca4ab59d648
	 */
	public void setPhone(java.lang.String newPhone) {
		phone = newPhone;
	}

	/** @pdOid 9381d76c-44a9-449e-8639-cc67e4edd1b0 */
	public java.lang.String getIntroduce() {
		return introduce;
	}

	/**
	 * @param newIntroduce
	 * @pdOid 29e5c820-cc93-4f8d-aa34-462acebda700
	 */
	public void setIntroduce(java.lang.String newIntroduce) {
		introduce = newIntroduce;
	}

	/** @pdOid 333b8aeb-1e79-4812-bf13-191c1add72b5 */
	public java.lang.String getAddress() {
		return address;
	}

	/**
	 * @param newAddress
	 * @pdOid 0d24364c-546f-4616-92dc-282096142ba6
	 */
	public void setAddress(java.lang.String newAddress) {
		address = newAddress;
	}

	/** @pdOid a1f4f4cd-e54d-4d8f-b724-dadf95de93df */
	public java.util.Date getCreatetime() {
		return createtime;
	}

	/**
	 * @param newCreatetime
	 * @pdOid 942d1f4c-0b03-4d80-af8e-a1c1eeb3ef1e
	 */
	public void setCreatetime(java.util.Date newCreatetime) {
		createtime = newCreatetime;
	}

	/** @pdOid ba70f9d9-95ff-45e7-ba17-ade239f5ecd3 */
	public int getState() {
		return state;
	}

	/**
	 * @param newState
	 * @pdOid 0cd23af0-3cea-43e1-973a-263793b9cb89
	 */
	public void setState(int newState) {
		state = newState;
	}

	/** @pdOid c1b86ab5-1bef-49ab-b9c3-fc0576c2d9b3 */
	public byte getArrage() {
		return arrage;
	}

	/**
	 * @param newArrage
	 * @pdOid 76d7f7a7-aa90-47a8-8bbf-5210f1c4dd38
	 */
	public void setArrage(byte newArrage) {
		arrage = newArrage;
	}

	/** @pdOid 9143fb1c-561b-452d-af7f-96dbbe77d5f8 */
	public double getReputaion() {
		return reputaion;
	}

	/**
	 * @param newReputaion
	 * @pdOid cc48be13-de73-4ac1-84a0-dc6ab11b2772
	 */
	public void setReputaion(double newReputaion) {
		reputaion = newReputaion;
	}

	/** @pdOid 5b933e06-df11-4d93-a5ab-44a05dd788b5 */
	public int getCount() {
		return count;
	}

	/**
	 * @param newCount
	 * @pdOid b8691514-f552-45aa-9628-1e5b57c8610f
	 */
	public void setCount(int newCount) {
		count = newCount;
	}

	/** @pdOid ed34e250-a4d3-451e-8071-b9cb94b23cb8 */
	public int getAuthentication() {
		return authentication;
	}

	/**
	 * @param newAuthentication
	 * @pdOid 08d3f63e-5e7e-45bf-915a-e49b53b3a9b7
	 */
	public void setAuthentication(int newAuthentication) {
		authentication = newAuthentication;
	}

	/** @pdOid 8763c792-2ffa-442d-8999-b9aaf01cf185 */
	public int getType() {
		return type;
	}

	/**
	 * @param newType
	 * @pdOid 5b4e13fa-6c4d-421f-83d2-55fc9fcaef1b
	 */
	public void setType(int newType) {
		type = newType;
	}

	/**
	 * @pdGenerated default getter
	 */
	public java.util.Collection<Product> getProduct() {
		if (product == null)
			product = new java.util.HashSet<Product>();
		return product;
	}

	/**
	 * @pdGenerated default iterator getter
	 */
	public java.util.Iterator getIteratorProduct() {
		if (product == null)
			product = new java.util.HashSet<Product>();
		return product.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newProduct
	 */
	public void setProduct(java.util.Collection<Product> newProduct) {
		// removeAllProduct();
		this.product = newProduct;
	}

	/**
	 * @pdGenerated default add
	 * @param newProduct
	 */
	public void addProduct(Product newProduct) {
		if (newProduct == null)
			return;
		if (this.product == null)
			this.product = new java.util.HashSet<Product>();
		if (!this.product.contains(newProduct)) {
			this.product.add(newProduct);
			newProduct.setSoler(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldProduct
	 */
	public void removeProduct(Product oldProduct) {
		if (oldProduct == null)
			return;
		if (this.product != null)
			if (this.product.contains(oldProduct)) {
				this.product.remove(oldProduct);
				oldProduct.setSoler((Soler) null);
			}
	}

	/**
	 * @pdGenerated default removeAll
	 */
	public void removeAllProduct() {
		if (product != null) {
			Product oldProduct;
			for (java.util.Iterator iter = getIteratorProduct(); iter.hasNext();) {
				oldProduct = (Product) iter.next();
				iter.remove();
				oldProduct.setSoler((Soler) null);
			}
		}
	}

	/**
	 * @pdGenerated default getter
	 */
	public java.util.Collection<Soler_property> getSoler_property() {
		if (soler_property == null)
			soler_property = new java.util.HashSet<Soler_property>();
		return soler_property;
	}

	/**
	 * @pdGenerated default iterator getter
	 */
	public java.util.Iterator getIteratorSoler_property() {
		if (soler_property == null)
			soler_property = new java.util.HashSet<Soler_property>();
		return soler_property.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newSoler_property
	 */
	public void setSoler_property(java.util.Collection<Soler_property> newSoler_property) {
		// removeAllSoler_property();
		this.soler_property = newSoler_property;
	}

	/**
	 * @pdGenerated default add
	 * @param newSoler_property
	 */
	public void addSoler_property(Soler_property newSoler_property) {
		if (newSoler_property == null)
			return;
		if (this.soler_property == null)
			this.soler_property = new java.util.HashSet<Soler_property>();
		if (!this.soler_property.contains(newSoler_property)) {
			this.soler_property.add(newSoler_property);
			newSoler_property.setSoler(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldSoler_property
	 */
	public void removeSoler_property(Soler_property oldSoler_property) {
		if (oldSoler_property == null)
			return;
		if (this.soler_property != null)
			if (this.soler_property.contains(oldSoler_property)) {
				this.soler_property.remove(oldSoler_property);
				oldSoler_property.setSoler((Soler) null);
			}
	}

	/**
	 * @pdGenerated default removeAll
	 */
	public void removeAllSoler_property() {
		if (soler_property != null) {
			Soler_property oldSoler_property;
			for (java.util.Iterator iter = getIteratorSoler_property(); iter.hasNext();) {
				oldSoler_property = (Soler_property) iter.next();
				iter.remove();
				oldSoler_property.setSoler((Soler) null);
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
			newSoler_evaluate.setSoler(this);
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
				oldSoler_evaluate.setSoler((Soler) null);
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
				oldSoler_evaluate.setSoler((Soler) null);
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
			newUser_evaluate.setSoler(this);
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
				oldUser_evaluate.setSoler((Soler) null);
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
				oldUser_evaluate.setSoler((Soler) null);
			}
		}
	}

	/**
	 * @pdGenerated default getter
	 */
	public java.util.Collection<Waiter> getWaiter() {
		if (waiter == null)
			waiter = new java.util.HashSet<Waiter>();
		return waiter;
	}

	/**
	 * @pdGenerated default iterator getter
	 */
	public java.util.Iterator getIteratorWaiter() {
		if (waiter == null)
			waiter = new java.util.HashSet<Waiter>();
		return waiter.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newWaiter
	 */
	public void setWaiter(java.util.Collection<Waiter> newWaiter) {
		// removeAllWaiter();
		this.waiter = newWaiter;
	}

	/**
	 * @pdGenerated default add
	 * @param newWaiter
	 */
	public void addWaiter(Waiter newWaiter) {
		if (newWaiter == null)
			return;
		if (this.waiter == null)
			this.waiter = new java.util.HashSet<Waiter>();
		if (!this.waiter.contains(newWaiter)) {
			this.waiter.add(newWaiter);
			newWaiter.setSoler(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldWaiter
	 */
	public void removeWaiter(Waiter oldWaiter) {
		if (oldWaiter == null)
			return;
		if (this.waiter != null)
			if (this.waiter.contains(oldWaiter)) {
				this.waiter.remove(oldWaiter);
				oldWaiter.setSoler((Soler) null);
			}
	}

	/**
	 * @pdGenerated default removeAll
	 */
	public void removeAllWaiter() {
		if (waiter != null) {
			Waiter oldWaiter;
			for (java.util.Iterator iter = getIteratorWaiter(); iter.hasNext();) {
				oldWaiter = (Waiter) iter.next();
				iter.remove();
				oldWaiter.setSoler((Soler) null);
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
			newOrder.setSoler(this);
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
				oldOrder.setSoler((Soler) null);
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
				oldOrder.setSoler((Soler) null);
			}
		}
	}

	/**
	 * @pdGenerated default getter
	 */
	public java.util.Collection<SolerWorker> getSolerWorker() {
		if (solerWorker == null)
			solerWorker = new java.util.HashSet<SolerWorker>();
		return solerWorker;
	}

	/**
	 * @pdGenerated default iterator getter
	 */
	public java.util.Iterator getIteratorSolerWorker() {
		if (solerWorker == null)
			solerWorker = new java.util.HashSet<SolerWorker>();
		return solerWorker.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newSolerWorker
	 */
	public void setSolerWorker(java.util.Collection<SolerWorker> newSolerWorker) {
		// removeAllSolerWorker();
		this.solerWorker = newSolerWorker;
	}

	/**
	 * @pdGenerated default add
	 * @param newSolerWorker
	 */
	public void addSolerWorker(SolerWorker newSolerWorker) {
		if (newSolerWorker == null)
			return;
		if (this.solerWorker == null)
			this.solerWorker = new java.util.HashSet<SolerWorker>();
		if (!this.solerWorker.contains(newSolerWorker)) {
			this.solerWorker.add(newSolerWorker);
			newSolerWorker.setSoler(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldSolerWorker
	 */
	public void removeSolerWorker(SolerWorker oldSolerWorker) {
		if (oldSolerWorker == null)
			return;
		if (this.solerWorker != null)
			if (this.solerWorker.contains(oldSolerWorker)) {
				this.solerWorker.remove(oldSolerWorker);
				oldSolerWorker.setSoler((Soler) null);
			}
	}

	/**
	 * @pdGenerated default removeAll
	 */
	public void removeAllSolerWorker() {
		if (solerWorker != null) {
			SolerWorker oldSolerWorker;
			for (java.util.Iterator iter = getIteratorSolerWorker(); iter.hasNext();) {
				oldSolerWorker = (SolerWorker) iter.next();
				iter.remove();
				oldSolerWorker.setSoler((Soler) null);
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
		if (this.university == null || !this.university.equals(newUniversity)) {
			if (this.university != null) {
				University oldUniversity = this.university;
				this.university = null;
				// oldUniversity.removeSoler(this);
			}
			if (newUniversity != null) {
				this.university = newUniversity;
				// this.university.addSoler(this);
			}
		}
	}

	/**
	 * Get value of solerPK.
	 *
	 * @return solerPK object
	 */
	public SolerPK getSolerPK() {
		return new SolerPK(id);
	}

	/**
	 * Set value of solerPK.
	 * 
	 * @param pk
	 */
	public void setSolerPK(SolerPK pk) {
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

		if (!(other instanceof Soler))
			return false;

		Soler cast = (Soler) other;

		if (this.id != cast.getId())
			return false;

		if (this.photoimg == null ? cast.getPhotoimg() != this.photoimg : !this.photoimg.equals(cast.getPhotoimg()))
			return false;

		if (this.email == null ? cast.getEmail() != this.email : !this.email.equals(cast.getEmail()))
			return false;

		if (this.pwd == null ? cast.getPwd() != this.pwd : !this.pwd.equals(cast.getPwd()))
			return false;

		if (this.name == null ? cast.getName() != this.name : !this.name.equals(cast.getName()))
			return false;

		if (this.phone == null ? cast.getPhone() != this.phone : !this.phone.equals(cast.getPhone()))
			return false;

		if (this.introduce == null ? cast.getIntroduce() != this.introduce
				: !this.introduce.equals(cast.getIntroduce()))
			return false;

		if (this.address == null ? cast.getAddress() != this.address : !this.address.equals(cast.getAddress()))
			return false;

		if (this.createtime == null ? cast.getCreatetime() != this.createtime
				: !(com.sybase.orm.util.Util.compareDate(this.createtime, cast.getCreatetime(),
						java.util.Calendar.SECOND) == 0))
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

		if (this.type != cast.getType())
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
		if (this.introduce != null)
			hashCode = 29 * hashCode + introduce.hashCode();
		if (this.address != null)
			hashCode = 29 * hashCode + address.hashCode();
		if (this.createtime != null)
			hashCode = 29 * hashCode + createtime.hashCode();
		hashCode = 29 * hashCode + (new Integer(state)).hashCode();
		hashCode = 29 * hashCode + (new Byte(arrage)).hashCode();
		hashCode = 29 * hashCode + (new Double(reputaion)).hashCode();
		hashCode = 29 * hashCode + (new Integer(count)).hashCode();
		hashCode = 29 * hashCode + (new Integer(authentication)).hashCode();
		hashCode = 29 * hashCode + (new Integer(type)).hashCode();
		return hashCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		ret.append("hobuy.domain.Soler: ");
		ret.append("id='" + id + "'");
		ret.append("photoimg='" + photoimg + "'");
		ret.append("email='" + email + "'");
		ret.append("pwd='" + pwd + "'");
		ret.append("name='" + name + "'");
		ret.append("phone='" + phone + "'");
		ret.append("introduce='" + introduce + "'");
		ret.append("address='" + address + "'");
		ret.append("createtime='" + createtime + "'");
		ret.append("state='" + state + "'");
		ret.append("arrage='" + arrage + "'");
		ret.append("reputaion='" + reputaion + "'");
		ret.append("count='" + count + "'");
		ret.append("authentication='" + authentication + "'");
		ret.append("type='" + type + "'");
		return ret.toString();
	}

}