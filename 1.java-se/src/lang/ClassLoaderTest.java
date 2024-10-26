package lang;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

import org.junit.Test;

public class ClassLoaderTest {

	// ClassLoader
	// : 런타임 중 필요한 클래스를 메모리에 동적으로 로드함
	// : 자바 프로그램은 여러 클래스 로더가 존재하며 계층 구조를 형성  
	// : 클래스 로더를 통해 로딩된 클래스들은 언로딩 될 수 없음  
	
	// 1. Bootstrap ClassLoader
	// : 최상위 클래스 로더로 JVM 실행시 가장 먼저 실행
	// : 네이티브 코드로 구현되어 있음
	
	// 2. Platform ClassLoader (Extension ClassLoader)
	// 3. System ClassLoader (Application ClassLoader)
	// 4. 사용자 정의 클래스 로더
	
	class CustomClassLoader extends ClassLoader {
		
		@Override 
		public Class<?> findClass(String name) throws ClassNotFoundException {
			byte[] b = loadClassData(name);
			return defineClass(name, b, 0, b.length);
		}
		
	    private byte[] loadClassData(String name) throws ClassNotFoundException {
	        try(ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
	             InputStream is = getClass().getClassLoader()
	                     .getResourceAsStream(name.replace('.', File.separatorChar) + ".class")) {

	            if(is == null) {
	                throw new ClassNotFoundException("Class not found: " + name);
	            }

	            int nextValue;
	            while((nextValue = is.read()) != -1) {
	                byteStream.write(nextValue);
	            }
	            
	            return byteStream.toByteArray();
	            
	        } catch(IOException e) {
	            e.printStackTrace();
	        }
	        
			return null;
	    }
		
	}

	@Test
	public void test() throws Exception {
		
		final CustomClassLoader loader = new CustomClassLoader();
		
		Class<?> c = loader.findClass("claxx.User");
		Object o = c.getDeclaredConstructor().newInstance();
		Method m = c.getMethod("toString");
		
		System.out.println(m.invoke(o));

	}
	
}