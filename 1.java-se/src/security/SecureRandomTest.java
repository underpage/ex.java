package security;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.junit.Test;

public class SecureRandomTest {

	// SecureRandom
	// Random 클래스보다 보안적으로 더 강력한 난수를 생성하는 클래스
	// 암호화에 사용되는 키의 엔트로피 소스로 사용됨
	// 엔트로피 소스란 예측 불가능한 무작위성의 원천을 의미함
	
	@SuppressWarnings("unused")
	@Test
	public void test() throws NoSuchAlgorithmException {
		
		// 기본 생성
		SecureRandom sr = new SecureRandom();
		
		// 알고리즘 지정
		sr = SecureRandom.getInstance("SHA1PRNG");
		
		// 시스템이 제공하는 가장 강력한 알고리즘을 사용한 SecureRandom 인스턴스 반환
		sr = SecureRandom.getInstanceStrong();
		
		// 지정한 바이트 수의 난수 시드를 생성해 반환함
		byte[] seed = SecureRandom.getSeed(16); 

		// 인스턴스를 초기화하거나 기존 인스턴스에 추가 시드를 제공함
		sr = new SecureRandom(seed);
		sr.setSeed(seed);
		
		// 바이트 배열을 난수로 채움
		byte[] byte64 = new byte[64];
		sr.nextBytes(byte64);
		
		// 난수를 정수로 반환
		sr.nextInt();
		
		// 0~(bound-1) 범위의 난수 반환
		sr.nextInt(1000);
		
		// 0.0~1.0 범위의 난수 반환
		sr.nextFloat();
		sr.nextDouble();
		
		// 난수의 불리언 값 반환
		sr.nextBoolean();
		
	}

	@SuppressWarnings("unused")
	@Test
	public void KeyGeneratorTest() throws NoSuchAlgorithmException, NoSuchProviderException {
		
		// SecureRandom을 사용한 암호화 키 생성
		// 난수 생성기의 난수 수준이 보장되지 않는다면 생성된 키의 윤곽이 들어날 수 있음
		
		SecureRandom sr = SecureRandom.getInstanceStrong();
		
		byte[] byte64 = new byte[64];
		sr.nextBytes(byte64);
		
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(256, sr);

		SecretKey key = keyGen.generateKey();

	}

}