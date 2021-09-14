package JavaPTA95道题目.题1011_A加B和C;

import java.util.Scanner;

public class Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		System.out.println(ifNumber(A,B,C));
	}
	
	public static boolean ifNumber(int number1, int number2, int numner3) {
		if (number1 + number2 > numner3) {
			return true;
		} else {
			return false;
		}
	}
}
