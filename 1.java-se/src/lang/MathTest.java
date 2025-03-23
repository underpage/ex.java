package lang;

import org.junit.Test;

public class MathTest {

	// Math 
	// : 수학 계산을 위한 유틸리티 클래스
	// : 엄격한 수학 계산이 필요한 경우 StrictMath 클래스를 사용해야 함
	// : Math는 플랫폼에 최적화된 연산 방식을 사용해 플랫폼에 따라 결과가 미세하게 다를 수 있음

	@Test
	public void test() {
		
		// 오일러 수 
		System.out.println(Math.E);
		
		// 원주율
		System.out.println(Math.PI);
		
		// 타우 상수 (Math.PI*2)
		System.out.println(Math.TAU);

		// 난수 생성
		Math.random();
		
		// 부호 반환
		// x > 0 이면 1.0 반환
		// x < 0 이면 -1.0 반환
		// x == 0 이면 0.0 반환
		Math.signum(0);

		// 올림수 반환
		Math.ceil(0);
		
		// 내림수 반환
		Math.floor(0);
		
		// 반올림수 반환
		Math.round(0);
		
		// 절대값 반환
		Math.abs(0);
		
		// 주어진 값 중 최대값/최소값을 반환
		Math.min(1, 2);
		Math.max(1, 2);
		
		// long 타입 값을 int 타입으로 변환
		Math.toIntExact(1L);
		
		// 연산에 대한 오버플로우를 체크함		
		Math.addExact(1, Integer.MAX_VALUE);
		Math.subtractExact(1, Integer.MAX_VALUE);
		Math.multiplyExact(1, Integer.MAX_VALUE);
		
		// 나누기와 나머지 연산에 대한 정확한 동작을 보장함
		Math.floorDiv(1, 0);
		Math.floorMod(1, 0);
		
	}
	
}