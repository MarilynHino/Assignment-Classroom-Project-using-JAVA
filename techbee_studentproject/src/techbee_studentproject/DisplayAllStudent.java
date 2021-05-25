package techbee_studentproject;

import java.util.ArrayList;

public class DisplayAllStudent {
	public static void showStudent(ArrayList<Student> studentList) {
		if (studentList.isEmpty()) {
			System.out.println("Student list is empty");
		} else {
			System.out.println("The current and new student(s) information");

			for (Student st : studentList) {
				System.out.println("Student name:" + st.getName() + "\nStudent last name:" + st.getLastName()
						+ "\nStudent email address:" + st.getEmailAddress() + "\nStudent phone number:"
						+ st.getPhoneNumber() + "\nStudent id:" + st.getStudentId() + "\nStudent gpa:" + st.getGpa()
						+ "\nStudent ssn:" + st.getSsn());
				System.out.println();
			}
			System.out.println();

		}
	}
}