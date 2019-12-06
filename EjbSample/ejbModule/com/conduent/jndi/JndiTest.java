package com.conduent.jndi;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.Hashtable;

import javax.ejb.CreateException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.conduent.Hello;
import com.conduent.HelloHome;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class JndiTest {
	
	public static void main(String[] args) throws NamingException, RemoteException, CreateException {
		Hashtable ht = new Hashtable();
		Context ctx = null;
		ht.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		ht.put(Context.PROVIDER_URL, "t3://localhost:7001");
		ht.put(Context.SECURITY_PRINCIPAL,"weblogic");
		ht.put(Context.SECURITY_CREDENTIALS,"weblogic@1");
		ctx = new InitialContext(ht);
		if(ctx != null){
			System.out.println("Connected....!");
		} else {
			System.out.println("not connected....");
		}
		//ctx.bind("apple",  new String ("it is in red color"));
		/*//ctx.bind("date",  new Date());
		Object obj = ctx.lookup("apple");
		Object dateObj = ctx.lookup("date");
		System.out.println("apple :: "+ obj);
		System.out.println("date :: "+ dateObj);
		
		ctx.rebind("apple", "got damaged...");
		Object afterRebind = ctx.lookup("apple");
		System.out.println("apple :: "+ afterRebind);*/
		
		Object obj = ctx.lookup("HelloJNDI");
		
		HelloHome helloHome = (HelloHome)obj;
		Hello hello = helloHome.create();
		System.out.println(hello.getHelloWorld());
		
	}

}
