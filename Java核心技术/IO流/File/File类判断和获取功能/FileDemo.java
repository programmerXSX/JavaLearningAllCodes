package IO流.File.File类判断和获取功能;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\java\\javaFile\\java语言基础\\IO流\\File\\test02.txt.txt");
        File f2 = new File("E:\\java\\javaFile\\java语言基础\\IO流\\File");
        f1.createNewFile();

        //public boolean isDirectory()              测试此抽象路径名表示的File是否为目录
        System.out.println(f1.isDirectory());
        System.out.println(f2.isDirectory());
        //public boolean isFile()                        测试此抽象路径名表示的File是否为文件
        System.out.println(f1.isFile());
        System.out.println(f2.isFile());
        //public boolean exists()                       测试此抽象路径名表示的File是否存在
        System.out.println(f1.exists());
        System.out.println(f2.exists());
        System.out.println("-------------------");

        //public String getAbsoloutePath()      返回此抽象路径名的 绝对路径名 字符串
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
        //public String getPath()                        将此 抽象路径名 转换为 路径名 字符串
        System.out.println(f1.getPath());           //其实和直接输出差不多，将"\\"变成"\"
        System.out.println(f2.getPath());
        //public String getName()                     返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f1.getName());
        System.out.println(f2.getName());
        System.out.println("--------------------");

        //public String[] list()                             返回由此抽象路径名表示的 目录中的 文件和目录 的名称字符串数组
        String[] list = f2.list();
        for (String s : list) {
            System.out.println(s);
        }
        //public File[] listFiles()                          返回由此抽象路径名表示的 目录中的  文件和目录  的File对象数组
        File[] files = f2.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
