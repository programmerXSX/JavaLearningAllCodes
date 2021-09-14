package 面向对象.修饰符;

public class Father {
    private void show1(){
        System.out.println("private");
    }
    void show2(){
        System.out.println("默认");
    }
    protected void show3(){
        System.out.println("protected");
    }
    public void show4(){
        System.out.println("pubilc");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}
