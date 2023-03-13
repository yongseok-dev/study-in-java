package basic_datastructure;

import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] a = makeArray(10);
        int[] b = makeArray(10);
        System.out.println("원본 a");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("copy(a,b)");
        copy(a,b);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("rcopy(a,b)");
        rcopy(a,b);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

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

    static void copy(int[] a, int[] b){
        //b배열의 모든요소를 배열a에 복사하는 메서드
        if(b.length<=a.length){
            for (int i = 0; i < b.length; i++) {
                a[i]=b[i];
            }
        }else{
            System.out.println("배열 a의 크기가 배열 b의 크기보다 큽니다.");
        }
    }

    static void rcopy(int[] a, int[] b){
        //b배열의 모든요소를 배열 a에 역순으로 복사하는 메서드
        if(b.length<=a.length){
            for (int i = 0; i < b.length; i++) {
                a[i]=b[b.length-i-1];
            }
        }else{
            System.out.println("배열 a의 크기가 배열 b의 크기보다 큽니다.");
        }
    }
}
