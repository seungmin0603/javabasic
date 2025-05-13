package javaStudy.day1;

public class AboutMainMethod {
	
	/*
	 * main 메서드 : 자바 APP 에서 처음 시작할떄 VM 자동으로 호출하는 메서드 입니다.
	 * 이 메서드가 존재 하기 떄문에 APP 이 실행 되는 것이죠.
	 * 
	 *  이러한 특성 때문에, main() 은 몇가지 규칙을 갖습니다.
	 *  
	 *  1. 하나의 APP 에는 하나의 main() 만 존재합니다.
	 *  2. main 의 문법 형태는 반드시 지켜져야 합니다.
	 *  public static void main(string ars[]){메서드 바디}
	 *  2_1. public static 은 순서가 바껴도 상관없음,
	 *  2_2. (String[] ars) 로 해도 상관없음
	 *  2_3. (String[] abcd) 로 해도 상관없음 .. 즉 메서드 파라미터 (변수) 명은 내맘대로 할 수 있음.
	 *  3. 위 문법에서 하나라도 틀리면 일반 메서드를 인식을 해서, System(VM) 이 호출을 할 수 없습니다.
	 */
	public static void main(String aa[]) {
		System.out.println("안뇽");
	}
}
