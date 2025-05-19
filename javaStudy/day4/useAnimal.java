package javaStudy.day4;


//정의된 Animal 클래스를 객체화 해서 사용하는 클래스 입니다.
public class useAnimal {
	public static void main(String[] args) {
		
//		Animal animal = new Animal("애니멀");
		
//		Dog dog = new Dog("토리", "토이푸들");
//		Cat cat = new Cat("아깽", "스코티쉬폴드");
//		duck duck = new duck("도날드덕", "헐리웃오리");
//		
		
		//다형성을 이용한 인스턴스 생성
//		Animal dog = new Dog("토리", "토이푸들");
//		Animal cat = new Cat("아깽", "스코티쉬폴드");
//		Animal duck = new duck("도날드덕", "헐리웃오리");
//		
//		
//		Dog dog2= (Dog)dog;
//		
//		System.out.println(dog);
//		System.out.println(cat);
//		System.out.println(duck);
//		
//		
//		dog.sound();
//		cat.sound();
//		duck.sound();
		
		//Animal 타입의 객체 3개를 배열에 담습니다.
		
		Animal[] animals = {new Dog("토리", "토이푸들"), new Cat("아깽", "스코티쉬폴드"), new duck("도날드덕", "헐리웃오리")};
		for(int i = 0; i<animals.length; i++) {
			//Dog dd = (Dog)animals[0];
			Animal thepets = animals[(int)(Math.random() * animals.length)];
			System.out.println(thepets);
			thepets.sound();
			
			//instanceof(className) 이 메서드는 해당 instance 가 클래스타입의 인스턴스라면 true 아니면 false 리턴함
			if(thepets instanceof duck) {
				((duck)thepets).layEggs();
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		//개와 고양이 오리 세개의 객체를 생성하기 위해서 변수를 선언합니다.
//		
//		Animal dog;
//		Animal cat;
//		Animal duck;
//		
//		//인스턴스 생성하기.
//		dog = new Animal("개"); // 기본객체(기본생성자를 호출해서 필드의 값이 default 로 초기화 된 객체를 말함)
//		cat = new Animal("고양이", "치즈닝");
//		duck = new Animal("오리", "흰색",3);
		
//		dog.aType = "개";
//		cat.aType = "고양이";
//		duck.aType = "오리";
		//instance 의 hash 를 출력해봅니다.
//		System.out.println(dog.aType);
//		System.out.println(cat.aType);
//		System.out.println(duck.aType);
		
//		System.out.println(dog.displayType());
//		System.out.println(cat.displayType());
//		System.out.println(duck.displayType());
		
		/*
		 * 다형성(polymorphism) : 상속관계에서 인스턴스를 생성할떄 ref 타입이 변경되는 것을 말함.
		 * 여기서 중요한건, 부모타입으로 자식 인스턴스를 생성해도, 인스턴스는 무조건 호출된 생성자의 instance 라는 것임
		 * 이 instance 는 절대 불변임.. 하지만 얘를 ref 하는 변수 타입은 super or 하위 타입으로 가능함
		 * 이떄 만약 타입이 상위 에서 하위 타입으로 변경시엔 반드시 type casting 연산을 통해 이뤄져야함.
		 */
		
	}

}
