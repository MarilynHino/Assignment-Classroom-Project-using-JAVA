package techbee_studentproject;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveStudents {

	public static void removeStudent(ArrayList<Student> studentList, Scanner sc) {
		System.out.println("Enter student id that you want to remove.");
		int removeId = sc.nextInt();
		boolean status = false;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.isEmpty()) {
				System.out.println("The list is empty");
			} else {
				for (Student st : studentList) {
					if (st.getStudentId() == removeId) {
						System.out.println("You want to delete id::" + removeId);
						studentList.remove(st);
						status = true;
						break;
					}
				}
				if (!status) {
					System.out.println("The id " + removeId + " does not exist.");
				}

			}

		}

	}
}
