package com.conduent;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

/**
 * home Interface (only when it extends from EJBHome)
 */
public interface HelloHome extends EJBHome{
	public Hello create() throws RemoteException, CreateException;
}
