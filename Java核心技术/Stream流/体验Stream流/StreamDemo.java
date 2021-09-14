package Stream流.体验Stream流;

import java.util.ArrayList;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("夏敏");
		arrayList.add("夏浩然");
		arrayList.add("老安");
		arrayList.add("猪头敏娃");
		//以夏开头的储存在新的集合
		ArrayList<String> newArray = new ArrayList<>();
		for(String s:arrayList){
			if (s.startsWith("夏")){
				newArray.add(s);
			}
		}
		System.out.println(newArray);
		//
		ArrayList<String> shortArray  = new ArrayList<>();
		for (String s: newArray){
			if(s.length() == 2){
				shortArray.add(s);
			}
		}
		System.out.println(shortArray);
		
		
		//使用Stream流改进
		arrayList.stream().filter((s)->s.startsWith("夏")).filter(s -> s.length() == 2).forEach(s -> System.out.println(s));
		//filter,过滤器		forEach,为每一个
		
		
	}
}
