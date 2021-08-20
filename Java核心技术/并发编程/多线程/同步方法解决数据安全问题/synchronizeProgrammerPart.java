package 并发编程.多线程.同步方法解决数据安全问题;
/*
synchronize关键词可以将部分代码块同步，相当于上锁
 */

public class synchronizeProgrammerPart implements Runnable{
    private int tickets = 100;
    private Object object = new Object();

    @Override
    public void run() {
        while (true) {
            String ticketOutlet = Thread.currentThread().getName();
            synchronized (object) {
                if (tickets > 0) {
                    System.out.println(ticketOutlet + "卖出了第" + (101 - tickets) + "张票");
                    tickets--;
                } else {
                    System.out.println("票已售罄");
                    break;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getTickets() {
        return tickets;
    }
}
