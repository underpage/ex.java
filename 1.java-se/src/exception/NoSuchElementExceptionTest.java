package exception;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Test;

public class NoSuchElementExceptionTest {

	// NoSuchElementException
	// : Enumeration, Iterator, StringTokenizer 객체의 요소에 참조했는데 요소가 없는 경우 발생  

	@Test 
	public void test() {
		
		try {
			
			final Iterator<?> i = Arrays.asList(1,2,3,4,5).iterator();			
			final StringBuilder sb = new StringBuilder();
			
			while(i.hasNext()) {
				sb.append(i.next());
				System.out.println(i.next());
			}
			
		} catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
	}
	
}