package com.campus.model;

public class ScholarshipStudent extends Student {
    private double scholarshipAmount;

    public ScholarshipStudent(int studentid, String studentname, int age, String department, int[] marks, double scholarshipAmount) {
        super(studentid, studentname, age, department, marks);
        this.scholarshipAmount = scholarshipAmount;
    }
    // getters and setters
    public double getScholarshipAmount() {
        return scholarshipAmount;
    }
    public void setScholarshipAmount(double scholarshipPercentage) {
        this.scholarshipAmount = scholarshipPercentage;

    }
    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo();
        
    }
}