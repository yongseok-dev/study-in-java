package basic_algorithm;

import java.util.Scanner;

public class Min3 {
    public static void main(String[] args) {
//        test();
        Scanner sn = new Scanner(System.in);
        System.out.println("정수를 3개 입력해 주세요.");
        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = sn.nextInt();
        int min = min3(a,b,c);
        System.out.println("입력한 정수의 최솟값은 "+min+"입니다.");
    }
    static int min3(int a, int b, int c){
        return a>b?b<c?b:c:a<c?a:c;
    }
    static void test(){
        System.out.println(min3(1,2,3));
        System.out.println(min3(2,1,4));
        System.out.println(min3(3,4,1));
        System.out.println(min3(4,1,2));
    }
}
