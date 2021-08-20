package 并发编程.多线程.线程优先级;

public class ThreadPriority extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + i);
        }
    }

    public ThreadPriority(String name) {
        super(name);
    }
}
