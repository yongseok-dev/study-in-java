package basic_algorithm;

import java.util.Scanner;

public class Difits {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a;
        int count = 0;

        do {
            System.out.print("양의정수: ");
            a = sn.nextInt();
        } while (a <= 0);

        while (a > 0) {
            a /= 10;
            count++;
        }

        System.out.printf("그 수는 %d자리 입니다", count);
    }
}
