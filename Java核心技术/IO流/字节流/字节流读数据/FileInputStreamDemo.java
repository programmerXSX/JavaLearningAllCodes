package IO流.字节流.字节流读数据;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\java\\javaFile\\java语言基础\\IO流\\字节流\\字节流读数据\\test01.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(f,true);
//        fileOutputStream.write("\nmy name is xsx".getBytes());

        //创建对象读数据对象
        FileInputStream fileInputStream = new FileInputStream(f);


        //读数据
        int read;
        while ((read = fileInputStream.read())!= -1){
            System.out.print((char) read);
            read = fileInputStream.read();
        }

        //释放资源
        fileInputStream.close();

    }
}
