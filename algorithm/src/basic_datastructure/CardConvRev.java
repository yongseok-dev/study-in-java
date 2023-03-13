package basic_datastructure;

import java.util.Scanner;

public class CardConvRev {
    public static void main(String[] args) {
        //10진수를 기수변환 하는 프로그램
        Scanner sc = new Scanner(System.in);
        System.out.println("10진수를 기수 변환합니다.");
        boolean run = true;
        while (run) {
            System.out.println("변환하는 음이 아닌 정수 : ");
            int number = sc.nextInt();
            System.out.println("어떤 진수로 변환할까요?(2~36): ");
            int cd = sc.nextInt();
            String result = CardConvRev(number, cd);
            System.out.println(cd + "진수로는 " + result + "입니다.");
            System.out.println("한 번 더 할까요? 1.ㅇㅖ 2. 아니오 : ");
            int check = sc.nextInt();
            run = check == 1;
        }
    }

    private static String CardConvRev(int number, int cd) {
        int size = 0;
        int number1 = number;
        while (number1 > 0) {
            number1 /= cd;
            size++;
        }
        String result = "";
        char[] temp = new char[size];
        int count = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (number / cd > 0 || number % cd > 0) {
            System.out.println((cd > 9 ? cd + " | " : cd + "  | ") + (" ".repeat(8 - Integer.toString(number).length()) + number) + (number % cd > 0 ? " ... " + number % cd : ""));
            System.out.println("   +---------");
            temp[count++] = dchar.charAt(number % cd);
            number /= cd;
        }
        for (int i = count - 1; i >= 0; i--) {
            result += temp[i];
        }
        return result;
    }
}
