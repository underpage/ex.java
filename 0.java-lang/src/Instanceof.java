import org.junit.Test;

public class Instanceof {

	// instanceof Operator
	// 객체가 특정 클래스의 인스턴스인지 여부 반환
	
	class A {}
	class B extends A {}
	
	@Test 
	public void test() {
		
		A a = new A();
		B b = new B();
		
		System.out.println(a instanceof A);
		System.out.println(a instanceof B == false);
		
		System.out.println(b instanceof A);		
		System.out.println(b instanceof B);
		
	}
	
	@Test
	public void patternMatchingTest() {
		
		// Java 14부터 패턴매칭 지원

		Object obj = "Hello World";
		if(obj instanceof String str) {
			System.out.println(obj);
		}
		
	}
	
}