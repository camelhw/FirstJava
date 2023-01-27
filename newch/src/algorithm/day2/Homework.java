package algorithm.day2;

import java.util.Scanner;

public class Homework {
	
	

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력");
		int su1=sc.nextInt();
		int su2=sc.nextInt();
		
		System.out.println("최대공배수는"+lcm(su1,su2)+"입니다");
		
	}
	public static int gcd(int su1, int su2) {
		if(su2==0) {
			return su1;
		}else {
			return gcd(su2,su1 % su2);
		}
	}
	public static int lcm(int su1, int su2) {
		return (su1*su2) / gcd(su1,su2);
	}

}
