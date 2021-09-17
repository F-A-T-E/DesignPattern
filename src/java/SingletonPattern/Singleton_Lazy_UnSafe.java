package java.SingletonPattern;

public class Singleton_Lazy_UnSafe {
	private static Singleton_Lazy_UnSafe instance;
	/*
	 * 构造函数
	 */
	private Singleton_Lazy_UnSafe() {};
	public static Singleton_Lazy_UnSafe getInstance() {
		if(instance == null) {
			instance = new Singleton_Lazy_UnSafe();
		}
		return instance;
	}
}
