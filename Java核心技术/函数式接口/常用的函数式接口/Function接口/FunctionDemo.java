package 函数式接口.常用的函数式接口.Function接口;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		conver("56515",s -> Integer.valueOf(s));
		
		conver0("5545",s -> Integer.valueOf(s),integer -> String.valueOf(integer + 666));
		
	}
	//Function<T,R>，传入T类型，返回R类型
	public static void conver(String s, Function<String, Integer> function){
		int i = function.apply(s);
		System.out.println(i);
	}
	//先执行，then执行
	public static void conver0(String s,Function<String, Integer> function1,Function<Integer,String> function2){
		System.out.println(function1.andThen(function2).apply(s));
	}
}
