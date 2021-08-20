package IO流.File.递归;

public class recursiveDemo {
    public static void main(String[] args) {
//        System.out.println(recursive(20));
        System.out.println(factorial(5));
    }
    public static int recursive(int n){
        if (n == 1 || n == 2) {
            return 1;
        }else{
            return recursive(n - 1) + recursive(n - 2);
        }
    }
    public static int factorial(int n){
        if (n == 1){
            return 1;
        }else{
            return factorial(n-1)*n;
        }
    }
}
