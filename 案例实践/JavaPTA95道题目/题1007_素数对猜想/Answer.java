package JavaPTA95道题目.题1007_素数对猜想;

import java.util.Scanner;

/*
见图img.png
 */
public class Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int answerNuber = 0;
		for(int i = 2;i<number-2;i++){
			if (primeNumber(i)&&primeNumber(i+2)){
				answerNuber++;
			}
		}
		System.out.println(answerNuber);
	}
	
	int answerNumber = 0;
	
	public static boolean primeNumber(int number) {
		boolean answer = true;
		for (int i = 2; i < number; i++) {
			double dl = number / (i * 1.0000);
			int in = (int) dl;
			if (in == dl) {
				answer = false;
			}
		}
		return answer;
	}
}
