package 接口组成更新.接口中默认方法;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface mi1 = new MyInterfaceImpOne();
        mi1.show1();
        mi1.show2();
        mi1.show3();


        MyInterface mi2 = new MyInterfaceImpTwo();
        mi2.show1();
        mi2.show2();
        mi2.show3();
    }
}
