package exception;

import org.junit.Test;

public class ArrayStoreExceptionTest {

	// ArrayStoreException
	// : 배열에 지정된 데이터 타입이 아닌 데이터로 저장을 시도할 경우 발생
	
	@Test
	public void test() {
		
		try {
			
			final Object[] obj = new Integer[10];
			obj[0] = "0";
		
		} catch(ArrayStoreException e) {
			e.printStackTrace();
		}
		
	}
	
}