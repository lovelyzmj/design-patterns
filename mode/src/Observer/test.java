package Observer;

import org.junit.Test;

/*主要解决：一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
 * 
 * 何时使用：一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知。
 * 
 * 优点：观察者和被观察者是抽象低耦合的
 * 
 * 缺点：如果一个被观察者有很多的直接或者间接的观察者的话，将所有的观察者都通知到会花费很多时间
 * 注册关注的用户 可以在服务更新之后收到更新的消息
 * 
 * 取消关注的用户将无法继续收到更新消息
 */

public class test {
	
	
	@Test
	public void test01()
	{
		WechatServer ws = new WechatServer();
		
		Observer zhangsan = new User("张三");
		Observer lisi = new User("李四");
		Observer wangwu = new User("王五");
		
		ws.registerObserver(zhangsan);
		ws.registerObserver(lisi);
		ws.registerObserver(wangwu);
		
		ws.setInfomation("PHP是世界上最好的语言！");
		
		System.out.println("------------------------");
		ws.removeObserver(lisi);
		
		ws.setInfomation("JAVA是世界上最好的语言！");
		
		
		
	}

}
