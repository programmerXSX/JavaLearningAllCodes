package 并发编程.多线程.实现Ruannable接口的方式实现多线程;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()  + " : "+ i);
        }
    }
}
