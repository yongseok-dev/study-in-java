package programming.ch02;

public class Array {
    public static void main(String[] args) {
        //array 선언
        int anArray1[];
        int[] anArray2;
//        int anArray3[10];  // 선언시 크기 명시 불가
//        anArra1[0] = 1;    // 초기화, 생성 전 배열사용 불가
        int anArray4[][];
        int[][] anArray5;
        int[] anArray6[];   //오류는 없지만 좋지 않은 표현

        //array 초기화
        int anArray7[] = {1,2,3,4,5};
        int[] anArray8 = {1,2,3,4,5};
        System.out.println(anArray7);
        System.out.println(anArray8);
        System.out.println(anArray7==anArray8); // false

        int anArray9[][] = {{1,2},{3,4},{5,6}};
        int[][] anArray10 = {{1,2},{3,4},{5,6}};

        int[] anArray11;
//        anArray11 = {1,2,3,4,5};   // 생성되지 않은 배열은 선언문에서 초기화하지 않으면 사용할 수 없다.

        //array 생성: new 로 인스턴스 생성
        int anArray12[] = new int[5];
        int[] anArray13 = new int[5];
        int anArray14[];
        anArray14 = new int[5];

        int anArry

    }
}
