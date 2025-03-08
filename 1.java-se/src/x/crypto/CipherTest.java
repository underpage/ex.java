package x.crypto;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

import org.junit.Test;

public class CipherTest {

	// Cipher 
	// 암호화와 복호화 처리를 지원하는 클래스
	
	@Test
	public void test() throws NoSuchAlgorithmException, NoSuchPaddingException, 
		InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();
        
		// 지정한 알고리즘을 통해 Cipher 객체 생성
        // 알고리즘 지정시 모드와 패딩 방식을 추가할 수 있음
		Cipher c = Cipher.getInstance("AES/GCM/NoPadding");
		
		// 지정한 키로 암호화나 복호화를 초기화함
		c.init(Cipher.ENCRYPT_MODE, secretKey);
		
		// 주어진 데이터를 암호화나 복호화하고 결과를 반환함
		c.doFinal(Base64.getDecoder().decode("데이터"));
		
	}
	
}