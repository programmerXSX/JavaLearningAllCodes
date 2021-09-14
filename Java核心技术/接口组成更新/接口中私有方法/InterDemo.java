package 接口组成更新.接口中私有方法;

public class InterDemo {
    public static void main(String[] args) {
        Inter inter = new InterImpl();
        inter.show1();
        inter.show2();

        Inter.show3();
        Inter.show4();
    }
}
