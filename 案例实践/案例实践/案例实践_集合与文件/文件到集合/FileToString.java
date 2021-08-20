package 案例实践.案例实践_集合与文件.文件到集合;

import java.io.*;
import java.util.ArrayList;

public class FileToString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("java 语言基础\\src\\案例实践.集合与文件\\文件到集合\\test.txt"));
        ArrayList<String> arrayList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null){
            arrayList.add(line);
        }
        for (String s1:arrayList){
            System.out.println(s1);
        }
        br.close();
    }
}
