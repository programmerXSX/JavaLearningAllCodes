package JavaPTA95道题目.题1013_数素数;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(),N = sc.nextInt();
		Set<Integer> AllPrimeNumber = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		for (int i = 2;i<=10000;i++){
			if(primeNumber(i)){
				AllPrimeNumber.add(i);
			}
		}
		int[] primeNumber = new int[AllPrimeNumber.size()];
		int subscript = 0;
		for (Integer integer:AllPrimeNumber){
			primeNumber[subscript++] = integer;
		}
		for (int i = M - 1;i<N;i++){
			System.out.print(primeNumber[i] +" ");
		}
	}
	//判断是否素数
	public static boolean primeNumber(int number){
		boolean answer = true;
		for (int i = 2;i<number;i++){
			double d = number/(double)i;
			if((int) d == d){
				answer = false;
			}
		}
		return answer;
	}
}
