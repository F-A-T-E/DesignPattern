package java.SingletonPattern;

public class Singleton_UnLazy_Safe {
	
	private static Singleton_UnLazy_Safe instance = new Singleton_UnLazy_Safe();
	/*
	 * 构造函数
	 */
	private Singleton_UnLazy_Safe() {};
	
	public Singleton_UnLazy_Safe getInstance() {
		return instance;
	}
}
