package Lambda表达式.Lambda表达式的注意事项;

public class LanmbdaDemo {
    public static void main(String[] args) {
        //1、使用Lambda必须要有接口，并且要求接口中有且仅有一个抽象方法
        useshow(()->{
            System.out.println("只有一个方法");
        });
        //2、必须有上下文环境，才能导出Lambda表达式对应的接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1");
            }
        }).start();

        Runnable r = ()->{
            System.out.println("线程2");
        };
        new Thread(r).start();

        new Thread(()-> System.out.println("线程3")).start();

    }
    public static void useshow(Inter inter){
        inter.show();
    }
}
