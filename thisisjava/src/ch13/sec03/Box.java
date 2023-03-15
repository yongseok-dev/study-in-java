package ch13.sec03;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Box<T> {
	private T t;
}
