import MySaver.Save;
import MyScanner.Read;
import MyDate.DateTime;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Программа для внесения заметок в файл");
        String file = "Notes.txt";
        String inputString = "";
        do {
            System.out.print("Введите заметку: ");
            inputString = Read.data();
            String dateString = DateTime.GetDateTime();
            if (!inputString.equals("")) {
                Save.ToFile(file, dateString + " -> " + inputString);
            }
        }
        while (!inputString.equals(""));
        System.out.println("Завершение программы.");
    }
}