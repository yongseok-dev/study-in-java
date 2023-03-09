package omok;

import java.util.Scanner;

public class Player {
	String name;
	String stone;

	Player(String name, String stone) {
		this.name = name;
		this.stone = stone;
	}

	public int[] type() {
		int[] position = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.print(name + "> ");
		String usertype;
		usertype = sc.nextLine().toUpperCase();
		int row = Integer
				.parseInt("".equals(usertype.replaceAll("[^0-9]", "")) ? "-1" : usertype.replaceAll("[^0-9]", ""));
		int col = Character.getNumericValue(usertype.replaceAll("[^A-Z]", "").charAt(0))
				- Character.getNumericValue('A');
		position[0] = row;
		position[1] = col;
		return position;
	}
}
