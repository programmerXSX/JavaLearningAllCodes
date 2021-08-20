package 常用工具类.System类;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("开始");
//        System.exit(0);
        System.out.println("finish");
        System.out.println(System.currentTimeMillis()/(double)1000/3600/24/365);


        long start = System.currentTimeMillis();
        for(int i =0;i<10000;i++){

         System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end-start) + "毫秒");
    }
}
