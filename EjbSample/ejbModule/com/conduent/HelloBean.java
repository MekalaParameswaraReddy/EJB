package com.conduent;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class HelloBean implements SessionBean{
	SessionContext ctx = null;
	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}
	public void ejbCreate() throws CreateException {
		System.out.println("ebj created method.....");
	}
	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSessionContext(SessionContext sessionContext) throws EJBException,
			RemoteException {
		ctx = sessionContext;
		
	}
	
	public String getHelloWorld(){
		return "EJB 2 Hello World!!!";
	}

}
