package algorithm.day2;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	
	public static final int LOTTO_NUM_CNT = 6;
	
	private static int getRandomNumber() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(45) + 1;
		
		return randomNumber;
	}
	
	public int[] generateLottoNumbers() {		
		int[] lotto = new int[LOTTO_NUM_CNT];		
		
		for(int i = 0; i < LOTTO_NUM_CNT; i++) {
			boolean dup_check = false;	//배열에 저장된 요소의 중복 상태값을 의미하는 변수		
			int temp = getRandomNumber();
			
			for(int j = 0; j <= i; j++) {
				if(temp == lotto[j]) {
					dup_check = true;
				}
			}
			if(!dup_check) {
				lotto[i] = temp;
			}			
		}
		
		return lotto;
	}
}
