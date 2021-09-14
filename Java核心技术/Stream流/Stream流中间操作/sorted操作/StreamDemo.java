package Stream流.Stream流中间操作.sorted操作;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
sorted():返回由此流的元素组成的流，根据自然顺序排序
sorted(Comparator comparator):返回由此流的元素组成的流，根据提供的比较器排序
 */
public class StreamDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("bdff");
		list.add("sddefc");
		list.add("aaaa");
		list.add("jmom,fs");
		list.add("kuo");
//		//按照字母顺序
//		list.stream().sorted().forEach(System.out::println);
		//按照长度
		list.stream().sorted(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length() == 0?o1.compareTo(o2):o1.length() - o2.length();
			}
		}).forEach(System.out::println);
		
	}
}
