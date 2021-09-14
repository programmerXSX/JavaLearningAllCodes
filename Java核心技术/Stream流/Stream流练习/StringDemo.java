package Stream流.Stream流练习;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StringDemo {
	public static void main(String[] args) {
		ArrayList<Actor> arrayListMan = new ArrayList<>();
		arrayListMan.add(new Actor("李信"));
		arrayListMan.add(new Actor("李白"));
		arrayListMan.add(new Actor("李元芳"));
		arrayListMan.add(new Actor("哪吒"));
		arrayListMan.add(new Actor("白起"));
		arrayListMan.add(new Actor("狄仁杰"));
		ArrayList<Actor> arrayListWoman = new ArrayList<>();
		arrayListWoman.add(new Actor("阿离"));
		arrayListWoman.add(new Actor("王昭君"));
		arrayListWoman.add(new Actor("云嘤"));
		arrayListWoman.add(new Actor("孙膑"));
		arrayListWoman.add(new Actor("武则天"));
		arrayListWoman.add(new Actor("杨玉环"));
		
		//挑选男的，名字俩字的后三个
		Stream<Actor> manActorStream = arrayListMan.stream().filter((Actor actor) -> actor.name.length() == 2).skip(1);
		//挑选女的，只要好看的，不要吃个桃桃
		Stream<Actor> womanActorStream = arrayListWoman.stream().filter((Actor actor) -> actor.name.length() > 2).skip(1);
		
		//合并
		Stream<Actor> concat = Stream.concat(manActorStream, womanActorStream);
		//输出
		concat.forEach(System.out::println);
	}
}
