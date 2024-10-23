package error;

import org.junit.Test;

public class StackOverflowErrorTest {

	// StackOverflowError
	// : 스택 메모리 부족시 발생
	// : 재귀 호출로 인한 오류면 종료 시점을 확인하고 특별한 경우가 아니면 재귀 호출을 반복문으로 수정
	// : JVM 옵션을 통해 스택 메모리 크기를 늘림

	@Test
	public void test() {
		try {
			
			this.method(1);
			
		} catch (StackOverflowError e){
			e.printStackTrace();
		}
	} 
	
	private void method(int i) {
		
		System.out.println(i);
		
		if(i <= 0) return;
		else method(i++);

	}

}