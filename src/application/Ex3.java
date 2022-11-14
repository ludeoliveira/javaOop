package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		Student student = new Student();
		student.name = sc.next();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + student.finalGrade());
		
		if (student.finalGrade() >= 60.0) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING "+ (60 - student.finalGrade()) + " POINTS");
		}

	}

}
