/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *		|_Question
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 *
 * @author		: saeim
 * @version		: 1.0
 *
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] questions={"1. 가장 좋아하는 가수는?", "2. 가장 좋아하는 배우는?", "3. 가장 좋아하는 과목은?"};
		String[] answers={"신화", "이민호", "3D"};
		
		// 1
		System.out.println(questions[0]);
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		
		if(answer.equals(answers[0])) {
			System.out.println("정답입니다!");
		}
		else {
			System.out.println("틀렸습니다!");
		}
		
		// 2
		System.out.println(questions[1]);
		Scanner scanner1 = new Scanner(System.in);
		String answer1 = scanner1.nextLine();
		
		if(answer1.equals(answers[1])) {
			System.out.println("정답입니다!");
		}
		else {
			System.out.println("틀렸습니다!");
		}
		
		// 3
		System.out.println(questions[2]);
		Scanner scanner2 = new Scanner(System.in);
		String answer2 = scanner2.nextLine();
		
		if(answer2.equals(answers[2])) {
			System.out.println("정답입니다!");
		}
		else {
			System.out.println("틀렸습니다!");
		}
		
		// 결과
		System.out.println("<< 결과 출력 >>");
		StringBuilder sb = new StringBuilder();
		
		for (int i=0;i<3;i++) {
			sb.append(questions[i]).append(" ").append(answers[i]).append("입니다.\n");
		}

		System.out.println(sb);
		
		scanner.close();
		scanner1.close();
		scanner2.close();
	}

}
