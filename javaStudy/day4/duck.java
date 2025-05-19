package javaStudy.day4;

public class duck extends Animal{

	private String name;
	private String breed;
	
//	public duck() {
//		super("오리");
//	}
	public duck(String name, String breed) {
		super("오리");
		this.name = name;
		this.breed = breed;
	}
	@Override//어노테이션.. 컴파일시에 이 메서드를 오버라이드 했는지를 검증하라는 의미임.. 자세한건 나중에 배움.
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " 이름은 " + name + " 품종은 " + breed;
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
	    System.out.println("꽥꽥");	
	}
	
	//알낳는 기능을 정의함
	public void layEggs() {
		System.out.println("오리 알낳다");
	}
}
