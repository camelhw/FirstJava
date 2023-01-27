package newch;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 82103
 *
 */
public class upDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random su = new Random();
		int nansu= su.nextInt(100)+1;
		int count = 1;
		
		do {
			System.out.println("1~100 사이의숫자를 입력하세요");
			int random=sc.nextInt();
			
			if(nansu == random) {
				System.out.println("정답입니다");
				break;
			}else if(nansu>random) {
				System.out.println("up");
			
			}else{
			System.out.println("down");
			}
			count++;
			
		}
		while(count<=5);
		if(count>5) {
			System.out.println("게임에서 패배하셨습니다");
			
		}
	}

}
