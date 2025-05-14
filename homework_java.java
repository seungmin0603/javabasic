package home_java;

import java.util.Scanner;

public class homework_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rock = "바위"; // 0
		String scissors = "가위"; // 1
		String paper = "보"; // 2
		Scanner sc = new Scanner(System.in);
		int loopCount = 0;
//		String input = sc.nextLine();
		
		int draw = 0;
		int win = 0;
		int rose =0;
		
//		int random = (int)(Math.random()*3);
		
//	    System.out.println(random);
		
		while(true) {
			
			System.out.println("가위 바위 보!!");
			
			String input = sc.nextLine();
			
			int random = (int)(Math.random()*3);
			
			loopCount++;
			
			if(rock.equals(input) && random == 0) {
				draw++;
				System.out.println("컴 바위!! 너 바위 무승부!!");
				System.out.println("총 전적 " + loopCount + "전 " + win +"승 " + draw +"무 "+ rose + "패 ");
			}
			if(scissors.equals(input) && random == 1) {
				draw++;
				System.out.println("컴 가위!! 너 가위 무승부!!");
				System.out.println("총 전적 " + loopCount + "전 " + win +"승 " + draw +"무 "+ rose + "패 ");
			}
			if(paper.equals(input) && random == 2) {
				draw++;
				System.out.println("컴 보!! 너 보 무승부!!");
				System.out.println("총 전적 " + loopCount + "전 " + win +"승 " + draw +"무 "+ rose + "패 ");
			}//무승부 여기 까지
			if(rock.equals(input) && random == 1) {
				win++;
				System.out.println("컴 가위!! 너 바위 승리!!");
				System.out.println("총 전적 " + loopCount + "전 " + win +"승 " + draw +"무 "+ rose + "패 ");
			}
			if(rock.equals(input) && random == 2) {
				rose++;
				System.out.println("컴 보!! 너 바위 패배!!");
				System.out.println("총 전적 " + loopCount + "전 " + win +"승 " + draw +"무 "+ rose + "패 ");
			} // 내가 바위 
			if(scissors.equals(input) && random == 0) {
				rose++;
				System.out.println("컴 바위!! 너 가위 패배!!");
				System.out.println("총 전적 " + loopCount + "전 " + win +"승 " + draw +"무 "+ rose + "패 ");
			}
			if(scissors.equals(input) && random == 2) {
				win++;
				System.out.println("컴 보!! 너 가위 승리!!");
				System.out.println("총 전적 " + loopCount + "전 " + win +"승 " + draw +"무 "+ rose + "패 ");
			}// 내가 가위
			if(paper.equals(input) && random == 0) {
				win++;
				System.out.println("컴 바위!! 너 보 승리!!");
				System.out.println("총 전적 " + loopCount + "전 " + win +"승 " + draw +"무 "+ rose + "패 ");
			}
			if(paper.equals(input) && random == 1) {
				rose++;
				System.out.println("컴 가위!! 너 보 패배!!");
				System.out.println("총 전적 " + loopCount + "전 " + win +"승 " + draw +"무 "+ rose + "패 ");
			}
			System.out.println("더 할래? (y or n)");
			String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") ) {
				
			}if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
				System.out.println("여기서 끝!!");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
