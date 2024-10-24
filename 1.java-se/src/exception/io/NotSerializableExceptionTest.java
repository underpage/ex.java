package exception.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class NotSerializableExceptionTest {

	// NotSerializableException 
	// : 객체 직렬화 중 직렬화할 수 없는 경우 발생 
	// : 객체가 Serializable 인터페이스를 구현했는지 확인

	@Test
	public void test() throws FileNotFoundException, IOException {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("vo.txt"))) {
			  
			final NotSerializableVO vo = new NotSerializableVO();
			oos.writeObject(vo);
			
		} catch (NotSerializableException e) {
			e.printStackTrace();
		}
		
	}
	
	class NotSerializableVO {
		
	}
	
}