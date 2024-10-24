package exception;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.junit.Test;

public class MissingResourceExceptionTest {

	// MissingResourceException 
	// : 특정 리소스를 찾을 수 없는 경우 발생

	@Test
	public void test() {
        try {
        	
    		final ResourceBundle bundle = ResourceBundle.getBundle("messages");
    		final String value = bundle.getString("key");
    		System.out.println(value);
    		
        } catch (MissingResourceException e) {
            e.printStackTrace();
        }
		
	}
	
}