package basic_datastructure;

public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);

        b[2] = 0;
        for (int i : a) {
            System.out.println(i);
        }
        for (int i : b) {
            System.out.println(i);
        }


    }
}
