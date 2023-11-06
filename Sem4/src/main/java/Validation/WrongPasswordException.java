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
        boolean badLength = passLength <= 20;
        return String.format("Your password is of %s correct length %s %d. Password %s match the confirmation.",
                ((badLength) ? "in" : ""),
                ((badLength) ? ", expected > 20, given" : ","),
                passLength,
                (matchConfirm) ? "" : "doesn't ");
    }

}
