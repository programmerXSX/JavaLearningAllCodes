package 案例实践.案例实践_TCP通信程序练习.二_客户端数据来自键盘输入;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException{
        //创建服务器ServerSocket对象
        ServerSocket ss = new ServerSocket(12345);

        //获取Socket对象
        Socket s = ss.accept();

        //字符流读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line ;
        //创建反馈对象
        OutputStream os = s.getOutputStream();

        while ((line = br.readLine()) != null) {
            //输出
            System.out.println(line);

            //给出反馈
            os.write("提示：信息已发送".getBytes());
        }
        ss.close();
    }
}
