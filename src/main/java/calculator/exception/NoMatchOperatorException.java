package calculator.exception;

public class NoMatchOperatorException extends RuntimeException {
    public NoMatchOperatorException() {
        super("연산자를 찾을수 없습니다.");
    }
}
