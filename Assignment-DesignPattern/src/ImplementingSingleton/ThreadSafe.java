package ImplementingSingleton;

public class ThreadSafe {
	
	public static ThreadSafe obj;
	private ThreadSafe() {}
	
	public static synchronized ThreadSafe getInstance() {
		
		if (obj==null) {
			obj=new ThreadSafe();
			
		}
		return obj;
	}
}
