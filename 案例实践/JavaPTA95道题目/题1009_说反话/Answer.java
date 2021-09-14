package JavaPTA95道题目.题1009_说反话;

import java.util.Scanner;

/*
给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出
 */
public class Answer {
	public static void main(String[] args) {
		//..............cao..
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		s = sb.toString();
		System.out.println(s);
	}
}
