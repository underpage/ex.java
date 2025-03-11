package x.crypto;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

import org.junit.Test;

public class MacTest {

	// Mac (Message Authentication Code)
	// 메시지 인증 코드 생성을 지원하는 클래스
	// 메시지가 전송 중 변경되었는지 확인하기 위해 사용됨
	// 해시 함수와 비슷하나 해시 함수와 달리 비밀 키를 사용함
	
	@Test
	public void test() throws NoSuchAlgorithmException, InvalidKeyException {
		
		KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");
		keyGenerator.init(256);
		SecretKey secretKey = keyGenerator.generateKey();
        
		// 지정한 MAC 알고리즘을 통해 MAC 객체 생성
		Mac mac = Mac.getInstance("HmacSHA256");
		
		// 지정한 키로 초기화
		mac.init(secretKey);
		
		// 주어진 데이터로 업데이트
		mac.update("데이터".getBytes());
		
		// 계산하고 결과 반환
		// 고정된 길이의 값(태그)를 생성함
		byte[] macValue = mac.doFinal();
		
		// MAC 값 검증
		mac.update("데이터".getBytes());
		byte[] newMacValue = mac.doFinal();
		
		Arrays.equals(macValue, newMacValue);
		
	}
	
}