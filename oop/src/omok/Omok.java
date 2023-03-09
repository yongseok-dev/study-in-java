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
    }
}