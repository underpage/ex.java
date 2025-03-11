package security;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;

public class MessageDigestTest {

	// MessageDigest
	// 해시 함수 구현을 지원하는 클래스
	// 단순 해시 계산만 수행하며 더 높은 보안성이 필요한 경우 Mac 클래스 사용

	@Test
	public void test() throws NoSuchAlgorithmException, CloneNotSupportedException {
		
		String message = "message";
		
		// 주어진 해시 알고리즘으로 인스턴스 생성
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		
		// 알고리즘 이름 반환
		md.getAlgorithm();
		
		// 해시 길이 반환
		md.getDigestLength();
		
		// 프로바이더 정보 반환
		md.getProvider();
		
		// 현재 인스턴스 복제
		md = (MessageDigest) md.clone();
		
		// 내부 상태 초기화
		// 해시 계산 완료 후 동일한 객체로 다시 해시 계산을 하려면 초기화해야 함
		md.reset();
		
		// 해시를 계산할 데이터를 객체에 추가
		md.update(message.getBytes());
		
		// update를 통해 추가한 데이터의 해시를 계산하거나 주어진 데이터를 바로 해시함
		byte[] bytes = md.digest(message.getBytes(StandardCharsets.UTF_8));

		StringBuffer sb = new StringBuffer();
		for(byte b : bytes){
			// %02x : 바이트 값을 두 자리 16진수로 변환하는 포맷 지정자
			sb.append(String.format("%02x", b));
		}

		System.out.println(sb);

	}
	
}