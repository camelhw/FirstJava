package algorithm.day2;

import java.util.Scanner;

public class power {


	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; ) {
			
		}
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력");
			int su1 = sc.nextInt();
			
		if(su1 ==0)
			break;
		if(su1*(su1-1)%2==0 && su1 !=0) {
			System.out.println("ok");
		}else {
			System.out.println("no");
		}
	}
		sc.close();

}
}
