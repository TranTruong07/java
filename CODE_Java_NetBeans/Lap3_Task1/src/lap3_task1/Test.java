/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap3_task1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Pet p1 = new Pet("01", "Cat 1", "Jone");
//        Pet p2 = new Pet("02", "Dog 1", "Jame");
//        Pet p3 = new Pet("03", "Dog 2", "Lisa");
//        Pet p5 = new Pet("05", "Dog 3", "Mary");
//        Pet p6 = new Pet("06", "Dog 4", "Ace");
//        Pet p4 = new Pet("04", "Cat 2", "Alice");
//        
//        Cat c1 = new Cat("SH", p1.getId(), p1.getName(), p1.getOwner());
//        Cat c2 = new Cat("LH", p4.getId(), p4.getName(), p4.getOwner());
//        Cat c3 = new Cat("SH", p4.getId(), p4.getName(), p4.getOwner());
//        
//        Dog d1 = new Dog("Small", p2.getId(), p2.getName(), p2.getOwner());
//        Dog d2 = new Dog("Large", p3.getId(), p3.getName(), p3.getOwner());
//        Dog d3 = new Dog("Small", p5.getId(), p5.getName(), p5.getOwner());
//        Dog d4 = new Dog("Large", p6.getId(), p6.getName(), p6.getOwner());
//        
//        DangerousDog dd1 = new DangerousDog(p2.getId(), p2.getName(), p2.getOwner(), d1.getSize(), 2);
//        DangerousDog dd2 = new DangerousDog(p3.getId(), p3.getName(), p2.getOwner(), d2.getSize());
//        
//        Pet[] pets = new Pet[10];
//        pets[0] = p1;
//        pets[1] = p2;
//        pets[2] = p3;
//        pets[3] = c1;
//        pets[4] = c2;
//        pets[5] = d3;
//        pets[6] = d4;
//        pets[7] = dd1;
//        pets[8] = dd2;
//        pets[9] = c3;
//        // all dog
//        for(int i = 0; i<pets.length; i++){
//            if(pets[i] instanceof Dog){
//            System.out.println(pets[i].getDetails());
//            }
//        }
//        //not dangerous
//        System.out.println("");
//        for(int i = 0; i<pets.length; i++){
//            if(pets[i] instanceof Dog){
//                if(!pets[i].getDetails().contains("reportedIncidents")){
//                    System.out.println(pets[i].getDetails());
//                }
//            }
//        }
//        //
//        System.out.println("");
//        for(int i = 0; i<pets.length; i++){
//            if(pets[i].getDetails().contains("Dog")){
//                if(pets[i].getDetails().contains("reportedIncidents")){
//                    System.out.println(((DangerousDog)pets[i]).getReportedIncidents());
//                }
//            }
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Number of pets: ");
        int a = sc.nextInt();
        sc.nextLine();
        Pet[] p = new Pet[a];
        for(int i = 0; i< p.length;i++){
            System.out.println("Enter character: ");
            String s = sc.nextLine();
         
            if(s.equals("P")){
                System.out.println("Enter id: ");
                String sId = sc.nextLine();
                System.out.println("Enter Name: ");
                String sName = sc.nextLine();
                System.out.println("Enter owner: ");
                String sOwner = sc.nextLine();
                p[i] = new Pet(sId, sName, sOwner);
            }else if(s.equals("D")){
                System.out.println("Enter id: ");
                String sId = sc.nextLine();
                System.out.println("Enter Name: ");
                String sName = sc.nextLine();
                System.out.println("Enter owner: ");
                String sOwner = sc.nextLine();
                System.out.println("Enter size: ");
                String sSize = sc.nextLine();
                p[i] = new Dog(sId, sName, sOwner, sSize);
            }else if(s.equals("DD")){
                System.out.println("Enter id: ");
                String sId = sc.nextLine();
                System.out.println("Enter Name: ");
                String sName = sc.nextLine();
                System.out.println("Enter owner: ");
                String sOwner = sc.nextLine();
                System.out.println("Enter size: ");
                String sSize = sc.nextLine();
                System.out.println("Enter reportedIncidents: ");
                int iReportedIncidents = sc.nextInt();
                p[i] = new DangerousDog(sId, sName, sOwner, sSize, iReportedIncidents);
            }else if(s.equals("C")){
                System.out.println("Enter id: ");
                String sId = sc.nextLine();
                System.out.println("Enter Name: ");
                String sName = sc.nextLine();
                System.out.println("Enter owner: ");
                String sOwner = sc.nextLine();
                System.out.println("Enter size: ");
                String sSize = sc.nextLine();
                System.out.println("Enter hairType: ");
                String sHairType = sc.nextLine();
                p[i] = new Cat(sId, sName, sOwner, sHairType);
            }
        }
        
        
        for (Pet pet : p) {
            System.out.println(pet.toString());
        }
    }
    
}
