/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.Task;

/**
 *
 * @author Admin
 */
public class Manage {
    private static Scanner sc = new Scanner(System.in);
    private List<Task> list;

    public Manage() {
        this.list = new ArrayList<>();;
    }
    public void addTask(){
        int ID;
        if(list.isEmpty()){
            ID = 1;
        }else{
            ID = list.get(list.size()-1).getID()+1;
        }
        System.out.print("Enter RequirementName: ");
        String requirementName = sc.nextLine();
        int taskTpye = Validation.getInt("Enter Task Tpye 1-4", 1, 4);
        Date d = Validation.getDate("Enter Date: ");
        double from = Validation.getDouble("Enter plan from: ", 8.0, 17.5);
        double to = Validation.getDouble("Enter plan to", from+0.1, 17.5);
        System.out.println("Enter Assignee");
        String assignee = sc.nextLine();
        System.out.println("Enter Reviewer");
        String reviewer = sc.nextLine();
        Task t = new Task(ID, taskTpye, requirementName, d, from, to, assignee, reviewer);
        list.add(t);
        System.out.println("added");
    }
    public void deleteTask(){
        int x = Validation.getInt("Enter id for delete", 1, Integer.MAX_VALUE);
        list.remove(x-1);
        System.out.println("delete successfull");
        
    }
    public void displayTask(){
        if(list.isEmpty()){
            System.out.println("List emplty");
            return;
        }
        for (Task task : list) {
            System.out.println(task.toString());
        }
    }
}
