package day25;

public class AbstractClass {
	
	public static void main(String[] args) {
		
		Pokemon pokemon = new Pikachu();
		System.out.println("이 포켓몬은 " + pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
		pokemon = new Squirtle(); // 변수를 여러 개 생성할 필요 없이 순차적으로 사용해 출력
		System.out.println("이 포켓몬은 " + pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
	}

}

abstract class Pokemon {
	String name;
	
	abstract void attack();
	abstract void sound();
	public String getName() {
		return this.name;
	}
}

class Pikachu extends Pokemon {
	
	Pikachu (){
		this.name="피카츄";
	}

	@Override
	void attack() {
		System.out.println("백만볼트");
	}

	@Override
	void sound() {
		System.out.println("피카-츄!");
	}
}

class Squirtle extends Pokemon {
	
	Squirtle (){
		this.name="꼬부기";
	}

	@Override
	void attack() {
		System.out.println("물대포");
	}

	@Override
	void sound() {
		System.out.println("꼬북꼬북");
	}	
}

