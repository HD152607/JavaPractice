/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *		|_PersonTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author		: saeim
 * @version		: 1.0
 *
 */
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person("Tom");
		Korean k=new Korean("홍길동");
		Japanese j=new Japanese("다나카");
		Chinese c=new Chinese("왕밍");
		
		System.out.println(p.toString());
		System.out.println(k.toString());
		System.out.println(j.toString());
		System.out.println(c.toString());
		
		System.out.println();
		
		System.out.println("Hello");
		k.sayHello();
		j.sayHello();
		c.sayHello();
		
		System.out.println();
		
		System.out.println("Bye");
		k.sayBye();
		j.sayBye();
		c.sayBye();

	}

}
