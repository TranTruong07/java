/*
 * Kiểm tra xem 1 chuỗi có chứa ít nhất 1 even digit: (?=.*[2468].*).+
Kiểm tra chuỗi có chứa ít nhất 1 digit: (?=.*\d+.*).+
Kiểm tra chuỗi có chứa ít nhất 1 letter: (?=.*[a-zA-Z].*).+
 */
package check_ky_tu_instring;

/**
 *
 * @author Admin
 */
public class Check_Ky_Tu_inString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "abc A01 B03";
        String[] arr = str.split("\\s+");
        int count = 0;
        for (String s : arr) {
            if(s.matches("(?=.*[a-zA-Z].*).+")){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
