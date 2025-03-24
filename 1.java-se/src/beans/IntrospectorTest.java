package beans;

import java.beans.IntrospectionException;
import java.beans.Introspector;

import org.junit.Test;

import claxx.User;

public class IntrospectorTest {

	// Introspector
	// : 리플렉션을 기반으로 클래스의 메타데이터에 접근하고 이를 분석하는 클래스
	// : 자바빈즈 명명 규칙을 기반으로 속성, 메소드, 이벤트를 분석함
	// : get/set/is 접두사로 시작하는 메소드를 통해 속성 정보를 추출함
	// : add/remove 접두사와 Listener 접미사를 가진 메소드를 통해 이벤트 정보를 추출함
	
	
	
	@Test 
	public void test() {
	
		try {
			
			// 주어진 클래스에 대한 BeanInfo 반환
			Introspector.getBeanInfo(User.class);
			
			// 특정 클래스까지만 분석
			Introspector.getBeanInfo(User.class, Object.class);
			
			// 분석 플래그 지정
			// 0 : 기본 동작으로 모든 분석
			// Introspector.IGNORE_IMMEDIATE_BEANINFO : 직접적인 BeanInfo 클래스 무시
			// Introspector.IGNORE_ALL_BEANINFO : 모든 BeanInfo 클래스를 무시하고 리플렉션만 사용
			Introspector.getBeanInfo(User.class, 0);
			
			// 모든 BeanInfo 캐시를 비움
			// Introspector는 클래스 분석 결과를 내부적으로 캐싱하는데 이를 비움
			Introspector.flushCaches();
			
			// 특정 클래스의 BeanInfo 캐시를 비움
			Introspector.flushFromCaches(User.class);
			
			// 속성 이름 처리
			// 자바 빈즈 규칙에 따라 첫 글자를 소문자로 변환함
			Introspector.decapitalize("UserName");
			
			// 첫 글자와 두번째 글자가 대문자인 경우는 처리하지 않음
			Introspector.decapitalize("URL");

		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		
	}
	
}