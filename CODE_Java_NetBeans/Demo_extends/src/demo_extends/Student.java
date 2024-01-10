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
public class Student extends Person{
    private String course;

    public Student(String course, String id, String name) {
        super(id, name);
        this.course = course;
        
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" + "course=" + course + '}';
    }
    
}
