package algorithm.day3;

public class quiz1 {

	public static void main(String[] args) {
		int count=0;
		int a,b,c;
		
		for (int n = 100; n < 1000; n++) {
			if(count !=0 && count %10 ==0) {
				System.out.println();
			}
			a= n/100;
			b= (n%100)/10;
			c= n%10;
			
			if(a*a*a+b*b*b+c*c*c == n) {
				count++;
				System.out.println(n);
			}
			
		}
		}

}
