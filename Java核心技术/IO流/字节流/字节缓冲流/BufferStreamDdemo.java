package IO流.字节流.字节缓冲流;

import java.io.*;

public class BufferStreamDdemo {
    public static void main(String[] args) throws IOException {
        //字节缓冲输出流写数据  :   BufferedOutputStream(OutputStream out)
        FileOutputStream fos = new FileOutputStream("java 语言基础\\src\\IO流\\字节流\\字节缓冲流\\test01.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("夏敏敏是大猪头".getBytes());


        //字节缓冲输入流读数据    ：   BufferedInputStream(InputStream in)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("java 语言基础\\src\\IO流\\字节流\\字节缓冲流\\test02.txt"));
        int len ;
        byte[] bytes = new byte[10];
        while ((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }


        bos.close();
        bis.close();
        fos.close();
    }
}
