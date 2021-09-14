package 案例实践.案例实践_TCP通信程序练习.五_客户端发送文件;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    private static String filePath = "E:\\Java\\Java_projects\\IDEA_java_projects\\Java学习\\案例实践\\src\\案例实践\\案例实践_TCP" +
            "通信程序练习\\五_客户端发送文件\\test.png";
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket s = new Socket("127.0.0.1",12365);
        //创建文件对象
        File f = new File(filePath);
        //创建字节流读取文件数据并传输
        InputStream isFile = new FileInputStream(filePath);
        OutputStream osClient = s.getOutputStream();
        //创建字节流接收反馈
        InputStream isClient = s.getInputStream();
        //读取文件数据并写入
        byte[] bytes = new byte[1024];
        int len;
        //传输文件名
        osClient.write((f.getName() + "\n").getBytes());
        //传输文件数据
        while ((len = isFile.read(bytes)) != -1){
            osClient.write(bytes);
        }
        //End mark
        s.shutdownOutput();
        //接收反馈
        len = isClient.read(bytes);
        System.out.println(new String(bytes,0,len));
        //释放资源
        s.close();
        isFile.close();
    }
}
