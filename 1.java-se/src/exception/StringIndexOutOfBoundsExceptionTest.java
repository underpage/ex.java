package exception;

import org.junit.Test;

public class StringIndexOutOfBoundsExceptionTest {

	// StringIndexOutOfBoundsException
	// : 문자열 길이를 넘어선 개수로 문자열 접근 시도할 경우 발생 
	
	// + ArrayIndexOutOfBoundsException
	// + IndexOutOfBoundsException
	
	@Test
	public void test() {
		
		try {
			
			final String str = "StringIndexOutOfBoundsException";
			final int length = str.length();
			
			System.out.println(str.substring(0, (length + 1)));
			
		} catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}
	
}