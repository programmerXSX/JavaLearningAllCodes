package 函数式接口.函数式接口作为方法返回值;

import java.util.*;

public class ComparatorDemo {
	public static void main(String[] args) {
		/*
如果方法的返回值是一个函数式接口，我们可以使用Lambda表达式作为返回结果
		 */
		
		List<String> array = new ArrayList<>();
		array.add("jnosdc");
		array.add("sdsd");
		array.add("sdd");
		array.add("gfjsicbiuabhdc");
		System.out.println("排序前：" + array);
		Collections.sort(array);
		System.out.println("集合排序后：" + array);
		Collections.sort(array,getComparator());
		System.out.println("比较器排序后："+array);
		
	}
	//Comparator是Set集合比较器
	public static Comparator<String> getComparator(){
	
//		Comparator<String> comparator = new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.length() - s2.length();
//			}
//		};
//		return comparator;
		
//		//直接返回
//		return new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.length() - s2.length();
//			}
//		};

//		//Lambda表达式
//		return (s1,s2)->{
//			return s1.length() - s2.length();
//		};
		
		//Lambda表达式省略模式
		return (s1,s2) -> s1.length() - s2.length();
	}
}
