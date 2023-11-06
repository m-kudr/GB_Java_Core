package Task1;

import static Task1.Check.checkCredentials;

public class Main {
    public static void main(String[] args) {
        String[][] credentials = {
                {"pavel", "123456789012345678901", "123456789012345678901"},// все верно
                {"123456789012345678901", "", ""},                          // неверная длина логина
                {"pavel", "123456789012345678901", "123456789"},            // пароли не совпадают
                {"pavel", "123456789", "123456789"},                        // неверная длина пароля
                {"pavel", "123456789", "12"}            // неверная длина пароля и они не совпадают
        };
        for (int i = 0; i < credentials.length; i++) {
            System.out.print((i + 1) + ") ");
            try {
                System.out.println(checkCredentials(credentials[i][0], credentials[i][1],
                        credentials[i][2]));
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
