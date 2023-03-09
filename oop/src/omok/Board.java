package omok;

public class Board {
    int size;//MAX_SIZE = 26
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

    public boolean checkVictory(int[] position, String stoneType) {
        int row = position[0];
        int col = position[1];
        int[] count = new int[4];
        for (int i = -4; i < 5; i++) {
            int checkRow = row - i;
            int checkCol1 = col - i;
            int checkCol2 = col + i;
            // 1. 상하
            if (checkRow >= 0 && checkRow < size && stoneType.equals(map[checkRow][col])) {
                if (++count[0] >= 5) return true;
            } else {
                count[0] = 0;
            }
            // 2. 좌우
            if (checkCol1 >= 0 && checkCol1 < size && stoneType.equals(map[row][checkCol1])) {
                if (++count[1] >= 5) return true;
            } else {
                count[1] = 0;
            }
            // 3. 좌상 우하
            if (checkCol1 >= 0 && checkCol1 < size && checkRow >= 0 && checkRow < size && stoneType.equals(map[checkRow][checkCol1])) {
                if (++count[2] >= 5) return true;
            } else {
                count[2] = 0;
            }
            // 4. 우상 좌하
            if (checkCol2 >= 0 && checkCol2 < size && checkRow >= 0 && checkRow < size && stoneType.equals(map[checkRow][checkCol2])) {
                if (++count[3] >= 5) return true;
            } else {
                count[3] = 0;
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