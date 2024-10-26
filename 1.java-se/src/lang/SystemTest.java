package lang;

import org.junit.Test;

public class SystemTest {

	// System
	// : 유틸리티 클래스 (상속이나 인스턴스 불가)
	// : 시스템 관련 기능 제공 (키보드 입출력, 시스템 프로퍼티, JVM 실행 종료 등)
	
	@Test
	public void test() {
		
		// 프로퍼티 지정
		System.setProperty("key", "value");
		
		// 지정된 프로퍼티 반환
		System.getProperty("os.name");
		System.getProperty("java.version");

		// 지정된 모든 프로퍼티 반환
		System.getProperties();
		
		// 지정된 환경 변수 반환
		System.getenv("key");

		// 콘솔 접근
		System.console();
		
		// 현재 시간을 밀리초 단위로 반환
		System.currentTimeMillis();
		
		// 현재 시간을 나노초 단위로 단환
		System.nanoTime();
		
		// 객체의 해시 코드 반환
		// 객체의 메모리 주소를 기반으로 하는 해시 코드로 객체를 식별할 수 있음
		System.identityHashCode("문자열");
		
		// GC 실행 요청
		System.gc();
		
		// 자바 프로그램 종료
		System.exit(0);
		
		// System.out
		// 표준 출력 스트림
		// 버퍼링된 스트림으로 데이터가 버퍼에 저장되었다가 일정량이 차면 한 번에 출력
		
		// System.err
		// 표준 오류 출력 스트임
		// 문자열이 즉시 출력됨
		
		// System.in
		// 표준 입력 스트림
		
	}
	
	
}