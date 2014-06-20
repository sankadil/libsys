/*
 * Created on Aug 8, 2009
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package common;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import pack.libsys;
import pack.libsysHome;
import pack.*;
/**
 * @author sankadil
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ServiceLocator {


	public libsys setLibsys(){

		libsysHome sHome;
		libsys sRemote=null;
	try{
	InitialContext ic=new InitialContext();
	Object ob=ic.lookup("ejb/pack/libsysHome");
	sHome=(libsysHome)PortableRemoteObject.narrow(ob,libsysHome.class);
	sRemote=sHome.create();
	}

	catch(Exception ex){
	ex.printStackTrace();
	}
	return sRemote;
	}
	
}
