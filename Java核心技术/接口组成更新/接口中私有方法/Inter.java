package 接口组成更新.接口中私有方法;

public interface Inter {
    //私有方法
    private void showDefault(){
        System.out.println("第一次");
        System.out.println("第二次");
        System.out.println("第三次");
    }
    default void show1(){
        System.out.println("show1开始执行");
//        System.out.println("第一次");
//        System.out.println("第二次");
//        System.out.println("第三次");
        //可以调用静态的私有方法
//        showDefault();
        showStatic();
        System.out.println("show1结束执行");
    }
    default void show2(){
        System.out.println("show2开始执行");
//        System.out.println("第一次");
//        System.out.println("第二次");
//        System.out.println("第三次");
        showDefault();
        System.out.println("show2结束执行");
    }
    //-----------------------------------------------------------------------
    //私有静态方法
    private static void showStatic(){
        System.out.println("第一次");
        System.out.println("第二次");
        System.out.println("第三次");
    }
    static void show3(){
        System.out.println("show3开始执行");
//        System.out.println("第一次");
//        System.out.println("第二次");
//        System.out.println("第三次");
        showStatic();
        System.out.println("show3结束执行");
    }
    static void show4(){
        System.out.println("show4开始执行");
//        System.out.println("第一次");
//        System.out.println("第二次");
//        System.out.println("第三次");
        showStatic();
        System.out.println("show4结束执行");
    }
}
