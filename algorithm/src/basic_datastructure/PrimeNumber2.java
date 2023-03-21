package basic_datastructure;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int count = 0;
        int index = 0;
        int[] arr = new int[1000];
        arr[index++]=2;
        for (int i = 3; i < 1001; i+=2) {
            int check=0;
            for (int j = 1; j < index; j++) {
                count++;
                if(i%arr[j]==0){
                    check++;
                    break;
                }
            }
            if (check==0){
                arr[index++] = i;
                System.out.println(i);
            }
        }
        System.out.println("나눗셈을 수행한 횟수: "+ count+"\n소수의 수: "+index );
    }

}
