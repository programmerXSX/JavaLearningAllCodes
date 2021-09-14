package 函数式接口.常用的函数式接口.Supplier接口;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		System.out.println(getString(()->{
			return "ujsefbf";
		}));
		System.out.println(getString(()->"scss"));
		
	}
	public static String getString(Supplier<String> supplier){
		return supplier.get();
	}
}
