package 并发编程.多线程.继承Thread类的方式实现多线程;
/*
setName()与getName()方法分别可以设置和获取线程名称
可以在run方法中直接使用setName和getName方法，在主函数中调用需要创建对象
 */

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i  = 0;i<100;i++){
            System.out.println(getName() + i);
        }
    }
}
