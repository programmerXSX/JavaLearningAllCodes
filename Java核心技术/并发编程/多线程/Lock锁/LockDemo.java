package 并发编程.多线程.Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo implements Runnable {
    private String pigHead夏敏  = "夏敏是大笨猪";
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {       //try内部程序很容易出现问题，因此使用try，Finally关闭lock
            lock.lock();
            if (pigHead夏敏.equals("xijai")){
                System.out.println("knv");
            }else {
                System.out.println("夏敏真是很笨啊哈哈哈");
            }
        }finally {
            lock.unlock();
        }

    }
}
