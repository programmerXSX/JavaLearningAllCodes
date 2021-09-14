package 案例实践.案例实践_TCP通信程序练习.五_客户端发送文件;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerThread implements Runnable{
    private Socket s;
    public ServerThread(Socket s) {
        this.s = s;
    }
    @Override
    public void run() {
        try {
            //在客户端创建文件目录
            File f = new File("E:\\Java\\Java_projects\\IDEA_java_projects\\Java学习\\" +
                    "案例实践\\src\\案例实践\\案例实践_TCP通信程序练习\\五_客户端发送文件\\ClientFiles");
            f.mkdirs();
            //创建字节流接收数据
            InputStream isServer = s.getInputStream();
            //读取文件名
            int read;
            StringBuilder sb = new StringBuilder("");
            String s1;
            while ((read = isServer.read()) != -1) {
                if ((char) read == '\n') {
                    break;
                }
                s1 = String.valueOf((char) read);
                sb.append(s1);
            }
            s1 = sb.toString();
            //创建文件
            File file = new File((f.getAbsolutePath() + "\\" + s1));
            file.createNewFile();
            //创建字节流对象写入文件数据
            OutputStream osFile = new FileOutputStream(file);
            //写入文件内容
            byte[] bytes = new byte[1024];
            int len;
            while ((len = isServer.read(bytes)) != -1) {
                osFile.write(bytes, 0, len);
            }
            //给出反馈
            OutputStream osServer = s.getOutputStream();
            osServer.write("文件已成功发送".getBytes(StandardCharsets.UTF_8));

            //释放资源
            osFile.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
