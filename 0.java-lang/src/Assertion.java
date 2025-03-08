import org.junit.Test;

public class Assertion {

	// Assertion
	// 개발이나 테스트 단계에서 조건과 가정을 검증하기 위해 사용
	// 조건이 참이 아닌 경우 예외가 발생함
	// 성공, 실패, 비활성화 상태에 따른 처리 방법이 각각 필요
	
	// 테스트시 활성화하고 배포시 비활성화함
	// java -ea -- 활성화
	// java -da -- 비활성화 
	
	@Test
	public void test() {
	
		int num = 0;
		assert num > 0 : "num은 0 이상이어야 합니다.";
		assert num > 0 && num < 10 : "num은 0 이상이고 10보다 작아야 합니다.";
		
	}
	
}