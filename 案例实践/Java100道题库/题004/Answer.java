package Java100道题库.题004;
/*
已知两个有序数组，找到两个数组合并后的中位数
 */

public class Answer {
    public static int[] array1 = {1, 3, 5, 7, 9};
    public static int[] array2 = {-3, 0, 7, 8, 10};

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        int[] array = new int[array1.length + array2.length];
        int n = 0, i = 0, j = 0, temp,sub;
        while (i < array1.length && j < array2.length) {
            if (array1[i] > array2[j]) {
                temp = array2[j++];
            } else if (array1[i] < array2[j]) {
                temp = array1[i++];
            } else {
                temp = array1[i++];
                j++;
            }
            array[n++] = temp;
        }

        for (Integer integer : array) {
            System.out.print(integer + ",");
        }
    }
}
