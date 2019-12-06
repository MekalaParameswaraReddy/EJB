package com.conduent;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

/**
 * Business Interface (only when it extends from EJBObject)
 */
public interface Hello extends EJBObject{
	public String getHelloWorld() throws RemoteException;
}
