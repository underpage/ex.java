import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DoubleColon {

	// Double Colon 
	// = Method Reference Operator
	// 메소드를 직접 참조해 호출하는 연산자
	
	class MyClass {
		static void myStaticMethod(String str) {
			System.out.println("static : " + str);
		}
		
		void myMethod(String str) {
			System.out.println(str);
		}
	}
	
	@Test
	public void test() {
		
		List<String> list = Arrays.asList("A", "B", "C");
		list.sort(String::compareToIgnoreCase);
		list.forEach(System.out::println);
		
		list.forEach(MyClass::myStaticMethod);
		list.forEach((new MyClass())::myMethod);
		
	}
	
}