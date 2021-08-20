package 并发编程.多线程.线程控制;

public class ThreadSleep extends Thread{
    public ThreadSleep(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(getName() + i);
            try {
                Thread.sleep(100);//休眠n毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
