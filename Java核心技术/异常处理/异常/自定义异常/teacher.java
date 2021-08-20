package 异常处理.异常.自定义异常;

public class teacher {
    public void checkScore(int score) throws customException {
        if(score<0|| score>100){
            throw new customException("分数不对劲，0-100之间");//可传参数，输出表达内容
        //throw将错误对象抛入异常类
        }else{
            System.out.println("老铁没毛病");
        }
    }
}