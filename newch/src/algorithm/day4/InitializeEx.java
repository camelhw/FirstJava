package algorithm.day4;

public class InitializeEx {
	public static int num=50;
	static{
		num /=5;
		System.out.println("1");
	}

	public static void main(String[] args) {
		System.out.println("3");
		num *=3;
		System.out.println(num);
	}
	
	static {
		num *=3;
		System.out.println("2");
	}
}
