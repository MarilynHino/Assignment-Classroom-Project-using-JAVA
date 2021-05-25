package techbee_studentproject;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
	static int curStudents = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ALLOWING ONLY 10 STUDENTS
		int max = 10;
		Student s[] = new Student[max];

		ArrayList<Student> studentList = new ArrayList<Student>();

		int choice;
		do {
			System.out.println("1.Add student.");
			System.out.println("2.Add new student.");
			System.out.println("3.Remove student.");
			System.out.println("4.Update student.");
			System.out.println("5.Display all student.");
			System.out.println("6.exit");
			System.out.println("Enter you choice");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.println("\nAdding students");
				addStudent(studentList, sc);
				break;

			case 2:
				System.out.println("\nAdding new students");
				AddNewStudent.addNewStudent(studentList, sc);
				break;

			case 3:
				System.out.println("\nRemoving students");
				RemoveStudents.removeStudent(studentList, sc);
				break;

			case 4:
				System.out.println("\nUpdating new students");
				UpdateStudents.updateStudent(studentList, sc);
				break;

			case 5:
				System.out.println("\nDisplaying all students");
				DisplayAllStudent.showStudent(studentList);
				break;

			default:
				if (choice != 6) {
					System.out.println("\nTry again!");
				}

			}

		} while (choice != 6);

		sc.close();
	}

	public static void addStudent(ArrayList<Student> StudentArrayList, Scanner sc) {

		System.out.println("Enter the size of the student. Dont exceed more than 10 students");
		int size = sc.nextInt();

		while (!(size > 0 && size + curStudents <= 10)) {

			System.out.println("Current Students are::" + curStudents);
			System.out.println("Out of range! Enter a number in the range of[0-" + (10 - curStudents) + "]");
			size = sc.nextInt();

		}
		curStudents = curStudents + size;

		Student s[] = new Student[size];

		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();

			{
				System.out.print("Enter Student name:");
				sc.nextLine();
				String studentName = sc.nextLine();
				s[i].setName(studentName);

				System.out.print("Enter Student last name:");
				String studentLastName = sc.nextLine();
				s[i].setLastName(studentLastName);

				System.out.print("Enter Student email address:");
				String studentEmailAddress = sc.nextLine();
				s[i].setEmailAddress(studentEmailAddress);

				System.out.print("Enter Student Phone number:");
				long studentPhoneNum = sc.nextLong();
				s[i].setPhoneNumber(studentPhoneNum);

				System.out.print("Enter Student id:");
				int studentId = sc.nextInt();
				s[i].setStudentId(studentId);

				System.out.print("Enter Student ssn:");
				int studentSsn = sc.nextInt();
				s[i].setSsn(studentSsn);

				System.out.print("Enter Student gpa:");
				float studentGpa = sc.nextFloat();
				s[i].setGpa(studentGpa);

				StudentArrayList.add(s[i]);

			} // END IF STSTEMENT

			System.out.println();
		} // END FOR LOOP

	}

}
