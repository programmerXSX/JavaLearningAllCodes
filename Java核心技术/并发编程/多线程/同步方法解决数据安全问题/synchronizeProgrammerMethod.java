package 并发编程.多线程.同步方法解决数据安全问题;

/*
synchronize也可以应用于方法上，可以将该方法上锁，默认对象是this
 */

public class synchronizeProgrammerMethod implements Runnable{
    private int tickets = 100;
    private Object object = new Object();

    @Override
    public void run() {
        while (true) {
            String ticketOutlet = Thread.currentThread().getName();
            boolean is = synchronizeMethod(ticketOutlet);
            if (is == true){break;}
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized boolean synchronizeMethod(String ticketOutlet){
            if (tickets > 0) {
                System.out.println(ticketOutlet + "卖出了第" + (101 - tickets) + "张票");
                tickets--;
                return false;
            } else {
                System.out.println("票已售罄");
                return true;
            }

    }

    public int getTickets() {
        return tickets;
    }
}
