package javaStudy.day3;

import java.util.Arrays;
import java.util.Scanner;



public class scoreEx1 {

	public static void main(String[] args) {
		
		System.out.println(args[2]);
		// TODO Auto-generated method stub
       /*
        * 프로 그램 시작하면 국어 , 영어 , 수학 입력 받도록 하고,
        * 만약 0 ~100 사이가 아니면, 다시 입력 받도록 하세요
        * 출력 결과는 총점, 평균 , 학점(a(80점이상),b(70점이상),F) 출력 시키세요.
        * 학점은 switch case 로 정의하세요.
        * do while 사용합니다.
        * */
		
		//배열 copy..
		/*
		 * 그럴일은 별로 없지만, 특정 배열의 값을 유지한채, 배열을 더 늘리고 싶을떄가 있다.
		 * 그런데, 자바에서는 한번 생성된 배열은 절대 크기를 변경 할 수 없다.
		 * 새 배열을 생성, 기존 배열을 순회 해서 값을 복사해서 넣어야 하는 번거로움이 있다.
		 * 이를 해결하기 위한 API 를 설명한다.
		 */
		
		int[] oldArr = {1,2,3};
		
		int[] newArr = new int[100];
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		
		System.out.println(Arrays.toString(newArr));
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 동적가변배열 : Outer 의 길이만 생성하고, inner 배열은 필요시에 동적으로 생성하는 문법
		 * 잘 안쓰이니 알고만 있어도 됨.
		 * */
		
	    char[][] stars = new char[10][];
	    for(int i = 0; i<stars.length; i++) {
	    	//Outer 의 inner 로 로직을 태울때 inner 배열을 생성한다.
	    	//참고로 자바 배열은 index 가 생성되지 않을시 access 하면 예외가 발생함.
	    	stars[i] = new char[i+1];
	    	for(int j = 0; j < stars[i].length; j++) {
	    		stars[i][j] = '*';
	    		
	    		System.out.print(stars[i][j]);
	    	}
	    	System.out.println();
	    }
//		String kor1 = "";
//		String eng1 = "학점 A" ;
//		int  kor , eng , math; 
//		Scanner sc = new Scanner(System.in);
//		
//		do{
//			System.out.println("국어 점수 입력 해줘");
//			kor = sc.nextInt();
//			System.out.println("영어 점수 입력 해줘");
//			eng = sc.nextInt();
//			System.out.println("수학 점수 입력 해줘");
//			math = sc.nextInt();
//			switch (kor / 10) {
//			   
//				case 10:
//				case 9:	
//				case 8:
//					kor1 = "학점 A";
//				case 7:
//					kor1 = "학점 B"; 
//				case 6:
//					kor1 = "학점 F";
//			}
//			switch (eng / 10) {
//			
//			case 10:
//			case 9:	
//			case 8:
//				eng1 = "학점 A" ; 
//			case 7:
//				eng1 = "학점 B" ;
//			case 6:
//				eng1 = "학점 F" ;
//		}switch (math / 10) {
//		
//		case 10:
//		case 9:	
//		case 8:
//			math1 = "학점 A" ; 
//		case 7:
//			math1 = "학점 B" ;
//		case 6:
//			math1 = "학점 F" ;
//			
//		}switch (eng / 10) {
//		
//		case 10:
//		case 9:	
//		case 8:
//			eng1 = "학점 A" ; 
//		case 7:
//			eng1 = "학점 B" ;
//		case 6:
//			eng1 = "학점 F" ;
//		while(true);
			
//		Scanner sc = new Scanner((System.in));
//		System.out.println("이름 입력 : ");
//		String userName = sc.nextLine();
//		double avg ;
//		
//		String[] subject = {"국어 입력 : ", "수학 입력 : ", "영어 입력 : "};
//		int [] score = new int [subject.length + 1];
//		
//		for(int i = 0 ; i<subject.length; i++) {
//			
//			do {System.out.println(subject[i]);
//			score[i] = sc.nextInt();}while(score[i] < 0 || score[i] > 100);
//			
//			score[subject.length] += score[i];
//			}
//		System.out.println(Arrays.toString(score));
		
//		avg = score[subject.length] / 3.0;
		
		
//		int kor,eng,math,total;
//		double avg;
//		char grade;
//		
//		do {
//			System.out.println("국어 점수 입력 :");
//			kor = sc.nextInt();
//		}while(kor < 0 || kor > 100);
//		do {
//			System.out.println("영어 점수 입력 :");
//			eng = sc.nextInt();
//		}while(eng < 0 || eng > 100);
//		do {
//			System.out.println("수학 점수 입력 :");
//			math = sc.nextInt();
//		}while(math < 0 || math > 100);
//		
//		
//		total = kor + eng + math;
//		avg = total / 3.0;
//		switch ((int)(avg / 10)) {
//		case 10:
//		case 9:
//		case 8:
//			grade = 'A';
//			break;
//		case 7:
//			grade = 'B';
//			break;
//		default:
//			grade = 'F';
//			break;
//		
//		}
//		
//		System.out.printf("%s님 총점 %d, 평균 %f5.2, 학점 %s 입니다.", userName, total, avg, grade);
	}
		
}