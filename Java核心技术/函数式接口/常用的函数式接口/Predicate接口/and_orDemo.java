package 函数式接口.常用的函数式接口.Predicate接口;

import java.util.function.Predicate;

public class and_orDemo {
	public static void main(String[] args) {
		System.out.println(checkString1("xxx",s -> true,s -> false));
		System.out.println(checkString2("dsv",s -> true,s -> false));
	}
	//同一个字符串给出两个不同的判断条件，最后把这两个判断的结果做逻辑与运算的结果作为最终的结果
	public static boolean checkString1(String s, Predicate<String> predicate1,Predicate<String>predicate2 ){
		return predicate1.and(predicate2).test(s);
		//相当于&&
	}
	public static boolean checkString2(String s,Predicate<String> predicate1,Predicate<String> predicate2){
		return predicate1.or(predicate2).test(s);
		//相当于||
	}
}
