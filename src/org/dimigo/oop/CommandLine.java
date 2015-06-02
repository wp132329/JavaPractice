package org.dimigo.oop;

import java.util.Arrays;

public class CommandLine {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("프로그램 사용법");
			System.out.println("Java CommandLine args1 args2");
			System.exit(0);
		}
		
		System.out.println(Arrays.toString(args));
		
			
	}

}
