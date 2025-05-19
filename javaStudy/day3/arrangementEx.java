package javaStudy.day3;

import java.util.Arrays;

/*
 * 자바 배열 : 자바에서 배열은 객체입니다.
 * 이 말은 배열은 반드시 객체 변수가 있어야 하고, 인스턴스를 생성하는 코드를 new 연산자를 이용해서 
 * 생성 해야 한다는 뜻입니다.
 * 배열은 P R 모든 타입을 index 의 값으로 저장할 수 있습니다.
 * 이떄 이값을 기준으로 배열을 생성시에 타입을 반드시 명기 해야 하는데, 같은 타입이거나 큰타입으로 타입을
 * 선언 해야 합니다.
 * 만약 큰 타입으로 선언하게 되면, 내부에 들어가는 값은 해당 타입으로 promotion 되어져서 들어가게 됩니다.
 * 배열은 객체이기 떄문에 배열 index 의 값이 R type 인 경우엔, 해당 instance 의 reference 가 
 * 값으로 들어가게 됩니다.(이건 도식으로 설명 할게요.)
 * 자바의 배열은 매우 엄격하게 관리 되어집니다. 예를 들어 스크립트의 경우, 배열의 갑ㅅ을 동적으로 넣고 빼고
 * 할수 있지만(undefined로 처리되는 경우 포함.), 자바의 배열은 위의 경우를 모두 예외로 인식 하여 에러를 발생 시킵니다.
 * 
 * 필수로 알아두세요!!! 기본객체라고 하는데, 모든 객체를 default 로 생성하게 되면, 그 내부의 속성의 값은 모두 각 타입의
 * default 값으로 초기화 되어져서 생성됩니다.
 * 
 * 배열을 예로 들면, 만약 int 타입으로 빈 배열(배열의 크기만 지정)을 생성하면, 각 index 의 값은 정수의 기본값인
 * 0으로 초기화 되어져 들어갑니다. 
 * */
public class arrangementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 문법 알아보기
		// 1. 크기만 지정하고 값은 기본값으로
		int[] intArr = new int[3];
		
		//배열객체의 상태(hash code)를 출력해봅시다
		//모든 클래스에는 toString() 이 존재함.. 이메서드는 내가 호출하건 안하건, 객체를 출력문에
		//찍으면 자동 호출함.
		System.out.println(intArr);
		for(int i = 0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		// 없는 index 를 접근해볼게요

		//System.out.println(intArr[3]);
		
		//문법2 : 배열의 값을 초기화 하는 배열 생성
		
		double dArr [] = {1,2,3};
		
		System.out.println(dArr[0]);
		for(int i = 0; i<dArr.length; i++) {
			
			int v = (int)dArr[i];
			System.out.println(v);
		}
		
		//향상된 for 을 알아볼게요.
		//나중에 배울 컬렉션 등에도 사용되니 잘 기억해두세요.
		// 향상된 for  구문은 위 자료형들의 길이에 맞게 자동으로 loop 를 돌면 전체으 ㅣ값을 리턴해주는 for 구문입니다.
		
		for(double dval : dArr) {
			System.out.println(dval);
		}
		
		//Array(배열) 의 모든 정보 (속성) 및 기능을 정의한 클래스를 통해서 배열의 정보를 얻어낼수 있습니다.
		//그 클래스 이름은 java.util.Arrays 라는 애 입니다.
		System.out.println(Arrays.toString(dArr));
		
		//기억하기~~~~ java.lang 패키지에 있는 애들은 import 를 하지 않아도 되지만, 다른 이름은 무조건 사용전에 
		//import 라는 키워드를 통해 패키지를 가져 와야 합니다.
		
		String str = "";
		
		//배열생성3. 1번과 2번을 합친 형태 입니다.
		// 이 배열식은 동적으로 배열을 생성할떄 사용됩니다. 특정 문법에서는 이 방법만 쓸수 있을때가 있어요..
		//지금은 문법만 기억 하길.
		
		String strArr [] = new String[] {"hi","there","here"};
		
		/*
		 * 2중 배열.. 배열 내부에 배열을 갖는(참조) 배열을 뜻함.
		 * 문법부터..
		 * 
		 * */
		
		int[] multi[] = new int [2][3];//2*3의 다중배열 생성함.
		multi [0][0] = 4;
		System.out.println(multi[0][0]);
//		//배열 초기화 문법 2 
		
		int[] [] m2 = {{1,2,3,100},{4,5,6,200},{7,8,9,300}};//new m2[3]
	
		System.out.println(m2[2][3]);
		System.out.println(m2[1][1]);
		
		for(int i = 0; i<m2.length; i++) {
			for(int j = 0; j < m2[i].length; j++) {
				System.out.println(m2[i][j]);
			}
		}
		
		
	}

}
