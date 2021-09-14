package JavaPTA95道题目.题1003_我要通过;

import java.util.Scanner;

/*
“答案正确”是自动判题系统给出的最令人欢喜的回复。
本题属于 PAT 的“答案正确”大派送 —— 只要读入的字符串满足下列条件，
系统就输出“答案正确”，否则输出“答案错误”。

得到“答案正确”的条件是：

字符串中必须仅有 P、 A、 T这三种字符，不可以包含其它字符；

任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，
或者是仅由字母 A 组成的字符串；

如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a、 b、 c 均或者是空字符串，
或者是仅由字母 A 组成的字符串。

现在就请你为 PAT 写一个自动裁判程序，判定哪些字符串是可以获得“答案正确”的。
 */
public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int length = str.length();
        System.out.println(length);
        char[] ch = new char[length];
        boolean answer = false;

        for (int i = 0; i<length;i++){
            ch[i] = str.charAt(i);
            System.out.println(ch[i]);
            if(ch[i] == 'P'||ch[i] == 'A'||ch[i] == 'T'||ch[i] == ' '){
                answer = true;
            }else {
                answer = false;
            }
        }
        if (answer == true){
            System.out.println("答案正确");
        }else {
            System.out.println("答案错误");
        }
    }
}
