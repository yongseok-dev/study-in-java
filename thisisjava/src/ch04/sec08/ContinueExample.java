package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
int i = 0;
while (i < 10) {
	i++;
	if (i % 2 == 0)
		continue;
	System.out.print(i + " ");
}
	}

}
