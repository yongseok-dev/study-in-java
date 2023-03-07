package basic_algorithm;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int number;
        do {
            System.out.println("사각형을 출력합니다.\n단수: ");
            number = sn.nextInt();
        } while (number <= 0);
        triangleRB(number);
        triangleLB(number);
        triangleRU(number);
        triangleLU(number);

    }

    static void square(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("*".repeat(number));
        }
    }

    static void triangleLB(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("*".repeat(i + 1));
        }
    }
    static void triangleLU(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("*".repeat(number-i));
        }
    }
    static void triangleRB(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(" ".repeat(number-i)+"*".repeat(i + 1));
        }
    }
    static void triangleRU(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(" ".repeat(i + 1)+"*".repeat(number-i));
        }
    }
}
