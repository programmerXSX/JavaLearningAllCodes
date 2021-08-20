package 异常处理.异常.自定义异常;

public class customException extends Exception{
    public customException() {}

    public customException(String message) {
        super(message);
    }
}
