package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Hong", 30), new Student("Hwang", 25), new Student("Park", 15));
		
		students.stream().sorted().forEach(s -> System.out.println(s));
		//오류. 지금 stdudent타입은 sort를 할  수 없음. comparable 구현되어야지 sort 이용 할 수 있음
		//Student 클래스에서 implement 해주고 오버라이딩 해주면 오버라이딩에서 정의한 기준으로 정렬되어짐.
		
		List<Person> persons = Arrays.asList(new Person("Hong",30), new Person("Hwang", 25), new Person("Park",15));
		persons.stream().sorted(new Comparator<Person>() { //클래스에 implement 오버라이디하지않고 sorted에서 매개값으로 여기서 정의
			@Override
			public int compare(Person o1, Person o2) {
//				return o1.age - o2.age; //나이기준으로 정렬
				return o1.name.compareTo(o2.name); //이름순 정렬
			}
		}).forEach(System.out::println);
		
	}
}
