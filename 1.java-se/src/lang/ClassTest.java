package lang;

import java.lang.reflect.Method;

import org.junit.Ignore;
import org.junit.Test;

public class ClassTest {

	// Class
	// : 클래스 로드시 JVM에 의해 자동 생성되는 클래스 (생성자 없음)
	// : 실행중인 클래스와 인터페이스의 정보를 담는 클래스   

	@Test
	public void test() throws NoSuchFieldException, SecurityException {
		
		// 정적으로 클래스 로딩 (컴파일 타임) 
		//final Class<?> c = String.class;
				
		// 동적으로 클래스 로딩 (런타임) 
		//final Class<?> c = Class.forName("java.lang.String");
		
		// 인스턴스 생성 후 타입 반환
		final Class<?> c = new String().getClass();
		
		// 클래스의 패키지와 이름을 문자열로 반환
		c.getName();
		c.getCanonicalName();
		
		// 클래스의 이름을 문자열로 반환
		c.getSimpleName();
		
		// 부모 클래스 반환
		c.getSuperclass();
		
		// 구현된 인터페이스를 배열로 반환
		c.getInterfaces();
		
		// 클래스의 모든 생성자를 배열로 반환
		c.getDeclaredConstructors();
		
		// 클래스의 모든 필드를 배열로 반환
		c.getDeclaredFields();
		
		// 클래스의 모든 메소드를 배열로 반환
		c.getDeclaredMethods();
		
		// 어노테이션을 배열로 반환
		c.getAnnotations();
		
		// 주어진 이름을 가진 공개 정적 변수를 반환
		c.getField("");

		// 주어진 이름을 가진 비공개 정적 변수를 반환
		c.getDeclaredField("");
		
	}
	
	@Test @Ignore
	public void example() throws ClassNotFoundException {
		
		final Class<?> c = Class.forName("java.lang.String");
		
		Method[] methods = c.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
		
	}

}