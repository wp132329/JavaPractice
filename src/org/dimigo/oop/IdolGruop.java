package org.dimigo.oop;


public class IdolGruop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		
		String[][]  member = {
				new String[] {"GD", "태양", "대성", "탑", "승리"},
				new String[] {"CL", "산다라박", "박봄", "민지"},
				new String[] {"유라", "소진","민아","혜리", "그외"}
		};
		
		// for문
		for(int i = 0; i<idolGroup.length; i++) {
			System.out.println("<< " + idolGroup[i]+" 멤버 >>");
			for(int j = 0; j<member[i].length; j++) {
				System.out.println(member[i][j]);
			}
			System.out.println();
		}
	}
}
