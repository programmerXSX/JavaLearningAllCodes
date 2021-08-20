package 集合框架.内部类;

public class outer {
    private class inner{
        public void show(){
            System.out.println("老安是猪头");
        }
    }
    public void test(){
        inner i  = new inner();
        i.show();
    }

//集合框架.内部类
    public void test2(){
        class inner{
            public void test3(){
                System.out.println("套中套");
            }
        }
        inner i = new inner();
        i.test3();
    }


    /*匿名内部类*/
    public void tea() {
        inter i2 = new inter() {
            @Override
            public void test() {
                System.out.println("匿名内部类");
            }
        };
        i2.test();

    }
}
