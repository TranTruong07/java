// Laboratory 05
import java.util.*;
import java.io.*;
public class TestLoadData
{
   private Scanner keyboard = new Scanner(System.in);

   public static void main(String[] args) throws Exception
   {
       Scanner infile = new Scanner(new File("CSEPRG.txt"));
       Subject s = Subject.loadData(infile);
       s.display();
		// Create an instance of the class Scanner  to read the file, name CSEPRG.txt
		// Create an instance of the class Subject by calling the method LoadData()
		// display the subject above by calling its display() method
   }
}
