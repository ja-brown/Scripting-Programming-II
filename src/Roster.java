import java.util.*;

public class Roster {
	
	static String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59", 
	        "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
	        "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
	        "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
	        "5,Jonathan,Brown,jbro632@my.wgu.edu,26,97,98,99"};
	
	static ArrayList<Student> rosterStudents = new ArrayList<>();

	public static void main(String[] args) {

		//Main() method. Required. Assigns values to each part of the ArrayList.

		for (int i = 0; i < students.length; i++){
			String [] arrPart = students[i].split(",");

			String studentID = arrPart[0];
			String firstName = arrPart[1];
			String lastName = arrPart[2];
			String email = arrPart[3];
			int age = Integer.parseInt(arrPart[4]);
			int[] grades = {Integer.parseInt(arrPart[5]),Integer.parseInt(arrPart[6]),Integer.parseInt(arrPart[7])};

			Student newStudent = new Student(studentID,firstName,lastName,email,age,grades);
			rosterStudents.add(newStudent);
		}

		//The following methods, shown below, are each called in order.
		print_all();
		print_invalid_emails();
		for (Student s : rosterStudents) {
			print_average_grade(s.getStudentID());
		}
		remove("3");
		remove("3");
	}

	public static void add(String studentID, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3){

		//If called, this method will create a Student object, taking in all the necessary parameters
		int[] grades = {grade1, grade2, grade3};
		Student newStudent = new Student(studentID, firstName, lastName, email, age, grades);
		rosterStudents.add(newStudent);
	}

	public static void print_all(){

		//Print a line for each Student in the rosterStudents ArrayList
		for(int i = 0; i < rosterStudents.size(); i++){
			rosterStudents.get(i).print();
		}
	}

	public static void print_invalid_emails() {
		for (int i = 0; i < rosterStudents.size(); i++) {
			String email = rosterStudents.get(i).getEmail();

			//Verify email addresses contain ampersand and period, and do not contain a space

			if (email.contains("@") && email.contains(".") && !email.contains(" ")) {
				System.out.print("");
			}
			else {
				System.out.println("Invalid email: " + rosterStudents.get(i).getEmail());
			}
		}
	}
		public static void print_average_grade(String studentID) {

		//Get each grade for each student in rosterStudents ArrayList. Then calculate an average
		//by summing them, and dividing by the total number of grades, in this case, 3. Then
		//print out each average grade for each student.

		for (int i = 0; i < rosterStudents.size(); i++) {
			if (rosterStudents.get(i).getStudentID().equals(studentID)) {
				double average = ((rosterStudents.get(i).getGrades()[0] + rosterStudents.get(i).getGrades()[1] + rosterStudents.get(i).getGrades()[2]) / 3.0);
				System.out.println("Student " + studentID + "'s Average Grade = " + average);
				return;
			}
		}
		//Code below replaced by for and if statements above
		//for (Student s : rosterStudents) {
		//	double average = (s.getGrades()[0] + s.getGrades()[1] + s.getGrades()[2]) / 3.0;
		//	System.out.println("Student " + studentID + "'s Average Grade = " + average);
		//}
	}
	
	public static void remove(String studentID){
		for (int i = 0; i < rosterStudents.size(); i++) {
			String ID = rosterStudents.get(i).getStudentID();

			//If the ID being passed in equals an ID that exists in the ArrayList rosterStudents,
			//then remove that value by its index.
			if (ID.equals(studentID)) {
				rosterStudents.remove(i);
				System.out.println("Student with ID " + studentID + " removed.");
				return;
			}
		}
		//If the ID being passed in does NOT equal an ID that exists in the ArrayList rosterStudents,
		//then print that the ID was not found.
		System.out.println("Student with ID " + studentID + " was not found.");
	}
		
}	

