package JavaPTA95道题目.题1008_数组元素循环右移;

import java.util.Scanner;

public class Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int moveLength = sc.nextInt();
		int[] numbers = new int[length];
		//给数组赋初值
		for (int i = 0;i<length;i++){
			numbers[i] = i+1;
		}
		int target = moveLength - 1,number  = 0;
		int[] tempNumber = new int[moveLength];
		//先将moveLength长度的数组保存起来
		for (int i = 0;i<moveLength;i++){
			tempNumber[i] = numbers[i];
		}
		//将其余数据移动到对应位置
		while (number++<length - moveLength){
			numbers[target] = numbers[nextTarget(target,length,moveLength)];
			target = nextTarget(target,length,1);
		}
		//再把tempNumber数组赋值给空缺位置
		for (int i = 0;i<moveLength;i++){
			numbers[i+moveLength] = tempNumber[i];
		}
		//输出
		for (int i = 0;i<length;i++){
			System.out.print(numbers[i] + " ");
		}
		sc.close();
		
	}
	//在循环中返回下一个数字
	public static int nextTarget(int number,int length,int moveLength){
		if((number - moveLength)>-1){
			return number-moveLength;
		} else {
			return number-moveLength+length;
		}
	}
}
