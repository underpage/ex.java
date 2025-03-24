package lang;

import org.junit.Ignore;
import org.junit.Test;

public class ClassTest {

	// Class
	// : 클래스 로드시 JVM에 의해 자동으로 생성되는 객체
	// : 실행중인 클래스와 인터페이스의 모든 정보에 접근 할 수 있음
	// : 리플렉션 클래스지만 lang 패키지에 존재함
	// : 기본 타입, 참조 타입, 배열은 Class 객체를 가짐
	
	
	
	@Test  @Ignore
	public void test() throws Exception {
		
		// 정적으로 클래스 로딩 (컴파일 타임)
		// JVM에 의해 이미 로드된 클래스의 Class 객체를 참조함
		// 타입 안정성을 보장하며 클래스가 없으면 컴파일 오류가 발생함
		Class<?> c = String.class;
		
		// 런타임에 객체로부터 클래스 정보 조회
		// 객체가 null일 경우 NullPointerException이 발생할 수 있음
		c = "".getClass();
				
		// 동적으로 클래스 로딩 (런타임)
		// 런타임에 동적으로 클래스를 로드해 초기화하고 Class 객체를 가져옴
		// 타입 안정성을 보장하지 않으며 클래스가 없으면 ClassNotFoundException가 발생함
		c = Class.forName("java.lang.String");
		
		// 클래스를 로드하지만 초기화는 수행하지 않는 경우
		c = Class.forName("java.lang.String", false, String.class.getClassLoader());
		
		// 패키지와 클래스 이름 반환
		c.getName();
		
		// 정규화된 클래스 이름 반환
		// 중첩 클래스 경우 외부클래스.내부클래스 형태의 이름 반환
		c.getCanonicalName();
		
		// 제네릭 타입을 포함한 클래스 이름 반환
		c.getTypeName();
		
		// 클래스의 패키지 객체 반환
		c.getPackage();
		
		// 클래스의 이름만 문자열로 반환
		c.getSimpleName();
		
		// 클래스 로더 반환
		c.getClassLoader();
		
		// 기본 타입인지 여부 반환
		c.isPrimitive();
		
		// 배열인지 여부 반환
		c.isArray();
		
		// 인터페이스인지 여부 반환
		c.isInterface();
		
		// 이넘 클래스인지 여부 반환
		c.isEnum();
		
		// 어노테이션 클래스인지 여부 반환
		c.isAnnotation();
		
		// 클래스가 주어진 클래스의 하위 클래스인지 여부 반환
		c.isAssignableFrom(Object.class);
		
		// 부모 클래스 반환
		c.getSuperclass();
		
		// 구현한 인터페이스 배열 반환
		c.getInterfaces();
		
		// 주어진 인자를 받는 생성자 반환 
		c.getConstructor(int.class);
		
		// 공개된 생성자를 배열로 반환
		c.getConstructors();
		
		// 모든 생성자를 배열로 반환
		c.getDeclaredConstructors();
		
		// 모든 접근 제어자 반환
		c.getModifiers();
		
		// 공개된 필드를 배열로 반환
		c.getFields();
		
		// 모든 필드를 배열로 반환
		c.getDeclaredFields();
		
		// 공개된 메소드를 배열로 반환
		c.getMethods();
		
		// 모든 메소드를 배열로 반환
		c.getDeclaredMethods();
		
		// 어노테이션을 배열로 반환
		c.getAnnotations();
		
		// 공개된 중첩 클래스 목록 반환
		c.getClasses();
		
		// 모든 중첩 클래스 목록 반환
		c.getDeclaredClasses();
		
		// 주어진 이름을 가진 공개 변수를 반환
		c.getField("");

		// 주어진 이름을 가진 비공개 변수를 반환
		c.getDeclaredField("");
		
		// 제네릭 타입 파라미터 정보 반환
		c.getTypeParameters();
		
	}

}