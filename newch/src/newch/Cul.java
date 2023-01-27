package newch;

import java.util.Scanner;

public class Cul {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int x;
    System.out.println("숫자를 입력해주세요:");
    x = sc.nextInt();
    for (int i = 1; i <= 9; i++) {
        System.out.println(x + " x " + i + " = " + x * i);
    }
}
}