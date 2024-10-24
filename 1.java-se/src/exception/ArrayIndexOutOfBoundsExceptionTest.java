package exception;

import org.junit.Test;

public class ArrayIndexOutOfBoundsExceptionTest {

	// ArrayIndexOutOfBoundsException
	// : 유효하지 않은 인덱스로 배열 참조시 발생
	
	@Test 
	public void test() {
		
		try {
			
			final int[] arr = {1,2,3,4,5};
			System.out.println(arr[5]);
		
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}

}