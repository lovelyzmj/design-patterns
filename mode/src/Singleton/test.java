package Singleton;

import org.junit.Test;

public class test {
	
	
	@Test
	public void test01()
	{
		
		Singleton_1 singleton_1 = Singleton_1.getInstance();
		singleton_1.showMessage();
	}

}
