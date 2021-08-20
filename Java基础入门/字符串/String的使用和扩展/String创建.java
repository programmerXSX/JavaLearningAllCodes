package 字符串.String的使用和扩展;

public class String创建 {
    public static void main(String[] args) {
        String sc1 = "姓名";


        char chr[] = {97, 'b', 'c'};//可以是ASCLL码
        String sc2 = new String(chr);


        System.out.println("sc1 = " + sc1);
        System.out.println("sc2 = " + sc2);

        //字符串的比较
        //"==" 比较基本数据类型的值
        //而对与引用数据类型比较其地址
        //用equals比较引用的值
        String s1 = "jin",s2 = "jin",s3 = "xsx";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

    }
}
