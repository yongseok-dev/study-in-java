package basic_algorithm;

public class SumOf {
    public static void main(String[] args) {
        test();
    }

    static int sumof(int a, int b) {
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }

        return a * (1 + a) / 2 - b * (b - 1) / 2;
    }

    static void test() {
        System.out.println(sumof(3, 5) == 12);
        System.out.println(sumof(6, 4) == 15);
    }
}
