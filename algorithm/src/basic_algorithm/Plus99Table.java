package basic_algorithm;

public class Plus99Table {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("  | ");
        for (int i : numbers) {
            System.out.print(i + "  ");
        }
        System.out.print("\n--+----------------------- ");
        for (int i : numbers) {
            System.out.print("\n" + i + " | ");
            for (int j : numbers) {
                System.out.print((j + i > 9 ? j + i : ((j + i) + " ")) + " ");

            }
        }
    }
}
