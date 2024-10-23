package exception.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Test;

public class UnknownHostExceptionTest {

	// UnknownHostException
	// : 호스트의 IP 주소를 확인할 수 없는 경우 발생
	// - 호스트 명 입력 확인
	// - DNS 서버 문제 확인
	
	@Test
	public void test() {
	
		try {
			
			final InetAddress ia = InetAddress.getByName("example");
			System.out.println(ia.getHostName());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	
}