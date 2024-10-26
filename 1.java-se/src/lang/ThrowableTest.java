package lang;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

import org.junit.Ignore;
import org.junit.Test;

public class ThrowableTest {

	// Throwable
	// : 오류와 예외 처리를 위한 최상위 클래스
	
	@Test @Ignore
	public void test() {
	
		final Throwable t = new Exception();
		
		// 예외 메시지를 문자열로 반환
		// 예외 메시지가 없을 경우 null이 반환됨
		t.getMessage();
		
		// 예외에 대한 간단한 설명을 문자열로 반환
		t.getLocalizedMessage();
		
		// 예외가 발생한 위치의 스택 트레이스를 콘솔에 출력
		// 기본으로 System.err로 출력
		t.printStackTrace();
		
		// 스택 트레이스를 배열(StackTraceElement)로 반환
		t.getStackTrace();
		
		// 예외 체인의 모든 원인을 배열(Throwable)로 반환
		t.getSuppressed();
		
		// 예외 원인을 설정하며 한 번만 호출 가능
		// 예외를 체이닝하기 위해 사용해 원본 예외 정보는 보존됨
		t.initCause(null);
	
		// 설정한 예외 원인 객체를 반환
		t.getCause();
		
	}
	
	@Test
	public void printStackTraceTest() throws FileNotFoundException {
		
		try {
			
			System.out.println(0/0);
			
		} catch (Exception e) {
			
			// 오류를 파일로 저장
			final PrintWriter writer = new PrintWriter(new FileOutputStream("error.txt"));
			e.printStackTrace(writer);
			writer.close();
			
			// 출력 스크림 변경
			e.printStackTrace(new PrintStream(System.out));
		}
		
	}
	
}