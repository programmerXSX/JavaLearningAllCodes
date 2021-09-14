package 函数式接口.初识函数式接口;

public class MyInterfaceDemo {
	public static void main(String[] args) {
		//函数式接口作局部变量时，可以把Lambda表达式赋值给它
		MyInterface mi = ()-> System.out.println("函数式接口");
		mi.show();
	}
}
