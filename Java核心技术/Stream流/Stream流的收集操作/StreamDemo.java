package Stream流.Stream流的收集操作;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		//List集合
		List<String > list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add("天青牛虻");
		list1.add("泰坦巨猿");
		list1.add("人面魔蛛");
		list1.add("蓝银皇");
		list2.add(100000);
		list2.add(100000);
		list2.add(10000);
		list2.add(25000);
		
		//四字
		Stream<String> list1Stream = list1.stream().filter(s -> s.length() == 4);
		//收集到list集合并遍历
		List<String> collect1 = list1Stream.collect(Collectors.toList());
		for (String s:collect1){
			System.out.println(s);
		}
		
		//Set集合
		Set<Integer> set = new HashSet<>();
		set.add(12);
		set.add(23);
		set.add(34);
		set.add(45);
		set.add(56);
		
		Stream<Integer> integerStream = set.stream().filter(integer -> integer > 29);
		Set<Integer> set1 = integerStream.collect(Collectors.toSet());
		for (Integer integer:set1){
			System.out.println(integer);
		}
		//Map集合
		String[] strings = {"关羽，0","马超，1","亚瑟，2","猪八戒，3","李信，4"};
		Map<Integer, String> map = Stream.of(strings).collect(Collectors.toMap((s ->Integer.valueOf( s.split("，")[1])),s -> s.split("，")[0]));
		Set<Integer> keySet = map.keySet();
		for (Integer integer:keySet){
			System.out.println(integer +" = "+ map.get(integer));
		}
		
	}
}
