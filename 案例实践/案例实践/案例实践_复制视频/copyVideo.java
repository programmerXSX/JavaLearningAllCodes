package 案例实践.案例实践_复制视频;

import java.io.*;

public class copyVideo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\桌面\\过生日傻逼视频.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("java 语言基础\\src\\案例实践\\案例实践_复制视频\\test.mp4"));
        byte[] bytes = new byte[1024];
        int len;
        long startTime = System.currentTimeMillis();
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        long finishTime = System.currentTimeMillis();
        bis.close();
        bos.close();
        System.out.println("复制视频共耗时：" +(finishTime-startTime) + "毫秒");
    }
}
