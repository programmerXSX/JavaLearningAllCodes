package 并发编程.网络编程.UDP通信.UDP接收数据;

import java.io.IOException;
import java.net.*;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socker对象（DatagramSocket)
        //DatagramSocket（int port）构造数据报套接字并将其绑定到本地主机上的指定端口
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包，用于接收数据
        //DatagramPacket（byte[] buf, int length)构造一个DatagramPacket用于接收长度为Length的数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        //调用DatagramSocket对象的方法接收数据
        ds.receive(dp);

        //解析数据包
        //byte[] getData():返回数据缓冲区
        byte[] datas =dp.getData();
        int len = dp.getLength();
        String s = new String(datas,0,len);
        System.out.println("数据是：" + s);

        ds.close();


    }
}
