/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *		|_SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 *
 * @author		: saeim
 * @version		: 1.0
 *
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone[] phone= {
				new IPhone("iPhone7", "애플", 900000),
				new Galaxy("갤럭시S8", "삼성", 800000),				
		};
		
		for(SmartPhone p:phone) {
			System.out.println(p.toString());
			p.turnOn();
			p.pay();
			p.useSpecialFunction(p);
			p.turnOff();
			System.out.println();
		}

	}

}
