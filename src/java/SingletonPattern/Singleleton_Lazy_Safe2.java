package java.SingletonPattern;

public class Singleleton_Lazy_Safe2 {
	
	private static class SingletonHolder{
		private static final Singleleton_Lazy_Safe2 instance = new Singleleton_Lazy_Safe2();
	}
	private Singleleton_Lazy_Safe2() {};
	
	public static final Singleleton_Lazy_Safe2 getinstance() {
		return SingletonHolder.instance;
	}
	

}
