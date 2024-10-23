package error;

import org.junit.Test;

public class ExceptionInInitializerErrorTest {

	// ExceptionInInitializerError  
	// : 클래스 초기화 중 예외가 발생
	// : 스태틱 블록이나 스태틱 변수 초기화 중 발생
	
	static {
		if(true) {
			throw new RuntimeException("Exception");
		}
	}
    
	@Test
	public void test() {
		System.out.println("ExceptionInInitializerErrorTest");
	} 
	
}