package JavaPTA95道题目.题1012_数字分类;

import java.util.Scanner;
//13 1 2 3 4 5 6 7 8 9  10 20 16 18
public class Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int[] number = new int[str.length];
		for(int i = 0;i<str.length;i++){
			number[i] = Integer.valueOf(str[i]);
		}
		int A1 = 0,A2 = 0,A3 = 0,A5 = 0;
		double A4 = 0;
		int A2point = 1, A4Number = 0;
		for(int i = 0; i<str.length;i++){
			if (number[i]%5 == 0&&number[i]%2 == 0){
				A1 +=number[i];
			}else if(number[i]%5 == 1){
				if (A2point%2 == 1){
					A2+=number[i];
					A2point++;
				}else {
					A2 -= number[i];
					A2point++;
				}
			}else if(number[i] % 5 == 2){
				A3++;
			}else if(i%5 == 3){
				A4Number++;
				A4 = (A4*(A4Number-1) + number[i])/(A4Number*1.0);
			}else if(i%5 == 4){
				if(A5<number[i]){
					A5 = number[i];
				}
			}
		}
		
		System.out.print(A1 + " ");
		System.out.print(A2 + " ");
		System.out.print(A3 + " ");
		System.out.print(String.format("%.1f",A4) + " ");
		System.out.print(A5 + " ");
	}
}
