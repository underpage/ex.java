package error;

import org.junit.Test;

public class NoClassDefFoundErrorTest {
	
	// NoClassDefFoundError
	// : 컴파일 타임에는 클래스가 존재했으나 런타임에 해당 클래스를 찾을 수 없는 경우 발생
	// : 클래스가 존재한다면 정적 변수, 정적 블록 초기화시 예외가 발생하는 경우 발생

	@SuppressWarnings("unused")
	@Test
	public void test() {
		try {
			
			// bin\error\NoClassDefFoundErrorTest.class 제거후 실행
			NoClassDefFoundErrorTest clazz = new NoClassDefFoundErrorTest();
			
		} catch (NoClassDefFoundError e){
			e.printStackTrace();
		}
	} 
	
}