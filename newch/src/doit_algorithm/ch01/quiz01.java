package doit_algorithm.ch01;

import java.util.Scanner;

public class quiz01 {
	
	static int max4(int a,int b, int c, int d) {
		int max = a;
		
		if(max<b)
			max= b;
		if(max<c)
			max=c;
		if(max<d)
			max=d;
		
		
		return max;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("네 정수의 최대값을 구합니다.");
		System.out.println("a:"); a=sc.nextInt();
		System.out.println("b:"); b=sc.nextInt();
		System.out.println("c:"); c=sc.nextInt();
		System.out.println("d:"); d=sc.nextInt();
		
		int max = max4(a,b,c,d);
		System.out.println("최대값은"+max+"입니다");
		
	}

}
