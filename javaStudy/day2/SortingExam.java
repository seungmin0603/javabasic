package javaStudy.day2;

import java.util.Scanner;

public class SortingExam {
	//65~90
	
	/*
	 *아래의 로직에 맞게 코드를 작성하세요.
	 *
	 *
	 *수 세개를 입력 받습니다. 이 수를 작은수 --> 큰수로 나열하도록 하세요.
	 *
	 *ex) 2, 5, 1 입려 되었다면, 1 <= 2 <=5 이렇게 나오도록 하세요
	 *ex) 1, 3, 5 입려 되었다면, 1 <= 3 <=5
	 *ex) 5, 4, 1 입려 되었다면, 1 <= 4 <=5
	 */
	public static void main(String[] args) {
	
		
//	  for(char cc = 'A'; cc<='Z'; cc++) {
//		  for(char ddd = cc; ddd<='Z'; ddd++) {
//			  System.out.print(ddd);
//		  }
//		  System.out.println();
//	  }
//	 char end = 'Z';
//	  for(char cc = 'A'; cc<='Z'; cc++) {
//		  for(char ddd = cc; ddd<=end; ddd++) {
//			  
//			  System.out.print(ddd);
//		  }
//		  end--;
//		  System.out.println();
//	  }
	  Scanner sc = new Scanner(System.in);
	  
	  int fir,sec,third,temp;//temp변수는 빈변수.. 나중에 이용해서 값들을 치환 예정
	  
	  System.out.println("첫 수 입력");
	  fir = sc.nextInt();
	  System.out.println("두번째 수 입력");
	  sec = sc.nextInt();
	  System.out.println("세번쨰 수 입력");
	  third = sc.nextInt();
		
	  
	  // 가장 큰 수를 찾아서 third 변수에 담기
	  // 여기서 생각할 부분은, 변수에 다른 값이 들어가면, 기존값을 덮어버림.. 따라서
	  // 기존 값을 어딘가에 보관해야함.. 이떄 temp 변수를 사용함.
	  // 첫수가 제일 큰지 확인하기
	  
	  if(fir >= sec && fir >=third) {
		  //fir 의 값을 temp 에 저장하기
		  temp = third;
		  third = fir;
		  fir = temp;
	  }else if(sec >= fir && sec >=third) {
		  temp = third;
		  third = sec;
		  sec = temp;
	  }if(fir >= sec) {
		  temp = sec;
		  sec = fir;
		  fir = temp;
	  }
	  System.out.println(fir + "<=" + sec + "<=" + third);
  }
}