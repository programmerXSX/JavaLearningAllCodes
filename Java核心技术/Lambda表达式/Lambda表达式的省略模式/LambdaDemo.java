package Lambda表达式.Lambda表达式的省略模式;

public class LambdaDemo {
        public static void main(String[] args) {
                //参数类型可以省略
                useaddable( (x,y) -> {
                        return x+ y;
                });

                //如果只有一个参数，小括号可以省略
                useflyable(s -> {
                        System.out.println(s + "会飞");
                });

                //如果代码块的语句只有一条，可以省略大括号和分号
                //如果有return，return也要省略
                useflyable(s -> System.out.println(s + "会飞"));
                useaddable((x,y)->x+ y);

        }

        public static void useaddable(addable a){
                int sum = a.add(12,78);
                System.out.println("12 + 78 = " + sum);
        }

        public static void useflyable(flyable f){
                f.fly("啦啦啦啦啦");
        }
}
