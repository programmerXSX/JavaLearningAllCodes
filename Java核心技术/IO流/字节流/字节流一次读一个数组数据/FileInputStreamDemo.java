package IO流.字节流.字节流一次读一个数组数据;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\java\\javaFile\\java语言基础\\IO流\\字节流\\字节流一次读一个数组数据\\test01.txt");
        FileInputStream fis = new FileInputStream(f);

        byte[] by = new byte[5];//创建一个byte数组，read读取的字节将以ASCLL码形式储存在数组之中
        int len = fis.read(by); //此处再用len接受就不是字节的ASCLL码了
        System.out.println(len);//而是实际读取的字节长度
        System.out.print(new String(by));//此时输出不是字符，而是字符串的形式，用String转换

        fis.read(by);
        System.out.print(new String(by));
        fis.read(by);
        System.out.print(new String(by));
        fis.read(by);
        System.out.print(new String(by));
        fis.read(by);
        System.out.print(new String(by));
        fis.read(by);
        System.out.print(new String(by));
        /*
        当读取到最后by数组内不会被替代，仍会输出最后几个字节
        但是我们不想输出多余的字节，因此采用这种方式
        new String(byte[] byte, off, len) ,用len接收读取长度
        表示从off输出len长度
         */
        len  = fis.read(by);
        System.out.println(new String(by,0,len));
        System.out.println(len);
        System.out.println("-----------------------");

        //利用while实现简化
        File f2 = new File("E:\\java\\javaFile\\java语言基础\\IO流\\字节流\\字节流一次读一个数组数据\\test02.txt");
        FileInputStream fileInputStream = new FileInputStream(f2);
        byte[] bys = new byte[10];
        while ((len = fileInputStream.read(bys)) != -1){
            System.out.print(new String(bys,0,len));
        }
        

        fis.close();
    }
}
