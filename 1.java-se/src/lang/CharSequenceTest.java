package lang;

import org.junit.Test;

public class CharSequenceTest {

	// CharSequence
	// : 문자열 처리를 위한 슈퍼 인터페이스  
	// : 문자열 처리를 위한 기본 기능들을 정의함
	
	// 구현
	// - String
	// - StringBuffer 
	// - StringBuilder
	// - CharBuffer

	@Test 
	public void test() {
		
		final CharSequence ch = "문자열";
		final String str = "문자열";
		
		System.out.println("ch :: " + System.identityHashCode(ch));
		System.out.println("str :: " + System.identityHashCode(str));

		System.out.println("ch :: " + ch.hashCode());
		System.out.println("str :: " + str.hashCode());

		System.out.println(ch == str);
		System.out.println(ch.equals(str));
		
		// 문자열 길이 반환
		ch.length();
		
		// 주어진 위치의 문자 반환
		ch.charAt(0);
		
		// 주어진 범위의 문자열을 CharSequence으로 반환
		ch.subSequence(0, 1);
		
		// 문자 스트림 반환
		ch.chars();
		ch.codePoints();
		
		// 빈 문자열인지 여부 반환
		ch.isEmpty();
		
	}
	
}