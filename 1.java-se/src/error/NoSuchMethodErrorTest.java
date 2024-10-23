package error;

import org.junit.Test;

public class NoSuchMethodErrorTest {

	// NoSuchMethodError
	// : 존재하지 않는 메소드 호출시 발생
	// : 컴파일 타임에는 컴파일러에 의해 체크되며 런타임시 발생하는 오류     
	// : 라이브러리나 프레임워크에서 문제가 발생한다면 종속성과 버전 확인
	
	@Test
	public void test() {
		try {

			NoSuchMethodErrorTest clazz = new NoSuchMethodErrorTest();
			clazz.method("호출");

		} catch (NoSuchMethodError e){
			e.printStackTrace();
		}
	} 
	
	private void method(String str) {
		System.out.println(str);
	}
	
}