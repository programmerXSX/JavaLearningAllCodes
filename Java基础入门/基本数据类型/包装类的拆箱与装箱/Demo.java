package 基本数据类型.包装类的拆箱与装箱;

public class Demo {
    public static void main(String[] args) {
        //装箱：把基本数据类型转换为对应的数据类型
        Integer i0 = Integer.valueOf(100);//装箱
        Integer i1 = 100;//自动装箱

        //拆箱：把包装类类型转换为基本数据类型
        i1 = i1.intValue() + 200;
        System.out.println(i1);
        i1+= 100;//自动拆箱
        System.out.println(i1);


    }
}
