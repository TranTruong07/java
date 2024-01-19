package thutrongtuan;
////
////

import java.util.Scanner;

////import java.text.ParseException;
////import java.text.SimpleDateFormat;
////import java.util.Date;
////import java.util.Scanner;
////
////public class ThuTrongTuan {
//    public static void main(String[] args) {
//        checkInputDate();
//    }
//
//    private static void checkInputDate() {
//        Scanner scanner = new Scanner(System.in); // System.in đại diện cho luồng đầu vào tiêu chuẩn, thường được kết nối với bàn phím
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//
//        while (true) {
//            try {
//                System.out.print("Please enter date with format [dd/mm/yyyy]: ");
//                String date1 = scanner.nextLine();
//                if (!isValidDate(date1)) {
//                    System.out.println("Invalid date format. Please enter a valid date.");
//                    continue;
//                }
//                System.out.print("Please enter date with format [dd/mm/yyyy]: ");
//                String date2 = scanner.nextLine();
//                // Kiểm tra tính hợp lệ của ngày
//                if (!isValidDate(date2)) {
//                    System.out.println("Invalid date format. Please enter a valid date.");
//                    continue;
//                }
//
//                Date date = dateFormat.parse(date1);
//                int a = date.compareTo(dateFormat.parse(date2));
//                if(a==0){
//                    System.out.println("băng nhau");
//                }else
//                if(a>0){
//                    System.out.println("lon");
//                }else{
//                    System.out.println("lon");
//                }
//                // Tìm ngày trong tuần
//                String dayOfWeek = getDayOfWeek(date);
//
//                System.out.println("Your day is " + dayOfWeek);
//                break;
//            } catch (ParseException e) {
//                System.out.println("Invalid date format. Please enter a valid date.");
//            }
//        }
//    }
//    // Hàm kiểm tra tính hợp lệ của ngày
//    private static boolean isValidDate(String input) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        dateFormat.setLenient(false);  // tắt tính linh hoạt của SimpleDateFormat sẽ k bỏ qua lỗi
//
//        try {
//            dateFormat.parse(input);
//            return true;
//        } catch (ParseException e) {
//            return false;
//        }
//    }
////
////    // Hàm tìm ngày trong tuần
////    private static String getDayOfWeek(Date date) {
////        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE"); // "EEEE" định dạng này là chuỗi mẫu cho SimpleDateFormat hiển thị này trong tuần
////        return dateFormat.format(date);
////    }
////}
//
//public class ThuTrongTuan {
//    public static void main(String[] args) {
//        String hexNumber = "217"; // Đây là số hexa cần chuyển đổi
////        String binaryNumber = hexToBinary(hexNumber);
////        System.out.println("Số nhị phân: " + binaryNumber);
////        System.out.println(binToDecima("11011", 2));
////        System.out.println(decimaTobinary(10, 2));
////        System.out.println(decimaToHex(535, 16));
////        System.out.println(binToHex("11011", 16));
//        System.out.println(hexToDeci("-1B"));
//    }
//
//    public static String decimaTobinary(int deci, int output){
//        String s = "";
//        while(deci!=0){
//            int temp = deci;
//            int a = temp % output;
//            s = a + s;
//            deci /= output;
//        }
//        return s;
//    }
//    public static String decimaToHex(int deci, int output){
//        String s = "";
//        while(deci!=0){
//            int temp = deci;
//            int a = temp % output;
//            s =  (char)(a<10 ? '0'+a: 'A'+ (a-10)) + s;
//            deci /= output;
//        }
//        return s;
//    }
//    
//    public static int binToDecima(String binary){
//        String digit = "01";
//        int sum = 0, j = 0;
//        for(int i = binary.length()-1; i>=0; i--){
//            char c = binary.charAt(i);
//            int a = digit.indexOf(c);
//            sum += a*Math.pow(2,j++);
//        }
//        return sum;
//    }
//    
//    public static String binToHex(String bina, int output){
//        int temp = binToDecima(bina);
//        String s = decimaToHex(temp, output);
//        return s;
//    }
//    public static String hexToBinary(String hexNumber) {
//        StringBuilder binaryNumber = new StringBuilder();
//        String digits = "0123456789ABCDEF";
//        for (int i = 0; i < hexNumber.length(); i++) {
//            char hexDigit = hexNumber.charAt(i);
//            int decimalValue = digits.indexOf(hexDigit);
//            String binaryDigit = Integer.toBinaryString(decimalValue);
//            // Đảm bảo rằng mỗi chữ số nhị phân có 4 bits bằng cách thêm các số 0 phía trước cần thiết
//            while (binaryDigit.length() < 4) {
//                binaryDigit = "0" + binaryDigit;
//            }
//            binaryNumber.append(binaryDigit);
//        }
//        return binaryNumber.toString();
//    }
//    
//    public static int hexToDeci(String hex){
//        String temp = hexToBinary(hex);
//        int x = binToDecima(temp);
//        return x;
//    }
//}
public class ThuTrongTuan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = Math.random();
        System.out.print("Enter: "+d);
       // System.out.println(Math.ra);
    }
}