package day22;

public class PhoneConstructor {
	
	public static void main(String[] args) {
		
		Iphone myphone1 = new Iphone();
		Iphone myphone2 = new Iphone("iPhone", "white", 256);
		
		System.out.println(myphone1.model + myphone1.color + myphone1.capacity);
		System.out.println(myphone2.model);
		
		myphone2.info();
	
	}
}
	
class Iphone {
	String model;
	String color;
	int capacity;
	
	Iphone (){
		
	}
	
	Iphone (String model, String color, int capacity){
		this.model=model;
		this.color=color;
		this.capacity=capacity;
	}
	
	void info() {
		System.out.println("model: " + model);
		System.out.println("color: " + color);
		System.out.println("capacity: " + capacity);
	}
}
