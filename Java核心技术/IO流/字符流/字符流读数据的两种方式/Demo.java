package IO流.字符流.字符流读数据的两种方式;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("java 语言基础\\src\\IO流\\字符流\\字符流读数据的两种方式\\test.txt"));

//        //int read();一次读一个字符数据
//        int read;
//        while ((read = isr.read()) != -1){
//            System.out.print((char) read);
//        }

        //int read(char[] cbuf):一次读一个字符数组数据
        char[] ch = new char[10];
        int len;
        while ((len = isr.read(ch)) != -1){
            System.out.print(new String(ch,0,len));
        }

        isr.close();
    }
}
