package exception;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class InstantiationExceptionTest {

	// InstantiationException
	// : 객체를 생성할 수 없는 경우 발생
	// : 추상 클래스나 인터페이스의 인스턴스를 생성하려고 하는 경우
	// : 클래스가 인스턴스를 생성할 수 없는 경우
	
	@Test
	public void test() throws Exception {
		
		try {
			
			Class<?> clazz = Class.forName("exception.AbstractClass");
			Constructor<?> constructor = clazz.getDeclaredConstructor();
			AbstractClass obj = (AbstractClass) constructor.newInstance();
			obj.method();
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
		
	}
	
}

abstract class AbstractClass {
    abstract void method();
}