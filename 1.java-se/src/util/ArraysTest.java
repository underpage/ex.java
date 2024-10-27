package util;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

import org.junit.Ignore;
import org.junit.Test;

public class ArraysTest {

	// Arrays
	// : 배열을 위한 유틸리티 클래스 
	
	@Test @Ignore
	public void test() {
		
		int[] arr = {1,2,3};
		
		// 배열을 리스트로 반환 
		Arrays.asList(arr);
		
		// 배열을 스트림으로 반환
		Arrays.stream(arr);
		
		// 배열을 Spliterator로 반환
		Arrays.spliterator(arr);
		
		// 배열에 주어진 인덱스부터 복사해 반환 
		Arrays.copyOf(arr, 0);
		
		// 배열에 주어진 인덱스 범위 만큼 복사해 반환 
		Arrays.copyOfRange(arr, 0, 1);
		
		// 이진 검색을 사용해 요소의 인덱스 반환
		// 사용하기 전에 배열이 정렬되야 함
		Arrays.binarySearch(arr, 0);
		
		// 오름 차순 정렬 
		Arrays.sort(arr);
		
		// 배열을 병렬로 정렬
		Arrays.parallelSort(arr);
		
		// 배열 얕은 비교
		// 배열의 길이와 각 요소들이 일치하면 참 반환
		Arrays.equals(new Object[0], new Object[0]);
		
		// 배열 깊은 비교 
		Arrays.deepEquals(new Object[0], new Object[0]);
		
		// 배열의 요소 값을 사전적으로 비교해 값이 동등하면 0을 반환
		// 처음 배열이 크면 1을 반환하고 두번째 배열이 크면  -1을 반환
		Arrays.compare(new int[0], new int[0]);
		
		// 배열의 요소 값을 비교해 처음으로 다른 요소의 인덱스를 반환
		// 두 배열이 동일하면 -1을 반환
		Arrays.mismatch(new int[0], new int[0]);
		
		// 주어진 값으로 배열을 채움
		Arrays.fill(new Object[0], 0);
		Arrays.setAll(new Object[0], x -> x );
		
		// 배열을 문자열로 출력
		Arrays.toString(new Object[] {});
		Arrays.deepToString(new Object[] {});
		
	}
	
	@Test @Ignore 
	public void asListTest() {
	
		// Arrays.asList()
		// : 배열을 받아서 리스트 형태로 반환 
		// : 이때 리스트의 크기는 배열의 크기와 같고 변경 불가능 unmodifiable List
		// : 고정된 리스트를 원하는 경우나 배열에 리스트 기능을 이용하고 싶을 때 사용 
		
		final List<String> list = Arrays.asList(new String[5]);

		try {
			
			// 직접 변경 불가
			list.add(0, "add");
			
		} catch(UnsupportedOperationException e) {
			e.getMessage();
		}

		// 변경 가능
		list.set(0, "set");
		list.forEach(System.out::print);
		
	}
	
	@Test @Ignore 
	public void streamTest() {
		
		final int[] arr = {1,5,8,0,3,6};
		Arrays.stream(arr).sorted().forEach(System.out::print);
		
	}
	
	@Test @Ignore 
	public void spliteratorTest() {
		
		// Spliterator
		// : 병렬처리를 위한 인터페이스
		
		final int[] arr = {1,5,8,0,3,6};
		final Spliterator<Integer> spliterator = Arrays.spliterator(arr);
		
		spliterator.forEachRemaining(System.out::print);
		
	}
	
	@Test @Ignore 
	public void binarySearchTest() {
		
		// Arrays.binarySearch()
		// : sort()로 정렬된 배열에 사용
		// : 요소가 배열에 없다면 음수 값 반환
		
		final int[] arr = {1,5,8,0,3,6};
		Arrays.sort(arr);
		
		System.out.println(Arrays.binarySearch(arr, 3));
		
	}
	
	@Test @Ignore 
	public void fillTest() {
		
		final Object[] arr = new Object[5];
		Arrays.fill(arr, 1);
		
		for(int i=0, len = arr.length ; i < len ; ++i) {
			System.out.println(arr[i]);
		}
		
	}
	
	@Test @Ignore 
	public void setAllTest() {
		
		final Object[] arr = new Object[5];
		Arrays.setAll(arr, x -> ++x );
		
		for(int i=0, len = arr.length ; i < len ; ++i) {
			System.out.println(arr[i]);
		}
		
	}
	
	@Test @Ignore 
	public void toStringTest() {
		
		System.out.println(Arrays.toString(new int[] {1,2,3}));
		
		// 다차원 배열을 출력할 경우
		System.out.println(Arrays.deepToString(new int[][] {{1,1,1}, {2,2,2}, {3,3,3}}));
		
	}
	
}