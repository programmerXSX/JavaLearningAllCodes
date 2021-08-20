package IO流.File.File类基本概述;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        //File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
        File f1 = new File("E:\\java\\javaFlie\\java语言基础\\IO流\\Flie\\test01.txt");
        System.out.println(f1);

        //File(String parent,String child),从父路径名字符串和子路径名字符串创建新的File实例
        File f2 = new File("E:\\java\\javaFlie\\java语言基础\\IO流\\Flie","test01.txt");
        System.out.println(f2);

        //File(File parent,String child) 从父抽象路径名和子路径名字符串创建新的File实例
        File f3 = new File("E:\\java\\javaFlie\\java语言基础\\IO流\\Flie");
        File f4 = new File(f3,"test01.txt");
        System.out.println(f4);
    }
}
