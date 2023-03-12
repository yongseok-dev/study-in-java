package basic_datastructure;

public class MaxOfArrayRand {
    static int maxOf(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int count = (int) (Math.random() * 10) + 1; //1~10명에 대한
        System.out.println("인원수 : " + count);
        int[] leng = new int[count];
        for (int i = 0; i < count; i++) {
            leng[i] = (int) (Math.random() * 40 + 140);
            System.out.println(leng[i]);
        }
        System.out.println("최장신 : " + maxOf(leng));
    }
}
