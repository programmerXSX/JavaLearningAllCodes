package 案例实践.案例实践_TCP通信程序练习.五_客户端发送文件;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        ServerSocket ss = new ServerSocket(12365);
        while (true) {
            Socket s = ss.accept();
            Thread thread = new Thread(new ServerThread(s));
            thread.start();
        }
    }
}
