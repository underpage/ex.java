package lang;

import java.lang.Runtime.Version;

import org.junit.Test;

public class VersionTest {

	// Version
	// : Runtime 버전 정보를 제공하는 클래스
	
	@Test
	public void test() {
		
		final Version version = Runtime.version();
	
		// 주 버전 반환
		version.feature();
		
		// 중간 버전 반환
		version.interim();
		
		// 업데이트 버전 반환
		version.update();
		
		// 패치 버전 반환
		version.patch();
		
		// 빌드 정보 반환
		version.build();
	
	}

}