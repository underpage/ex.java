import org.junit.Test;

public class BlockTest {

	// Block Statement
	
	class Block {
		
		int num;
		
		{
			System.out.println("Block : Instance initialization");
		}
		
		public Block () {
			System.out.println("Block : Constructor");
		}

	}
	
	class ChildBlock extends Block {
		{
			System.out.println("ChildBlock : Instance initialization");
		}
		
		public ChildBlock() {
			System.out.println("ChildBlock : Constructor initialization");
		}
	}
	
	
	
	@Test
	public void test() {
	
		// 인스턴스 생성
		// 1. super 생성자 호출 및 실행  2. 인스턴스 초기화 블록 실행  3. 생성자 실행 
		new ChildBlock();
		
		// 이중 괄호 초기화
		Block b = new Block() {{ 
			// 바깥 괄호 : 익명 내부 클래스
			// 안쪽 괄호 : 초기화 블록 (객체 생성과 함께 필드 초기화) 
			num = 999; 
		}};
		
		System.out.println(b.num);		
		
	}
	
}