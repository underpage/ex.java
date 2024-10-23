package error;

import org.junit.Test;

public class AbstractMethodErrorTest {

	// AbstractMethodError
	// : 서브 클래스가 추상 메소드를 구현하지 않았는데 호출할 경우 발생
		
	@Test
	public void test() {
		try {
			
			Animal dog = new Dog();
			
			// sound()가 구현되지 않았는데 호출하면 발생
			dog.sound();
			
		} catch (AbstractMethodError e){
			e.printStackTrace();
		}
	}
	
	abstract class Animal {
		public abstract void sound();
	}
	
	class Dog extends Animal {
		@Override
		public void sound() {}
	}
	
}