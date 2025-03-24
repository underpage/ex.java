package beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import org.junit.Test;

import claxx.User;

public class BeanInfoTest {

	// BeanInfo
	// : 특정 클래스(자바빈)의 메타데이터 정보를 제공하는 인터페이스
	// : 인터페이스 구현 대신 쉽게 사용하기 위해 SimpleBeanInfo 클래스를 제공함
	
	// PropertyDescriptor : 속성에 대한 정보 제공
	// MethodDescriptor   : 메소드에 대한 정보 제공
	// EventSetDescriptor : 발생하는 이벤트에 대한 정보 제공
	
	
	
	@Test 
	public void test() {
		
		try {
			
			BeanInfo info = Introspector.getBeanInfo(User.class);
			
			// 빈에 대한 설명 반환
			info.getBeanDescriptor();

			// 빈의 속성 정보 반환
			info.getPropertyDescriptors();
			
			// 빈의 메소드 정보 반환
			info.getMethodDescriptors();
			
			// 빈의 이벤트 정보 반환
			info.getEventSetDescriptors();
			
			// 추가 정보를 제공하는 객체를 반환
			// 추가 정보란 Introspector이 감지하지 못하는 정보로 기본은 null을 반환함
			info.getAdditionalBeanInfo();
			
			// 빈의 get/set/is 메소드를 통해 속성 정보를 추출하므로 
			// 빈에 get/set/is 메소드가 없다면 속성 정보를 반환하지 못함
			PropertyDescriptor[] pd = info.getPropertyDescriptors();
			for(PropertyDescriptor p : pd) {
				System.out.println(p.getName());
			}
			
			
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		
	}
	
}