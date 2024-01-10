/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_extends;

/**
 *
 * @author Admin
 */
public class Demo_extends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("01", "Nguyễn Văn A");
        Person p2 = new Person("02", "Nguyễn Văn B");
        Person p3 = new Person("03", "Nguyễn Văn C");
        
        Student s1 = new Student("KTPM", p1.getId(), p1.getName());
        Student s2 = new Student("Đồ Họa", p2.getId(), p2.getName());
        Student s3 = new Student("Kinh Doanh", p3.getId(), p3.getName());
        
        Staff st1 = new Staff("department1", p1.getId(), p1.getName());
        Staff st2 = new Staff("department2", p2.getId(), p2.getName());
        Staff st3 = new Staff("department3", p3.getId(), p3.getName());
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        System.out.println("");
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        
        System.out.println("");
        
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
    
}
