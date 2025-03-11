package x.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.junit.Test;

public class KeyGeneratorTest {

	// KeyGenerator 
	// 대칭키 생성을 지원하는 클래스
	
	@SuppressWarnings("unused")
	@Test
	public void test() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		
		// 지정한 암호화 알고리즘의 KeyGenerator 객체 생성
        KeyGenerator kg = KeyGenerator.getInstance("AES");
		
        // 키 크기 지정
        // 지원하지 않는 키 길이를 지정하면 익셉션이 발생하거나 기본값이 적용됨
        kg.init(128);
        
        // 키 크기와 난수 생성기로 지정
        kg.init(128, SecureRandom.getInstanceStrong());
        
        // 대칭키 생성
        SecretKey secretKey = kg.generateKey();
        
	}
	
}