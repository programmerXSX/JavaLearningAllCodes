package IO流.特殊操作流.对象序列化流与反序列化流;

import java.io.*;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream
                ("java 语言基础\\src\\IO流\\特殊操作流\\对象序列化流与反序列化流\\test.txt"));

        Student s1 = new Student("xmm", 12);
                //可以直接用write方法将对象加入文件
        oos.writeObject(s1);
        oos.close();
    }
}
