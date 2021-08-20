package 集合框架.匿名内部类的使用;

public class Demo {
    public static void main(String[] args) {
        InterOperator i = new InterOperator();
        i.test0(new Inter() {
            @Override
            public void show() {
                System.out.println("我，就是太阳" +
                        "，\n" +
                        "秀儿is me！！！！！！！！！");
            }
        });
    }
}
