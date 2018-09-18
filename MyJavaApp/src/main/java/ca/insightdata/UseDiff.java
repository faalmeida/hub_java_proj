package ca.insightdata;

import javax.naming.*;
import javax.naming.directory.*;

import java.util.Hashtable;
import java.util.Iterator;

public class UseDiff {
	
	public static void main(String[] args) {

		// Set up environment for creating initial context
		Hashtable env = new Hashtable(11);
		env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://faa-centos-002:389");

		// Authenticate as S. User and password "mysecret"
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.SECURITY_PRINCIPAL, "uid=fabio,ou=People,dc=cloudera");
		env.put(Context.SECURITY_CREDENTIALS, "admin1");

		try {
		    // Create initial context
		    DirContext ctx = new InitialDirContext(env);

		    // do something useful with ctx
		    System.out.println(ctx.lookup("ou=People,dc=cloudera"));

		    Attributes attrs = ctx.getAttributes("uid=fabio,ou=People,dc=cloudera");
		    
		    System.out.println(attrs);
		    
		    // Change to using no authentication
		    ctx.addToEnvironment(Context.SECURITY_AUTHENTICATION, "none");

		    System.out.println(ctx.lookup("uid=fabio,ou=People,dc=cloudera"));

		    // do something useful with ctx

		    // Close the context when we're done
		    ctx.close();
		} catch (NamingException e) {
		    e.printStackTrace();
		}
	    }

}
