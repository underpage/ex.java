package beans;

import java.beans.BeanDescriptor;

import org.junit.Test;

import claxx.User;

public class BeanDescriptorTest {

	// BeanDescriptor
	// : 빈의 메타데이터 정의 및 정보를 제공하는 클래스
	// : 정의한 정보는 문서화, 프레임워크, IDE에서 활용됨
	
	
	
	@Test 
	public void test() {
		
		BeanDescriptor descriptor = new BeanDescriptor(User.class);
		
		// 빈의 이름 지정
		descriptor.setDisplayName("User Component");
		
		// 빈에 대한 설명 지정
		descriptor.setShortDescription("사용자 정보를 담는 컴포넌트");
	
		// 빈에 대한 추가 정보 지정
		descriptor.setValue("속성", "커스텀 속성 지정");
		
		// 빈의 이름 반환
		descriptor.getName();
		
		// 정의한 빈 이름 반환
		descriptor.getDisplayName();
		
		// 주어진 빈의 속성값 반환
		descriptor.getValue("속성");
		
		// 빈의 클래스 반환
		descriptor.getBeanClass();
		
		// 고급 사용자 속성 지정
		// IDE에서 고급 모드나 전문가 모드에만 속성을 노출함
		descriptor.setExpert(true);
		
		// 사용자에게 속성을 숨길지 여부 지정
		descriptor.setHidden(true);
		
		// 사용자에게 속성을 우선적으로 보여줄지 여부 지정
		descriptor.setPreferred(true);

	}
	
}