package 案例实践.案例实践_TCP通信程序练习.三_服务器数据写入文本文件;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket s = new Socket("127.0.0.1",0615);

        //键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //字符流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        //创建接收反馈对象
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len;

        //循环接收数据
        String line;
        while ((line = br.readLine()) != null){
            if (line.equals("666")){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();

            //接收反馈
            len = is.read(bytes);
            System.out.println(new String(bytes,0,len));

        }

        //释放资源
        s.close();

    }
}
