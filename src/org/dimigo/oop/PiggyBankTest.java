package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember[] members = {
				new FamilyMember("아빠"), new FamilyMember("엄마"),
				new FamilyMember("나"), new FamilyMember("남동생"),
		};
		
		PiggyBank piggy = new PiggyBank();
		
		FamilyMember.printMenberCnt();
		PiggyBank.putMoney(members[0], 10000);
		PiggyBank.putMoney(members[1], 5000);
		PiggyBank.putMoney(members[2], 2000);
		PiggyBank.putMoney(members[3], 1000);
		
		piggy.printBalance();
		PiggyBank.putMoney(members[2], 1000);
		piggy.printBalance();
	}

}
