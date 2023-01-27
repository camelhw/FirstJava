package doit_algorithm.ch01;

import java.util.Scanner;

public class quiz02 {
	static int min3(int a,int b,int c) {
		int min=a;
		
		if(min>b) min=b;
		if(min>c) min=c;
		
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("a:"); a=sc.nextInt();
		System.out.println("b:"); b=sc.nextInt();
		System.out.println("c:"); c=sc.nextInt();
		
		int min=min3(a, b, c);
		System.out.println("최소값은:"+min+"입니다");
		
	}

}
