package exception.net;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;

import org.junit.Test;

public class SSLExceptionTest {

	// SSLException
	// : SSL/TLS 연결 중 문제가 생길 경우 발생
	
	@Test
	public void test() {
		
		try {
			
			// 유효하지 않은 인증서를 가진 서버
			final URL url = new URI("https://self-signed.badssl.com/").toURL();
			final HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            
			connection.connect();
            System.out.println("Response Code: " + connection.getResponseCode());
            
		} catch (SSLException e) {
			e.printStackTrace();	
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}