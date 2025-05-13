package javaStudy.day1;
/*
 * 입력(input) 개념 알아보기.
 * 일반출력 이라는 개념은 데이터가 프로그램에서 콘솔로 나가는 것을 말하고 이름 전문용어로 Standard Output 이라고 함
 * Standard Input 은 위의 반대 개념임.
 * 
 * 아래는 입력을 얻어낼수 있는 방법을 보여주는 예시임.
 */

import java.io.IOException;

public class SysteminStudy {
	
	public static void main(String[] args) throws IOException {
		//콘솔로 부터 입력 얻어내기
		System.out.println("첫번쨰 수를 입력 하세요.");
		int input1 = System.in.read() - 48;//이 API 를 이용하면, 콘솔에 입력한 키보드 첫번쨰 하느의 값만 int 로 리턴시킴.
		
		System.in.read();
		System.in.read();
		
		System.out.println("두번쨰 수를 입력 하세요.");
		int input2 = System.in.read() - 48;
		
		
		System.out.println("" + input1 + input2);
		
		System.out.printf("입력된 숫자1: %1$s, 숫자2: %2$s",  input1, input2);
		
		
		//0 --> 48, 1 -- > 49
		//input1(0) + input2(1) --> + 연산자를 만남..
		// + 를 캐릭터의 문자 숫자가 더해질걸로 예상하지만, 그게 아니라, 두개의 character 는 연산전에 int 로 변형되어집니다.
		//이유는 char 는 내부적으로 정수형이기 때문이죠
		
		//int k;
		
		//System.out.println(k);
	}

}
