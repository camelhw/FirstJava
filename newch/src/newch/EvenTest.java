package newch;

public class EvenTest {
	   public static void main(String[] args) {
		   
	       int num =  Integer.parseInt(args[0]);
	       if( num%2 == 0 ){
	            System.out.println(num+"짝수");
	       }else {
	          System.out.println(num+"홀수");
	       }//if end
	   }//main end

	} //class end
