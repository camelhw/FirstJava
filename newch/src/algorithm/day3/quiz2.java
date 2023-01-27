package algorithm.day3;

public class quiz2 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		for (int i = 1; i <99; i++) {
			if(i %2 ==0) {
				a=i/2;
			}else if(i %3==0) {
				b=(i*3)+1;
			}if(a == 4 || b==4 ? break : continue)
			
			System.out.println("a:"+a);
			System.out.println("b:"+b);
		}
	}

}
