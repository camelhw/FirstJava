package algorithm.day2;

public class CallByValueEx {

	public void change(int a,int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println("a=" +a +",b="+b);
	}
	
	public static void main(String[] args) {
		int x=3, y=5;
		CallByValueEx ex = new CallByValueEx();
		ex.change(x, y);
		System.out.println("x="+x+",y="+y);
	}
}
