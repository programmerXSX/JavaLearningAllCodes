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

        /*
        虽然这里写了当br.readline()!= null时,程序退出，
        但是当客户端读取的数据当为null时，客户端程序退出，就无法发送null信息给服务器
        因此我们需要在客户端传输数据时最后加上一个结束标志
        除了自定义标志外，Socket提供了shutdownOutput方法作为结束标志
         */
        while ((line = br.readLine()) != null) {
            //判断结束退出标志
//            if (line.equals("end")){
//                break;
//            }
            //将文件储存在Server.txt中
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        System.out.println("jieshu");
        //给出反馈
        bwClient.write("对方已接收");
        bwClient.newLine();
        bwClient.flush();
        s.shutdownOutput();
        //释放资源
        bw.close();
        ss.close();
    }
}
