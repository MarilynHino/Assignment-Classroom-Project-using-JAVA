package techbee_studentproject;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewStudent {

	public static void addNewStudent(ArrayList<Student> studentList, Scanner sc) {
		System.out.println("How many new student you want to enter:");
		int updatSize = sc.nextInt();
		while (!(updatSize > 0 && updatSize <= 10)) {
			System.out.println("Enter other number range[1-10].");
			updatSize = sc.nextInt();

		}
		Student stu[] = new Student[updatSize];

		for (int i = 0; i < stu.length; i++) {

			stu[i] = new Student();
			System.out.print("Enter Student name:");
			sc.nextLine();
			String newStudentName = sc.nextLine();
			stu[i].setName(newStudentName);

			System.out.print("Enter Student last name:");
			String newStudentLastName = sc.nextLine();
			stu[i].setLastName(newStudentLastName);

			System.out.print("Enter Student email address:");
			String newStudentEmailAddress = sc.nextLine();
			stu[i].setEmailAddress(newStudentEmailAddress);

			System.out.print("Enter Student Phone number:");
			int newStudentPhoneNum = sc.nextInt();
			stu[i].setPhoneNumber(newStudentPhoneNum);

			System.out.print("Enter Student id:");
			int newStudentId = sc.nextInt();
			stu[i].setStudentId(newStudentId);

			System.out.print("Enter Student ssn:");
			int newStudentSsn = sc.nextInt();
			stu[i].setSsn(newStudentSsn);

			System.out.print("Enter Student gpa:");
			float newStudentGpa = sc.nextFloat();
			stu[i].setGpa(newStudentGpa);

			studentList.add(stu[i]);

			System.out.println();

		}
	}

}
