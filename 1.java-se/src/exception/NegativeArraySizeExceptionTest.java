package exception;

import org.junit.Test;

public class NegativeArraySizeExceptionTest {

	// NegativeArraySizeException
	// : 배열의 크기를 음수로 지정하는 경우 발생

	@Test
	public void test() {
		
		try {

			final int[] array = new int[-1];
			System.out.println(array[0]);
			
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();	
		}
		
	}
	
}