package exception;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.Test;

public class EmptyStackExceptionTest {

	// EmptyStackException
	// : 스택이 비어있는데 요소를 삭제하거나 최상위 요소를 조회하는 경우 발생

	@Test
	public void test() {
		
        try {
        	
        	final Stack<Integer> stack = new Stack<>();
            stack.pop();
            
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
        
	}
	
}