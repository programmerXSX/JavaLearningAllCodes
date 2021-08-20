package IO流.字节流.字节输出流写数据;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\java\\javaFile\\java语言基础\\IO流\\字节流\\字节输出流写数据\\test01.txt");
        //FileOutputSteam 会自动创建文件并指向该对象
        FileOutputStream fos = new FileOutputStream(f,true);

        //void write(int b):将指定的字节写入此文件输出流
        fos.write(97) ;        //以ASCLL码形式显示     97-a
        fos.write("\n\t".getBytes());

        byte[] bytes = "I love you".getBytes();
        fos.write(bytes);
        fos.write("\n".getBytes());

        //void write(byte[] b, int off, int len):将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
        fos.write(bytes,0,3);       // 表示从数组bytes[0]往后写三个字节

        //追加写入：如果正常写的话，每次都会从文件的开头重写，而覆盖原文件
        //使用如下方法可从文件尾写入而实现追加写入
        FileOutputStream fileOutputStream = new FileOutputStream(f,true);
        fileOutputStream.write("夏敏是猪猪".getBytes());


        //void close():关闭此文件输出流并释放与此流相关联的任何系统资源
        fos.close();


    }
}
