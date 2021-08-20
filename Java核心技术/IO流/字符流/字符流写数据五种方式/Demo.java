package IO流.字符流.字符流写数据五种方式;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("java 语言基础\\src\\IO流\\字符流\\字符流写数据五种方式\\test01.txt"));

        //1、void write(int c):写一个字符
        osw.write(97);
        osw.flush();//刷新，其实不用写，close之前会刷新
        //2、void write(char[] cbuf):写一个字符数组
        char[] ch = {'\n','a','b','c','\n'};
        osw.write(ch);
        //3、void write(char[] cbuf, int off, int len):写入字符数组的一部分
        osw.write(ch,1,4);
        //4、void write(String str):写一个字符串
        osw.write("I love China\n");
        //5、void write(String, int off, int len):写一个字符串的一部分
        osw.write("My name is xsx",0,7);

        osw.close();
    }
}
