package x.crypto;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;

import org.junit.Test;

public class KeyGeneratorTest {

	// KeyGenerator 
	// 대칭키를 생성하는 클래스
	
	@Test
	public void test() throws NoSuchAlgorithmException {
		
		// 주어진 암호화 알고리즘의 KeyGenerator 객체 생성
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		
        // 키 크기 초기화
        // 지원하지 않는 키 길이를 지정하면 익셉션이 발생하거나 기본값이 적용됨
        keyGenerator.init(128);
        
        // 키 크기와 난수 생성기로 초기화
        keyGenerator.init(128, SecureRandom.getInstance("SHA1PRNG"));
        keyGenerator.init(128, new SecureRandom());
        
        // 대칭키 생성
        keyGenerator.generateKey();
        
	}
	
}