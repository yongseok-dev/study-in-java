package ch08;

//이름 신장, 체중 -> 사람 클래스
public class Human {
	String name;
	double height;
	double weight;

	Human(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void gainWeight(double a) {
		setWeight(getWeight() + a);
	}

	public void reduceWeight(double a) {
		setWeight(getWeight() - a);
	}
	public String toString() {
		return "이름: "+name+"\n신장: "+height+"\n체중: "+weight;
	}
}
