package x.crypto;

import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.junit.Test;

public class SecretKeyTest {

	// SecretKey 
	// 대칭키를 나타내는 인터페이스
	// 암호화나 복호화에 사용되는 비밀 키의 표준을 정의함
	
	@Test
	public void test() throws NoSuchAlgorithmException {
		
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);

        // 대칭키 생성
        SecretKey secretKey = keyGenerator.generateKey();
        
        // 키의 알고리즘 반환
        secretKey.getAlgorithm();
        
        // 키의 포맷 반환
        secretKey.getFormat();
        
        // 인코딩된 키 반환
        secretKey.getEncoded();
        
	}
	
}