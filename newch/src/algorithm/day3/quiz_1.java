package algorithm.day3;

import java.util.Scanner;

public class quiz_1 {


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max= Integer.MAX_VALUE;
		int min= Integer.MIN_VALUE;
		
		for (int i = 0; i <10; i++) {
			System.out.println("10개의 정수");
			int su = sc.nextInt();
		
			//최대값
			if(su<max) {
				max=su;
			}
			//최소값
			if(su>min) {
				min=su;
			}
			
	}
		int range = min -max; // 최소값 - 최대값
		System.out.println("최대값과 최소값의 범위는"+range+"입니다");

	}
	}
