package 案例实践.案例实践_遍历文件目录;

import java.io.File;

public class traverseFile {
    public static void main(String[] args) {
        File f1 = new File("E:\\java\\javaFile");
        getAllFilePath(f1);
    }

    public static void getAllFilePath(File file) {
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files!= null) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        getAllFilePath(f);
                    }else {
                        System.out.println(f.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("文件或目录为空");
        }
    }
}
