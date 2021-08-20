package 并发编程.网络编程.TCP通信.TCP接收数据;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //ServerSocket(int port) 创建绑定到指定端口的服务器套接字
        ServerSocket ss = new ServerSocket(10000);

        //Socket accept() 侦听要连接到此套接字并接受它
        Socket socket = ss.accept();
        InputStream is =socket.getInputStream();

        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String s =new String(bytes,0,len);
        System.out.println(s);

        //关闭资源
        ss.close();
        is.close();

    }
}
