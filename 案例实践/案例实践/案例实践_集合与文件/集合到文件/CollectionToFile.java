package 案例实践.案例实践_集合与文件.集合到文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CollectionToFile {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("I love");
        arrayList.add("Hello");
        arrayList.add("World");

        BufferedWriter bw = new BufferedWriter(new FileWriter("java 语言基础\\src\\案例实践.集合与文件\\集合到文件\\test.txt"));

        for (String s:arrayList){
            System.out.println(s);
        }
    }
}
