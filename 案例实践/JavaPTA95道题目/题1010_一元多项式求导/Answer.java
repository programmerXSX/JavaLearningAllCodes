package JavaPTA95道题目.题1010_一元多项式求导;

import java.util.Scanner;

public class Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int[] number = new int[str.length];
		for (int i = 0;i< str.length;i++){
			number[i] = Integer.valueOf(str[i]);
		}
		int i = 0;
		while (i<str.length){
			number[i] = number[i]*number[i+1];
			number[i+1]--;
			i+=2;
		}
		for (Integer integer:number){
			System.out.print(integer + " ");
		}
	}
}
