package Singleton;


/*
 * 枚举
 * 
 *线程安全
 *
 * 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制
 * ，防止反序列化重新创建新的对象，绝对防止多次实例化。
 */
public enum Singleton_6 {
	
	INSTANCE;
	
	public static void whateverMethod() {
		say();
	}
	
	public static void say()
	{
		System.out.println("i'm 枚举");
	}

}
