/***********************************************************************
 * Module:  ShoppingcartDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Shoppingcart
 ***********************************************************************/

package hobuy.domain.dao;

import java.io.Serializable;
import java.util.List;

import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import hobuy.domain.Repertory;
import hobuy.domain.Shoppingcart;
import hobuy.domain.ShoppingcartPK;
import hobuy.domain.User;

/**
 * dao interface that defines data access methods for class Shoppingcart
 * 
 */
public interface ShoppingcartDao extends Dao {

	/**
	 * Save <Code>Shoppingcart</Code> instance
	 *
	 * @param shoppingcartObject
	 * @return identifier
	 * @throws DaoException
	 */
	public Serializable save(Shoppingcart shoppingcartObject) throws DaoException;

	/**
	 * Load <Code>Shoppingcart</Code> instance by primary key
	 *
	 * @param pk
	 * @return <Code>Shoppingcart</Code> instance
	 * @throws DaoException
	 */
	public Shoppingcart load(ShoppingcartPK pk) throws DaoException;

	/**
	 * Delete <Code>Shoppingcart</Code> instance from persistence store
	 *
	 * @param shoppingcartObject
	 * @throws DaoException
	 */
	public void delete(Shoppingcart shoppingcartObject) throws DaoException;

	/**
	 * Update <Code>Shoppingcart</Code> instance to persistence store
	 *
	 * @param shoppingcartObject
	 * @throws DaoException
	 */
	public void update(Shoppingcart shoppingcartObject) throws DaoException;

	/**
	 * Save or update <Code>Shoppingcart</Code> instance to persistence store
	 *
	 * @param shoppingcartObject
	 * @throws DaoException
	 */
	public void saveOrUpdate(Shoppingcart shoppingcartObject) throws DaoException;

	/**
	 * Get all <Code>Shoppingcart</Code> instances from persistence store
	 *
	 * @return <Code>Shoppingcart</Code> instance list
	 * @throws DaoException
	 */
	public List getShoppingcartList() throws DaoException;

	/**
	 * Get all <Code>Shoppingcart</Code> instances from persistence store by
	 * range
	 *
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Shoppingcart</Code> instance list
	 * @throws DaoException
	 */
	public List getShoppingcartList(int firstResult, int maxResult);

	/**
	 * Query <Code>Shoppingcart</Code> instances by example instance
	 *
	 * @param shoppingcartObject
	 *            example instance
	 * @return <Code>Shoppingcart</Code> instance list
	 * @throws DaoException
	 */
	public List queryByExample(Shoppingcart shoppingcartObject) throws DaoException;

	/**
	 * Find <Code>Shoppingcart</Code> instances from persistence store by sum
	 *
	 * @param sum
	 * @return <Code>Shoppingcart</Code> instance list
	 * @throws DaoException
	 */
	public List findBySum(int sum) throws DaoException;

	/**
	 * Find <Code>Shoppingcart</Code> instances in range firstResult, maxResult
	 * from persistence store by field sum
	 *
	 * @param sum
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Shoppingcart</Code> instance list
	 * @throws DaoException
	 */
	public List findBySum(int sum, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Shoppingcart</Code> instances from persistence store by
	 * createtime
	 *
	 * @param createtime
	 * @return <Code>Shoppingcart</Code> instance list
	 * @throws DaoException
	 */
	public List findByCreatetime(java.util.Date createtime) throws DaoException;

	/**
	 * Find <Code>Shoppingcart</Code> instances in range firstResult, maxResult
	 * from persistence store by field createtime
	 *
	 * @param createtime
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Shoppingcart</Code> instance list
	 * @throws DaoException
	 */
	public List findByCreatetime(java.util.Date createtime, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Shoppingcart</Code> instances from persistence store by state
	 *
	 * @param state
	 * @return <Code>Shoppingcart</Code> instance list
	 * @throws DaoException
	 */
	public List findByState(int state) throws DaoException;

	/**
	 * Find <Code>Shoppingcart</Code> instances in range firstResult, maxResult
	 * from persistence store by field state
	 *
	 * @param state
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Shoppingcart</Code> instance list
	 * @throws DaoException
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Shoppingcart</Code> instances from persistence store by User
	 *
	 * @param user
	 * @return <Code>Shoppingcart</Code> instance list
	 * @throws DaoException
	 */
	public List findByUser(hobuy.domain.User user) throws DaoException;

	/**
	 * Find <Code>Shoppingcart</Code> instances instances in range firstResult,
	 * maxResult from persistence store by User
	 *
	 * @param user
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Shoppingcart</Code> instance list
	 * @throws DaoException
	 */
	public List findByUser(hobuy.domain.User user, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Shoppingcart</Code> instances from persistence store by
	 * Repertory
	 *
	 * @param repertory
	 * @return <Code>Shoppingcart</Code> instance list
	 * @throws DaoException
	 */
	public List findByRepertory(hobuy.domain.Repertory repertory) throws DaoException;

	/**
	 * Find <Code>Shoppingcart</Code> instances instances in range firstResult,
	 * maxResult from persistence store by Repertory
	 *
	 * @param repertory
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Shoppingcart</Code> instance list
	 * @throws DaoException
	 */
	public List findByRepertory(hobuy.domain.Repertory repertory, int firstResult, int maxResult) throws DaoException;

	public Shoppingcart findByUserAndRepertory(User user, Repertory repertory);
}