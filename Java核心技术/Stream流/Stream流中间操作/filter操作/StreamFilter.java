package Stream流.Stream流中间操作.filter操作;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
	public static void main(String[] args) {
		//filter用于对流中的数据进行过滤
		//Predicate接口中的方法boolean test(T t)，对给定的参数进行判断，返回一个布尔值
		List<String> stringList = new ArrayList<>();
		
		stringList.add("啊啊啊");
		stringList.add("hhhou");
		stringList.add("youtube");
		stringList.add("藏阿三");
		stringList.add("lijznc");
		
		stringList.stream().filter(s -> !s.startsWith("l")).forEach(System.out::println);
		stringList.stream().filter(s -> s.length()<6).forEach(System.out::println);
		stringList.stream().filter(s -> s.length()>3).filter(s -> !s.startsWith("y")).forEach(System.out::println);
		
		
	}
}
