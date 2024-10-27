package lang;

import org.junit.Ignore;
import org.junit.Test;

public class StringBufferTest {

	// StringBuffer
	// : 변경 가능한 문자열 객체로 문자열 조작시 새로운 객체를 생성하지 않음
	// : 내부 버퍼에 문자열을 저장하고 버퍼에서 수정, 삭제 작업을 수행
	// : 멀티 스레드 환경에서 사용하기 적합  
	
	@Test @Ignore
	public void test() {
		
		// 버퍼 크기를 지정하지 않으면 기본 초기 용량 16이 사용됨
		final StringBuffer str = new StringBuffer();

		str.append(false);
		str.append(1);
		str.append(1.5);
		str.append("모든 데이터 타입 추가");

		// 버퍼 크기 반환
		str.capacity();

		// 버퍼 크기 수정
		str.ensureCapacity(10);
		
		// 문자열 길이에 맞게 버퍼 크기 수정
		str.trimToSize();

		// 주어진 위치에 값 추가
		str.insert(0, true);

		// 주어진 위치의 문자 반환
		str.charAt(0);
		
		// 주어진 위치의 문자 교체
		str.setCharAt(0, '!');

		// 주어진 범위를 주어진 문자열로 수정
		str.replace(0, 10, "수정");

		// 문자열을 역순으로 변경
		str.reverse();
		
		// 주어진 위치에 해당하는 문자 삭제
		str.deleteCharAt(0);

		// 주어진 범위에 해당하는 문자열 삭제
		str.delete(0, 10);

		// 모든 문자 삭제
		str.setLength(0);
		
	}
	
}