package lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Ignore;
import org.junit.Test;

public class RuntimeTest {

	// Runtime
	// : 현재 실행중인 JVM과 상호작용하기 위한 클래스

	@Test @Ignore
	public void test() {
		
		// 인스턴스 생성
		// Runtime 클래스는 싱글톤 패턴으로 구현
		final Runtime run = Runtime.getRuntime();
		
		// JVM이 현재 사용 중인 총 메모리 양
		run.totalMemory();
		
		// JVM에서 현재 사용 가능한 메모리 양
		run.freeMemory();
		
		// JVM이 사용하려고 시도할 최대 메모리 양
		run.maxMemory();

		// 사용 가능한 프로세서 수 반환
		run.availableProcessors();
		
		// Shutdown Hook 등록
		// System.exit() 호출이나 프로그램 종료시 호출되는 메소드
		run.addShutdownHook(new Thread(() -> {
		    System.out.println("프로그램 종료 전 호출");
		}));
		
		// GC 실행 요청
		run.gc();

		// JVM 종료
		run.exit(0);
		
		// JVM 즉시 강제 종료
		run.halt(1);
	}
	
	
	@Test
	public void execTest() throws InterruptedException {
		
		// exec()
		// : 외부 프로그램 실행
		
		final Runtime runtime = Runtime.getRuntime(); 
		Process process = null;
		BufferedReader reader = null;
		
		try {

			String charset;
			String[] command;
			String os = System.getProperty("os.name").toLowerCase();
			
			if(os.contains("windows")) {
				charset = "EUC-KR";
				command = new String[] {"cmd", "/c", "dir"};
			} else {
				charset = "UTF-8";
				command = new String[] {"ls", "-l"};
			}

			process = runtime.exec(command);
			reader = new BufferedReader(new InputStreamReader(process.getInputStream(), charset));
			
			String s = "";
			while((s = reader.readLine()) != null) {
				System.out.println("line: " + s);
			}
			
			process.waitFor();
			
		} catch (IOException e) {
			e.getMessage();
			
		} finally {
			process.destroy();
		}

	}

}