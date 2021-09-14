package 函数式接口.函数式接口作方法参数;

public class RunnableDemo {
	public static void main(String[] args) {
		//匿名内部类
		startThread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "线程启动了");
			}
		});
		//Lambda表达式
		startThread(()-> System.out.println(Thread.currentThread().getName() + "线程启动了"));
		//如果方法的参数时函数式接口，可以使用Lambda表达式作为参数传递
		
	}
	public static void startThread(Runnable r){
		new Thread(r).start();
	}
}
