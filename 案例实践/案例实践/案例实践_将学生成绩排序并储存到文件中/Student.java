package 案例实践.案例实践_将学生成绩排序并储存到文件中;

public class Student {
    private String name;
    private int ChineseScore;
    private int EnglishScore;
    private int MathScore;
    private int points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getChineseScore() {
        return ChineseScore;
    }

    public void setChineseScore(int chineseScore) {
        ChineseScore = chineseScore;
    }

    public int getEnglishScore() {
        return EnglishScore;
    }

    public void setEnglishScore(int englishScore) {
        EnglishScore = englishScore;
    }

    public int getMathScore() {
        return MathScore;
    }

    public void setMathScore(int mathScore) {
        MathScore = mathScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ChineseScore=" + ChineseScore +
                ", EnglishScore=" + EnglishScore +
                ", MathScore=" + MathScore +
                ", points=" + points +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (ChineseScore != student.ChineseScore) return false;
        if (EnglishScore != student.EnglishScore) return false;
        if (MathScore != student.MathScore) return false;
        if (points != student.points) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + ChineseScore;
        result = 31 * result + EnglishScore;
        result = 31 * result + MathScore;
        result = 31 * result + points;
        return result;
    }
}
