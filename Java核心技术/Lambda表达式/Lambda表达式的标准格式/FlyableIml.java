package Lambda表达式.Lambda表达式的标准格式;

public class FlyableIml implements Flyable{
    private String s;

    public FlyableIml(String s) {
        this.s = s;
    }

    @Override
    public void fly(String s) {
        System.out.println(s + "会飞");
    }
}
