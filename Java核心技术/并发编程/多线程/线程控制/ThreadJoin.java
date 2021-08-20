package 并发编程.多线程.线程控制;

public class ThreadJoin extends Thread{
    public ThreadJoin(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + i);

        }
    }
}
