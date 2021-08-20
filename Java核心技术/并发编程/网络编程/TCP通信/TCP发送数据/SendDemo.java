package 并发编程.网络编程.TCP通信.TCP发送数据;
////192.168.124.7

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象（Socket）
        //Socket(InetAddress address, int port) 创建流套接字并将其连接到指定IP地址的指定端口号
        Socket s = new Socket(InetAddress.getByName("192.168.124.7"),10000);
        //Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号,简化上面的步骤
        Socket s1 = new Socket("192.168.124.7",10000);

        //获取输出流，写数据
        //采用字节流输入输出
        //OutputStream getOutputStream() 返回此套接字的输出流
        OutputStream os = s.getOutputStream();
        os.write("hello TCP".getBytes());

        s.close();
        os.close();


    }
}
