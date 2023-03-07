package basic_algorithm;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        System.out.println("1~n까지 합을 구합니다.");
        Scanner sn = new Scanner(System.in);
//        int n = 7;
        int n = sn.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + (n == i ? "" : " + "));
            sum += i;
        }
        System.out.print(" = " + sum);
        System.out.println();
    }

}
