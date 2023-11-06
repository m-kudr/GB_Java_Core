package Validation;

public class Check {

    public static boolean checkCredentials(String login, String password1, String password2) {
        boolean conf = password1.equals(password2);
        int logLen = login.length();
        int passLen = password1.length();
        if (logLen >= 20)
            throw new WrongLoginException(logLen);
        else if (passLen < 20 || !conf)
            throw new WrongPasswordException(passLen, conf);
        else
            return true;
    }
}
