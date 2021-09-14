package JavaPTA95道题目.题1004_成绩排名;

import java.util.Scanner;

/*
读入 n（>0）名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。

第 1 行：正整数 n
第 2 行：第 1 个学生的姓名 学号 成绩
第 3 行：第 2 个学生的姓名 学号 成绩
  ... ... ...
第 n+1 行：第 n 个学生的姓名 学号 成绩

其中姓名和学号均为不超过 10 个字符的字符串，成绩为 0 到 100 之间的一个整数，
这里保证在一组测试用例中没有两个学生的成绩是相同的。

对每个测试用例输出 2 行，
第 1 行是成绩最高学生的姓名和学号，
第 2 行是成绩最低学生的姓名和学号，字符串间有 1 空格。
 */
public class answer {
	public static void main(String[] args) {
		System.out.print("n：");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		Student[] students = new Student[n];
		students[0] = new Student();
		int i = 0;

		//接收信息
		System.out.println("请依次输入学生的姓名、学号、成绩：");
		while (!sc.hasNext("#")){
			students[i].name = sc.next();
			students[i].number = sc.next();
			students[i].score = sc.nextInt();
			if(i < n - 1) {
				students[i++ + 1] = new Student();
			}
		}
		//找最高最低分
		int max = 0,min = 100,maxNumber = 0,minNumber = 0;
		for (i = 0;i<n;i++){
			if(max != Math.max(max,students[i].score)){
				max = Math.max(max,students[i].score);
				maxNumber = i;
			}
			if(min != Math.min(min,students[i].score)){
				min = Math.min(min,students[i].score);
				minNumber = i;
			}
		}
		System.out.println("最高分是："+ students[maxNumber].score
			+ ",姓名："+students[maxNumber].name +", 学号："+students[maxNumber].number);
		System.out.println("最低分是："+ students[minNumber].score
			+ ",姓名："+students[minNumber].name +", 学号："+students[minNumber].number);
		
	}
}
