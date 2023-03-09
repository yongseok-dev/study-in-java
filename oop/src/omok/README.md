# 오목

# 기본 코드

Omok.java

```java
public class Omok {
    public static void main(String[] args) {
        Player user = new Player("사용자", "O");
        Player computer = new Player("컴퓨터", "X");
        Board board = new Board(19);
        play(board, user, computer);
    }
    private static void play(Board board, Player user, Player computer) {
        board.print();
    }
}
```

Board.java

```java
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
            for (int col = 0; col < size; col++) {
                System.out.print(" " + map[row][col]);
            }
            System.out.println();
        }
    }
}
```

Player.java

```java
public class Player {
    String name;
    String stone;
    Player(String name, String stone) {
        this.name = name;
        this.stone = stone;
    }
}
```

# 실행결과

```
. . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
 . . . . . . . . . . . . . . . . . . .
```

# Step 1: 좌표 출력하기

좌측에 0, 1, 2, 3, … , 18 하단에 A, B, C, … , S 의 좌표 표시를 하시오.

# Step 2: 바둑판에 돌 놓기

“J 9”를 입력하면 해당 좌표에 “O” 돌을 표시하시오.

# Step 3: 검은 돌, 흰 돌 번갈아 가며 놓기

사용자 A와 B가 번갈아가며 O, X, O, X, … 의 돌을 놓도록 하시오.

# Step 4:

“오목”이 되면 게임이 종료되도록 하시오.