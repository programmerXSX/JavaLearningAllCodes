package IO流.File.File类创建及删除功能;
//E:\java\javaFlie\java语言基础\IO流\Flie\test01.txt

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) throws IOException {
        //mkdir方法可以用来创建一级目录，不能重复创建
        File f1 = new File("E:\\java\\javaFlie\\java语言基础");
        System.out.println(f1.mkdir());

        //mkdirs方法可以用来创建多级目录
        File f2 = new File("E:\\java\\javaFlie\\java语言基础\\IO流\\Flie\\");
        System.out.println(f2.mkdirs());

        //creatNewFile方法可以创建文件
        File f3 = new File("E:\\java\\javaFlie\\java语言基础\\IO流\\Flie\\test01.txt");
        System.out.println(f3.createNewFile());

        /*
        如果创建文件不加前面的目录，会创建在该项目下，与模块是同级目录
        File f = new file("java.txt");  会在本项目中创建文件
        File f = new file("java 语言基础\\java.txt");  会在该模板下创建文件
         */


    }
}
