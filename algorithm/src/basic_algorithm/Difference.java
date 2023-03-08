package basic_algorithm;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a, b;

        System.out.print("a의 값: ");
        a = sn.nextInt();
        System.out.print("b의 값: ");
        b = sn.nextInt();
        while (b <= a) {
            System.out.println("a보다 큰 값을 입력하세요!");
            System.out.print("b의 값: ");
            b = sn.nextInt();
        }

        System.out.println("b-a는 " + (b - a) + "입니다.");
    }
}
