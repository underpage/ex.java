package lang;

import java.lang.Runtime.Version;

import org.junit.Test;

public class VersionTest {

	// Version
	// : 자바 플랫폼에 대한 일관된 버전 정보를 제공하는 클래스
	// : 실행 중인 JVM의 버전 정보에 프로그래밍 방식으로 접근할 수 있음
	// : 배포 스크립트나 가상 환경에서 자바 실행 환경을 검증하는 용도로 사용됨
	

	
	@Test
	public void test() {
		
		// 주어진 값으로 인스턴스 생성
		// JVM의 버전 정보를 변경하지 못하며 비교 용도로 사용됨
		// Version(int major, int minor, int security, int patch);
		// Version.parse(String version);
		
		// 실행중인 JVM 버전 정보 반환
		Version version = Runtime.version();
	
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
		
		// 객체 버전 비교
		version.compareTo(Version.parse("21"));
	
	}

}