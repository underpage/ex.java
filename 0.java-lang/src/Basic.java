public class Basic {

	private static int count = 10;
	
	public static void main(String str) {
		System.out.println("오버로딩 : " + str);
	}
	
	public static void main(String... args) {
		
		System.out.println("메인 메소드 : " + (count--));

		if(count != 0) {
			main();
		}

		// 오버로드한 메인 메소드 
		main("실행 " + (count--));
		
	}
	
}