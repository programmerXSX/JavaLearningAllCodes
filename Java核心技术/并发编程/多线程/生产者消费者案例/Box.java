package 并发编程.多线程.生产者消费者案例;

public class Box {
    private int milk;
    public boolean state = false;

    //储存牛奶
    public synchronized void put(int milk) {
        if (state) {
            try {
                wait();//线程进入等待状态，但是必须要手动唤醒，否则线程会一直等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");
        state = true;
        notifyAll();
    }

    //获取牛奶
    public synchronized void get() {
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户将第" + this.milk + "瓶奶拿走");
        state = false;

        notifyAll();
    }
}
