package lang.reflect;

import java.lang.reflect.Array;

import org.junit.Ignore;
import org.junit.Test;

public class ArrayTest {
	
	// reflect.Array
	// : 배열을 동적으로 생성하고 조작하기 위한 유틸리티 클래스
	// : 컴파일 시점에 배열의 타입을 알 수 없는 경우 사용함
	
	
	
	@Test @Ignore
	public void test() {
		
		String[] arr = null;
		
		// 지정된 타입와 크기로 배열 생성
		Array.newInstance(String.class, 5);
		
		// 배열의 특정 인덱스에 있는 값 반환
		Array.get(arr, 0);
		
		// 배열의 특정 인덱스에 값 설정
		Array.set(arr, 0, "value");
		
		// 배열의 길이 반환
		Array.getLength(arr);
		
	}
	
	public <T> T[] createArray(Class<T> clazz, int size) {
		@SuppressWarnings("unchecked")
		T[] array = (T[]) Array.newInstance(clazz, size);
	    return array;
	}
	
	@Test
	public void createArrayTest() {
		
		String[] stringArray = createArray(String.class, 5);
		System.out.println(stringArray.length);
		
	}

}