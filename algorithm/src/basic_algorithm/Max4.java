package basic_algorithm;

import java.util.Scanner;

public class Max4 {
    public static void main(String[] args) {
//        test();
        Scanner sn = new Scanner(System.in);
        System.out.println("정수를 4개 입력해 주세요.");
        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = sn.nextInt();
        int d = sn.nextInt();
        int max = max4(a, b, c, d);
        System.out.println("입력한 정수의 최댓값은 " + max + "입니다.");
    }

    static int max4(int a, int b, int c, int d) {
        if (b > a) a = b;
        if (c > a) a = c;
        if (d > a) a = d;
        return a;
    }

    static void test() {
        //test_code
        System.out.println(max4(1, 2, 3, 4));
        System.out.println(max4(2, 3, 4, 1));
        System.out.println(max4(3, 4, 1, 2));
        System.out.println(max4(4, 3, 2, 1));
    }
}
