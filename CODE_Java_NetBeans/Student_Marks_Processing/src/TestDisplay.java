// Laboratory 05
import java.util.*;
import java.io.*;
public class TestDisplay
{
   private Scanner keyboard = new Scanner(System.in);

   public static void main(String[] args)
   {
		//	Test 1 - Create a subject with no students and display it
		//
	int studentCount = 0;
        Student[] students = null;

        Subject subject = new Subject("CSE1IOO", "Programming", 3, "F|20|30|50",
      	studentCount, students);

		subject.display();


		// Test 2 -  Create a subject with two students and display it
		//
		double[] marks = {90, 92, 94};
		Student s1 = new Student("S1", "Alder", "A.", marks);
		Student s2 = new Student("S2", "Brown", "B.", marks);

		studentCount = 2;
		Student[] students_2 = {s1, s2};

		subject = new Subject("CSE1IOO", "Programming", 3, "F|20|30|50", studentCount, students_2);

		subject.display();
   }
}
