package exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class InvocationTargetExceptionTest {

	// InvocationTargetException
	// : 리플렉션을 통해 메소드를 호출했는데 그 메소드에서 예외가 발생한 경우
	
	public int method() {
		return 10/0;
	}
	
	@Test
	public void test() throws Exception {
		
		try {

			final Method method = InvocationTargetExceptionTest.class.getMethod("method");
			method.invoke(new InvocationTargetExceptionTest());
			
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
	
}