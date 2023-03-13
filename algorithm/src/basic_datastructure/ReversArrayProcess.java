package basic_datastructure;

import java.util.Scanner;

public class ReversArrayProcess {
    public static void main(String[] args) {

        //배열 요소에 값을 읽어 들여 역순으로 정렬합니다.

        //값 받기
        int[] arr = makeArray(10);
        System.out.println("원본");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        //역순으로 정렬하기
        int[] result = reverse(arr);
        System.out.println("정렬");
        for (int i : result) {
            System.out.print(i + " ");
        }
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

    private static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.printf("arr[%d]와 arr[%d]를 스왑합니다.%n", i, arr.length - i - 1);
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return result;
    }
}
