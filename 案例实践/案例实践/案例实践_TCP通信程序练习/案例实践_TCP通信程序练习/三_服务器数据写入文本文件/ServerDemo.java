package 案例实践.案例实践_TCP通信程序练习.三_服务器数据写入文本文件;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
//E:\Java\Java_projects\IDEA_java_projects\Java学习\
public class ServerDemo {
    public static void main(String[] args) throws IOException {
//        File f = new File("案例实践\\src\\案例实践\\案例实践_TCP通信程序练习\\三_服务器数据写入文本文件\\data.txt");
//        System.out.println(f.exists());

        //创建ServerSocket对象
        ServerSocket ss = new ServerSocket(0615);

        //获取Socket对象
        Socket s= ss.accept();

        //创建文件写数据对象
        OutputStream os = new FileOutputStream("E:\\Java\\Java_projects\\IDEA_java_projects\\Java学习\\案例实践\\src\\案例实践\\案例实践_TCP通信程序练习\\三_服务器数据写入文本文件\\data.txt",true);

        //创建反馈对象
        OutputStream outputStream = s.getOutputStream();

        //读数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line ;

        while ((line = br.readLine()) != null) {
            //控制台输出
            System.out.println(line);

            //将数据写入文件
            os.write(line.getBytes(StandardCharsets.UTF_8));

            //给出反馈
            outputStream.write("信息已发送你并写入文件".getBytes(StandardCharsets.UTF_8));
        }
        ss.close();
        os.close();
        outputStream.close();
    }
}
