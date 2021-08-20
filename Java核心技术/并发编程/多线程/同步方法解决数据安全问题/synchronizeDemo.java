package 并发编程.多线程.同步方法解决数据安全问题;


public class synchronizeDemo {
    public static void main(String[] args) {
//        synchronizeProgrammerPart st = new synchronizeProgrammerPart();
//        synchronizeProgrammerMethod st = new synchronizeProgrammerMethod();
        synchronizeStaticProgrammerMethod st = new synchronizeStaticProgrammerMethod();
        Thread t1 = new Thread(st, "A窗口");
        Thread t2 = new Thread(st, "B窗口");
        Thread t3 = new Thread(st, "C窗口");

        t1.start();
        t2.start();
        t3.start();
    }
}
