package ch17.sec04.exam03;
import java.util.stream.*;
public class StreamExample {
public static int sum;
public static void main(String[] args) {
	IntStream stream = IntStream.rangeClosed(1, 100);
	stream.forEach(i->{
		sum+=i;
	});
	System.out.println(sum);
}
}
