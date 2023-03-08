package basic_algorithm;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int number;
        do {
            System.out.println("피라미드를 출력합니다.\n단수: ");
            number = sn.nextInt();
        } while (number <= 0);
        star(number);
        num(number);
    }

    static void star(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(" ".repeat(number - i - 1) + "*".repeat(i * 2 + 1));
        }
    }

    static void num(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(" ".repeat(number - i) + ("" + i).repeat((i - 1) * 2 + 1));
        }
    }
}
