package Singleton;

public class Singleton_1 {
	
	 //创建SingletObject的一个对象
    private static Singleton_1 instance = new Singleton_1();
    //将类的构造函数设为私有的这样只有自己才能够实例化
    private Singleton_1() {}
    //获取唯一可用的对象
    public static Singleton_1 getInstance() {
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello World!");
    }
	

}
