package newch;

public class FinalVar {   
	   public final int PORT=3000; ; 
	   public static void main(String[] args){  //Standalone application의 실행 메서드이므로 독립적
		   FinalVar test =new FinalVar();
	        System.out.println(test.PORT); // 오류 
	        test.PORT=5000;
	   }
	}