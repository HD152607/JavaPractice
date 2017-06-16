/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

/**
 * <pre>
 * org.dimigo.io
 *		|_ArakoMenu
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 16.
 * </pre>
 *
 * @author		: saeim
 * @version		: 1.0
 *
 */
public class ArakoMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Writer writer=new BufferedWriter(new FileWriter("files/menu.txt"));
			BufferedReader reader=new BufferedReader(new FileReader("files/menu.txt"))){
			
			// 키보드로 메뉴를 한 줄씩 입력받아 파일에 저장하기
			String data;
			while((data = br.readLine()) != null){
				writer.write(data);
				writer.write("\n");
			}
			writer.close();
			
			// 파일에서 한 줄씩 읽어와서 모니터로 출력하기
			System.out.println("<< 메뉴 출력 >>");
			String inputData;
			while((inputData = reader.readLine()) != null){
				System.out.println(inputData);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
