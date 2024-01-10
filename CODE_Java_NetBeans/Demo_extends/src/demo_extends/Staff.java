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
public class Staff extends Person{
    private String department;

    public Staff(String department, String id, String name) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Staff{" + "department=" + department + '}';
    }
    
}
