// ������� 25 � 2927
// ������� �� ������� ����� ��� �� ����� �� ������ ���������������� ��������
// �������� ����� ���� ������������� ��������� ��������� �������������� �������
// �������� 30 ���������. ���� ������������� ��������� ���, �������� �� ����.

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
            System.out.println("� ������ ������� ���� ������������� �����");
            return;
        }
        System.out.println(s);
    }
}