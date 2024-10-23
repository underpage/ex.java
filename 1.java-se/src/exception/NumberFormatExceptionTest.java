package exception;

import org.junit.Test;

public class NumberFormatExceptionTest {

	// NumberFormatException
	// : 문자열을 숫자 타입으로 변환할 수 없는 경우 발생   
	// : 변환시 숫자 타입의 범위를 벗어날 경우에도 발생 

	@Test
	public void test() {
		
		try {
			
			// 문자열에 공백이 포함된 경우 
			//final String str = "1 0";
			
			// 숫자로 변환할 수 없는 문자가 포함된 경우 
			//final String str = "one";
			//final String str = "0.1"; 
			//final String str = "0,1"; 
			
			final String str = null;
			int i = Integer.parseInt(str);
			
			System.out.println(i);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
	}
	
}