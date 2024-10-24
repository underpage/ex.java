package exception;

import org.junit.Test;

public class IllegalArgumentExceptionTest {

	// IllegalArgumentException
	// : 메소드가 잘못되었거나 메소드에 잘못된 인수를 전달하는 경우 발생  
	
	class Example {
		
		public Example(Object...o) {
			throw new IllegalArgumentException();
		}
		
	}
	
	@Test
	public void test() {

		new Example("test");
		
	}
	
}