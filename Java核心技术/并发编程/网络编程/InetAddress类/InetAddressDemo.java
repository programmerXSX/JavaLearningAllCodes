package 并发编程.网络编程.InetAddress类;

import java.net.*;

/*
InetAdress:
        此类表示Internet协议（IP）地址
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //public
//        InetAddress address = InetAddress.getByName("Jinforeverlove");
        //创建InetAdress对象
        InetAddress address = InetAddress.getByName("192.168.124.7");
        String name = address.getHostName();//获取对象名称
        String IP = address.getHostAddress();//获取对象IP
        System.out.println("设备名称：" + name);
        System.out.println("IP地址：" + IP);

    }
}
