package IO流.字节流.字节流写数据加入异常处理;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        File f = new File("E:\\java\\javaFile\\java语言基础\\IO流\\字节流\\字节流写数据加入异常处理");
        FileOutputStream fos = null;//如果不定义并初始化，finally中fos无法使用
        try {
            fos = new FileOutputStream(f, true);
            fos.write("I love you".getBytes());
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fos != null) {  //如果是空调用close会抛出异常，因此要先判断
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
