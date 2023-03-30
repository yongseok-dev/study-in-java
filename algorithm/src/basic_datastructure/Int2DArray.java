package basic_datastructure;

public class Int2DArray {
	public static void main(String[] args) {
		int[][] x = new int[2][4];

		x[0][1] = 37;
		x[0][3] = 20;
		x[1][2] = 30;
		
		for (int[] is : x) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
	}
}
