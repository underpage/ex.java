import org.junit.Test;

public class UserDefinedExceptionTest {

	// 사용자 정의 예외
	
	class UserDefinedException extends Exception {

		private static final long serialVersionUID = 5652286005762300221L;

		public UserDefinedException() {
			super("사용자 정의 예외");
		}
		
		public UserDefinedException(String msg) {
			super(msg);
		}
		
	}
	
	@Test
	public void test() throws UserDefinedException {
		throw new UserDefinedException();
	}
	
}