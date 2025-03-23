package lang;

import org.junit.Ignore;
import org.junit.Test;

public class ObjectTest {

	// Object
	// : 자바의 최상위 클래스로 모든 클래스는 Object를 자동으로 상속함
	// : Object 클래스는 모든 클래스가 공통으로 포함해야하는 기능을 제공함
	// : 객체를 위한 메소드는 오버라이딩이 가능하나 스레드를 위한 메소드는 오버라이딩 불가능함

	@Test @Ignore
	public void test() throws InterruptedException {
		
		Object obj = new Object(){};
		
		// 주어진 객체와 동등성 비교
		// Object 클래스 내부에서는 == 연산자를 통해 동등성을 비교함
		// String, Date, File 등 일부 클래스에서는 오버라이드하여 값을 비교함
		// equals()를 오버라이드한 경우 지켜야할 규약이 존재함
		obj.equals(new Object());
		
		// 객체의 해시 코드 반환
		// 해시 코드란 객체의 메모리 주소를 기반으로 생성된 값으로 객체를 식별하는데 사용됨
		// 하위 클래스에서는 객체의 내용을 기반으로 해시 코드를 생성하도록 재정의하여 사용함
		// equals()를 오버라이드한 경우 hashCode()도 오버라이드해야 함
		// 두 객체가 동일하다면 해시 코드도 동일해야 함
		obj.hashCode();
		
		// 객체의 정보를 문자열로 반환 (패키지명.클래스명@16진수해시코드)
		// 하위 객체에서 오버라이드할 경우 의미가 달라지며 일반적으로 객체의 상태에 대한 정보를 표현함
		obj.toString();
		
		// 객체의 얕은 복사본을 만들어 반환 
		// 복제할 클래스는 Cloneable 인터페이스를 구현해야 함
		// obj.clone();
		
		// 객체의 런타임 클래스 반환
		// 하위 클래스에서 오버라이딩이 불가능함
		obj.getClass();
		
		// 스레드를 지정 시간까지 일시적으로 중지함
		// 시간을 지정하지 않으면 무기한 정지되고 notify() 또는 notifyAll()이 호출될 때까지 대기함
		// synchronized 블록 내에서 호출해야 함
		obj.wait();
		
		// wait()된 스레드의 실행을 재개함
		// synchronized 블록 내에서 호출해야 함
		obj.notify();

	}
	
	@Test @Ignore
	public void hashCodeTest() {

		Object obj = new Object();
		
		// 객체의 메모리 주소를 기반으로 생성한 해시 코드 반환
		// 하위 클래스에서는 객체의 상태를 기반으로 해시 코드를 생성하도록 오버라이딩함
		System.out.println(obj.hashCode());
		
		// 객체의 메모리 주소를 기반으로 생성한 해시 코드 반환
		// hashCode()를 오버라이드해도 영향받지 않음
		System.out.println(System.identityHashCode(obj));
		
	}
	
	@Test
	public void cloneTest() throws CloneNotSupportedException {
		
		class Example implements Cloneable {
			public Example copy() throws CloneNotSupportedException {
				return (Example) super.clone();
			}
		}
		
		// copy()는 얇은 복사를 수행하므로 객체의 참조값만 복사함
		Object obj = new Example().copy();
		System.out.println(obj);
		
	}
	

	@Test
	public void getClassTest() {
		
		String str = new String("test");
		Class<?> clazz = str.getClass();
		System.out.println(clazz);
		
	}
	
	@Test
	public void waitTest() throws InterruptedException {
		
		class Example {
			synchronized void waitTest() {
				try {
					System.out.println("Before wait");
					wait(3000);
					System.out.println("After wait");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		Example ex = new Example();
	    Thread t = new Thread(() -> {
	    	ex.waitTest();
	    });
		
	    t.start();
	    
	    Thread.sleep(1500);
	    synchronized(ex) {
			ex.notify();
		}
	    
	}

}