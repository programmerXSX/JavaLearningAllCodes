package 字符串.String的使用和扩展;

public class StringBuilder使用 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = sb1.append("World");


        System.out.println(sb1);
        System.out.println(sb2);


        StringBuilder sb = new StringBuilder();
        sb.append("Hello, World!").append("My name is ....");
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        //string与string Builder相互转换
        //StringBuilder转String
        StringBuilder s = new StringBuilder("hello");
        String s0 = s.toString();
        System.out.println("s = " + s);
        System.out.println("s0 = " + s0);
        //String转Stringbuilder
        s.append(s0);
        System.out.println("s = " + s);
        System.out.println("s0 = " + s0);
    }
}
