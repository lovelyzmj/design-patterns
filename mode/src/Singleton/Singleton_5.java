package Singleton;

/*
 * 静态内部类
 * 是否多线程安全：是
 * 这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 * 这种方式同样利用了 classloder 机制来保证初始化 instance 时只有一个线程，它跟第 1 种方式不同的是：
 * 第 1 种方式只要 Singleton 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果）
 * ，而这种方式是 Singleton 类被装载了，instance 不一定被初始化。因为 SingletonHolder 类没有被主动使用，
 * 只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance。
 */

public class Singleton_5 {
	
	private static class SingletonHolder{
		
		private  static final Singleton_5 INSTANCE = new Singleton_5();
	}
	private Singleton_5() {
		
	}
	public  static final Singleton_5 getInstance() {
		return SingletonHolder.INSTANCE;
	}

	public void say()
	{
		System.out.println("I'm 静态内部类");
	}
}
