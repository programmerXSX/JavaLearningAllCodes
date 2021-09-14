package 函数式接口.常用的函数式接口.Consumer接口;

import java.util.function.Consumer;

/*
Consumer<T>:包含两个方法
	void accept(T t): 对给定的参数执行此操作
	defaultConsumer<T t> andThen(Consumer after):返回一个组成的Consumer，依次执行此操作，然后执行after操作
	
	
 */
public class ConsumerDemo {
	public static void main(String[] args) {
		//Lambda表达式
		operatorString("husb",(s -> System.out.println(s)));
		//方法引用
		operatorString("dushd",System.out::println);
		
		//反转语句
		operatorString("上海自来水来自海上",(s)->{
			System.out.println(new StringBuilder(s).reverse().toString());
		});
		
		//用不同的方式消费同一个字符串数据
		operatorStr("就是这个字符串",s -> System.out.println(s),s -> System.out.println(new StringBuilder(s).reverse().toString()));
		
	}
	public static void operatorStr(String name,Consumer<String> consumer1,Consumer<String> consumer2){
//		consumer1.accept(name);
//		consumer2.accept(name);
		//通过andThen方法改进，如下
		consumer1.andThen(consumer2).accept(name);
	}
	public static void operatorString (String name, Consumer<String > consumer){
		consumer.accept(name);
	}
}
