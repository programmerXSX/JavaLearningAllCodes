package 并发编程.多线程.继承Thread类的方式实现多线程;
/*
方式1：继承Thread类
        1：定义一个类MyThread继承Thread类
        2：在Mythread类中重写run()方法
        3：创建MyThread类的对象
        4：启动线程
Thread类有一个构造方法，可以对线程名称进行赋值，需要在类中带参构造此方法
 */

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("xiam");
        MyThread mt2 = new MyThread("uhsuc");

        //void start()：导致此线程开始执行，Java虚拟机调用此线程的run方法
        //start方法可以同时启用多个线程
        mt1.setName("夏敏");
        mt1.start();
        System.out.println(Thread.currentThread().getName());
        mt2.setName("夏浩然");
        mt2.start();

        //public static Thread currentThread(),返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());

    }
}
