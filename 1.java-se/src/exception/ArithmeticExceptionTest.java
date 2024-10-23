package exception;

import org.junit.Test;

public class ArithmeticExceptionTest {

	// ArithmeticException
	// : 수학적으로 올바르지 못한 계산 시도시 발생 
	// : 모든 산술 연산에 해당하지 않음
	
	@Test
	public void test() {
		
		try {
			
			// 정수 0으로 나눌 경우 예외가 발생하지만 
			// 실수 0.0으로 나눌 경우 NaN 반환 
			System.out.println( 10 % 0 );
			
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	
}