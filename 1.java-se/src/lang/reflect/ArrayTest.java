package lang.reflect;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

public class ArrayTest {
	
	// reflect.Array
	// : 배열을 동적으로 생성하기 위한 리플렉션 API
	// : 컴파일 시점에 배열의 타입을 알 수 없는 경우 사용
	
	@Test @Ignore
	public void test() {
		
		// 지정된 타입와 크기로 배열 생성
		Array.newInstance(Integer.class, 5);
		
		// 배열의 특정 인덱스에 있는 값 반환
		Array.get(getClass(), 0);
		
		// 배열의 특정 인덱스에 값 설정
		Array.set(getClass(), 0, "value");
		
	}
	
	@Test
	public void newInstanceTest() {
		
		final int len = 5;
		final Object obj = Array.newInstance(Integer.class, len);
		
		for(int i=0; i<len ; ++i) {
			Array.set(obj, i, i);
		}
		
		System.out.println(Arrays.toString((Object[]) obj));
		
	}

}