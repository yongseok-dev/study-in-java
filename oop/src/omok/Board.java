package omok;

public class Board {
	int size;// MAX_SIZE = 26
	String[][] map;

	Board(int size) {
		this.size = size;
		map = new String[size][size];
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				map[row][col] = ".";
			}
		}
	}

	public void print() {
		for (int row = 0; row < size; row++) {
			System.out.print(row < 10 ? " " + row + "|" : row + "|");
			for (int col = 0; col < size; col++) {
				System.out.print(" " + map[row][col]);
			}
			System.out.println();
		}
		System.out.print("    ");
		for (int i = 0; i < size; i++) {
			System.out.print((char) ('A' + i) + " ");
		}
		System.out.println();
	}

	public boolean checkOutBoard(int row, int col, String stoneType) {
		if (row >= 0 && row < size && col >= 0 && col < size && stoneType.equals(map[row][col])) {
			return true;
		}
		return false;
	}

	public boolean checkVictory(int[] position, String stoneType) {
		int row = position[0];
		int col = position[1];
		int[] count = new int[4];
		for (int i = -4; i < 5; i++) {
			int[][] check = { { row - i, col - 0 }, { row - 0, col - i }, { row - i, col - i }, { row - i, col + i } };
			// 0. 상하 1. 좌우 2. 좌상 우하 3. 우상 좌하
			for (int j = 0; j < check.length; j++) {
				if (checkOutBoard(check[j][0], check[j][1], stoneType)) {
					if (++count[j] >= 5)
						return true;
				} else {
					count[j] = 0;
				}
			}
		}
		return false;
	}

	public boolean setStone(int[] position, String stoneType) {
		int row = position[0];
		int col = position[1];
		if (0 > row || row >= size || 0 > col || col >= size || !".".equals(map[row][col])) {
			return false;
		}
		map[row][col] = stoneType;
		return true;
	}
}