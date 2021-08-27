package 并发编程.网络编程.Lambda表达式.体验Lambda表达式;

public class LambdaDemo {
    public static void main(String[] args) {
        /*
        方法一：
                常规程序，但较复杂
         */
        multithreadMethod1();

        /*
        方法二：
                采用匿名内部类，简化步骤
         */
        multithreadMethod2();

        /*
        方法三：
                采用Lambda表达式，看不懂
         */
        multithreadMethod3();
    }

    private static void multithreadMethod3() {
        new Thread( () -> {
            System.out.println("多线程启动，你妈的根本看不懂！！！！！！");
        } ).start();
    }

    private static void multithreadMethod2() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程启动！！！！！！！！！！");
            }
        }).start();
    }

    private static void multithreadMethod1() {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
    }

}
