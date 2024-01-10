/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalformatdemo;

import java.text.DecimalFormat;

/**
 *
 * @author Admin
 */
public class DecimalFormatDemo {
    static public String customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        return output;
    }
    static public void main(String[] args) {
        System.out.println(customFormat("###,###.###", 123456.789));
        System.out.println(customFormat("###.##", 123456.789));
        System.out.println(customFormat("000000.000", 123.78));
        System.out.println(customFormat("$###,###.###", 12345.67));
    }
    
}
