package lang;

import java.lang.reflect.Method;

import org.junit.Ignore;
import org.junit.Test;

public class ClassTest {

	// Class
	// : 클래스 로드시 JVM에 의해 자동 생성되는 클래스 (생성자 없음)
	// : 실행중인 클래스와 인터페이스의 정보를 담는 클래스   

	@Test  @Ignore
	public void test() throws Exception {
		
		// 정적으로 클래스 로딩 (컴파일 타임)
		// 타입 안정성을 보장하며 ClassNotFoundException 이 발생하지 않음
		//final Class<?> c = String.class;
				
		// 동적으로 클래스 로딩 (런타임)
		// 타입 안정성을 보장하지 않으며 ClassNotFoundException 처리필요
		// class 보다 성능이 조금 저하됨
		// 런타임에 동적으로 클래스를 생성할 경우 사용
		final Class<?> c = Class.forName("java.lang.String");

		// 인터페이스인지 여부 반환
		c.isInterface();
		
		// 이넘 클래스인지 여부 반환
		c.isEnum();
		
		// 어노테이션 클래스인지 여부 반환
		c.isAnnotation();
		
		// 클래스의 패키지와 이름을 문자열로 반환
		c.getName();
		c.getCanonicalName();
		c.getTypeName();
		
		// 클래스의 패키지 정보 반환
		c.getPackage();
		
		// 클래스의 이름을 문자열로 반환
		c.getSimpleName();
		
		// 부모 클래스 반환
		c.getSuperclass();
		
		// 구현한 인터페이스를 배열로 반환
		c.getInterfaces();
		
		// 주어진 생성자를 반환 
		c.getConstructor(int.class);
		
		// 클래스의 공개된 생성자를 배열로 반환
		c.getConstructors();
		
		// 클래스의 모든 생성자를 배열로 반환
		c.getDeclaredConstructors();
		
		// 클래스의 공개된 필드를 배열로 반환
		c.getFields();
		
		// 클래스의 모든 필드를 배열로 반환
		c.getDeclaredFields();
		
		// 클래스의 공개된 메소드를 배열로 반환
		c.getMethods();
		
		// 클래스의 모든 메소드를 배열로 반환
		c.getDeclaredMethods();
		
		// 어노테이션을 배열로 반환
		c.getAnnotations();
		
		// 공개된 중첩 클래스 목록 반환
		c.getClasses();
		
		// 모든 중첩 클래스 목록 반환
		c.getDeclaredClasses();
		
		// 주어진 이름을 가진 공개 정적 변수를 반환
		c.getField("");

		// 주어진 이름을 가진 비공개 정적 변수를 반환
		c.getDeclaredField("");
		
		// 제네릭 타입 파라미터 정보 반환
		c.getTypeParameters();
		
	}
	
	@Test
	public void example() throws ClassNotFoundException {
		
		final Class<?> c = String.class;
		
		Method[] methods = c.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
		
	}

}