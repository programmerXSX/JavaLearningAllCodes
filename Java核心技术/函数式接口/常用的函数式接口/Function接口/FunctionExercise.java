package 函数式接口.常用的函数式接口.Function接口;

import java.util.function.Function;

public class FunctionExercise {
	public static String s = "夏顺鑫,18";
	public static void main(String[] args) {
		operator(s1 -> Integer.valueOf(s.split(",")[1]),integer -> integer+70);
	}
	public static void operator(Function<String,Integer> function1,Function<Integer,Integer> function2){
		System.out.println(function1.andThen(function2).apply(s));
	}
}
