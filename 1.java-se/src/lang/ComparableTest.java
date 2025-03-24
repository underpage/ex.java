package lang;

import java.util.Arrays;

import org.junit.Test;

public class ComparableTest {

	// Comparable
	// : 객체 간 비교를 위한 메소드를 지원하는 인터페이스
	// : Comparable 인터페이스를 구현해 객체를 비교하고 정렬할 수 있음
	// : 단일 메소드만 존재하며 숫자는 값을 기준으로 문자열은 사전순으로 정렬함

	
	
	@Test
	public void test() {
		
		Person[] p = {
			new Person("a" , 3),
			new Person("b" , 2),
			new Person("c" , 1),
		};
		
		// Arrays.sort()에 의해 compareTo()가 호출됨   
		Arrays.sort(p);
		Arrays.stream(p).forEach(System.out::println);
		
	}
	
	class Person implements Comparable<Person> {

		private String name;
		private int age;
		
		public Person (String name, int age) { 
			this.name = name;
			this.age = age;
		}
		
		@Override
		public int compareTo(Person p) {

			// 현재 객체와 주어진 객체를 비교하여 int 값 반환   	
			// x < y -- -1
			// x > y -- 1 
			// x = y -- 0
			
			return this.age < p.age ? -1 : (this.age == p.age ? 0 : 1);

		}
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		
	}
	
}