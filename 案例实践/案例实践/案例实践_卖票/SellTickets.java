package 案例实践.案例实践_卖票;
/*
当共享数据被多条语句操作，容易产生数据安全
我们使用synchronized方法构建数据安全锁🔒，使所有数据同时被一个线程操作，
则不会出现数据安全问题
 */

public class SellTickets implements Runnable {
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
