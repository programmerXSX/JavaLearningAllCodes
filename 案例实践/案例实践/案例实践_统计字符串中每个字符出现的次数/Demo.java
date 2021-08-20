package 案例实践.案例实践_统计字符串中每个字符出现的次数;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        //从键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //创建Hash Map集合，键是Character，值是Tnteger
        //Character是char的包装类
        TreeMap<Character,Integer> hashMap = new TreeMap<Character,Integer>();

        //用charAt（）方法获取字符串内字符
        for (int i = 0;i<line.length();i++){
            char c = line.charAt(i);
            if (hashMap.get(c) == null){
                hashMap.put(c,1);
            }else {
                int num = hashMap.get(c);
                hashMap.put(c,++num);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keyMap = hashMap.keySet();
        for (Character ch:keyMap){
            sb.append(ch).append("(").append(hashMap.get(ch)).append(")");
        }
        System.out.println(sb);
    }
}
