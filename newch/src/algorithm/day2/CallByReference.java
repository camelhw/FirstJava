package algorithm.day2;

public class CallByReference {
	
	public void change(int[] a,int[] b) {
		int temp = a[0];
		a[0]=b[0];
		b[0]=temp;
		System.out.println("a=" +a +",b="+b);
	}
	
	public static void main(String[] args) {
		int[] x= {3};
		int[]y= {5};
		CallByReference ex = new CallByReference();
		ex.change(x, y);
		System.out.println("x[0]="+x+",y[0]="+y);
	}
}

