package IO流.字符流.字符缓冲流特有功能;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("java 语言基础\\src\\IO流\\字符流\\字符缓冲流特有功能\\test.txt"));
        for (int i = 0;i <10;i++){
            bw.write("hello" + (i+1));
            bw.newLine();//换行
            bw.flush();//刷新
        }
        BufferedReader br = new BufferedReader(new FileReader("java 语言基础\\src\\IO流\\字符流\\字符缓冲流特有功能\\test.txt"));
        String line;
        //readline读取不到换行符，要自主换行
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        bw.close();
        br.close();
    }
}
