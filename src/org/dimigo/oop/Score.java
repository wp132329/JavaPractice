package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
			
	 StringBuilder sb = new StringBuilder();
	 System.out.println();
	 sb.append("<< 점수 출력 >>\n")
	 .append("국어 점수 : ")
	 .append(kor)
	 .append("\n수학 점수 : ")
	 .append(mat)
	 .append("\n영어 점수 : ")
	 .append(eng)
	 .append("\n총점 :  ")
	 .append(kor+mat+eng)
	 .append("\n평균 :  ")
	 .append(String.format("%.1f", (kor+mat+eng)/ 3.0));
	 
	 System.out.println(sb);
	}

}
