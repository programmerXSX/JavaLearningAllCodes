package 函数式接口.常用的函数式接口.Predicate接口;

import java.util.function.Predicate;

public class testDemo {
	public static void main(String[] args) {
		//test方法
		System.out.println(checkString("夏顺鑫聪明",s ->true));
		
		//negate方法,negate返回否定
		System.out.println(checkStr("金子婷聪明",s -> true));
	}
	public static boolean checkString(String s, Predicate<String> predicate){
		return predicate.test(s);
	}
	public static boolean checkStr(String s,Predicate<String> predicate){
		return predicate.negate().test(s);
	}
}
