/***********************************************************************
 * Module:  OrderDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Order
 ***********************************************************************/

package hobuy.domain.dao;

import java.io.Serializable;
import java.util.List;

import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import hobuy.domain.Order;
import hobuy.domain.OrderPK;
import hobuy.domain.Soler;

/**
 * dao interface that defines data access methods for class Order
 * 
 */
public interface OrderDao extends Dao {

	/**
	 * Save <Code>Order</Code> instance
	 *
	 * @param orderObject
	 * @return identifier
	 * @throws DaoException
	 */
	public Serializable save(Order orderObject) throws DaoException;

	/**
	 * Load <Code>Order</Code> instance by primary key
	 *
	 * @param pk
	 * @return <Code>Order</Code> instance
	 * @throws DaoException
	 */
	public Order load(OrderPK pk) throws DaoException;

	/**
	 * Delete <Code>Order</Code> instance from persistence store
	 *
	 * @param orderObject
	 * @throws DaoException
	 */
	public void delete(Order orderObject) throws DaoException;

	/**
	 * Update <Code>Order</Code> instance to persistence store
	 *
	 * @param orderObject
	 * @throws DaoException
	 */
	public void update(Order orderObject) throws DaoException;

	/**
	 * Save or update <Code>Order</Code> instance to persistence store
	 *
	 * @param orderObject
	 * @throws DaoException
	 */
	public void saveOrUpdate(Order orderObject) throws DaoException;

	/**
	 * Get all <Code>Order</Code> instances from persistence store
	 *
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List getOrderList() throws DaoException;

	/**
	 * Get all <Code>Order</Code> instances from persistence store by range
	 *
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List getOrderList(int firstResult, int maxResult);

	/**
	 * Query <Code>Order</Code> instances by example instance
	 *
	 * @param orderObject
	 *            example instance
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List queryByExample(Order orderObject) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances from persistence store by price
	 *
	 * @param price
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByPrice(double price) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances in range firstResult, maxResult from
	 * persistence store by field price
	 *
	 * @param price
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByPrice(double price, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances from persistence store by couriernum
	 *
	 * @param couriernum
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByCouriernum(java.lang.String couriernum) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances in range firstResult, maxResult from
	 * persistence store by field couriernum
	 *
	 * @param couriernum
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByCouriernum(java.lang.String couriernum, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances from persistence store by createtime
	 *
	 * @param createtime
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByCreatetime(java.util.Date createtime) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances in range firstResult, maxResult from
	 * persistence store by field createtime
	 *
	 * @param createtime
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByCreatetime(java.util.Date createtime, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances from persistence store by type
	 *
	 * @param type
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByType(int type) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances in range firstResult, maxResult from
	 * persistence store by field type
	 *
	 * @param type
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByType(int type, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances from persistence store by state
	 *
	 * @param state
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByState(int state) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances in range firstResult, maxResult from
	 * persistence store by field state
	 *
	 * @param state
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances from persistence store by printstate
	 *
	 * @param printstate
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByPrintstate(byte printstate) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances in range firstResult, maxResult from
	 * persistence store by field printstate
	 *
	 * @param printstate
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByPrintstate(byte printstate, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances from persistence store by User
	 *
	 * @param user
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByUser(hobuy.domain.User user) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances instances in range firstResult,
	 * maxResult from persistence store by User
	 *
	 * @param user
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByUser(hobuy.domain.User user, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances from persistence store by Address
	 *
	 * @param address
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByAddress(hobuy.domain.Address address) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances instances in range firstResult,
	 * maxResult from persistence store by Address
	 *
	 * @param address
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findByAddress(hobuy.domain.Address address, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances from persistence store by Soler
	 *
	 * @param soler
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findBySoler(hobuy.domain.Soler soler) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances instances in range firstResult,
	 * maxResult from persistence store by Soler
	 *
	 * @param soler
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances from persistence store by SolerWorker
	 *
	 * @param solerWorker
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findBySolerWorker(hobuy.domain.SolerWorker solerWorker) throws DaoException;

	/**
	 * Find <Code>Order</Code> instances instances in range firstResult,
	 * maxResult from persistence store by SolerWorker
	 *
	 * @param solerWorker
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Order</Code> instance list
	 * @throws DaoException
	 */
	public List findBySolerWorker(hobuy.domain.SolerWorker solerWorker, int firstResult, int maxResult)
			throws DaoException;

	public List<Order> findBySoler(Soler soler, int state, int firstResult, int maxResult);
}