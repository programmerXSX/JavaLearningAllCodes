package Stream流.Stream流练习;

public class Actor {
	String name;
	
	public Actor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Actor{" +
			"name='" + name + '\'' +
			'}';
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
}
