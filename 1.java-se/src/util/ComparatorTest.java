package util;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

import claxx.User;

public class ComparatorTest {

	// Comparator
	// : 객체 간 비교를 정의하기 위한 함수형 인터페이스
	// : 비교와 정렬을 위한 다양한 유틸리티 메소드들이 정의되어 있음
	// : 객체의 속성에 따라 다양한 정렬 방식을 구현할 수 있음
	
	
	
	@Test
	public void test() {
				
		User[] u = {
			new User("a" , 3),
			new User("b" , 2),
			new User("c" , 1),
		};

		// 방법1.
		Arrays.sort(u, (u1, u2) -> Integer.compare(u1.getAge(), u2.getAge()));
		Arrays.stream(u).forEach(System.out::println);
		
		// 방법2.
		Arrays.sort(u, Comparator.comparing(User::getAge));
		
		// 주어진 객체의 속성을 기준으로 비교해 정렬함
		Comparator.comparing(User::getAge);
		
		// 값이 null인 경우 목록 앞으로 배치하고 comparing()을 수행함
		Comparator.nullsFirst(Comparator.comparing(User::getAge)); 

		// 값이 null인 경우 목록 뒤로 배치하고 comparing()을 수행함
		Comparator.nullsLast(Comparator.comparing(User::getAge));
		
		// 객체가 Comparable을 구현한 경우 자연 순서에 따른 Comparator 생성
		Comparator.naturalOrder();
		
		// 객체가 Comparable을 구현한 경우 자연 순서의 역순인 Comparator 생성
		Comparator.reverseOrder();
		
		// 주어진 객체의 속성을 기준으로 비교하고 역순으로 정렬함
		Comparator.comparing(User::getAge).reversed();
		
		// 처음 기준으로 정렬하고 동등한 경우 두번째 기준으로 정렬함
		Comparator.comparing(User::getAge).thenComparing(User::getName);
		
	}
	
}