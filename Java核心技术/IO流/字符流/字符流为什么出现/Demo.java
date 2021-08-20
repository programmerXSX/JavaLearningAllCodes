package IO流.字符流.字符流为什么出现;
/*
字符流 = 字节流 + 编码表
 */

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        //[-28, -72, -83, -27, -101, -67],  UTF-8编码，三个字节一个字符
        byte[] bytes1 = s.getBytes();
        byte[] bytes2 = s.getBytes("GBK");//[-42, -48, -71, -6]
        //Arrays.toString(byte[] bytes) 将数组输出
        System.out.println(Arrays.toString(bytes1));
        System.out.println(Arrays.toString(bytes2));

        //解码
        s = new String(bytes1);
        System.out.println(s);

        s = new String(bytes2,"GBK");
        System.out.println(s);

    }
}
