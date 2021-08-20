package 基本数据类型.基本类型包装类;


public class IntegerDemo {
    public static void main(String[] args) {
        /*
        Integer的使用
         */
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
//
        Integer a = Integer.valueOf(100);
        System.out.println(a);
        a = Integer.valueOf("100");
        System.out.println(a);

        /*
        int 和string 相互转换
         */
        int number = 98;
        String str = "" + number;
        System.out.println(number);
        System.out.println(str);
        str = String.valueOf(number);
        System.out.println(str);

        String s1 = "59";
        int sum = Integer.valueOf(s1);
        System.out.println(sum);
        int sum1 = Integer.parseInt(s1);
        System.out.println(sum1);
    }
}
