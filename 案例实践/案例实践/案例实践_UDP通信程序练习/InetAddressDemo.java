package 案例实践.案例实践_UDP通信程序练习;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("Jinforeverlove");
        System.out.println(address);

        //我也不知道这是什么操作
//        byte[] bytes = address.getAddress();
//        System.out.println(new String(bytes));

        String sName = address.getHostName();
        String sIP = address.getHostAddress();
        System.out.println(sName);
        System.out.println(sIP);
    }
}
