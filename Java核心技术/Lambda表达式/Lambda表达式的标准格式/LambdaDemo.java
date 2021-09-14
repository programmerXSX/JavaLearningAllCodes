package Lambda表达式.Lambda表达式的标准格式;

public class LambdaDemo {
	public static void main(String[] args) {
		Eatable e = new EatableIml();
		useEatabe(e);
		//Lambda表达式（无参）
		useEatabe(() -> {
			System.out.println("iu你对比uv你是可能从");
		});

		//-----------------------------------------------------------------------------

//        Flyable f = new FlyableIml("夏敏");
//        useFlyable(f);

		useFlyable(new Flyable() {
			@Override
			public void fly(String s) {
				System.out.println(s + "会飞");
			}
		});
		//Lambda表达式（带参无返回值）
		useFlyable((String s) -> {
			System.out.println(s);

		});


		//------------------------------------------------------------------------------
		//Lambda表达式带参有返回值
		useaddable( ( int x, int y) -> {
			return x + y;
		});

	}

	public static void useaddable(addable a) {
		int add = a.add(1, 5);
		System.out.println("x + y = " + add);
	}

	public static void useFlyable(Flyable f) {
		f.fly("夏敏");
	}

	public static void useEatabe(Eatable eatable) {
		eatable.eat();
	}
}
