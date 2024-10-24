package exception;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

public class IllegalStateExceptionTest {

	// IllegalStateException
	// : 부적절한 시기에 메소드 사용시 발생 

	
	
	@Test
	public void test() {

		try {
			
			final Iterator<Integer> list = Arrays.asList(1,2,3,4,5).iterator();
			
			list.remove();
			
		} catch(IllegalStateException e) {
			e.printStackTrace();
		}
		
	}
	
}