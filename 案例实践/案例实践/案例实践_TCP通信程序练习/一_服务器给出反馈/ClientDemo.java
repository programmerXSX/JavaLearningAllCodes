package 案例实践.案例实践_TCP通信程序练习.一_服务器给出反馈;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientDemo {
    public static void main(String[] args) throws IOException {

         //创建客户端Socket对象
        Socket s = new Socket("192.168.124.7", 12345);

        //键盘录入
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        if (line != null) {

            //输出流对象
            OutputStream os = s.getOutputStream();

            //write data
            os.write(line.getBytes());

            //接收服务器反馈
            InputStream is = s.getInputStream();
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes, 0, len));
        }

        //关闭资源
        s.close();

    }
}
