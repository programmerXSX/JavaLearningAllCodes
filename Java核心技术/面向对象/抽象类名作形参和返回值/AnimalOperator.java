package 面向对象.抽象类名作形参和返回值;

public class AnimalOperator {
    public void show(Anmial a){
        a.eat();
    }
    public Anmial test( ){
        Anmial b = new Cat();
        return b;
    }
}
