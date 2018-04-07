package Observer;

/*
 * 具体被观察者角色：也就是一个具体的主题，在集体主题的内部状态改变时，所有登记过的观察者发出通知
 */
import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {
	
	private List<Observer> list;
	
	private String message;
	
	public WechatServer() {
		list = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		
		list.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		
		if(!list.isEmpty())
			list.remove(o);
		
	}

	@Override
	public void notifyObserver() {

		for(int i=0;i<list.size();i++)
		{
			Observer observer = list.get(i);
			observer.update(message);
		}
		
	}
	
	
	public void setInfomation(String s)
	{
		this.message = s;
		System.out.println("微信服务更新消息： "+s);
		
		notifyObserver();
	}


}
