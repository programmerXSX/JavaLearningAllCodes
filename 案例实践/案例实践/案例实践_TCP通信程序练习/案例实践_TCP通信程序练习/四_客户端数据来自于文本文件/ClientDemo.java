package 案例实践.案例实践_TCP通信程序练习.四_客户端数据来自于文本文件;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket s = new Socket("127.0.0.1", 4566);
        //创建字符流对象写数据、接收反馈
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader brServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //创建字符流读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream
                ("E:\\Java\\Java_projects\\IDEA_java_projects\\Java学习\\案例实践\\src\\案例实践\\" +
                        "案例实践_TCP通信程序练习\\四_客户端数据来自于文本文件\\Client.txt")));
        String line;
        //传输数据
        while ((line = br.readLine()) != null) {
            //写数据
            bw.write(line);
            bw.newLine();
            bw.flush();

        }
        //接收反馈
        line = brServer.readLine();
        System.out.println(line);

        s.close();
        br.close();
    }
}
