package basic_datastructure;

import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {
        int[] arr = makeArray(10);
        System.out.println("원본");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("배열의 합 : " + sumOf(arr));

    }

    private static int[] makeArray(int count) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
//            System.out.println(i + "번 인수를 입력> ");
//            arr[i] = sc.nextInt();
            arr[i] = (int) (Math.random() * 20);
        }
        return arr;
    }

    static int sumOf(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }
}
