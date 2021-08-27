package 并发编程.网络编程.Lambda表达式.体验Lambda表达式;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("多线程启动");
    }
}
