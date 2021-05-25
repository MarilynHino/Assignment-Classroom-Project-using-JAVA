package techbee_studentproject;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateStudents {

	public static void updateStudent(ArrayList<Student> studentLists, Scanner sc) {
		System.out.println("Enter id to update sudent information");
		int updateId = sc.nextInt();
		if (studentLists.isEmpty()) {
			System.out.println("Student list is empty");
		} else {
			System.out.println("You're going to update student id::" + updateId);

			for (Student st : studentLists) {
				if (st.getStudentId() == updateId) {
					System.out.println("Enter update student name");
					sc.nextLine();
					String updateName = sc.nextLine();
					st.setName(updateName);

					System.out.println("Enter update student last name");
					String updateLastName = sc.nextLine();
					st.setLastName(updateLastName);

					System.out.println("Enter update student email address");
					String updateEmailAddress = sc.nextLine();
					st.setEmailAddress(updateEmailAddress);

					System.out.println("Enter update student phone number");
					int updatePhoneNum = sc.nextInt();
					st.setPhoneNumber(updatePhoneNum);

					System.out.println("Enter update student ssn");
					int updateSsn = sc.nextInt();
					st.setSsn(updateSsn);

					System.out.println("Enter update student gpa");
					float updategpa = sc.nextFloat();
					st.setGpa(updategpa);

					System.out.println("Student name:" + st.getName() + "\nStudent last name:" + st.getLastName()
							+ "\nStudent email address:" + st.getEmailAddress() + "\nStudent id:" + st.getStudentId()
							+ "\nStudent phone number:" + st.getPhoneNumber() + "\nStudent gpa:" + st.getGpa()
							+ "\nStudent ssn:" + st.getSsn());
					break;

				}
				System.out.println();
			}
		}
	}
}
