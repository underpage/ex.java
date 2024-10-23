package exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class UnsupportedOperationExceptionTest {

	// UnsupportedOperationException
	// : 메소드가 구현되지 않거나 지원되지 않는 경우 발생  
	// : 대체로 Collection API 사용중 발생
	
	@Test
	public void test() {
		
		try {
			
			final List<Integer> list = new ArrayList<>();
			
			list.add(1);
			list.add(2);
			list.add(3);
			
			list.forEach(System.out::print);
			
			// Arrays.asList() : 고정 크기 배열 반환  
			final List<Integer> arraysList = Arrays.asList(1,2,3);
			
			// Collections.unmodifiableList() : read-only, 불변 객체 
			final List<Integer> collectionsList = Collections.unmodifiableList(list);
			
			// 수정 불가   
			arraysList.add(4);
			collectionsList.add(4);
			
			arraysList.forEach(System.out::print);
			collectionsList.forEach(System.out::print);
			
		} catch(UnsupportedOperationException e) {
			e.printStackTrace();
		}
		
	}
	
}