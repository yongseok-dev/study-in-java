package omok;

public class Omok {
    public static void main(String[] args) {
        Player userA = new Player("사용자A", "●");
        Player userB = new Player("사용자B", "○");
        Board board = new Board(19);
        play(board, userA, userB);
    }

    private static void play(Board board, Player userA, Player userB) {
        board.print();
        int turn = 0;
        do {
            Player player = turn % 2 == 0 ? userA : userB;
            int[] userType = player.type();
            if (!board.setStone(userType, player.stone)) {
                System.out.println("둘 수 없는 자리입니다.");
                continue;
            }
            board.print();
            if (board.checkVictory(userType, player.stone)) {
                System.out.println(player.name + player.stone + "승! 게임 종료");
                break;
            }
            turn++;
        } while (true);

    }
}