package org.dimigo.inheritance;

public class FigureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle(0, 0, 5);
		Rectangle r = new Rectangle(10, 10, 5, 8);
		Triangle t = new Triangle(20, 20, 5, 8);
		
		System.out.println("원의 넓이 : " + String.format("%.1f",c.calcArea()));
		System.out.println("삼각형의 넓이 : " + t.calcArea());
		System.out.println("사각형의 넓이 : " + r.calcArea());
		System.out.println();
		
		c.printCenter();
		r.printCenter();
		t.printCenter();
		
		System.out.println();
		
		System.out.println("-- 중심좌표 이동(x, y축 5씩)");
		c.moveFigure(5, 5);
		r.moveFigure(5, 5);
		t.moveFigure(5, 5);
		
		System.out.println();
		
		c.printCenter();
		r.printCenter();
		t.printCenter();
	}

}
