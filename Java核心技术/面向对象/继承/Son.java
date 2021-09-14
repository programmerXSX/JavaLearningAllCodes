package 面向对象.继承;

public class Son extends Father {
    int height = 190;

    public void method() {
        System.out.println("子类method方法调用");
    }

    public void print() {
        System.out.println("身高： " + height);
    }

    int money = 2000;
    public void visit() {
        int money = 3000;
        System.out.println("money = " + money);//3000
        System.out.println("money = " + this.money);//2000
        System.out.println("money = " + super.money);//1000
    }
    @Override
    public void show(){
        super.show();
        System.out.println("子类也调用");
    }
}
