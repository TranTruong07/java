/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkstringnotsort;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class CheckStringNotSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputString = "abc fde cde gsm cd hg";
        String targetWord = "hg";

        String[] words = inputString.split(" ");
        int lastUnsortedIndex = -1;

        // Tìm từ cuối cùng chưa được sắp xếp
        for (int i = words.length - 1; i >= 0; i--) {
            if (!isSorted(words[i])) {
                lastUnsortedIndex = i;
                break;
            }
        }
        System.out.println(lastUnsortedIndex);
    }
    private static boolean isSorted(String word) {
        char[] chars = word.toCharArray();
        char[] sortedChars = Arrays.copyOf(chars, chars.length);
        Arrays.sort(sortedChars);
        return Arrays.equals(chars, sortedChars);
    }
    
}
