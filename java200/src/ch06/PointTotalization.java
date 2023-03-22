package ch06;

import userType.UserType;

// 6명의 두 과목 점수로 부터 과목별/학생별 평균 구하기
public class PointTotalization {
	public static void main(String[] args) {
		int n = 6;// 사람수

		int[][] arr = new int[n][2];
		double[] avg = {0,0};

		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = UserType.i((i + 1) + "번 국어:", "0+");
			arr[i][1] = UserType.i("    수학:", "0+");
		}

		System.out.println("No.\t국어\t수학\t평균");
		for (int i = 0; i < arr.length; i++) {
			
			avg[0]+=arr[i][0];
			avg[1]+=arr[i][1];
			System.out.println(
					(i + 1) + "\t" + arr[i][0] + "\t" + arr[i][0] + "\t" + ((double) (arr[i][0] + arr[i][1]) / 2));
		}
		avg[0]/=n;
		avg[1]/=n;
		System.out.println("평균 \t"+avg[0]+"\t"+avg[1]);
	}
}
