package lang;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;

public class ProcessBuilderTest {

	// ProcessBuilder
	// : 외부 프로세스를 실행하거나 제어하기 위한 클래스
	// : 명령어를 작성하면 이를 운영체제 명령어 해석기에 전달하여 실행됨
	// : 기존의 Runtime.exec()를 대체하기 위해 개발됨

	
	
	@Test @Ignore
	public void test() throws IOException, InterruptedException {
		
		
		ProcessBuilder pb = new ProcessBuilder();
		
		// 현재 작업 디렉토리 반환
		pb.directory();
		
		// 작업 디렉토리 지정
		pb.directory(new File("/path"));
		
		// 현재 명령어 반환
		pb.command();
		
		// 명령어 지정
		pb.command(new String[] {"curl", "https://google.com"});

		// 환경 변수 지정
		pb.environment().put("VAR_NAME", "value");
		
		// 결과와 오류를 하나로 합침
		pb.redirectErrorStream(true);
		
		// 프로세스 실행
		Process p = pb.start();

		// 타임 아웃 설정
		// 명령어가 5초이내 완료되지 않으면 TimeoutException 발생
		p.waitFor(5, TimeUnit.SECONDS);
		
		// 프로세스 정보 얻기
		p.toHandle();
		
		// 결과 읽기
		p.getInputStream();
		
		// 오류 읽기
		p.getErrorStream();

		// 입력을 파일로 리다이렉션
		pb.redirectInput(ProcessBuilder.Redirect.from(new File("input.txt")));
		
		// 결과를 파일로 리다이렉션
		pb.redirectOutput(ProcessBuilder.Redirect.to(new File("output.txt")));
		
		// 오류를 파일로 리다이렉션
		pb.redirectError(ProcessBuilder.Redirect.to(new File("error.txt")));
		
		// 프로세스 종료 코드 반환
	    p.waitFor();
	    
	    // 정상 종료 시도
	    p.destroy();

	    // 강제 종료
	    p.destroyForcibly();

	}
	
	
	@Test @Ignore
	public void commandTest() {
		
		try {
			
			ProcessBuilder pb = new ProcessBuilder();
			
			// 명령어 지정
			pb.command(new String[] {"curl", "https://google.com"});

			// 결과와 오류를 하나로 합침
			pb.redirectErrorStream(true);
			
			// 프로세스 실행
			Process p = pb.start();

			boolean completed = p.waitFor(5, TimeUnit.SECONDS);
			if(!completed) {
				p.destroy();
			}
			
			// 결과 읽기
			try(BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
				String line = null;
				while((line = br.readLine()) != null) {	
					System.out.println(line);
				}
			}
			
		    int exitCode = p.waitFor();
		    System.out.println(exitCode);
		    
		    
		} catch (IOException | InterruptedException  e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void pipelineTest() throws IOException, InterruptedException {
		
		// 프로세스를 자동으로 실행하고 결과를 다음 프로세스의 입력으로 연결함
		List<Process> processes = ProcessBuilder.startPipeline(
			List.of(
				new ProcessBuilder(
					"C:\\Program Files\\Git\\bin\\bash.exe",
					"-c",
					"curl https://google.com"
				),
				new ProcessBuilder(
					"C:\\Program Files\\Git\\bin\\bash.exe",
					"-c",
					"grep -i google"
				)
			)
		);

		// 실행된 마지막 프로세스만 읽을 수 있음
		Process p = processes.get(processes.size() - 1);

		try(BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
		    String line;
		    while((line = br.readLine()) != null) {
		        System.out.println(line);
		    }
		}
		
		for(Process process : processes) {
			process.waitFor();
		}
		
	}
	
}