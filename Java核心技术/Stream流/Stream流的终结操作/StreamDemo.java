package Stream流.Stream流的终结操作;

import java.util.ArrayList;
import java.util.List;
/*
forEach(Consumer action):对此流的每个元素执行操作

long count()：返回此流中的元素数

 */
public class StreamDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("李信");
		list.add("纳尼");
		list.add("我昨天");
		list.add("无奈此单");
		
		//输出
		list.stream().forEach(System.out::println);
		//统计两字元素的数量
		long count = list.stream().filter(s -> s.length() <= 2).count();
		System.out.println(count);
	}
}
