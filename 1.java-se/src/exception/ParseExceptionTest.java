package exception;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class ParseExceptionTest {

	// ParseException
	// : 문자열을 특정 형식으로 변환하는 과정에서 발생
	// : 정의한 날짜 패턴과 입력되는 날짜 패턴이 다를 경우 발생 
	
	@Test
	public void test() {

		try {
			
			final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			final Date date = (Date) formatter.parse("2024-12");
			System.out.println(date);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
}