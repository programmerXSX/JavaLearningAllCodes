package 标准类的制作;

public class PersonTest {
    public static void main(String[] args) {
        Person xm = new Person("夏敏", 10,"河南省永城市卧" +
                "龙乡夏竹园", "4114812056163", "1866662612686" );
        xm.setName("夏浩然");
        System.out.println("姓名：" +xm.getName());
        xm.show();
    }
}
