package javaStudy.day2;

import java.util.Scanner;

public class StringExam {
	public static void main(String[] args) {
		
		int a = 10;
		
		String str = null;
		
		System.out.println(str);
		
		str = "안녕";
		System.out.println(str);
		
		String str2 = "안녕";
		
	    if(str == str2) {//같은 instance 인지 비교함.
	    	System.out.println("같은 객체 입니다. 당연히 값도 같습니다.");
	    }
	    
	    //생성자(내일 배움)을 이용해서 같은 값의 문자열 객체 생성해보기
		str2 = new String("안녕");
		if(str == str2) {
			System.out.println("같은 객체 입니다. 당연히 값도 같습니다.");
		}else {
			System.out.println("틀린 객체 입니다. 값이 같은지는 모르겠네요.");
		}
		//다른 문자열 객체간의 값이 같은지를 문자열 객체의 메서드를 이용해서 알아보자
		
		if(str2.equals(str)) {
			System.out.println("같은 객체인지 모르지만, 값은 같네요");
		}else {
			System.out.println("같은 객체인지 모르지만, 값은 틀리네요");
		}
		
	   String str3 ="ABC";
	   String str4 ="abc";
	   
	   if(str3.equalsIgnoreCase(str4)) {
		   System.out.println("같은 문자열 값");
	   }
	   
	   System.out.println(str3.charAt(0));
	   int leng = str4.length();
	   
	   System.out.println(leng);
	   for(int i = 0; i<str4.length(); i++) {
		   char ch = str4.charAt(i);
		   System.out.println(ch);
	   }
	   
	   String myName = "김승민";
	   for(int i = 0; i<myName.length(); i++) {
		   System.out.println(myName.codePointAt(i));
		   System.out.println((char)myName.codePointAt(i));
	   }
	   
	   
	   //concat(str) : + 와 같은 역할.. 문자열을 합친 새로운 객체 (instance)를 생성해서 그 ref 를 리턴 시킨다.
	   
//	   String mymail = "abs@naver.com";
//	   if(mymail.endsWith(".com")) {
//		   System.out.println(".com 으로 끝나네요.");
//	   }
//	   
//	   System.out.println(mymail);
	   /*
	    * 이메일을 입력 받아서 노가다로 검증하는 로직을 작성합니다.
	    * 이메일은 @ 을 기준으로 앞은 id, 뒤는 메일 서버로 구분됩니다.
	    * 때문에 @ 를 기준으로 분리 해야 하는데, 이떄 subString() 이용하면 편리함.
	    * 분리된 이메일은 ID 는 6~10 자 사이여야 하고, 반드시 영문자와 , 숫자로만 구성되어야 하며,
	    * 첫자로는 숫자가 올수 없어야 합니다.
	    * 서버는 반드시 .com, .net, co.kr로 끝나야 홥니다.
	    * 이 조건을 검증하는 로직을 작성하고, 만약 위배시엔 어떤 조건을 위배했는지에 대한 내용을 콘솔에 찍어야합니다.
	    * ex>id 의 첫자에 숫자가 있음.. 이럼 안뎀 .. 뭐 이런식으로 
	    *  
	    */
//	    int atidx = -1;
//	    String eId, mailServer;
//	   if(mymail.indexOf('@') != -1) {
//		   atidx = mymail.indexOf('@');
//		   
//		   mailServer = mymail.substring(atidx+1);
//		   System.out.println(mailServer);
//	   }
//	   
//	   System.out.println(" hello ".trim().length());
//	   
	   
	   
	   Scanner sc = new Scanner(System.in);
	   
	   String mail,mailServer,iDe;
	   
	   System.out.println("이메일을 입력하세요.");
	   mail = sc.nextLine();
	   int atidx = -1;
		   atidx = mail.indexOf('@');
		   mailServer = mail.substring(atidx+1);
//		   System.out.println(mailServer);
	       iDe = mail.substring(0,atidx).trim();
//	       System.out.println(iDe);
	  if(mailServer.endsWith(".com") || mailServer.endsWith(".co.kr") || mailServer.endsWith(".net") ) {
//		  System.out.println("축");
	  }else {
		  System.out.println("서버쪽 문제가 심각합니다.");
	  }if(6<=iDe.length() && iDe.length()<=10 ) {
//		System.out.println("통과입니다.");  
	  }else {
		  System.out.println("아이디를 6자에서 10자 사이로 해주세요");
	  }if(iDe.matches("")) {
		  System.out.println("축하합니다.");
	  }else {
		  System.out.println("공백이랑 문자 확인해주세요 영문과 숫자만 가능합니다.");
	  }
	   
	   
	   
	   
	   
	   
	   
	}
}
