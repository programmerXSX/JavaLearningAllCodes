package 面向对象.抽象类名作形参和返回值;

public class CatDemo {
    public static void main(String[] args) {
        Cat a = new Cat(12,"jiligala");
        CatOpearator b = new CatOpearator();
        b.operator(a);
        b.test(a);
        System.out.println(a.ifNo);

        Anmial c = new Cat();
        c.eat();

        AnimalOperator d = new AnimalOperator();
        d.show(c);
    }
}
