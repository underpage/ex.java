package lang;

import org.junit.Ignore;
import org.junit.Test;

public class ObjectTest {

	// Object
	// : 슈퍼 클래스, 최상위 클래스
	// : 모든 클래스는 Object 클래스를 자동으로 상속함
	// : Object 클래스는 모든 클래스가 공통으로 포함해야하는 기능을 제공함
	// : 객체를 위한 메서드는 오버라이딩 가능하고 스레드를 위한 메서드는 오버라이딩 불가

	@Test @Ignore
	public void test() throws InterruptedException {
		
		final Object obj = new Object(){};
		
		// 두 객체의 동등성 비교
		// Object 클래스는 두 객체의 참조를 비교
		// String, Date, File 등 일부 클래스에서는 값을 비교
		obj.equals(new Object());
		
		// 객체의 해시 코드 반환
		// 해시 코드란 객체의 내용을 기반으로 생성되는 정수 값
		// equals() 오버라이드한 경우 hashCode()도 오버라이드해야 함
		obj.hashCode();
		
		// 객체의 정보를 문자열로 반환 (패키지명.클래스명@16진수해시코드)
		obj.toString();
		
		// 객체의 복사본을 만들어 반환 
		// 복제할 클래스는 Cloneable 인터페이스를 구현해야 함
		// obj.clone();
		
		// 객체의 런타임 클래스 반환
		// 하위 클래스에서 오버라이딩 불가능한 메소드
		obj.getClass();
		
		// 스레드를 지정 시간까지 일시적으로 중지함
		obj.wait();
		
		// wait()된 스레드를 실행 재개함
		obj.notify();

	}
	
	@Test @Ignore
	public void equalsTest() {

		final Object obj1 = new Object();
		final Object obj2 = new Object();
		
		// 두 객체의 동등성 비교
		System.out.println(obj1.equals(obj2));
		
		// 두 객체의 메모리 주소 비교
		System.out.println(obj1 == obj2);

	}
	
	@Test @Ignore
	public void hashCodeTest() {

		final Object obj = new Object();
		
		// 객체의 해시 코드 반환
		System.out.println(obj.hashCode());
		
		// 객체의 메모리 주소와 관련된 해시 코드 반환
		System.out.println(System.identityHashCode(obj));
		
	}
	
	@Test @Ignore
	public void toStringTest() {

		final Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());

	}
	
	@Test @Ignore
	public void cloneTest() throws CloneNotSupportedException {
		
		class Example implements Cloneable {
			public Example copy() throws CloneNotSupportedException {
				return (Example) super.clone();
			}
		}
		
		final Object obj = new Example().copy();
		System.out.println(obj);
		
	}
	

	@Test @Ignore
	public void getClassTest() {
		
		final String str = new String("test");
		final Class<? extends String> clazz = str.getClass();
		System.out.println(clazz);
		
	}
	
	@Test
	public void waitTest() {
		
		class Example {
			synchronized void waitTest() {
				try {
					wait(1000);
					System.out.println("wait");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		final Example ex = new Example();
		ex.waitTest();
		
	}

}