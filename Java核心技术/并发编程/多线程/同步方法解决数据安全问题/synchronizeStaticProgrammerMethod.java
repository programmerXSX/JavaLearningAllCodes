package 并发编程.多线程.同步方法解决数据安全问题;
/*
对于静态方法，使用   public static synchronize 方法类型  方法名（）{}格式修饰
应用于static修饰的静态变量只能用static修饰的方法访问
默认对象是：
        类名.class
 */

public class synchronizeStaticProgrammerMethod implements Runnable {
    private static int tickets = 100;
    private Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (synchronizeStaticProgrammerMethod.class){
                System.out.println(tickets);
            }
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
    public static synchronized boolean synchronizeMethod(String ticketOutlet){
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
