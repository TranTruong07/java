/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Task {
    private static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    private int ID, xid;
    private String Requirement;
    private static String[] TypeOfTask = {"Code", "Test", "Design", "Review"};
    private Date date;
    private double From, To;
    private String Assignee, Reviewer;

    public Task(int xid, int ID, String Requirement, Date date, double From, double To, String Assignee, String Reviewer) {
        this.xid = xid;
        this.ID = ID;
        this.Requirement = Requirement;
        this.date = date;
        this.From = From;
        this.To = To;
        this.Assignee = Assignee;
        this.Reviewer = Reviewer;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRequirement() {
        return Requirement;
    }

    public void setRequirement(String Requirement) {
        this.Requirement = Requirement;
    }

    public static String[] getTypeOfTask() {
        return TypeOfTask;
    }

    public static void setTypeOfTask(String[] TypeOfTask) {
        Task.TypeOfTask = TypeOfTask;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getFrom() {
        return From;
    }

    public void setFrom(double From) {
        this.From = From;
    }

    public double getTo() {
        return To;
    }

    public void setTo(double To) {
        this.To = To;
    }

    public String getAssignee() {
        return Assignee;
    }

    public void setAssignee(String Assignee) {
        this.Assignee = Assignee;
    }

    public String getReviewer() {
        return Reviewer;
    }

    public void setReviewer(String Reviewer) {
        this.Reviewer = Reviewer;
    }

    public int getXid() {
        return xid;
    }

    public void setXid(int xid) {
        this.xid = xid;
    }

    @Override
    public String toString() {
        return String.format("%-15d %-15s %-15s %-15s %-15.1f %-15s %-15s", this.xid, this.Requirement, this.TypeOfTask[ID-1], SDF.format(date), (this.To-this.From), this.Assignee, this.Reviewer);
    }
    
}
