package ch06;

import java.util.Iterator;

import userType.UserType;

//행어 따라 열의 개수가 다른 2차원 배열을 생성하자! 행수, 열수, 각 요소는 키보드 통해 입력
public class UnevennessArray {
	public static void main(String[] args) {
		System.out.println("불규칙한 2차원 배열을 생성합니다.");

		int n = UserType.i("행 수", "+");
		int[][] arr = new int[n][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[UserType.i(i + "행때 열 수", "+")];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = UserType.i("c[" + i + "][" + j + "] = ");
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
