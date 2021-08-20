package 案例实践.案例实践_UDP通信程序练习;

import java.io.IOException;
import java.net.*;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端DatagramPacket对象，要传入端口参数，且与发送端一致
        DatagramSocket ds = new DatagramSocket(10086);

        //创建byte数组接收
        byte[] bytes = new byte[1024];

        //创建DataPacket对象，传入两个参数——接收数组和数组长度
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            //接收数据
            ds.receive(dp);

            //解析数据包
            byte[] datas = dp.getData();

            //输出
            System.out.println(new String(dp.getData(), 0, dp.getLength()));

        }
    }
}
