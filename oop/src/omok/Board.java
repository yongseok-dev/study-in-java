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
		return ".".equals(map[row][col]) ? true : false;
	}

	public void setStone(int[] position, String stoneType) {
		int row = position[0];
		int col = position[1];
		if (capable(position)) {
			map[row][col] = stoneType;
		} else {
			System.out.println("둘 수 없는 자리입니다.");
		}
	}
}