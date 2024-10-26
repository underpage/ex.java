package lang.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;

public class ProxyTest {

	// Proxy
	// : 프록시 객체를 동적으로 생성하기 위한 클래스
	// : 프록시 객체란 실제 객체에 대한 대리자 역할을 하는 객체
	// : 객체에 직접 접근하지 않고 프록시 객체를 통해 간접적으로 접근하는 패턴
	
	interface Example {
		void interfaceMethod();
	}
	
	@Test
	public void test() {
		
		// 프록시 객체 생성
		final Example ex = (Example) Proxy.newProxyInstance(Example.class.getClassLoader(), 
				new Class<?>[] { Example.class }, (proxy, method, args) -> {
					System.out.println(method.getName());
					return null;
				});
		
		ex.interfaceMethod();
		
		// 프록시 객체인지 여부 반환
		Proxy.isProxyClass(ex.getClass());
		
		// 프록시 객체와 연결된 InvocationHandler 반환
		Proxy.getInvocationHandler(ex);
		
		// 프록시 객체가 호출되는 방식을 정의하는 인터페이스
		final InvocationHandler handler = Proxy.getInvocationHandler(ex);
		System.out.println(handler.getClass().getSimpleName());
		
	}	
	
}