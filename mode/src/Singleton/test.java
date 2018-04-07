package Singleton;

import org.junit.Test;

public class test {
	
	
	@Test
	public void test01()
	{
		
		Singleton_1 singleton_1 = Singleton_1.getInstance();
		singleton_1.showMessage();
	}
	
	@Test
	public void test02()
	{
		
		Singleton_2 singleton = Singleton_2.getInstance();
		Singleton_2 singleton1 = Singleton_2.getInstance();
		singleton.sayHello();
		System.out.println(singleton == singleton1);
	}
	
	
	@Test
	public void test03()
	{
		
		Singleton_3 Singleton = Singleton_3.getInstance();
		Singleton_3 singleton1 = Singleton_3.getInstance();
		Singleton.sayHello();
		System.out.println(Singleton == singleton1);
	}
	
	@Test
	public void test04()
	{
		
		Singleton_4 Singleton = Singleton_4.getInstance();
		Singleton_4 singleton1 = Singleton_4.getInstance();
		Singleton.say();
		System.out.println(Singleton == singleton1);
	}
	
	@Test
	public void test05()
	{
		Singleton_5 singleton = Singleton_5.getInstance();
		Singleton_5 singleton1 = Singleton_5.getInstance();
		singleton.say();
		System.out.println(singleton == singleton1);
	}
	
	@Test
	public void test06()
	{
		Singleton_6 singleton = Singleton_6.INSTANCE;
		Singleton_6 singleton1 = Singleton_6.INSTANCE;
		singleton.say();
		System.out.println(singleton == singleton1);
	}
	
	
	

}
