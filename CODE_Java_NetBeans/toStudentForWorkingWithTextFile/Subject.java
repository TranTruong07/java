// Laboratory 05
import java.util.*;
import java.io.*;
public class Subject
{
   private String code;
   private String title;
   private int fieldCount;
   private String fieldWeights; // a string with tokens separated by |
                                // e.g. F|20|10|70
   private int studentCount;
   private Student[] students;
   private int[] finalMarks;

   public Subject(String code, String title, int fieldCount,
                  String fieldWeights, int studentCount, Student[] students)
   {
      this.code = code;
      this.title = title;
      this.fieldCount = fieldCount;
      this.fieldWeights = fieldWeights;
      this.studentCount = studentCount;
      this.students = students;
      finalMarks = new int[studentCount];
   }



	public void display()
   {
      // Question 1(a)
      // Display on the screen the subject code, title, field counts,
      // field weights, student count, and
      // for each student, display id, family name, initials,
      // and the marks

      // TO DO for Question 1a)
	  
   }

   public static Subject loadData(Scanner infile)
	{
		// Question 1 b), c) d)
		
		  // Read the subject's details:
	   // code, title, fieldCount, fieldWeights
		
		
		// Read studentCount
	  	// Create an array to store Student instances
		
		
	 	// Read students' details,
	 	// For each students, create the array for the compoment
	 	// marks, create the Student instance and add it to the array

	  	// Create and return a Subject instance
		
	}


   public void writeReport(PrintWriter out)
   {
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
