package basic_algorithm;

import java.util.Scanner;

public class GaussSum {
    public static void main(String[] args) {
        System.out.println("1~n까지 합을 구합니다.");
        Scanner sn = new Scanner(System.in);
//        int n = 7;
        int n = sn.nextInt();
        int sum = (1+n)*n/2;
        System.out.println("1~n까지의 합: " + sum);
        System.out.println();
    }
}
