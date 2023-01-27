package algorithm.day2;

public class LottoEx {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		
		int[] lottery = lotto.generateLottoNumbers();
		lotto.displayLottoNumbers(lottery);

	}

}
