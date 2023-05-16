package day25;

public class ShapeMain {
	
	public static void main(String[] args) {
		Shape shapes[] = new Shape[3];
		// 부모의 객체배열 요소에 자식 값 넣기 -> 업캐스팅
		
		shapes[0] = new Rect();
		shapes[1] = new Circle();
		shapes[2] = new Line();
		
		for (int i=0; i<3; i++) {
			shapes[i].draw();
		}
	}

}

/*
class Shape {
	void draw () {
		System.out.println("도형을 그리다");
	}
}

-> 부모클래스인 Shape의 draw 메서드를 구현은 해 주어야 하지만 그 값이 무의미한 경우
abstract 를 사용해 메서드만 구현하고 값은 입력하지 않는다 (추상클래스)
이 경우 자식클래스에서 추상클래스의 값을 반드시 구현해야 한다
*/

// ==
abstract class Shape {
	abstract void draw();
}

class Rect extends Shape {
	void draw () {
		System.out.println("사각형을 그리다");
	}
}
class Circle extends Shape {
	void draw () {
		System.out.println("원을 그리다");
	}
}
class Line extends Shape {
	void draw () {
		System.out.println("선을 그리다");
	}
}
