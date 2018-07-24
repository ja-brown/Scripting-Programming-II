import java.util.Arrays;

public class Student {
    
    private String studentID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] grades;
    
    public Student(String studentID, String firstName, String lastName, String email, int age, int[] grades){
    	setStudentID(studentID);
    	setFirstName(firstName);
    	setLastName(lastName);
    	setEmail(email);
    	setAge(age);
    	setGrades(grades);
    }
    
    //Accessors ('gets')
    
    public String getStudentID(){
    	return studentID;
    }
    public String getFirstName(){
    	return firstName;
    }
    public String getLastName(){
    	return lastName;
    }
    public String getEmail(){
    	return email;
    }
    public int getAge(){
    	return age;
    }
    public int[] getGrades(){
    	return grades;
    }

    //Mutators ('sets')
    
    public void setStudentID(String studentID){
    	this.studentID = studentID;
    }
    public void setFirstName(String firstName){
    	this.firstName = firstName;
    }
    public void setLastName(String lastName){
    	this.lastName = lastName;
    }
    public void setEmail(String email){
    	this.email = email;
    }
    public void setAge(int age){
    	this.age = age;
    }
    public void setGrades(int[] grades){
    	this.grades = grades;
    }

    // Print Method
    
    public void print(){
    	System.out.println("Student ID: " + getStudentID() + "\t First Name: " + getFirstName() + "\t Last Name: " + getLastName() + "\t E-mail: "
    			+ getEmail() + "\t Age:" + getAge() + "\t Grades: " + Arrays.toString(getGrades()));
    }
    
}