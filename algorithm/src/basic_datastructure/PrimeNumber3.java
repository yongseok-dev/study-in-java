package basic_datastructure;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int count = 0;
        int index = 0;
        int[] arr = new int[1000];

        arr[index++]=2;
        arr[index++]=3;

        for (int i = 5; i < 1001; i+=2) {
            int check=0;
            for (int j = 1; arr[j]*arr[j]<=i; j++) {
                count+=2;
                if(i%arr[j]==0){
                    check++;
                    break;
                }
            }
            if (check==0){
                arr[index++] = i;
                count++;//for의 최종 조건까지 체크한 수를 더해줘야 함.
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("나눗셈을 수행한 횟수: "+ count+"\n소수의 수: "+index );
    }

}
