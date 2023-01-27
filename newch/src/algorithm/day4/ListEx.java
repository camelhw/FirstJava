package algorithm.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListEx {

	public static void main(String[] args) {
		//List 인터페이스는 배열과 유사하게 객체를 저장,검색,삭제할때 index를 사용하여 처리
//		ArrayList(단일 스레드 환경에서 동기화 필요없는경우), Vector(멀티 스레드 환경에서 동기화를 보장)
		ArrayList<String> list = new ArrayList<>(Arrays.asList("C","A","B","a")); //67,65,66,97
		System.out.println("원본:"+list);
		//오름차순으로 정렬
		Collections.sort(list);
		System.out.println("오름차순:"+list);
		
		//내림차순으로 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("내림차순:"+list);
		
		//대소문자 구별없이 내림추순으로 정렬
		Collections.sort(list, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		System.out.println("내림차순:"+list);
		
		ArrayList<Integer> list3= new ArrayList<>(Arrays.asList(12,21,34,45,21,33,12,4));
	
		List<Integer> result = list3.stream().distinct().collect(Collectors.toList());
		//distinct()는 Stream 으로부터 받은 요소들의 중복을 제거하는 필터메서드
		//collect()는 Stream 필터링한 요소수집
		System.out.println(result);
		
		//ArrayList의 addAll() - ArrayList에 대해 깊은 복사 수행
		//ArrayList의 subList(int fromidx, int toidx) - 리스트 요소 자르기
		//ArrayList에 저장된 최소값, 최대값 변환 - Collections.max(), Collections.min()
		System.out.println(Collections.max(list3));
		System.out.println(Collections.min(list3));
	}

}
