package 案例实践.案例实践_卖票;

public class mainDemo {
    public static void main(String[] args) {
        SellTickets st = new SellTickets();
        Thread t1 = new Thread(st, "A窗口");
        Thread t2 = new Thread(st, "B窗口");
        Thread t3 = new Thread(st, "C窗口");

        t1.start();
        t2.start();
        t3.start();
    }
}
