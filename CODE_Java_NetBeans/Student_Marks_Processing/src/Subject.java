// Laboratory 05

import java.util.*;
import java.io.*;

public class Subject {

    private String code;
    private String title;
    private int fieldCount;
    private String fieldWeights; // a string with tokens separated by |
    // e.g. F|20|10|70
    private int studentCount;
    private Student[] students;
    private int[] finalMarks;

    public Subject(String code, String title, int fieldCount,
            String fieldWeights, int studentCount, Student[] students) {
        this.code = code;
        this.title = title;
        this.fieldCount = fieldCount;
        this.fieldWeights = fieldWeights;
        this.studentCount = studentCount;
        this.students = students;
        finalMarks = new int[studentCount];
    }

    public void display() {
        System.out.println("code: "+ this.code);
        System.out.println("title: "+ this.title);
        System.out.println("field count: "+ this.fieldCount);
        System.out.println("field weights: "+ this.fieldWeights);
        System.out.println("student count: "+ this.studentCount);
        if(this.studentCount == 0){
            System.out.println("students: 0");
        }else{
            for (Student student : students) {
                System.out.println(student.toString() );
            }
        }
        // Question 1(a)
        // Display on the screen the subject code, title, field counts,
        // field weights, student count, and
        // for each student, display id, family name, initials,
        // and the marks

        // TO DO for Question 1a)
    }

    public static Subject loadData(Scanner infile) {
        // Question 1 b), c) d)

        // Read the subject's details:
        // code, title, fieldCount, fieldWeights
        // Read studentCount
        String line1 = infile.nextLine();
        StringTokenizer st1 = new StringTokenizer(line1, "|");
        st1.nextToken();
        String code = st1.nextToken();
        
        String line2 = infile.nextLine();
        StringTokenizer st2 = new StringTokenizer(line2, "|");
        st2.nextToken();
        String title = st2.nextToken();
        
        
        String line3 = infile.nextLine();
        StringTokenizer st3 = new StringTokenizer(line3, "|");
        st3.nextToken();
        int fieldCount = Integer.parseInt(st3.nextToken());
        
        String fieldWeights = infile.nextLine();
        
        String line4 = infile.nextLine();
        StringTokenizer st4 = new StringTokenizer(line4, "|");
        st4.nextToken();
        int studentCount = Integer.parseInt(st4.nextToken());
        Student[] student = new Student[studentCount];
        // Create an array to store Student instances
//        for (int i = 0; i< studentCount; i++) {
//            String line = infile.nextLine();
//            StringTokenizer st = new StringTokenizer(line, "|");
//            String studentNumber = st.nextToken();
//            String familyName = st.nextToken();
//            String initials = st.nextToken();
//            double[] marks = new double[fieldCount];
//            for(int j = 0; j< fieldCount; j++){
//                marks[j] = Double.parseDouble(st.nextToken());
//            }
//            
//            student[i] = new Student(studentNumber, familyName, initials, marks);
//        }
        
        for (int i = 0; i < studentCount; i++) {
		String line = infile.nextLine(); // read a student line
		StringTokenizer st = new StringTokenizer(line, "|"); // split the line by |
		st.nextToken(); // skip the token "S"
		String studentNumber = st.nextToken(); // get the student number
		String familyName = st.nextToken(); // get the family name
		String initials = st.nextToken(); // get the initials
		double[] marks = new double[fieldCount]; // create an array for marks
		for (int j = 0; j < fieldCount; j++) {
			marks[j] = Double.parseDouble(st.nextToken()); // get a mark and add it to the array
		}
		student[i] = new Student(studentNumber, familyName, initials, marks); // create a Student instance and add it to the array
	}
        
        
        
        
        
        
        // Read students' details,
        // For each students, create the array for the compoment
        // marks, create the Student instance and add it to the array
        // Create and return a Subject instance
     
        return new Subject(code, title, fieldCount, fieldWeights, studentCount, student);
          // Read the subject's details:
//   // code, title, fieldCount, fieldWeights
//   String line = infile.nextLine(); // read the first line
//   StringTokenizer st = new StringTokenizer(line, "|"); // split the line by |
//   st.nextToken(); // skip the token "Code"
//   String code = st.nextToken(); // get the subject code
//   
//   line = infile.nextLine(); // read the second line
//   st = new StringTokenizer(line, "|"); // split the line by |
//   st.nextToken(); // skip the token "Title"
//   String title = st.nextToken(); // get the subject title
//   
//   line = infile.nextLine(); // read the third line
//   st = new StringTokenizer(line, "|"); // split the line by |
//   st.nextToken(); // skip the token "FieldCount"
//   int fieldCount = Integer.parseInt(st.nextToken()); // get the field count
//   
//   line = infile.nextLine(); // read the fourth line
//   String fieldWeights = line; // get the field weights as a string
//	
//	// Read studentCount
//	line = infile.nextLine(); // read the fifth line
//	st = new StringTokenizer(line, "|"); // split the line by |
//	st.nextToken(); // skip the token "StudentCount"
//	int studentCount = Integer.parseInt(st.nextToken()); // get the student count
//	
//  	// Create an array to store Student instances
//	Student[] students = new Student[studentCount];
//	
// 	// Read students' details,
// 	// For each students, create the array for the compoment
// 	// marks, create the Student instance and add it to the array
//	for (int i = 0; i < studentCount; i++) {
//		line = infile.nextLine(); // read a student line
//		st = new StringTokenizer(line, "|"); // split the line by |
//		st.nextToken(); // skip the token "S"
//		String studentNumber = st.nextToken(); // get the student number
//		String familyName = st.nextToken(); // get the family name
//		String initials = st.nextToken(); // get the initials
//		double[] marks = new double[fieldCount]; // create an array for marks
//		for (int j = 0; j < fieldCount; j++) {
//			marks[j] = Double.parseDouble(st.nextToken()); // get a mark and add it to the array
//		}
//		students[i] = new Student(studentNumber, familyName, initials, marks); // create a Student instance and add it to the array
//	}
//
//  	// Create and return a Subject instance
//	return new Subject(code, title, fieldCount, fieldWeights, studentCount, students);
	
        
}
   

		

    public void writeReport(PrintWriter out) {
        // Question 3

        //	Call the  method calculateFinalMarks() to update final marks
        // Define arrays of lower and upper bounds for the frequency table
        //  	int [] lowers = {0, 10, ...}
        //		int [] uppers = {9, 19, ...}
        // Define the array of labels for the grtoups in the frequency table
        //    String [] = {"0- 9", "10-19", ....}
        // Perform a for loop to find highest and lowest marks
        // total marks
        // Define array to hold frequencies, i.e. number of stars
        // int[] frequencies = new int[lowers.length]
        // Perform a loop to fill in frequencies array
        // Output the required information followed by the histogram
    }
}
