package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.Test;

public class InputMismatchExceptionTest {

	// InputMismatchException
	// : 사용자가 입력하는 데이터가 정의한 데이터 타입이 아닌 경우 발생

	@Test
	public void test() {
		
		try(final Scanner s = new Scanner(System.in)) {
			
			System.out.println("숫자 입력 >>");
			System.out.println("결과 : " + s.nextInt());
			
		} catch(InputMismatchException e){
			
			System.out.println("잘못입력했습니다. " );
			e.printStackTrace();
			
		} 
		
	}
	
}