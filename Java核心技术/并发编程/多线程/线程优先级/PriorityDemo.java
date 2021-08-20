package 并发编程.多线程.线程优先级;
/*
线程优先级最大是10，最小是1，默认是5
线程优先级表示的是获取cpu的几率高，并不是一定是优先执行
 */

public class PriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority("夏敏");
        ThreadPriority tp2 = new ThreadPriority("夏浩然");

        tp1.setPriority(10);
        tp2.setPriority(1);

        tp1.start();
        tp2.start();
    }
}
