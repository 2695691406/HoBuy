/***********************************************************************
 * Module:  ProductDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Product
 ***********************************************************************/

package hobuy.domain.dao;

import java.io.Serializable;
import java.util.List;

import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import hobuy.domain.Product;
import hobuy.domain.ProductPK;
import hobuy.domain.Soler;

/**
 * dao interface that defines data access methods for class Product
 * 
 */
public interface ProductDao extends Dao {

	/**
	 * Save <Code>Product</Code> instance
	 *
	 * @param productObject
	 * @return identifier
	 * @throws DaoException
	 */
	public Serializable save(Product productObject) throws DaoException;

	/**
	 * Load <Code>Product</Code> instance by primary key
	 *
	 * @param pk
	 * @return <Code>Product</Code> instance
	 * @throws DaoException
	 */
	public Product load(ProductPK pk) throws DaoException;

	/**
	 * Delete <Code>Product</Code> instance from persistence store
	 *
	 * @param productObject
	 * @throws DaoException
	 */
	public void delete(Product productObject) throws DaoException;

	/**
	 * Update <Code>Product</Code> instance to persistence store
	 *
	 * @param productObject
	 * @throws DaoException
	 */
	public void update(Product productObject) throws DaoException;

	/**
	 * Save or update <Code>Product</Code> instance to persistence store
	 *
	 * @param productObject
	 * @throws DaoException
	 */
	public void saveOrUpdate(Product productObject) throws DaoException;

	/**
	 * Get all <Code>Product</Code> instances from persistence store
	 *
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List getProductList() throws DaoException;

	/**
	 * Get all <Code>Product</Code> instances from persistence store by range
	 *
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List getProductList(int firstResult, int maxResult);

	/**
	 * Query <Code>Product</Code> instances by example instance
	 *
	 * @param productObject
	 *            example instance
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List queryByExample(Product productObject) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances from persistence store by name
	 *
	 * @param name
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByName(java.lang.String name) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances in range firstResult, maxResult from
	 * persistence store by field name
	 *
	 * @param name
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances from persistence store by imgurl
	 *
	 * @param imgurl
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByImgurl(java.lang.String imgurl) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances in range firstResult, maxResult from
	 * persistence store by field imgurl
	 *
	 * @param imgurl
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByImgurl(java.lang.String imgurl, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances from persistence store by introduce
	 *
	 * @param introduce
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByIntroduce(java.lang.String introduce) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances in range firstResult, maxResult from
	 * persistence store by field introduce
	 *
	 * @param introduce
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByIntroduce(java.lang.String introduce, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances from persistence store by state
	 *
	 * @param state
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByState(int state) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances in range firstResult, maxResult from
	 * persistence store by field state
	 *
	 * @param state
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances from persistence store by subtitle
	 *
	 * @param subtitle
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findBySubtitle(java.lang.String subtitle) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances in range firstResult, maxResult from
	 * persistence store by field subtitle
	 *
	 * @param subtitle
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findBySubtitle(java.lang.String subtitle, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances from persistence store by
	 * evaluate_count
	 *
	 * @param evaluate_count
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByEvaluate_count(int evaluate_count) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances in range firstResult, maxResult from
	 * persistence store by field evaluate_count
	 *
	 * @param evaluate_count
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByEvaluate_count(int evaluate_count, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances from persistence store by
	 * evaluate_level
	 *
	 * @param evaluate_level
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByEvaluate_level(double evaluate_level) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances in range firstResult, maxResult from
	 * persistence store by field evaluate_level
	 *
	 * @param evaluate_level
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByEvaluate_level(double evaluate_level, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances from persistence store by solenumber
	 *
	 * @param solenumber
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findBySolenumber(int solenumber) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances in range firstResult, maxResult from
	 * persistence store by field solenumber
	 *
	 * @param solenumber
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findBySolenumber(int solenumber, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances from persistence store by Soler
	 *
	 * @param soler
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findBySoler(hobuy.domain.Soler soler) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances instances in range firstResult,
	 * maxResult from persistence store by Soler
	 *
	 * @param soler
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances from persistence store by Clazz
	 *
	 * @param clazz
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByClazz(hobuy.domain.Clazz clazz) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances instances in range firstResult,
	 * maxResult from persistence store by Clazz
	 *
	 * @param clazz
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByClazz(hobuy.domain.Clazz clazz, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances from persistence store by
	 * Soler_property
	 *
	 * @param soler_property
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findBySoler_property(hobuy.domain.Soler_property soler_property) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances instances in range firstResult,
	 * maxResult from persistence store by Soler_property
	 *
	 * @param soler_property
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findBySoler_property(hobuy.domain.Soler_property soler_property, int firstResult, int maxResult)
			throws DaoException;

	/**
	 * Find <Code>Product</Code> instances from persistence store by Img_group
	 *
	 * @param img_group
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByImg_group(hobuy.domain.Img_group img_group) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances instances in range firstResult,
	 * maxResult from persistence store by Img_group
	 *
	 * @param img_group
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByImg_group(hobuy.domain.Img_group img_group, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances from persistence store by University
	 *
	 * @param university
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByUniversity(hobuy.domain.University university) throws DaoException;

	/**
	 * Find <Code>Product</Code> instances instances in range firstResult,
	 * maxResult from persistence store by University
	 *
	 * @param university
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Product</Code> instance list
	 * @throws DaoException
	 */
	public List findByUniversity(hobuy.domain.University university, int firstResult, int maxResult)
			throws DaoException;

	public List<Product> findBySolerAndState(Soler soler, int i);

}