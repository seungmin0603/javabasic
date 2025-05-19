package javaStudy.day4;

public class Dog extends Animal{

	private String name;
	private String breed;
	
//	public Dog() {
//		super("개");
//	}
//	
	public Dog(String name, String breed) {
		super("개");
		this.name = name;
		this.breed = breed;
	}
	/*
	 * 메서드 오버라이딩(method overriding) : 상속받은 부모의 메서드의 내용부를 자식의 목적에 맞게 재정의 하는것
	 * 이렇게 하게되면 부모의 메서드가 은닉 상태로 되기 떄문에, 자식 객체로 해당 메서드를 호출하게 되면,
	 * 무조건 처음 걸리는 메서드, 즉 오버라이드된 자식 메서드가 호출되도록 설계 되어 있다.
	 *
	 * 오버라이딩의 규칙(꼭 기억) : 메서드의 리턴타입, 시그니처, 이름은 절대 불변한다.
	 * 단 접근제어자는 수정 할 수 있는데, 부모와 같거나 반드시 큰 제어자를 사용해야한다.
	 * */
	@Override//어노테이션.. 컴파일시에 이 메서드를 오버라이드 했는지를 검증하라는 의미임.. 자세한건 나중에 배움.
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " 이름은 " + name + " 품종은 " + breed;
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
}
