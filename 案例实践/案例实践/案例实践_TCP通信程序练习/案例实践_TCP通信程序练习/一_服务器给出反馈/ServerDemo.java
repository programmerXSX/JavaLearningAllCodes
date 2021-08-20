package 案例实践.案例实践_TCP通信程序练习.一_服务器给出反馈;
//192.168.124.7

import java.io.*;
import java.net.*;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的ServerSocket对象
        ServerSocket ss = new ServerSocket(12345);

        //获取Socket对象
        Socket s = ss.accept();

        //获取输入流对象
        InputStream is = s.getInputStream();

        //读数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String line = new String(bytes, 0, len);
        System.out.println(new String(bytes, 0, len));

        //给出反馈
        OutputStream os = s.getOutputStream();
        os.write("提示：信息已发送".getBytes());

        ss.close();
    }
}
