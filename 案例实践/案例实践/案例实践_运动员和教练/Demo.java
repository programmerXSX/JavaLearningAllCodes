package 案例实践.案例实践_运动员和教练;

public class Demo {
    public static void main(String[] args) {
        TableTennisCoach tc = new TableTennisCoach("xoamx",12);
        TableTennisPlayer tp = new TableTennisPlayer();
        BasketballCoach bc = new  BasketballCoach();
        BasketballPlayer bp = new BasketballPlayer();
        tp.EnglishSpeak();
        tc.EnglishSpeak();

    }
}
