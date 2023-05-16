package day23;

public class SuperConstructor {
	
	public static void main(String[] args) {
		
		SportCar mycar = new SportCar("red", 300);
		System.out.println(mycar.color);
		System.out.println(mycar.speedlimit);
	}

}

class Car {
	
	int wheel;
	int speed;
	String color;
	
	public Car() {
	}
	Car (String color) {
		this.color=color;
	}
}

class SportCar extends Car {
	int speedlimit;
	
	SportCar (String color, int speedlimit) {
		this.color=color;
		this.speedlimit=speedlimit;
	}
}