package error;

import org.junit.Test;

public class OutOfMemoryErrorTest {

	// OutOfMemoryError
	// : 힙 영역이 충분하지 않은 경우 발생
	// : finalize 메소드를 과도하게 사용해 GC가 지연되며 메모리가 부족해지는 경우 

	@Test
	public void test() {
		try {

			final int[] array = new int[Integer.MAX_VALUE];
			for(int i = 0; i < array.length; ++i)
				array[i] = i + 1;
			
		} catch ( OutOfMemoryError e){
			e.printStackTrace();
		}	
	}

}