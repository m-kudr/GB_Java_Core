package MyScanner;

import java.io.IOException;
import java.util.Scanner;

public class Read {

    public static String data() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //scanner.close();
        return (text);
    }
}
