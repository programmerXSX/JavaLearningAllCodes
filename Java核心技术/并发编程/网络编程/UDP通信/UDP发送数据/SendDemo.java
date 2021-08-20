package 并发编程.网络编程.UDP通信.UDP发送数据;

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //DatagramSocket():构造数据报套接字并将其绑定到本地主机的任何可用 端口
        DatagramSocket ds = new DatagramSocket();

        //DatagramePacket(byte[] buf, int Length, InetAddress address, int port),  port(0-65535)
        //构造一个数据包，发送长度为Length的数据包到指定主机的指定端口号
        byte[] bytes = "wsm".getBytes();
        int length = bytes.length;
        InetAddress address = InetAddress.getByName("192.168.124.7");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes,length,address,port);


        //send(DatagramPacket  p),发送数据报包
        ds.send(dp);

        ds.close();
    }
}
