package algorithm.day2;

import java.util.Scanner;

public class quiz6 {

	public static void main(String[] args) {
		int  no ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수입력 :");
		no = scanner.nextInt();
		while(no!=0) {
		   boolean flag = false;
		   for (int i=1;i<no/2;i++) {
		   	  if( Math.pow(2, i) == no ) {
		   		  flag = true;
		   		  break;
		   	  }
		   }//for end
		   if(flag) {
			   System.out.println( "출력 : OK");	
		   }else {
			   System.out.println( "출력 : NO");		
		   }
		   System.out.print("정수입력 :");
		  no = scanner.nextInt();   
		}//while end
		scanner.close();
	}//main end
}//class end
