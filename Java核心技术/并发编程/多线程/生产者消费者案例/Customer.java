package 并发编程.多线程.生产者消费者案例;

public class Customer implements Runnable {
    private Box b = new Box();

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
while (true){
                b.get();
        }
    }
}
