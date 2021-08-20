package 案例实践.案例实践_TCP通信程序练习.二_客户端数据来自键盘输入;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        Socket s = new Socket("127.0.0.1", 12345);
        //键盘读数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //字符流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        //创建接收反馈对象
        InputStream is = s.getInputStream();
        String line;
        //循环输入，886 退出
        while ((line = br.readLine()) != null){
            if (line.equals("886")){
                break;
            }
            //发送数据
            bw.write(line);
            bw.newLine();
            bw.flush();

            //接收反馈
            byte[ ] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes,0,len));

        }

        //关闭资源
        s.close();
    }
}
