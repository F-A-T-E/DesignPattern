package java.SingletonPattern;

import javax.management.InstanceAlreadyExistsException;
import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class Singleton_Lazy_Safe {
	
	private static Singleton_Lazy_Safe instance;
	
	/*
	 * 构造函数
	 */
	private  Singleton_Lazy_Safe() {};
	
	public static synchronized Singleton_Lazy_Safe getInstance() {
		if(instance == null) {
			instance = new Singleton_Lazy_Safe();
		}
		return instance;		
	}
}
