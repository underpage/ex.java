package x.crypto;

import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.junit.Test;

public class SecretKeyTest {

	// SecretKey 
	// 대칭키를 나타내는 인터페이스
	// 암호화와 복호화에 사용되는 비밀키의 표준을 정의함
	
	@Test
	public void test() throws NoSuchAlgorithmException {
		
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);

        // 대칭키 생성
        SecretKey secretKey = keyGenerator.generateKey();
        
        // 알고리즘 이름 반환
        secretKey.getAlgorithm();
        
        // 포맷 이름 반환
        secretKey.getFormat();
        
        // 인코딩된 바이트 배열 반환
        secretKey.getEncoded();
        
	}
	
}