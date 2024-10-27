package lang;

import org.junit.Test;

public class MathTest {

	// Math 
	// : 수학 계산을 위한 유틸리티 클래스
	// : 엄격한 수학 계산이 필요한 경우 StrictMath 클래스 사용

	@Test
	public void test() {
		
		// 오일러 수 
		System.out.println(Math.E);
		
		// 원주율
		System.out.println(Math.PI);
		
		// long 타입을 int 타입으로 변환
		Math.toIntExact(1L);
		
		// 난수 생성
		Math.random();
		
		// 최대값 최소값
		Math.min(1, 2);
		Math.max(1, 2);
		
	}
	
}