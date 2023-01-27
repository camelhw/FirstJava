package algorithm.day3;

import java.util.Scanner;

public class quiz_011 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;

	        // 임의의 양의 정수 10개를 읽어들인다
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter a positive integer: ");
	            int number = input.nextInt();

	            // 읽어들인 수들 중 최대값과 최소값을 구한다
	            if (number < min) {
	                min = number;
	            }
	            if (number > max) {
	                max = number;
	            }
	        }

	        // 범위를 구한다 (최대값 - 최소값)
	        int range = max - min;

	        System.out.println("The range of the numbers is: " + range);
	    }
	}