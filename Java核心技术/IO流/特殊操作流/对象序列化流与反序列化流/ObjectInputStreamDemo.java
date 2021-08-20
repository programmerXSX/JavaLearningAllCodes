package IO流.特殊操作流.对象序列化流与反序列化流;

import java.io.*;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream
                ("java 语言基础\\src\\IO流\\特殊操作流\\对象序列化流与反序列化流\\test.txt"));

        Student student = (Student) ois.readObject();
        System.out.println(student);

        ois.close();

    }
}
