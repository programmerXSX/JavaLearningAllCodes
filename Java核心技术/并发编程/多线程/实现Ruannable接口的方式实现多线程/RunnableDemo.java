package 并发编程.多线程.实现Ruannable接口的方式实现多线程;

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        //Thread(Runnable target, String Name):Thread的构造方法
        Thread t1 = new Thread(mr,"线程1");
        Thread t2 = new Thread(mr,"线程2");
        t1.start();
        t2.start();
    }
}
