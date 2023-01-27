package algorithm.day2;

import java.util.Scanner;

public class power1 {

	   public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      System.out.println("입력: ");
		      int num = sc.nextInt();
		      int score = 0;
		      while (num != 0) {
		         for (int i = 1; i <= num; i *= 2) {
		            if ((i - num) == 0) {
		               score++;
		            }
		         }
		         if (score >= 1) {
		            System.out.println("출력: OK");
		         } else {
		            System.out.println("출력: NO");
		         }
		         score = 0;

		         System.out.print("입력: ");
		         num = sc.nextInt();

		      }
		      sc.close();

		   }

		}