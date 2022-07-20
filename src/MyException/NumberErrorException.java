package MyException;

public class NumberErrorException extends Exception {
    public NumberErrorException(String ErrorMessage) {
        super("输入数值有误 -> " + ErrorMessage);
    }
}
