package omok;

public class Board {
	int size;
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

	private boolean capable(int[] position) {
		int row = position[0];
		int col = position[1];
		if (0 > row || row >= size || 0 > col || col >= size) {
			return false;
		}
		return ".".equals(map[row][col]) ? true : false;
	}

	public boolean checkVictory(int[] position, String stoneType) {
		int row = position[0];
		int col = position[1];
		int count = 0;
		// 1. 상하
		for (int i = -4; i < 5; i++) {
			int r = row - i;
			if (r >= 0 && r < size && stoneType.equals(map[r][col])) {
				if (++count >= 5)
					return true;
			} else {
				count = 0;
			}
		}
		// 2. 좌우
		count = 0;
		for (int i = -4; i < 5; i++) {
			int c = col - i;
			if (c >= 0 && c < size && stoneType.equals(map[row][c])) {
				if (++count >= 5)
					return true;
			} else {
				count = 0;
			}
		}
		// 3. 좌상 우하
		count = 0;
		for (int i = -4; i < 5; i++) {
			int r = row - i;
			int c = col - i;
			if (c >= 0 && c < size && r >= 0 && r < size && stoneType.equals(map[r][c])) {
				if (++count >= 5)
					return true;
			} else {
				count = 0;
			}
		}
		// 4. 우상 좌하
		count = 0;
		for (int i = -4; i < 5; i++) {
			int r = row - i;
			int c = col + i;
			if (c >= 0 && c < size && r >= 0 && r < size && stoneType.equals(map[r][c])) {
				if (++count >= 5)
					return true;
			} else {
				count = 0;
			}
		}
		return false;
	}

	public boolean setStone(int[] position, String stoneType) {
		int row = position[0];
		int col = position[1];
		if (capable(position)) {
			map[row][col] = stoneType;
		} else {
			System.out.println("둘 수 없는 자리입니다.");
			return false;
		}
		return true;
	}
}