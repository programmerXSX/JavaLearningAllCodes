package 面向对象.抽象类名作形参和返回值;

public class CatOpearator {
    public void operator(Cat c){
        System.out.println(c.getName());
        System.out.println(c.getNum());
    }
    public void test(Cat g){
        g.ifNo = 20;
    }
}
