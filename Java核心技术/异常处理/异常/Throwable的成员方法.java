package 异常处理.异常;

public class Throwable的成员方法 {
    public static void main(String[] args) {
        System.out.println("start");
        method();
        System.out.println("finish");

    }
    public static void method(){
        try {
            int[] arr = {1, 2, 3, 4};
            System.out.println(arr[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());//异常的原因
            System.out.println(e.toString());//
            e.printStackTrace();//输出最全面错误信息
        }

    }
}
