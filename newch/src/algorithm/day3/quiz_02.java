package algorithm.day3;

public class quiz_02 {

	public static void main(String[] args) {
		int money=480;
		int apple1=30;
		int apple2=40;
		int apple3=50;
		
		int su1=0;
		int su2=0;
		int su3=0;
		
			for (su1 = 1; su1 <=8; su1++) {
			for (su2 = 1; su2<=9; su2++) {
			for (su3 = 1; su3 <=10; su3++) {
				if(su1 * apple1 + su2*apple2 + su3*apple3==money) {
					System.out.println(+su1+"개 30원" +"\t"+su2+"개 40원"+"\t" +su3+"개50원");
				}
				}
				
			}
			}
		}
	}

