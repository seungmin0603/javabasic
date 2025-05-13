package javaStudy.day1;
/*
 * 자바의 Data Type : 일반적으로 컴퓨터 언어는 메모리에 담는 값에 타입에 따라서 데이터 타입을 엄격하게 구분짓습니다.
 * 자바도 마찬가지 입니다.
 * 
 * 아래의 내용은 꼭 기억 하세요.
 * 
 * 제가 Java 의 데이터 타입을 크게 2개로 말하세요 라고 하면, 반드시 Primitive Type(p type - 원시 자료형)
 * 과 Reference Type(객체 타입) 이 존재 한다라고 하시면 됩니다. 꼭 기억하세요!!!!!!!!!
 * 
 * 자바는 100% 객체지향 언어이기 떄문에 모든 프로그래밍은 R type 으로 이뤄진다라고 생각하세요.
 * 그럼 p type 은 언제 쓰는냐?? 객체 내에서 데이터 들이 연산등을 수행을 할 떄 사용되어진다라고 생각하세요.
 * 
 * p type 은 다시 값의 타입에 따라서 아래로 구분됨
 * 
 * 수치형
 *  1. 정수형 : byte(1byte), short(2), int(4 default), long(8)
 *  2. 실수형 : float(4), double(8 default)
 *  수치형의 리터럴값은 모두 기본형 타입의 메모리에 할당되어집니다.
 *  연산시의 타입 변환 : 기본적으로 자바에서는 두 변수가 연산되어질떄, 먼저 타입 검사를 합니다.
 *  
 *  만약 타입이 기본타입 이하인 경우엔 무조건 기본타입으로 메모리를 할당, 복사 연산 합니다. 꼭 기억하세요
 *  만약 기본타입 이상의 경우엔 무조건 큰타입으로 복사후 연산합니다. 꼭 기억하세요.
 *  
 *  3. 문자형(문자 하나만 담는 타입) : char(2byte - 음수 없음, 내부적으로 정수형태를 취함..unicode 참조)
 *  4. boolean : true / false !! 스크립트처럼 0 1 , empty 등을 true/false 로 못담음. 그냥 true/false 만 존재함
 */
public class DataTypeExam {
	
	public static void main(String[] args) {
		// TODO Auto-tenerated method stub
		
		//리터럴을 이용한 예시
		System.out.println(10);// 내부적으로 int 메모리 할당후 값을 대입하고 출력시키다
		System.out.println(10+2);//int int 를 생성후 + 연산후 결과를 출력시킨다
		System.out.println("파이의 값은" + 3.14);//문자열객체(String) 을 생성하고, double 메모리를 생성, 값을 할당수
		//문자열 + double 연산을 처리, 최종 결과가 문자열인 값을 출력시킨다.
		//문자열객쳉(String) + 모든 data type(p and r type)  의 결과는 String 임.
		
		//변수의 타입 : 자바에서는 값이 사용되기 전엔 그 값의 타입이 반드시 먼저 선언이 되고, 값을 대입해야 합니다.
		//만약 타입이 틀리거나, 범위가 벗어나면 에러입니다.
		//변수 선언시 주의!!! 같은 블락내에서 재선언 절대 불가함.
		
		//변수 선언 예시
		byte b1, b2, b3;
		int k = 10;
		
		b1 = 10;// 대입
		byte b = 1;//변수 초기화.
		
	    k = b1 + b;
	    
	    //long 과 float 은 초기화시에 값뒤에 L or 1 , f or F 를 넣어줘서 처음부터 메모리를 생성한다.
	    long lo = 1L;//조... int max 21억 5천만...
	    
	    System.out.println(Float.MAX_VALUE);
	    
	    float f = 3.14F;
		
	    lo = 0xAAA;//16진수
	    System.out.println(lo);
	    
	    lo = 06123;//수 앞에 0을 사용해서 8진수 표기함.
	    System.out.println(lo);
	    //케스팅 연산자 : 작은 타입을 큰 타입으로 변환하도록 하는 연산자 임.
	    //케스팅 연산자는 단항 연산자입니다. 떄문에 우측항 하나에만 연산이 적용됩니다.
	    //사용 예 : byte bt = 1; byte bt2 = (byte)bt + 2
	    byte bt = 1; byte bt2 = (byte)(bt + 2);
	    float f2 = (float)1.0;
	    
	    //Fruit.clas 를 아래처럼 정의 하세요
	    //main 내부에
	    //아래의 로직을 정의 하고, 결과를 출력 시키세요.
	    /*
	     * 여러분이 과수원을 한다고 가정합니다.
	     * 재배 과일로는 사과, 배 , 오렌지가 있고, 각각 시간당 3,5,3개씩 생산이 되어집니다.
	     * 과수원의 하루 총 생산량(과일합산) 을 출력하고, 시간당 생산량을 출력시키세요
	     * 단 아래의 조건을 모두 만족해야 합니다.
	     * 
	     * 1. 최대한의 변수를 활용하세요.
	     * 2. 시간당 결과는 소숫점으로 나올겁니다.
	     * 3. 한번의 리터럴과, 한번의 케스팅 연산을 사용하세요.
	     */
	    
	    //char 데이터 타입 : 2byte 이며 유니코드 테이블의 문자셋을 문자로 표현한다.
	    //음수가 없는 형태이기 떄문에(당연하겠죠?? 문자 테이블은 0 부터 시작하니깐)
	    //일반 수치형 데이터타입의 같은 메모리 타입과는 호환이 불가능 함
	    //단 int 형과는 호환됨. 즉 promotion 및 casting 됨..(음수 빼고)
	    
	    String sung = "김";//문자 하나만 담을수 있음. '' 로 묶음.
	    System.out.println(sung.codePointAt(0));
	    
	    char ch1 = '\uAbcd';
	    System.out.println(ch1);
	    
	    char mySung = '노';
	    
	    char codeCh = 12335;
	    System.out.println(codeCh);
	    
	    //short sh = codeCh;// 메모리가 같아도 범위가 달라 호환불가함.
	    int theCh = codeCh;
	    System.out.println((char)theCh);
	    
	    //boolean 타입 : true / false 만 갖는 타입. 다른 타입으로 케스팅 불가함.
	    boolean theFlag = false;//조건이나 , 루프등에서 사용되는 타입.
	    
	    System.out.println("\"\'\\\n\t하하");
	    
	    
	    
	    
	    
	    
	    //promotion : casting 의 반대 개념..
	    //작은 타입을 큰 타입에 대입하는 것.. 특별한 문제 없이 변환 됨.
	    
	    int it = 1;
	    long ln = it;//프로모션.
	    float fl = ln;
	    double dl = fl;
	    
	    //출력문 형태 알아보기..
	    //System.out.print("모든 P T type 및 void 가 아닌 메서드 호출 가능") 결과 출력후 커서 맨 마지막 위치
	    //System.out.println("위와 같지만 라인 개행 및 맨 처음으로 커서 이동");
	    System.out.print("누군가...");
	    System.out.println("이건 개행");
	    System.out.println("gggg");
	    
	    //printf() : 특정 format 대로 문자열을 출력 시키는 출력문. 형식은 아래와 같음
	    //print("문자열",값1, 값2 ,.....)
	    //format 문자열의 형식(format) 은 다음과 같음
	    /*
	     *[값의 순번], [flage(-0)],[width(전체자릿수)], [.precision(소수자리수)] conversion(변환 문자 %)
	     *
	     *위 메서드가 나온 이유는 기존 println() 에서는 특정 형식대로 출력을 만들수 가 없기 떄문에...(ex> 소수점 2자리까지만 출력 하는등의,..)
	     * 해서 JDK 1.5 부터 C의 그것과 똑같은 기능의 메서드 제공함
	     * 
	     * 주의사항!! [] 은 optional 하기 떄문에 줘도 그만 안줘도 그만..만약 줄 경우엔 반드시 패턴에 따른 값 처리 해야함..
	     * 하지만, conversion 은 반드시 존재 해야함.
	     * conversion 문자는 d (정수), f(실수), s(문자열) 이 올수 있다.
	     */
	    
	    String name = "승민";
	    int age = 26;
	    
	    System.out.println("내이름은" + name + "이야 나이는" + age + "야");
	    
	    System.out.printf("이름은 %s", name);
	    System.out.printf("나이는 %d\n", age);
	    
	    System.out.printf("이름: %1$s 나이 %2$d: ", name,age);
	    
	    
	    //컨버전 형태를 좀 볼게요
	    /*
	     * 정수(d) : %d : 일반 정수 표기
	     * %자리수d : 자릿수 정수.. 왼쪽 빈자리 공백
	     * %-자리수d : 자릿수 정수 .. 오른쪽 빈자리 공백
	     * %0자리수d : 자릿수 정수... 왼쪽 0으로 채움.
	     * 
	     * 
	     * 
	     * 실수(f) : %f
	     * 10.2f : 소수 이하는 2자리까지 (반올림 없음 출력이라서),
	     * 
	     * 문자열(s) : %s
	     * %자리수s : 자릿수길이의 문자열, 공백으로 채움.
	     * %% : % 채움.
	     */
	    System.out.println();
	    int value = 123;
	    System.out.printf("상품 가격 %06d원\n", value);
	    
	    
	    System.out.println();
	    double pi = Math.PI;
	    System.out.println(pi);
	    
	    System.out.println();
	    System.out.printf("파이값(10자리소수이하2자리) :%10.2f",pi);
	    
	    
	    String no = "김";
	    String man = "승민";
	    System.out.println();
	    System.out.printf("Mr. 질문맨..%-10s | %10s", no,man);
	    
	    char c = ' ';
	    
	    
	    
	    
	    
	    
	}
	
}
