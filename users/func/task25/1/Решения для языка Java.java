// Задание 25 № 2927
// Опишите на русском языке или на одном из языков программирования алгоритм
// подсчета суммы всех отрицательных элементов заданного целочисленного массива
// размером 30 элементов. Если отрицательных элементов нет, сообщите об этом.

import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        final int N = 30;
        int s = 0;
        int[] a = new int[N];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= N - 1; i++) {
            a[i] = scanner.nextInt();
            if (a[i] < 0) {
                s += a[i];
            }
        }
        if (s == 0) {
            System.out.println("В данном массиве нету отрицательных чисел");
            return;
        }
        System.out.println(s);
    }
}