package Stream流.Stream流中间操作.map和mapToInt;

import java.util.ArrayList;
import java.util.List;

/*
<R> Stream <R> map(Function mapper):返回由给定函数应用于此流的元素的结果组成的流
	Function接口中的方法		R apply（T　ｔ）
IntStream mapToInt(ToIntFunction mapper):返回一个IntStream其中包含将给定函数应用于此流的元素结果
	IntStream:表示原始int流
	ToFunction接口中的方法			int applyAsInt(T value)

 */
public class StreamDemo {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("李白");
		list.add("李信");
		list.add("刮痧");
		list.add("刮骨");
		
		list.stream().map(s -> "王者"+ s).forEach(System.out::println);
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("122");
		list1.add("466");
		list1.add("796");
		list1.add("855");
		
		//int sum:返回元素总和
		int sum = list1.stream().mapToInt(Integer::parseInt).sum();
		System.out.println(sum);
		
		
		
		
	}
}
