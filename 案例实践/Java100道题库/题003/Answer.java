package Java100道题库.题003;

/*
给定⼀个字符串，找到没有重复字符的最⻓⼦串，返回它的⻓度
        Given:abcabcbb,the answer is "abc"',which the length = 3.

 */

import java.util.HashSet;

public class Answer {
    public static String s = "abcabcbb";
    public static void main(String[] args) {

    }

    /*
方法一：将字符串加入HashSet集合之中
        HashSet集合不会有重复元素
        时间复杂度：O（n）
        空间复杂度：O（min（m，n））
     */
    public static void answer1(){
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0;i<s.length();i++){
            hs.add(s.charAt(i));    //charAt()方法可以返回字符串s的索引i的值
        }
        for (Character c:hs){
            System.out.print(c);
        }
        System.out.println("\n" +hs.size());
    }
}
