/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *		|_PiggyBankTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author		: saeim
 * @version		: 1.0
 *
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FamilyMember d=new FamilyMember("아빠");
		d.getMemberName();
		
		FamilyMember m=new FamilyMember("엄마");
		m.getMemberName();
		
		FamilyMember i=new FamilyMember("나");
		i.getMemberName();
		
		FamilyMember b=new FamilyMember("남동생");
		b.getMemberName();

		PiggyBank.putMoney(d, 10000);
		PiggyBank.putMoney(m, 5000);
		PiggyBank.putMoney(i, 2000);
		PiggyBank.putMoney(b, 1000);
		
		FamilyMember.printMemberCnt();

		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(i, 1000);
		
		PiggyBank.printBalance();

	}

}
