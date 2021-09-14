package Stream流.Stream流中间操作.limit和skip操作;

import java.util.ArrayList;
import java.util.List;

/*
limit(long maxsize):返回此流中的元素组成的流，截取前指定参数个数的数据
skip(long n):跳过指定参数个数的数据，返回由该流的剩余元素组成的流
 */
public class StreamDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("顶顶顶");
		list.add("jin");
		
		//取前三个数据在控制台输出
		list.stream().limit(3).forEach(System.out::println);
		System.out.println("--------------------");
		
		//跳过两个元素
		list.stream().skip(2).forEach(System.out::println);
		System.out.println("--------------------");
		
		//跳过一个元素，剩下的输出前两个
		list.stream().skip(1).limit(2).forEach(System.out::println);
	}
}
