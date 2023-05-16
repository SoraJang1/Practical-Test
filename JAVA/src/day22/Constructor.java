package day22;

public class Constructor {
	
	public static void main(String[] args) {
		
		Cellphone phone = new Cellphone();
	
	}

}

class Cellphone {
	
	String model="Galaxy S23 Ultra";
	String color="Baby Pink";
	int capacity=512;
	
	Cellphone () {
		System.out.println("model: " + model);
		System.out.println("color: " + color);
		System.out.println("capacity: " + capacity);
	}
	
}