package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("내가 프로젝트로 사용하고 있는 프로그램의 이름은?");
		String answer = scanner.nextLine();
		if (answer.equalsIgnoreCase("videoscribe")) {
			System.out.println("정답입니다!!");
		} else System.out.println("틀렸습니다.");
		System.out.println();
		
		System.out.println("내 나이는?");
		String answer2 = scanner.nextLine();
		if (answer2.equals("18")) {
			System.out.println("정답입니다!!");
		} else System.out.println("틀렸습니다.");
		System.out.println();
		
		System.out.println("내가 다니고 있는 학교의 이름은?");
		String answer3 = scanner.nextLine();
		if (answer3.equals("디미고") || answer3.equals("한국디지털미디어고등학교")) {
			System.out.println("정답입니다!!");
		} else System.out.println("틀렸습니다.");
		System.out.println();
	}
}
