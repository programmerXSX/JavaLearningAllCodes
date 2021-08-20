package 案例实践.案例实践_UDP通信程序练习;
/*
在发送端创建DatagramSocket对象，可以不用传入端口参数，
但在创建DatagramPacket对象时要传入端口参数，并且要和接收端一致
 */

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);

        String line;
        //键盘录入
        while ((line = sc.next())!= null) {
            if (line.equals(666)){
                break;
            }else {
                //write data
                byte[] bytes = line.getBytes();

                //打包发送
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.124.7"), 10086);

                //发送
                ds.send(dp);
            }

        }
        //关闭资源
        ds.close();
    }
}
