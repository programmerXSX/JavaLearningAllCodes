package 案例实践.案例实践_运动员和教练;

public class TableTennisCoach extends Coaches implements EnglishStudy{
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void EnglishSpeak() {
        System.out.println("学会了，知道嘤语咋说了");
    }
}
