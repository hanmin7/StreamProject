package checkQ;

import java.util.function.IntBinaryOperator;

//class GetMax implements IntBinaryOperator{
//	@Override
//	public int applyAsInt(int left, int right) {
//		return left > right ? left : right; //if문 이런식으로도 나타낼 수 있ㅇㅁ
//	}
//}
//
//class GetMin implements IntBinaryOperator{
//	@Override
//	public int applyAsInt(int left, int right) {
//		return left < right ? left : right;   //left가 작으면 left 반환, 아니면 right 반환
//	}
//	
//}

public class LambdaExample5 {
	private static int[] scores = { 10, 50, 3 };
	
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//클래스 선언않고 익명객체로 표현 (책)
		//최대값 얻기
//		int max = maxOrMin( 
//			(a , b) -> {
//				if(a>=b) return a;
//				else return b;
//			}
//		);
//		
//		System.out.println("최대값: " + max); 
		
//		//최소값 얻기
//		int min  = maxOrMin(
//				(a, b) -> {
//					if(a<=b) return a;
//					else return b;
//				}
//				);
//		
//		System.out.println("최소값: " + min);
		
		
		
		
		//클래스 따로 만들어서 이용~~
		//최대값 class GetMax 만든거
//		int result = maxOrMin(new GetMax());
//		System.out.println("결과값은: " + result);
		
		//최소값 class GetMin 만든거
//		int result1 = maxOrMin(new GetMin());
//		System.out.println("결과값은: " + result1);
		
		//이것도 이제 바로 쓰는 람다로도 표현 가능 ~ 아래~~
		
		
		
		
		
		//클래스 만들지않고 바로 람다로 적어서도 가능~~
		int result3 = maxOrMin((left, right) -> left > right ? left : right);
		System.out.println("결과값은: " + result3);  //최대값
		
		int result4 = maxOrMin((left, right) -> left < right ? left : right);
		System.out.println("결과값은: " + result3);  //최소값
		
		
		
		
	}
	
}
