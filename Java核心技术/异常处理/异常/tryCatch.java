package 异常处理.异常;

public class tryCatch {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method() {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        }catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
            e.printStackTrace();//将异常打印出来并且不影响后续程序


        }
    }
}
