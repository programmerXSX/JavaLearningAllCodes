package IO流.特殊操作流.Properties.Properties和IO流结合的方法;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.Properties;

public class PropertiesIODemo {
    public static final String path = "java 语言基础\\src\\IO流\\特殊操作流\\Properties\\Properties和IO流结合的方法\\test.txt";

    public static void main(String[] args) throws IOException {
//        File f = new File(path);
//        System.out.println(f.exists());

        myStore1();//字符流写数据
        myLoad1();//字符流读数据

//        myStore2();//字节流写数据
//        myLoad2();//字节流读数据
    }

    /*
       void store(OutputStream out, String comments), void store(Writer writer,String comments)
       将此属性列表（键和元素对）写入此Properties表中，以适合于使用load(InputStream), load(Reader)方法的格式
写入输出字符流
    */
    public static void myStore1() throws IOException {
        Properties pro = new Properties();
        FileWriter fw = new FileWriter(path, false);

        pro.put("夏敏", "猪头");
        pro.put("夏浩然", "大笨蛋 ");
        pro.put("老安", "lll");

        pro.store(fw, "描述");//comments是描述信息，可不写
        fw.close();
    }

    public static void myStore2() throws IOException {
        Properties pro = new Properties();
        OutputStream os = new FileOutputStream(path, false);

        pro.put("xax", "man");
        pro.put("jzt", "woman");
        pro.put("xzt","boy");

        pro.store(os, null);
        os.close();
    }

    /*
    void load(InputStream inStream)， void load(Reader reader)：
            从输入字节流，字符流读取属性列表（键和元素对）
 */
    public static void myLoad1() throws IOException {
        Properties pro = new Properties();
        FileReader fr = new FileReader(path);
        pro.load(fr);
        fr.close();
        System.out.println(pro);
    }

    public static void myLoad2() throws IOException{
        Properties pro = new Properties();
        InputStream is = new FileInputStream(path);
        pro.load(is);
        is.close();
        System.out.println(pro);
    }
}
