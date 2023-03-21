package basic_datastructure;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 1001; i++) {
            int check = 0;
            for (int j = 2; j < i; j++) {
                count++;
                if (i%j==0){
                    check++;
                    break;
                }
            }
            if (check==0){
                System.out.println(i);
            }
        }
        System.out.println("나눗셈을 수행한 횟수: "+ count );
    }

}
