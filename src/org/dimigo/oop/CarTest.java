package org.dimigo.oop;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("<< �ڵ��� ��� >>");
		car.setCompany("�����ڵ���");
		car.setModel("���׽ý�");
		car.setColor("������");
		car.setMaxSpeed(225);
		car.setPrice(50000000);
		
		System.out.println("������ : "+ car.getCompany());
		System.out.println("�𵨸� : "+ car.getModel());
		System.out.println("���� : "+ car.getColor());
		System.out.println("�ִ�ӵ� : "+ car.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d",car.getPrice())+"��");
		System.out.println();
		
		car.setCompany("����ڵ���");
		car.setModel("K7");
		car.setColor("���");
		car.setMaxSpeed(246);
		car.setPrice(40000000);
		
		System.out.println("������ : "+ car.getCompany());
		System.out.println("�𵨸� : "+ car.getModel());
		System.out.println("���� : "+ car.getColor());
		System.out.println("�ִ�ӵ� : "+ car.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d",car.getPrice())+"��");
		System.out.println();
		
		car.setCompany("�Ｚ�ڵ���");
		car.setModel("SM7");
		car.setColor("ȸ��");
		car.setMaxSpeed(200);
		car.setPrice(38000000);
		
		System.out.println("������ : "+ car.getCompany());
		System.out.println("�𵨸� : "+ car.getModel());
		System.out.println("���� : "+ car.getColor());
		System.out.println("�ִ�ӵ� : "+ car.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d",car.getPrice())+"��");
		System.out.println();
	}
}
