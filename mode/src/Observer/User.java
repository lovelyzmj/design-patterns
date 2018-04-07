package Observer;

/*
 * 具体观察者角色：实现抽象观察者角色所需要的更新接口，一边使本身的状态与制图的状态相协调
 */
public class User implements Observer {
	private String name ;
	private String message;
	
	public User(String name)
	{
		this.name = name;
	}

	@Override
	public void update(String message) {
		this.message = message;
		read();

	}
	
	public void read()
	{
		System.out.println(name + "收到推送消息 ： "+message);
	}

}
