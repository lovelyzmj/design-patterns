package Observer;

/*
 * 抽象被观察者角色：也就是一个抽象主题，把所有对观察者对象的引用保存在一个集合中，
 *
 * 每个主题都可以有任意数量的观察
 * 
 * 
 */
public interface Observerable {
	
	//Attach
	public void registerObserver(Observer o);
	
	//Detach
	public void removeObserver(Observer o);
	
	//Notify
	public void notifyObserver();

}
