package exception;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class MalformedURLExceptionTest {

	// MalformedURLException
	// : URL의 프로토콜 형식이 잘못되었거나 누락된 경우 발생 
	
	@Test
	public void test() {
		
		try {
			
			final URL url = new URI("hxxp://google.com").toURL();	
			System.out.println(url.getProtocol());

		} catch (MalformedURLException e) {
			e.printStackTrace();
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
	}
	
}
