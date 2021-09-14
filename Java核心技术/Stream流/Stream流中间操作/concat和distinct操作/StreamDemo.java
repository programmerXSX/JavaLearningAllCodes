package Stream流.Stream流中间操作.concat和distinct操作;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
concat(Stream a,Stream b):合并a和b两个流成为一个流
distinct():返回该流的不同元素（根据Object.equals(Object))组成的流
 */
public class StreamDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aaaa");
		list.add("bdff");
		list.add("sddefc");
		list.add("jmom,fs");
		list.add("kuo");
		
		//取前四个数据组成一个流
		Stream<String> stream1 = list.stream().limit(4);
		//取后三个组成一个流
		Stream<String> stream2 = list.stream().skip(2);
		//合并一和二
//		Stream<String> stream3 = Stream.concat(stream1, stream2);
//		stream3.forEach(System.out::println);
//		stream3.close();
		//消去重复字符串
		System.out.println("--------------------------");
		Stream.concat(stream1, stream2).distinct().forEach(System.out::println);
		
	}
}
