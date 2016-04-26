/***********************************************************************
 * Module:  ProductDaoImpl.java
 * Author:  ZD
 * Purpose: Defines dao implementation class for class Product
 ***********************************************************************/

package hobuy.domain.daoimpl.hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;

import hobuy.domain.Product;
import hobuy.domain.ProductPK;
import hobuy.domain.Soler;
import hobuy.domain.dao.ProductDao;

/**
 * Class that implements methods of ProductDao interface
 *
 */
@Repository
public class ProductDaoImpl extends HibernateDaoImpl implements ProductDao {
	@Autowired
	public void setMySessionFactory(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#save(hobuy.domain.Product)
	 */
	public Serializable save(Product productObject) throws DaoException {
		return super.save(productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#load(hobuy.domain.ProductPK)
	 */
	public Product load(ProductPK pk) throws DaoException {
		List cs = new ArrayList();
		String[] paramNames = new String[] { "id" };
		Object[] values = new Object[] { new Long(pk.getId()) };
		for (int i = 0; i < paramNames.length; i++)
			cs.add(Restrictions.eq(paramNames[i], values[i]));

		List list = super.findByCriterions(Product.class, cs);
		return (((list != null) && (list.size() > 0)) ? (Product) list.get(0) : null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#delete(hobuy.domain.Product)
	 */
	public void delete(Product productObject) throws DaoException {
		super.delete(productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#update(hobuy.domain.Product)
	 */
	public void update(Product productObject) throws DaoException {
		super.update(productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#saveOrUpdate(hobuy.domain.Product)
	 */
	public void saveOrUpdate(Product productObject) throws DaoException {
		super.saveOrUpdate(productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#queryByExample(java.lang.Class,
	 * hobuy.domain.Product)
	 */
	public List queryByExample(Product productObject) throws DaoException {
		return super.queryByExample(Product.class, productObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#getProductList()
	 */
	public List getProductList() throws DaoException {
		return super.loadAll(Product.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#getProductList(int, int)
	 */
	public List getProductList(int firstResult, int maxResult) {
		return super.loadAll(Product.class, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByName(java.lang.String)
	 */
	public List findByName(java.lang.String name) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByName(java.lang.String, int, int)
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("name", name));
		return super.findByCriterions(Product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByImgurl(java.lang.String)
	 */
	public List findByImgurl(java.lang.String imgurl) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("imgurl", imgurl));
		return super.findByCriterions(Product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByImgurl(java.lang.String, int, int)
	 */
	public List findByImgurl(java.lang.String imgurl, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("imgurl", imgurl));
		return super.findByCriterions(Product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByIntroduce(java.lang.String)
	 */
	public List findByIntroduce(java.lang.String introduce) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("introduce", introduce));
		return super.findByCriterions(Product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByIntroduce(java.lang.String, int,
	 * int)
	 */
	public List findByIntroduce(java.lang.String introduce, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("introduce", introduce));
		return super.findByCriterions(Product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByState(int)
	 */
	public List findByState(int state) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByState(int, int, int)
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("state", new Integer(state)));
		return super.findByCriterions(Product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findBySubtitle(java.lang.String)
	 */
	public List findBySubtitle(java.lang.String subtitle) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("subtitle", subtitle));
		return super.findByCriterions(Product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findBySubtitle(java.lang.String, int,
	 * int)
	 */
	public List findBySubtitle(java.lang.String subtitle, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("subtitle", subtitle));
		return super.findByCriterions(Product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByEvaluate_count(int)
	 */
	public List findByEvaluate_count(int evaluate_count) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("evaluate_count", new Integer(evaluate_count)));
		return super.findByCriterions(Product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByEvaluate_count(int, int, int)
	 */
	public List findByEvaluate_count(int evaluate_count, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("evaluate_count", new Integer(evaluate_count)));
		return super.findByCriterions(Product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByEvaluate_level(double)
	 */
	public List findByEvaluate_level(double evaluate_level) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("evaluate_level", new Double(evaluate_level)));
		return super.findByCriterions(Product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByEvaluate_level(double, int, int)
	 */
	public List findByEvaluate_level(double evaluate_level, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("evaluate_level", new Double(evaluate_level)));
		return super.findByCriterions(Product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findBySolenumber(int)
	 */
	public List findBySolenumber(int solenumber) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("solenumber", new Integer(solenumber)));
		return super.findByCriterions(Product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findBySolenumber(int, int, int)
	 */
	public List findBySolenumber(int solenumber, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("solenumber", new Integer(solenumber)));
		return super.findByCriterions(Product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findBySoler(hobuy.domain.Soler)
	 */
	public List findBySoler(hobuy.domain.Soler soler) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(Product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findBySoler(hobuy.domain.Soler, int,
	 * int)
	 */
	public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		return super.findByCriterions(Product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByClazz(hobuy.domain.Clazz)
	 */
	public List findByClazz(hobuy.domain.Clazz clazz) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("clazz", clazz));
		return super.findByCriterions(Product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByClazz(hobuy.domain.Clazz, int,
	 * int)
	 */
	public List findByClazz(hobuy.domain.Clazz clazz, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("clazz", clazz));
		return super.findByCriterions(Product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findBySoler_property(hobuy.domain.
	 * Soler_property)
	 */
	public List findBySoler_property(hobuy.domain.Soler_property soler_property) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler_property", soler_property));
		return super.findByCriterions(Product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findBySoler_property(hobuy.domain.
	 * Soler_property, int, int)
	 */
	public List findBySoler_property(hobuy.domain.Soler_property soler_property, int firstResult, int maxResult)
			throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler_property", soler_property));
		return super.findByCriterions(Product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByImg_group(hobuy.domain.Img_group)
	 */
	public List findByImg_group(hobuy.domain.Img_group img_group) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("img_group", img_group));
		return super.findByCriterions(Product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hobuy.domain.dao.ProductDao#findByImg_group(hobuy.domain.Img_group,
	 * int, int)
	 */
	public List findByImg_group(hobuy.domain.Img_group img_group, int firstResult, int maxResult) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("img_group", img_group));
		return super.findByCriterions(Product.class, cs, firstResult, maxResult);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.ProductDao#findByUniversity(hobuy.domain.University)
	 */
	public List findByUniversity(hobuy.domain.University university) throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("university", university));
		return super.findByCriterions(Product.class, cs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hobuy.domain.dao.ProductDao#findByUniversity(hobuy.domain.University,
	 * int, int)
	 */
	public List findByUniversity(hobuy.domain.University university, int firstResult, int maxResult)
			throws DaoException {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("university", university));
		return super.findByCriterions(Product.class, cs, firstResult, maxResult);
	}

	public List<Product> findBySolerAndState(Soler soler, int i) {
		List cs = new ArrayList();
		cs.add(Restrictions.eq("soler", soler));
		cs.add(Restrictions.eq("state", i));
		return super.findByCriterions(Product.class, cs);
	}
}