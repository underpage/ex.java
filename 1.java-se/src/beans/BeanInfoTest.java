package beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import org.junit.Test;

import claxx.User;

public class BeanInfoTest {

	// BeanInfo
	// : 빈 구성 요소 추출을 위한 기능이 정의된 인터페이스  

	@Test 
	public void test() {
		
		try {
			
			BeanInfo info = Introspector.getBeanInfo(User.class);
			
			// BeanDescriptor 객체 반환
			info.getBeanDescriptor();

			// 빈 구성 요소에 대한 정보 반환
			PropertyDescriptor[] pd = info.getPropertyDescriptors();
			for(PropertyDescriptor p : pd) {
				System.out.println(p.getName());
				System.out.println(p.getReadMethod());
			}
			
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		
	}
	
}