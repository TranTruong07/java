/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkhexa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class CheckHexa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "Tran nam truong";
        String regex = "^[a-zA-Z ]+$"; // Thêm ^ và $ để kiểm tra toàn bộ chuỗi
//"^[YNyn]$"
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);

        if (input.matches(regex)) {
            System.out.printf("%-5s %-5s", "ok", "ok");
        } else {
            System.out.println("Chuỗi không phù hợp với biểu thức chính quy.");
        }
    }

}
