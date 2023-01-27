package exercise.basic.array;

import java.util.Random;

public class Array {
    private String title;
    private int row;
    private int col;
    private int[][] array;

    public Array(String title, int row, int col) {
    	//멤버필드를 받아온 파라미터로 초기화
        this.title = title;
        this.row = row;
        this.col = col;
    }
public void setArray(int[][] array) {
        this.array = array;
    }

    public void makeArrayData(){
        array = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                array[i][j] = getRandomNumber();
            }
        }
    }

    private int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(row * col) + 1;
    }

    public void printArray(){
        if(array == null) throw new NullPointerException();//
        System.out.println("## "+title+" 출력");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }

public static void findMatchNumber(Array array1, Array array2){
    int row = Math.min(array1.row, array2.row);//
    int col = Math.min(array1.col, array2.col);//
    int[][] arr1 = array1.getArray();
    int[][] arr2 = array2.getArray();
    int cnt = 0;

    StringBuffer sb = new StringBuffer();
    sb.append("##");
    for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            if(arr1[i][j] == arr2[i][j]) {
                sb.append(" 일치하는 숫자: ["+ i +"]["+j+"] = "+arr1[i][j]+ ", ");
                cnt++;
            }
        }
    }
    if(cnt > 0) System.out.println(sb.toString());
    System.out.println("## 일치하는 숫자 갯수: " + cnt);
}
private int[][] getArray() {
	// TODO Auto-generated method stub
	return null;
}
}



