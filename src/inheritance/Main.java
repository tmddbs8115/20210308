package inheritance;

public class Main {
	public static void main(String[] args) {
		//Student랑 SalaryMan을 생성하고 임의의 값을 부여해주세요
		
		Student s1 = new Student();
		Salaryman m1 = new Salaryman();
		
		s1.age = 19;
		s1.grade = 3;
		s1.job = "학생";
		s1.major = "컴퓨터";
		s1.name = "버르장모리";
		s1.pnum = "010-8282-1111";
		m1.age = 28;
		m1.job = "개발자";
		m1.name = "허승윤";
		m1.pnum = "010-4444-2212";
		m1.salary = 4000;
		
		
		s1.setGrade(2);
		s1.getInfo("=================");
		m1.getInfo();
		s1.getInfo();
		
		
	}
}
