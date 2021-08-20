package 案例实践.案例实践_运动员和教练;

public class TableTennisPlayer extends Players implements EnglishStudy{
    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void EnglishSpeak() {
        System.out.println("偷懒，没有学会");
    }
}
