package basic_algorithm;

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        test();
        Scanner sn = new Scanner(System.in);
        System.out.println("정수를 3개 입력해 주세요.");
        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = sn.nextInt();
        int med = median(a, b, c);
        System.out.println("입력한 정수의 중앙값은 " + med + "입니다.");
    }

    static int median(int a, int b, int c) {
        int med = a;
        if ((a <= b && b <= c) || (c <= b && b <= a)) {
            med = b;
        } else if ((b <= c && c <= a) || (a <= c && c <= b)) {
            med = c;
        }
        return med;
    }

    static void test() {
        System.out.println("1." + median(1, 2, 3));//1
        System.out.println("2." + median(1, 3, 2));//2
        System.out.println("3." + median(2, 1, 3));//3
        System.out.println("4." + median(2, 3, 1));//4
        System.out.println("5." + median(3, 1, 2));//5
        System.out.println("6." + median(3, 2, 1));//6
        System.out.println("7." + median(2, 2, 1));//7
        System.out.println("8." + median(2, 1, 2));//8
        System.out.println("9." + median(1, 2, 2));//9
        System.out.println("10." + median(3, 2, 2));//10
        System.out.println("11." + median(2, 3, 2));//11
        System.out.println("12." + median(2, 2, 3));//12
        System.out.println("13." + median(2, 2, 2));//13
    }
}
