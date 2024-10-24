package exception.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.Test;

public class FileNotFoundExceptionTest {

	// FileNotFoundException 
	// : 지정된 경로에 파일이 없거나 파일에 접근할 수 없는 경우 발생
	
	// 1. 경로 확인
	// 2. 파일 여부 확인
	// 3. 파일 명 확인 (\r\n)
	// 4. 파일 권한 확인
	
	@SuppressWarnings({ "unused", "resource" })
	@Test
	public void test() {
		
		try {
			
			final String path = "example.txt";
			FileReader file = new FileReader(path); 
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
	} 
	
}