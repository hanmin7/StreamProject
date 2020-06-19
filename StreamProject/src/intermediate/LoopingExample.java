package intermediate;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		
		System.out.println("[peek()를 마지막에 호출한 경우]");
		Arrays.stream(intArr).filter(a -> a%2 == 0).peek(n -> System.out.println(n));//동작X 값안나옴. 중간처리메소드라서
		
		System.out.println("[최종 처리 메소드를 마지막에 호출한 경우");
		int total = Arrays.stream(intArr).filter(a -> a%2 == 0).peek(n -> System.out.println(n)).sum(); //peek동작. sum 최종메소드
		System.out.println("총합: " + total);
		
		System.out.println("[forEach()를 마지막에 호출한 경우]");
		Arrays.stream(intArr).filter(a -> a%2 == 0).forEach(n -> System.out.println(n)); //foreach 중간처리메소드이나  최종 메소드로 동작
		
		//peek, forech 
		
	}
}
