package java.SingletonPattern;


//双检锁/双重校验锁（DCL，即 double-checked locking）
/**
 * 懒汉式线程安全
 * @author lpf18
 */
public class Singleleton_DCL {
	private volatile static Singleleton_DCL instance;
	private Singleleton_DCL() {};
	
	public static Singleleton_DCL getInstance() {
		if(instance == null) {
			synchronized (Singleleton_DCL.class) {
				if(instance == null) {
					instance = new Singleleton_DCL();
					}				
			}
		}
		return instance;		
	}
}
