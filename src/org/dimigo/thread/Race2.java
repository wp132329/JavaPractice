package org.dimigo.thread;

public class Race2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread start");
		
		Thread t1 = new Thread(new Runner2("홍길똥"));
		Thread t2 = new Thread(new Runner2("홍길숙"));
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
	}

}
