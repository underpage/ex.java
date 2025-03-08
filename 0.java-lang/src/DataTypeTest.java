import org.junit.Test;

public class DataTypeTest {

	@Test
	public void byteTest() {
		
		// 128이 byte 범위 내에서 벗어나므로 컴파일 오류가 발생
		// 명시적 형변환이 필요하며 이 경우 오버플로가 발생함
		byte b = (byte) 128;
		System.out.println(b == -128);
		
		// 타른 타입의 값이 byte 범위 내에 있어도 명시적 형변환이 필요함
		short s = 127;
		b = (byte) s;
		System.out.println(b == 127);
		
		int i = 127;
		b = (byte) i;
		System.out.println(b == 127);
		
	}
	
}