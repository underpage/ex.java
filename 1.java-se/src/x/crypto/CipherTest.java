package x.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

import org.junit.Test;

public class CipherTest {

	// Cipher 
	// 암호화와 복호화 처리를 지원하는 클래스
	
	@Test
	public void test() throws NoSuchAlgorithmException, NoSuchPaddingException, 
		InvalidKeyException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {
		
		// 대칭키 생성
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();
        
        // 초기화 벡터 생성
        byte[] iv = new byte[12];
        new SecureRandom().nextBytes(iv);
        GCMParameterSpec gcmSpec = new GCMParameterSpec(128, iv);
        
        // 지정한 암호화 알고리즘을 통해 Cipher 객체 생성
        // 암호화 알고리즘 지정시 모드와 패딩 방식을 추가할 수 있음
		Cipher c = Cipher.getInstance("AES/GCM/NoPadding");
		
		// 지정한 키로 암호화나 복호화를 초기화함
		c.init(Cipher.ENCRYPT_MODE, secretKey);
		c.init(Cipher.ENCRYPT_MODE, secretKey, gcmSpec);
		
		// 주어진 데이터를 암호화나 복호화하고 결과를 반환함
		byte[] ciphertext = c.doFinal("데이터".getBytes());
		
		// 암호문을 Base64로 인코딩해 출력
		System.out.println(Base64.getEncoder().encodeToString(ciphertext));
		
	}
	
}