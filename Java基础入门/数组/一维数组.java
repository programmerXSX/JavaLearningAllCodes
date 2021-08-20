package 数组;

public class 一维数组 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 4, 8, 5, 45, 6};
        for (int i = 0; i < 8; i++) {
            System.out.println("arr[" + i + "]  = " + arr[i]);
        }
        /*
        冒泡排序
         */
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.print("   " + arr[i]);
        }
    }
}
