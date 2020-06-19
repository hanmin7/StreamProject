package checkQ;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LambdaExample6 {
	private static Student[] students = {
		new Student("홍길동", 90, 96),
		new Student("신용권", 95, 93)
	};
	
//	public static double avg(int a) {
//		int sum = 0;
//		for(Student student : students) {
//			sum += student.getEnglishScore();
//		}
//		return (double) sum / students.length;
//	}
	//이렇게 int로 받아오면 일이많아짐. 영어, 수학 등 만약 과목들이 더 많다면? 다 만들어줘야하니까 
	
	
	
	//avg() 메소드 생성
//	public static double avg( ToIntFunction<Student> toIntFunction) {
	public static double avg( ToIntFunction<Student> function) {//student타입 받아서 int로 반환 맴핑...
		int sum = 0;
		for(Student student : students) {
			sum += function.applyAsInt(student);
		}
		return (double) sum / students.length;
	}
	
	
	
	//--------------------------------
//	public static double avgTotal() {
//		int sum = 0;
//		for(Student student : students) {
//		sum += student.getEnglishScore() + student.getMathScore();
//		}
//		return (double) sum / students.length;
//		return 0;
//	}
//	
//	public static double avgEnglish() {
//		int sum = 0;
//		for(Student student : students) {
//			sum += student.getEnglishScore();
//		}
//		return (double) sum / students.length;
//	}
//	
//	public static double avgMath() {
//		int sum = 0;
//		for(Student student : students) {
//			sum += student.getMathScore();
//		}
//		return (double) sum / students.length;
//	}
	//---------------------------------
	
	
	
	
	
	public static void main(String[] args) {
		double result = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getEnglishScore();
			}
		});
		
		
		double result1 = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getMathScore();
			}
		});
		
		
		System.out.println("영어평균: " + result);
		System.out.println("수학평균: " + result1);
		
		
		System.out.println("전체평균: " + (result + result1) / 2);
		
		
		
		double TotalAvg = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getMathScore() + value.getEnglishScore();
			}
		});
		System.out.println("학생 전체 평균: " + TotalAvg);
		
		
		//---
//		System.out.println("영어평균: " + avgEnglish());
//		System.out.println("수학평균: " + avgMath());
//		System.out.println("전체평균: " + avgTotal());
//		
//		double mathAvg = avg(new ToIntFunction<Student>() {
//			@Override
//			public int applyAsInt(Student value) {
//				return value.getMathScore();
//			}
//		});
//		System.out.println("수학 평균 점수: " + mathAvg);
//		double TotalAvg = 0;
//		
//		System.out.println("전체 평균 점수: " + TotalAvg);
//		
		//---
		
	}
	
	
	
	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		public String getName() {return name;}
		public int getEnglishScore() { return englishScore;}
		public int getMathScore() {return mathScore;}
	}
	
}
