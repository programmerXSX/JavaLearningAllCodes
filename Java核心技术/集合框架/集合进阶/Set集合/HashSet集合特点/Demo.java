package 集合框架.集合进阶.Set集合.HashSet集合特点;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        HashSet<String> hs  = new HashSet<>();
        hs.add("ok");
        hs.add("Let's");
        hs.add("go");

        for (String s:hs){
            System.out.println(s);
        }
    }
}
