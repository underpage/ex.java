package exception;

import org.junit.Test;

public class ClassNotFoundExceptionTest {

	// ClassNotFoundException
	// : Class.forName(), loadClass(), findSystemClass() 메소드를 사용하여 클래스 로드시 
	//    해당 클래스가 없거나 로드 할 수 없는 경우 발생 
	
	// + NoClassDefFoundError
	
	
	
	@Test
	public void test() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
      
		} catch (ClassNotFoundException e){
			e.printStackTrace();
        }
		
	}
	
}