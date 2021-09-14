package Stream流.Stream流的生成方式;

import java.util.*;
import java.util.stream.Stream;

/*
Stream流的常见生成方式：
	1、Collection体系的集合可以使用默认方法stream（）生成流
		default Stream<E> stream()
	2、Map体系的集合间接的生成流
	3、数组可以通过Stream接口的静态方法of（T。。。values）生成流
 */
public class StreamDemo {
	public static void main(String[] args) {
		//Collection体系的集合可以使用默认方法stream（）生成流
		//		default Stream<E> stream()
		List<String> list = new ArrayList<>();
		Stream<String> listStream = list.stream();
		
		Set<String> set = new HashSet<>();
		Stream<String> setStream = set.stream();
		
		//Map体系的集合间接的生成流
		Map<Integer,String> map = new HashMap<>();
		Stream<Integer> keyStream = map.keySet().stream();
		Stream<String> valueStream = map.values().stream();
		Stream<Map.Entry<Integer, String>> entryStream = map.entrySet().stream();
		
		//数组可以通过Stream接口的静态方法of（T。。。values）生成流
		String[] strings = {"hell","jin","xsx"};
		Stream<String> stringStream = Stream.of(strings);
		Stream<String> stringStream1 = Stream.of("ss", "vsdvdfvd", "cas");
		
	}
}
