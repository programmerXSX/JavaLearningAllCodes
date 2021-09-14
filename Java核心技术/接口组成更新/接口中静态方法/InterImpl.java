package 接口组成更新.接口中静态方法;

public class InterImpl implements Inter{

    @Override
    public void show() {
        System.out.println("InterImpl中show方法");
    }

    @Override
    public void method() {
        System.out.println("InterImpl中的默认方法");
    }
}
