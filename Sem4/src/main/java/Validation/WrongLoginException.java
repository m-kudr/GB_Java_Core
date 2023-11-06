package Validation;

public class WrongLoginException extends RuntimeException {
    private int logLength;

    public WrongLoginException(int logLength) {
        super();
        this.logLength = logLength;
    }

    @Override
    public String getMessage() {
        return String.format("Неверная длина пароля, ожидается < 20, получено %d.", logLength);
    }
}
