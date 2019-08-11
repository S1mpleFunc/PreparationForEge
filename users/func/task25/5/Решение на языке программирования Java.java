import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    /* https://inf-ege.sdamgia.ru/problem?id=16828 */

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final int[] a = new int[2018];
        int min = 15_001;

        for (int i = 0; i < a.length; i++) {
            final int currentInput = scanner.nextInt();

            a[i] = currentInput;
            min = currentInput % 3 == 0 && currentInput < min ? currentInput : min;
        }
        for (int i : a)
            System.out.println(i % 2 == 0 ? i - min : i);
    }
}