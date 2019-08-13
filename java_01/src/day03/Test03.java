package day03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		int score;

		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		// score = input.nextInt();
		// input.nextLine();
		score = Integer.parseInt(input.nextLine());

		input.close();
		input = null;
		// 유효성 검사

		if (!(score > 0 && score <= 100)) {
			System.out.println("유효하지 않은 점수입니다.");
			return; // 현재 수행중인 함수를 종료하고 호출한 자리로 돌아가는 문장
		}

		else {
			/*
			 * if(score>=80) { System.out.println("Pass"); } else
			 * System.out.println("Fail");
			 */

			// 삼항연산으로 처리

			String result;
			result = score >= 80 ? "Pass" : "Fail";

			// System.out.println("점수 : " + score);
			// System.out.println(score >= 80 ? "Pass" : "Fail");

			String grade;

			/*
			// A,B,C,D,F 등급처리
			if (score >= 90)
				grade = "A";
			else if (score >= 80)
				grade = "B";
			else if (score >= 70)
				grade = "C";
			else if (score >= 60)
				grade = "D";
			else
				grade = "F";

			System.out.println("점수 : " + score + " : " + result + " : " + " 등급 : " + grade);
			*/
			
			grade = score >= 90 ? "A" : (score>=80 ? "B" : score>=70 ? "C" : score>=60 ? "D" : "F");
			
			System.out.println("점수 : " + score + " : " + result + " : " + " 등급 : " + grade);
			
			System.out.println("********************등급처리 switch********************");
			
			switch (score/10) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				break;
			}
			
			
			System.out.println("점수 : " + score + " : " + result + " : " + " 등급 : " + grade);
			
			return;

		}

	}

}
