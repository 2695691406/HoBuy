/***********************************************************************
 * Module:  Dao.java
 * Author:  ZD
 * Purpose: Defines common interface for data access
 ***********************************************************************/

package com.sybase.orm.dao;

import org.hibernate.SessionFactory;

/**
 * Interface that defines common methods used by data access.
 *
 */
public interface Dao {
	public void setMySessionFactory(SessionFactory sf);
}