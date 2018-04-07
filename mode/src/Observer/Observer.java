package Observer;

/*
 * 抽象观察者角色： 为所有的观察者定义一个接口，在得到主题通知时更新自己
 *
 */
public interface Observer {
	public void update(String message);

}
