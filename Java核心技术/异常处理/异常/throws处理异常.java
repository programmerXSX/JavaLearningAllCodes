package 异常处理.异常;

public class throws处理异常 {
    public static void main(String[] args) {
        System.out.println("start");
        method();
        System.out.println("finish");
    }
    //throws是抛出异常，并不能解决问题
    public static void method() throws ArrayIndexOutOfBoundsException{
        int[] arr = {1,2,3};
        System.out.println(arr[5]);

    }
}
