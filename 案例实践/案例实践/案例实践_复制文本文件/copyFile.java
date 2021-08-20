package 案例实践.案例实践_复制文本文件;

import java.io.*;

/*
将test02复制到test01中
java语言基础\src\案例实践\案例实践_复制文本文件\test01.txt
E:\java\javaFile\java语言基础\IO流\字节流\字节流读数据\test01.txt
 */
public class copyFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("java 语言基础\\src\\案例实践\\案例实践_复制文本文件\\test01.txt");
        File f2 = new File("java 语言基础\\src\\案例实践\\案例实践_复制文本文件\\test02.txt");

        FileOutputStream fos = new FileOutputStream(f1);
        FileInputStream fis = new FileInputStream(f2);
        int read;
        while ((read = fis.read()) != -1) {
            System.out.print((char) read);
            fos.write(read);
        }
        fos.close();
        fis.close();
    }
}
