package Package1;

public class Task2 {
    public static int deltaMinMax(int[] numbers) {
        int min = numbers[0];
        int max = min;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }
}
