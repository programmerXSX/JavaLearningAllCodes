package IO流.File.File类创建及删除功能;
//E:\java\javaFlie\java语言基础\IO流\Flie\test01.txt

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File f1 = new File("E:\\java\\javaFlie\\java语言基础\\IO流\\Flie\\test01.txt");
        /*
        如果目录内有内容，不可以直接删除，要先删除子目录
         */
        System.out.println(f1.delete());

    }
}
