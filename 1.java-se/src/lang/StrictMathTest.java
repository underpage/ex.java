package lang;

import org.junit.Test;

public class StrictMathTest {

	// StrictMath
	// : 수학 연산을 위한 클래스
	// : Math 클래스에 비해 엄격한 규칙을 적용해 보다 정확한 연산을 하나 속도는 느림
	// : 다양한 플랫폼에서 동일한 결과를 보장함
	
	@Test
	public void test() {
		
		// 삼각 함수
		StrictMath.sin(0.0);
		StrictMath.cos(0.0);
		StrictMath.tan(0.0);
		
		// 지수 및 로그
		StrictMath.exp(0.0);
		StrictMath.log(0.0);
		StrictMath.log10(0.0);
		
		// 제곱근 및 절대 값
		StrictMath.sqrt(0.0);
		StrictMath.abs(0.0);
		
	}
	
}