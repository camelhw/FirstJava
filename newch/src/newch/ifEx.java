package newch;

import java.util.Scanner;

public class ifEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1~100사이의 점수를 입력하시오");
		int su=sc.nextInt();
		
		switch(su){
		case 1:
			if(su>=90) {
				System.out.println("A");
				break;
			}
		case 2:
			if(su>=85) {
				System.out.println("B");
				break;
			}
		case 3:
			if(su>=80) {
				System.out.println("C");
				break;
			}
		case 4:
			if(su>=70) {
				System.out.println("D");
				break;
			}
		case 5:
			if(su<=60) {
				System.out.println("F");
				break;
			}
			}
		}
	}

