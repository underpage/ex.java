import org.junit.Test;

public class Increment {

	@Test
	public void incrementTest() {
		
		// 전위 증가 연산자 (증가 => 대입)
		// 1을 먼저 증가하고 대입함
		int num = 0;
		int result = ++num;
		
		System.out.println(num == 1);
		System.out.println(result == 1);
		
	}

	@Test
	public void decrementTest() {
		
		// 후위 증가 연산자 (대입 => 증가)
		// 대입을 먼저하고 1을 증가함
		int num = 0;
		int result = num++;
		
		System.out.println(num == 1);
		System.out.println(result == 0);
		
	}
	
}