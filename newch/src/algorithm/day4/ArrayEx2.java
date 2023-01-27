package algorithm.day4;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		int [] arr = {0,1,2,3,4,5};
		int position = 3;
		
		int[] arr1= Arrays.copyOfRange(arr, 0, position);
		int[] arr2= Arrays.copyOfRange(arr, position,arr.length);
	
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	
	
		int[] arr3 = new int[] {12,21,34,45,21,33,12,4};
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("Array Sum=" + sum);
		
		int[] result = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(result));
	
		//Arrays.Stream() 은 inStream 또는 DoubleStream 타입의 객체를 반환 대용량 데이터를 처리할때 for loop를 명시적으로 사용하지 않아도
		//요소를 순차적으로 다음 연산 메서드로 전달 > distinct();
		
		//List 인터페이스를 구현한 Collection 객체를 정렬할 때 Collections.sort()를 사용합니다.
	}

}
