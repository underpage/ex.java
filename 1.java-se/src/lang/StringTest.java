package lang;

import org.junit.Ignore;
import org.junit.Test;

public class StringTest {

	// String
	// : 문자열을 다루기 위한 메소드를 제공하는 클래스
	
	@Test @Ignore
	public void test() {
		
		// 암시적 객체 String literal = "문자열";
		// 명시적 객체 String string = new String("문자열"); 
		
		// 다른 타입을 문자열로 변환
		String.valueOf(0);
		
		// 문자 배열을 문자열로 변환
		String.copyValueOf(new char[]{'A', 'B', 'C'});
		
		// 주어진 문자열들을 하나로 결합
		String.join("", "", "");
		
		final String str = "";
		
		// 문자열 길이 반환
		str.length();
		
		// 문자열이 비었는지 여부반환
		// 문자열 길이가 0이어야 참 반환
		str.isEmpty();
		
		// 문자열이 공백 문자로 구성되었는지 여부 반환
		str.isBlank();
		
		// 주어진 인덱스에 위치하는 문자 반환
		str.charAt(0);
		
		// 주어진 인덱스에 위치하는 문자의 아스키코드 반환
		str.codePointAt(0);
		
		// 주어진 문자열이 있는 위치를 반환
		// 문자열이 없으면 -1 반환
		str.indexOf("");
		
		// 주어진 문자열을 뒤에서 부터 검색해 위치를 반
		str.lastIndexOf("");
		
		str.startsWith("접두사");
		str.endsWith("접미사");
		
		// 주어진 문자열이 포함되어 있는지 여부 반환
		str.concat("");
		
		// 주어진 문자열 비교
		str.equals("");
				
		// 주어진 문자열을 대소문자 구분없이 비교
		str.equalsIgnoreCase("");
		
		// 주어진 문자열을 유니코드 값으로 비교해 사전순으로 동일하면 0 반환
		str.compareTo("");
		
		// 대소문자 구분없이 비교
		str.compareToIgnoreCase("");
		
		// 주어진 정규 표현식과 일치하는지 여부 반환
		str.matches("");
		
		// 문자열을 소문자나 대문자로 변환
		str.toLowerCase();
		str.toUpperCase();
		
		// 문자열의 앞뒤 공백을 제거
		str.trim();
		
		// 유니코드 공백을 포함에 앞뒤 공백 제거
		str.strip();
		
		// 문자열 앞쪽 공백 제거
		str.stripLeading();
		
		// 문자열 뒤쪽 공백 제거
		str.stripTrailing();
		
		// 문자열의 특정 문자를 다른 문자로 교체
		str.replace("원본", "교체");
		str.replaceAll("원본", "교체");
		str.replaceFirst("원본", "교체");
		
		// 주어진 문자열을 결합함
		str.concat("");
		
		// 문자열을 지정한 수만큼 반복해 새로운 문자열 반환
		str.repeat(0);
		
		// 주어진 함수를 사용해 문자열 변환
		// 새로운 인스턴스를 생성하고 이를 반환함
		str.transform(s -> s.toUpperCase());
		
		// 주어진 토큰을 기준으로 문자열을 분할해 배열로 반환
		str.split("");

		// 문자열을 줄 단위로 분할해 Stream으로 반환
		str.lines();
		
		// 주어진 범위의 문자열을 추출해 새로운 문자열 반환
		str.substring(0, 1);
		
		// 문자열의 각 줄에 들여쓰기를 함
		// 음수 값을 지정하면 내어쓰기를 함
		str.indent(0);
		
		// 문자열을 문자 스트림으로 반환
		// 문자열을 UTF-16 코드 유닛의 정수 스트림으로 반환
		str.chars();
		
		// 문자열을 유니코드 코드 포인트 스트림으로 반환
		// 각 문자의 유니코드 코드 포인트를 스트림으로 반환
		str.codePoints();

	}
	
	@Test @Ignore
	public void linesTest() {
		
		final String multiline = "Hello\nWorld\nJava";
		multiline.lines().forEach(System.out::println);
		
	}
	
	@Test @Ignore
	public void charsTest() {
		
		final String multiline = "Hello\nWorld\nJava";
		final String result = multiline.chars()
				.filter(c -> c != '\n')
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
		
		System.out.println(result);
		
	}

	@Test
	public void codePointsTest() {
		
		final String str = "Hello, 🌍!";
		System.out.println("Using str.chars():");
        str.chars().forEach(c -> System.out.println(c + " : "  + (char) c));
        
		System.out.println("\nUsing str.codePoints():");
        str.codePoints().forEach(cp -> System.out.println(cp + " : "  + (char) cp));
        
	}
	
	@Test @Ignore
	public void internTest() {
		
		// intern()
		// : String pool에 있는 문자열들과 비교하여 존재하면 반환 
		// : String pool에 해당 문자열이 없을 경우 새로 생성하고 반환   
		
		// String pool에 저장
		String str1 = "문자열";
		String str2 = "문자열";
		String str3 = new String("문자열").intern();
		
		// 힙에 새로운 객체 생성
		String str4 = new String("문자열");
		
		System.err.println("str1 :: " + System.identityHashCode(str1));
		System.err.println("str2 :: " + System.identityHashCode(str2));
		System.err.println("str3 :: " + System.identityHashCode(str3));
		System.err.println("str4 :: " + System.identityHashCode(str4));
		
		// == 연산자를 이용한 비교가 equals() 보다 빠름
		// == 연산자는 객체의 참조 값을 비교하고 equals()는 문자열을 한 글자씩 비교함
		// == 연산자를 사용하면 연산이 줄어 더 빠르나 값을 비교한다면 equals()을 사용해야 함
		System.out.println(str1 == str4);
		System.out.println(str1.equals(str4));
		
		str4 = str4.intern();
		System.out.println(str1 == str4);
		System.err.println("변경된 str4 :: " + System.identityHashCode(str4));
		
	}
	
	@Test @Ignore
	public void syntacticSugar() {
		 
		// 1. 리터럴 또는 String 객체가 + 연산자를 만날 경우 컴파일러에 의해
		// 2. 처음 인수를 StringBuilder 생성자에 할당하여 인스턴스 생성   
		// 3. append() 메소드를 호출하여 나머지 인수 전달
		// 4. toString() 호출 
		
		final String str = "문자열을 연결할 경우 " + "StringBuilder로 자동 컴파일";
		System.out.println(str);
		
	}

}