package ch13.sec02.exam1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product<K, M> {
	private K kind;
	private M model;
	
}
