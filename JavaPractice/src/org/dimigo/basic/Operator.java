/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	|_ Operator
 *
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author		: Chimes
 * @version		: 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int salary=1700000;
		int staff=3;
		int store=1500;
		
		long res;
		
		res=salary*12L*staff*store;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", salary) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", staff) + "명");
		System.out.println("점포 수 : " + String.format("%,d", store) + "개");
		System.out.printf("\n");
		System.out.println("연간 인건비 : " + String.format("%,d", res) + "원");
	}

}
