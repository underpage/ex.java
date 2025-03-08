import org.junit.Test;

public class BitwiseTest {

	// Bitwise Operator
	// 비트 연산자
	
	@Test
	public void test() {
		
		int a = 0b0000_0000_0000_0000_1111_1111_1111_1111;
		int b = 0b1111_1111_1111_1111_0000_0000_0000_0000;
		
		// 피연산자의 비트 패턴을 비교해 모두 1이면 1을 반환하고 아니면 0을 반환함
		// 0000_0000_0000_0000_0000_0000_0000_0000
		System.out.println(Integer.toBinaryString(a & b));
		
		// 피연산자의 비트 패턴을 비교해 다르면 1을 반환하고 같으면 0을 반환함
		// 1111_1111_1111_1111_1111_1111_1111_1111
		System.out.println(Integer.toBinaryString(a ^ b));
		
		// 피연산자의 비트 패턴을 반대로함
		// 1111_1111_1111_1111_0000_0000_0000_0000
		System.out.println(Integer.toBinaryString(~a));
		
	}
	
}