package exception;

import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;

public class ClassCastExceptionTest {

	// ClassCastException
	// : 적절하지 않은 형변환을 시도할 경우 발생  

	@Test @Ignore
	public void castChdilClassTypeTest() {
	
		try {
			
			// 상위 클래스를 하위 클래스 타입으로 캐스팅할 경우 
			final Object obj = new Object();
			System.out.println((String) obj);
			
		} catch(ClassCastException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test 
	public void castNonExtendClassTest() {
	
		try {
			
			// 관계없는 클래스 타입으로 캐스팅할 경우  
			final Object obj = new Random();
			System.out.println((String) obj);
			
		} catch(ClassCastException e) {
			e.printStackTrace();
		}
		
	}
	
}