package exception;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

import org.junit.Test;

public class ConcurrentModificationExceptionTest {

	// ConcurrentModificationException
	// : 수정이 허용되지 않는 경우에 수정을 시도할 경우 발생
	
	
	
	@Test
	public void test() {
		
		try {
			
			final List<Integer> list = new ArrayList<>();
			
			list.add(1);
			list.add(2);
			list.add(3);
			
			// 컬렉션 순회가 완료되지 않았는데 요소를 제거하려고 시도할 경우 예외 발생 
			for(Integer i : list) {
				if(i == 1) {
					list.remove(i);
				}
			}
			
			list.forEach(System.out::println);
			
		} catch(ConcurrentModificationException e) {
			e.printStackTrace();
		}
		
	}
	
}