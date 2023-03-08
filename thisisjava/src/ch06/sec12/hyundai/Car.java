package ch06.sec12.hyundai;

import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllseasonTire;
//import ch06.sec12.hankook.Tire;
//import ch06.sec12.kumho.Tire;
//중복이름을 임포트 해서 사용할 수 없다.

public class Car {
	ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
	ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();

	SnowTire tire3 = new SnowTire();
	AllseasonTire tire4 = new AllseasonTire();
}
