/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
        this.list = new ArrayList<>();
    }

    public void addTask() {
        int xid;
        if (list.isEmpty()) {
            xid = 1;
        } else {
            xid = list.get(list.size() - 1).getXid() + 1;
        }
        System.out.println("Enter Requirement: ");
        String Requirement = sc.nextLine();
        int ID = Validation.getInt("Enter Task Type 1-4: ", 1, 4);
        Date date = Validation.getDate("Enter date: ");
        double from = Validation.getDouble("Enter plan from: ", 8, 17.5);
        double to = Validation.getDouble("Enter plan to: ", (from + 0.1), 17.5);
        System.out.println("Enter Assignee: ");
        String Assignee = sc.nextLine();
        System.out.println("Enter Reviewer: ");
        String Reviewer = sc.nextLine();
        Task T = new Task(xid, ID, Requirement, date, from, to, Assignee, Reviewer);
        if (!check(Assignee, date, from, to)) {
            list.add(T);
            System.out.println("Added");
        } else {
            System.out.println("Can't add");
        }
    }

    public void deleteTask() {
        if (list.isEmpty()) {
            System.out.println("List Empty");
            return;
        }
        int chose = Validation.getInt("Enter Integer number", 1, Integer.MAX_VALUE);
        Iterator<Task> it = list.iterator();
        while (it.hasNext()) {
            Task t = it.next();
            if (chose == t.getXid()) {
                it.remove();
            }
        }
    }

    public void showdataTask() {
        if (list.isEmpty()) {
            System.out.println("List Empty");
            return;
        }
        for (Task task : list) {
            System.out.println(task.toString());
        }
    }

    
    private boolean check(String assignee, Date date, double planFrom, double planTo) {
        for (Task task : list) {
            if (task.getAssignee().equalsIgnoreCase(assignee) && task.getDate().compareTo(date)==0
                    &&((planFrom >= task.getFrom() && planFrom < task.getTo())
                    ||(planFrom <= task.getFrom()&&planTo>task.getFrom()))
                ) {
                return true; // Có sự trùng lặp
            }
        }
        return false; // Không có sự trùng lặp
    }
}
//||(planTo <= task.getTo()&&planTo>=task.getFrom()