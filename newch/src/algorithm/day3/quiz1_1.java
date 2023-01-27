package algorithm.day3;

public class quiz1_1 {

	public static void main(String[] args) {
        int num = 153; // input number between 100 and 999
        
        int originalNum = num;
        int result = 0;
        int digit;
        
        while (originalNum != 0) {
            digit = originalNum % 10;
            result += digit * digit * digit;
            originalNum /= 10;
        }
        
        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
