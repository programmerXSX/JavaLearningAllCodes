package 接口组成更新.接口中静态方法;

public class InterDemo {
    public static void main(String[] args) {
        Inter inter = new InterImpl();
        inter.show();
        inter.method();

        //静态方法不可以通过创建对象访问
        //但可以通过接口名调用
        Inter.test();

    }
}
