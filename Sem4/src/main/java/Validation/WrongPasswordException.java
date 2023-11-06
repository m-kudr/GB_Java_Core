package Validation;

public class WrongPasswordException extends RuntimeException {
    private int passLength;
    private boolean matchConfirm;

    public WrongPasswordException(int passLength, boolean matchConfirm) {
        super();
        this.passLength = passLength;
        this.matchConfirm = matchConfirm;
    }

    @Override
    public String getMessage() {
        boolean wrongLength = passLength <= 20;
        return String.format("Пароль %sверной длины%s %d. Пароли %sсовпадают.",
                ((wrongLength) ? "не" : ""),
                ((wrongLength) ? ", ожидается > 20, получен" : ","),
                passLength,
                (matchConfirm) ? "" : "не ");
    }

}
