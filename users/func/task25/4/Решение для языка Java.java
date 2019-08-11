import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    /* https://inf-ege.sdamgia.ru/problem?id=2923 */

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final String[] a = new String[30];
        for (int i = 0; i < a.length; i++)
            a[i] = scanner.nextLine();
        System.out.println(Stream.of(a)
                .map(Integer::valueOf)
                .filter(x -> x > 3)
                .mapToInt(x -> x)
                .average()
                .getAsDouble()
        );
    }
}