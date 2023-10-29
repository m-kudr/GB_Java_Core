//1) Написать метод, возвращающий количество чётных элементов массива.
//   countEvens([2, 1, 2, 3, 4]) → 3
//   countEvens([2, 2, 0]) → 3
//   countEvens([1, 3, 5]) → 0
//2) Написать функцию, возвращающую разницу между самым большим
//   и самым маленьким элементами переданного не пустого массива.
//3) Написать функцию, возвращающую истину, если в переданном массиве
//   есть два соседних элемента, с нулевым значением.

import static Package1.Task1.countEvens;
import static Package1.Task2.deltaMinMax;
import static Package1.Task3.twoZero;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("countEvens([2, 1, 2, 3, 4]) → " + countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println("countEvens([2, 2, 0]) → " + countEvens(new int[]{2, 2, 0}));
        System.out.println("countEvens([1, 3, 5]) → " + countEvens(new int[]{1, 3, 5}));
        // Задание 2
        System.out.println("deltaMinMax([2, 0, 3, 9]) → " + deltaMinMax(new int[]{2, 0, 3, 9}));
        System.out.println("deltaMinMax([2, 10, 3, 1]) → " + deltaMinMax(new int[]{2, 10, 3, 1}));
        // Задание 3
        System.out.println("twoZero([1, 2, 0, 0]) → " + twoZero(new int[]{1, 2, 0, 0}));
        System.out.println("twoZero([1, 2, 0, 1]) → " + twoZero(new int[]{1, 2, 0, 1}));
        System.out.println("twoZero([0, 2, 0, 1]) → " + twoZero(new int[]{0, 2, 0, 1}));
    }
}