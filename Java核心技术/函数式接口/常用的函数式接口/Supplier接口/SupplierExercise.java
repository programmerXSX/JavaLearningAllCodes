package 函数式接口.常用的函数式接口.Supplier接口;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExercise {
	public static void main(String[] args) {
		int[] number = {1,90 ,768,3,4345,554,2,4};
		int Max = getMax(()->{
			int max = number[0];
			for (int i = 0; i < number.length; i++){
				if (max<number[i]){
					max = number[i];
				}
			}
			return max;
		});
		System.out.println(Max);
	}
	public static int getMax(Supplier<Integer> supplier){
		return supplier.get();
	}
}
