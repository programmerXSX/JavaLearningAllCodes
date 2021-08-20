package 案例实践.案例实践_点名器;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class randomCall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("java 语言基础\\src\\案例实践\\案例实践_点名器\\name.txt"));
        ArrayList<String> arrayList = new ArrayList<>();
        String name;
        while ((name = br.readLine()) != null){
            arrayList.add(name);
        }
        Random r = new Random();
        int order = r.nextInt(arrayList.size());
        System.out.println(arrayList.get(order));

        br.close();
    }
}
