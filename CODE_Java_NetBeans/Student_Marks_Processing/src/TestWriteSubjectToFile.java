// Laboratory 05
import java.util.*;
import java.io.*;
public class TestWriteSubjectToFile
{
   private Scanner keyboard = new Scanner(System.in);

   public static void main(String[] args) throws Exception
   {
		Scanner infile = new Scanner(new File("CSEPRG.txt"));
		Subject subject = Subject.loadData(infile);
		subject.display();

		PrintWriter outfile = new PrintWriter(new File("report.txt"));
		subject.writeReport(outfile);
		outfile.close();

		outfile = new PrintWriter(new File("CSEPRG-COPY.txt"));
		subject.writeSubjectToFile(outfile);
		outfile.close();
   }
}
