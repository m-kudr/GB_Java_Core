package Package1;

public class Task3 {
    public static boolean twoZero(int[] numbers) {
        if (numbers.length > 1) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] == 0 && numbers[i + 1] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}