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
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private int ID;
    private int taskTypeID; // trong khoảng 1-4
    private String[] taskType = {"Code", "Test", "Design", "Review"};
    private String requirementName;
    private Date date;
    private double plan_from, plan_to;
    private String assignee, expert;

    public Task(int ID, int taskTypeID, String requirementName, Date date, double plan_from, double plan_to, String assignee, String expert) {
        this.ID = ID;
        this.taskTypeID = taskTypeID;
        this.requirementName = requirementName;
        this.date = date;
        this.plan_from = plan_from;
        this.plan_to = plan_to;
        this.assignee = assignee;
        this.expert = expert;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTaskTypeID() {
        return taskTypeID;
    }

    public void setTaskTypeID(int taskTypeID) {
        this.taskTypeID = taskTypeID;
    }

    public String[] getTaskType() {
        return taskType;
    }

    public void setTaskType(String[] taskType) {
        this.taskType = taskType;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPlan_from() {
        return plan_from;
    }

    public void setPlan_from(double plan_from) {
        this.plan_from = plan_from;
    }

    public double getPlan_to() {
        return plan_to;
    }

    public void setPlan_to(double plan_to) {
        this.plan_to = plan_to;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    @Override
    public String toString() {
        return String.format("%-15d%-15s%-15s%-15s%-15.1f%-15s%-15s", this.ID, 
               this.requirementName,this.taskType[this.getTaskTypeID()-1] ,
               sdf.format(date), this.plan_to - this.plan_from, this.assignee, this.expert);
    }
    
    
}
