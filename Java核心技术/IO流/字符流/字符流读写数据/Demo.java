package IO流.字符流.字符流读写数据;
/*
在使用转换流创建字符流对象时，格式如下：
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("fileName"),"charstName");
这种格式使用起来太过复杂，而我们常见的操作都是按照本地默认编码实现的，
所以，为了简化书写，转换流提供了对应的子类：
        FileWriter:用于读取字符文件的便捷类
                FileReader(String fileName)
由此，上述代码可简写为：
        FileReader fr = new FileReader("fileName");
同理，

 */

import java.io.*;
public class Demo {
    public static void main(String[] args) throws IOException {
        //创建对象
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream
//                ("java 语言基础\\src\\IO流\\字符流\\字符流读写数据\\test01.txt"),"UTF-8");
        FileWriter osw = new FileWriter("java 语言基础\\src\\IO流\\字符流\\字符流读写数据\\test01.txt");
        //写数据
        osw.write("I love you");
        osw.close();

//        InputStreamReader isr = new InputStreamReader(new FileInputStream
//                ("java 语言基础\\src\\IO流\\字符流\\字符流读写数据\\test01.txt"),"UTF-8");
        FileReader isr  =new FileReader("java 语言基础\\src\\IO流\\字符流\\字符流读写数据\\test01.txt");
        int len;
        while ((len = isr.read()) != -1){
            System.out.print((char) len);
        }
        isr.close();
    }
}
