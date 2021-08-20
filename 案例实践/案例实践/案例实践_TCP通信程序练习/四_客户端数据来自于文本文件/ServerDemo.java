package 案例实践.案例实践_TCP通信程序练习.四_客户端数据来自于文本文件;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象、Socket对象、文本文件对象、接收客户端对象、反馈对象
        ServerSocket ss = new ServerSocket(4566);
        Socket s = ss.accept();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream
                ("E:\\Java\\Java_projects\\IDEA_java_projects\\Java学习\\案例实践\\src\\案例实践\\" +
                        "案例实践_TCP通信程序练习\\四_客户端数据来自于文本文件\\Server.txt")));
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bwClient = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        //给出反馈
        bwClient.write("文件已成功发送");
        bwClient.newLine();
        bwClient.flush();
        String line;
        while ((line = br.readLine()) != null) {
            //将文件储存在Server.txt中
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
        ss.close();
    }
}
