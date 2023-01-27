package algorithm.day2;

public class OverloadEx {
	public void add(int a, int b) {
		System.out.println("add(int, int) called");
	}
	
	double add(double a, double b) {
		System.out.println("add(double, double) called");
		return 0.0;
	}

	public void add(String a,String b) {
		System.out.println("add(String, String)called");
	}
	public void add(int a,int b, int...c) {
		System.out.println("4 called");
		System.out.println(c.length); // 메서드 내부에서 파라미터 c는 로컬 배열로 생서됨
	}

	public static void main(String[] args) {
		OverloadEx ex = new OverloadEx();
		ex.add(10, 20);
		ex.add('a', 3.14); //error? , 정상 실행?
		// byte < short < int < long <float <double
		//		  char
	
		ex.add(1,2,3,4,5,6,7,8,9,10);
		int[] nums= new int[] {1,2,3,4,5};
		ex.add(0, 0, nums);
	
	
}
}
