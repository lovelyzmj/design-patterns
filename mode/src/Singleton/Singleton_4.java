package Singleton;

/*
 * 双重校验锁
 * 是否 Lazy 初始化：是

 * 是否多线程安全：是

 * 实现难度：较复杂

 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。 
 * getInstance() 的性能对应用程序很关键。
 */

public class Singleton_4 {
	
	private static volatile Singleton_4 instance;
	
	private Singleton_4() {}
	
	public  static Singleton_4 getInstance()
	{
		if(instance == null)
		{
			synchronized(Singleton_4.class) {
				if(instance == null)
				{
					instance = new Singleton_4();
				}
			}
		}
		return instance;
	}
	
	
	public void say()
	{
		System.out.println("我是双重校验锁");
	}
	

}
