package 案例实践.案例实践_复制多级文件夹;

import java.io.*;

public class copyFiles {
    public static final String s1 = "java 语言基础\\src\\案例实践\\案例实践_复制多级文件夹\\待复制文件夹";
    public static final String s2 = "java 语言基础\\src\\案例实践\\案例实践_复制多级文件夹\\已复制文件夹存放区域\\";

    public static void main(String[] args) throws IOException {
        String Path = "";
        getFile(new File(s1), Path);
    }

    public static void getFile(File file, String Path) throws IOException {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                String path = Path + "\\" + f.getName();
                File file1 = new File(s2 + path);
                file1.mkdirs();
                getFile(f, path);
            } else if (f.isFile()) {
                String path = Path + "\\" + f.getName();
                File file2 = new File(s2 + path);
                file2.createNewFile();
                copyfile(f, file2);
            }
        }
    }
    public static void copyfile(File f1, File f2) throws IOException {
                //将f1复制到f2
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f2));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f1));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }

}
