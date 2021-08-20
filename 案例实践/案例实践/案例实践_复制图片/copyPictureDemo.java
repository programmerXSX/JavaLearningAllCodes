package 案例实践.案例实践_复制图片;

import java.io.*;

public class copyPictureDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\文档\\图片\\test.jpg");
        FileOutputStream fos = new FileOutputStream("java 语言基础\\src\\案例实践\\案例实践_复制图片\\test.jpg");
        byte[] bytes = new byte[1024];
        int len ;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes , 0, len);
        }
        fis.close();
        fos.close();
    }
}
