package exception;

import org.junit.Test;

public class ClassNotFoundExceptionTest {

	// ClassNotFoundException
	// : 런타임에 클래스 로드시 클래스가 없거나 로드할 수 없는 경우 발생


	
	@Test
	public void test() {
		
		try {
			
			// 클래스 이름을 통해 클래스 동적 로드
			Class.forName("com.example.MyClass");
      
			// 클래스로더를 통해 클래스 이름으로 클래스 로드
			ClassLoader loader = getClass().getClassLoader();
			loader.loadClass("com.example.MyClass");

		} catch (ClassNotFoundException e){
			e.printStackTrace();
        }
		
	}

}