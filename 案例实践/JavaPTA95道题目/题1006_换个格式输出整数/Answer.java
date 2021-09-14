package JavaPTA95道题目.题1006_换个格式输出整数;

import java.util.Scanner;

/*
让我们用字母 B 来表示“百”、字母 S 表示“十”，用 12...n 来表示不为零的个位数字 n（<10），
换个格式来输出任一个不超过 3 位的正整数。例如 234 应该被输出为 BBSSS1234，
因为它有 2 个“百”、3 个“十”、以及个位的 4。

每个测试输入包含 1 个测试用例，给出正整数 n（<1000）。

每个测试用例的输出占一行，用规定的格式输出 n。
 */
public class Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int hundredNumber = (number/100)%10;
		int tenNumber = (number/10)%10;
		int digitNumber = (number)%10;
		for (int i = 0;i<hundredNumber;i++){
			System.out.print('B');
		}
		for (int i = 0;i < tenNumber;i++){
			System.out.print('S');
		}
		for (int i = 0;i<digitNumber;i++){
			System.out.print(i+1);
		}
		sc.close();
	}
}
