/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ManageDoctorHash;
import control.Validation;
import java.util.Map;
import java.util.Scanner;
import model.Doctor;

/**
 *
 * @author Admin
 */
public class Gui {
    
    
    
    
    public static void display() throws Exception{
        Scanner sc = new Scanner(System.in);
        ManageDoctorHash doctorHash = new ManageDoctorHash();
        do { 
            doctorHash.showMenu();
            int chose = Validation.getInt("Enter your choice", 1);
            switch(chose){
                case 1:
                    String code = Validation.getId("Enter code: ", doctorHash.getHashMap(), 1);
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter specialization: ");
                    String specialization = sc.nextLine();
                    int availability = Validation.getInt("Enter availability: ", 2);
                    Doctor d = new Doctor(code, name, specialization, availability);
                    doctorHash.addDoctor(d);
                    break;
                case 2:
                    String code1 = Validation.getId("Enter code: ", doctorHash.getHashMap(), 2);
                    System.out.println("Enter name: ");
                    String name1 = sc.nextLine();
                    System.out.println("Enter specialization: ");
                    String specialization1 = sc.nextLine();
                    int availability1 = Validation.getInt("Enter availability, the integer number >= 0", 2);
                    Doctor d1 = new Doctor(code1, name1, specialization1, availability1);
                    doctorHash.updateDoctor(d1);
                    break;
                case 3:
                    String code3 = Validation.getId("Enter code: ", doctorHash.getHashMap(), 2);
                    doctorHash.deleteDoctor(code3);
                    break;
                case 4:
                    String code2 = Validation.getId("Enter code: ", doctorHash.getHashMap(), 2);
                    for (Map.Entry<String, Doctor> entry : doctorHash.searchDoctor(code2).entrySet()){
                        System.out.println(entry.getValue().toString());
                    }
                    break; 
                case 5:
                    return;   
            }
        } while (true);
    }

}
