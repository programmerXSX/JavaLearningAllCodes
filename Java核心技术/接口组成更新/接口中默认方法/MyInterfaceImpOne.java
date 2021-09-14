package 接口组成更新.接口中默认方法;

public class MyInterfaceImpOne implements MyInterface {


    @Override
    public void show1() {
        System.out.println("one show()1");
    }

    @Override
    public void show2() {
        System.out.println("one show()2");
    }

    @Override
    public void show3() {
        System.out.println("默认方法也可以重写");
    }
}
