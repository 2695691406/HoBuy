/***********************************************************************
 * Module:  Soler_propertyDao.java
 * Author:  ZD
 * Purpose: Defines the dao interface for class Soler_property
 ***********************************************************************/

package hobuy.domain.dao;

import java.io.Serializable;
import java.util.List;

import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import hobuy.domain.Soler;
import hobuy.domain.Soler_property;
import hobuy.domain.Soler_propertyPK;

/**
 * dao interface that defines data access methods for class Soler_property
 * 
 */
public interface Soler_propertyDao extends Dao {

	/**
	 * Save <Code>Soler_property</Code> instance
	 *
	 * @param soler_propertyObject
	 * @return identifier
	 * @throws DaoException
	 */
	public Serializable save(Soler_property soler_propertyObject) throws DaoException;

	/**
	 * Load <Code>Soler_property</Code> instance by primary key
	 *
	 * @param pk
	 * @return <Code>Soler_property</Code> instance
	 * @throws DaoException
	 */
	public Soler_property load(Soler_propertyPK pk) throws DaoException;

	/**
	 * Delete <Code>Soler_property</Code> instance from persistence store
	 *
	 * @param soler_propertyObject
	 * @throws DaoException
	 */
	public void delete(Soler_property soler_propertyObject) throws DaoException;

	/**
	 * Update <Code>Soler_property</Code> instance to persistence store
	 *
	 * @param soler_propertyObject
	 * @throws DaoException
	 */
	public void update(Soler_property soler_propertyObject) throws DaoException;

	/**
	 * Save or update <Code>Soler_property</Code> instance to persistence store
	 *
	 * @param soler_propertyObject
	 * @throws DaoException
	 */
	public void saveOrUpdate(Soler_property soler_propertyObject) throws DaoException;

	/**
	 * Get all <Code>Soler_property</Code> instances from persistence store
	 *
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List getSoler_propertyList() throws DaoException;

	/**
	 * Get all <Code>Soler_property</Code> instances from persistence store by
	 * range
	 *
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List getSoler_propertyList(int firstResult, int maxResult);

	/**
	 * Query <Code>Soler_property</Code> instances by example instance
	 *
	 * @param soler_propertyObject
	 *            example instance
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List queryByExample(Soler_property soler_propertyObject) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances from persistence store by name
	 *
	 * @param name
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findByName(java.lang.String name) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances in range firstResult,
	 * maxResult from persistence store by field name
	 *
	 * @param name
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findByName(java.lang.String name, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances from persistence store by
	 * pro1name
	 *
	 * @param pro1name
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findByPro1name(java.lang.String pro1name) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances in range firstResult,
	 * maxResult from persistence store by field pro1name
	 *
	 * @param pro1name
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findByPro1name(java.lang.String pro1name, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances from persistence store by
	 * pro2name
	 *
	 * @param pro2name
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findByPro2name(java.lang.String pro2name) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances in range firstResult,
	 * maxResult from persistence store by field pro2name
	 *
	 * @param pro2name
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findByPro2name(java.lang.String pro2name, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances from persistence store by
	 * pro3name
	 *
	 * @param pro3name
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findByPro3name(java.lang.String pro3name) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances in range firstResult,
	 * maxResult from persistence store by field pro3name
	 *
	 * @param pro3name
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findByPro3name(java.lang.String pro3name, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances from persistence store by
	 * pcount
	 *
	 * @param pcount
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findByPcount(int pcount) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances in range firstResult,
	 * maxResult from persistence store by field pcount
	 *
	 * @param pcount
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findByPcount(int pcount, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances from persistence store by
	 * state
	 *
	 * @param state
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findByState(int state) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances in range firstResult,
	 * maxResult from persistence store by field state
	 *
	 * @param state
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findByState(int state, int firstResult, int maxResult) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances from persistence store by
	 * Soler
	 *
	 * @param soler
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findBySoler(hobuy.domain.Soler soler) throws DaoException;

	/**
	 * Find <Code>Soler_property</Code> instances instances in range
	 * firstResult, maxResult from persistence store by Soler
	 *
	 * @param soler
	 * @param firstResult
	 *            first result to return
	 * @param maxResult
	 *            max result to return
	 * @return <Code>Soler_property</Code> instance list
	 * @throws DaoException
	 */
	public List findBySoler(hobuy.domain.Soler soler, int firstResult, int maxResult) throws DaoException;

	public List<Soler_property> findBySoler(Soler soler, int i);
}