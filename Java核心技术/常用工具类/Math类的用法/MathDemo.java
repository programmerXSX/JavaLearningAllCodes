package 常用工具类.Math类的用法;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(33));
        System.out.println(Math.abs(-23));
        //_________________________
        System.out.println(Math.ceil(15.36546));
        //_________________________________
        //round是四舍五入
        System.out.println(Math.round(12.45f));
        System.out.println(Math.round(4.65426584));
        //_________________________
        System.out.println(Math.max(12,74));
        System.out.println(Math.min(45,6545));
        //+__________________________
        System.out.println(Math.pow(5,8.26));
        //_______________________________
//        System.out.println(Math.);
        //_____________________
        //random函数，是随机数，可以在[0.0,1.0)之间取（double）值
        System.out.println(Math.random());
    }
}
