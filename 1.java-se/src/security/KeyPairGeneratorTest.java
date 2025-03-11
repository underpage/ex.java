package security;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.RSAKeyGenParameterSpec;

import org.junit.Test;

public class KeyPairGeneratorTest {

	// KeyPairGenerator 
	// 비대칭키(공개키) 생성을 지원하는 클래스

	@Test
	public void test() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
	
		KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
		
		// 키 크기 지정
		kpg.initialize(2048);
		
        // 키 크기와 난수 생성기 지정
		kpg.initialize(2048, SecureRandom.getInstanceStrong());
        
        // 알고리즘 매개변수 지정
		kpg.initialize(new RSAKeyGenParameterSpec(2048, RSAKeyGenParameterSpec.F4));
		
		// KeyPair 객체 생성
		KeyPair keyPair = kpg.generateKeyPair();
		
		// 공개키 반환
		keyPair.getPublic();
		
		// 개인키 반환
		keyPair.getPrivate();
		
	}
	
}