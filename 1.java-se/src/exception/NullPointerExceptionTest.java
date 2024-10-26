package exception;
	
import org.junit.Ignore;
import org.junit.Test;

public class NullPointerExceptionTest {

	// NullPointerException
	// : 인스턴스를 생성하지 않았는데 객체를 참조할 경우 발생  

	@SuppressWarnings("null")
	@Test
	public void primitiveTest() {
		
		try {
			
			final Integer integer = null;
			System.out.println(integer.intValue());
			
		} catch(NullPointerException e) {
			e.printStackTrace();
		}

	}
	
	@SuppressWarnings("null")
	@Test @Ignore
	public void objectTest() {
		
		try {
			
			final Object o = null;
			System.out.println(o.toString());
			
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test @Ignore
	public void methodTest() {
		
		final Object result = this.method(null);
		System.out.println(result);
	
	}

	private Object method(Object obj) {
		return obj;
	}
	
}