package ch06;

import java.util.Iterator;

import userType.UserType;

//4행 3열의 행렬과 3행 4열의 행렬을 곱하는 프로그램 작성
public class MatrixProduct {
	public static void main(String[] args) {
		int[][] a = new int[4][3];
		System.out.println("행렬 a의 요소를 입력하세요.");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = UserType.i("a[" + i + "][" + j + "] = ");
			}
		}
		int[][] b = new int[3][4];
		System.out.println("행렬 b의 요소를 입력하세요.");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = UserType.i("b[" + i + "][" + j + "] = ");
			}
		}
		int[][] c = new int[4][4];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				for (int k = 0; k < 3; k++) {
					c[i][j] += (a[i][k] * b[k][j]);
				}
			}
		}
		System.out.println("행렬 a,b의 곱");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
