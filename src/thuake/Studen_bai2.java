/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuake;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Studen_bai2 extends Person_Bai2{
    private static final long serialVersionUID = 1L;
	private String studentID;
	private int academic_year;
	private float gpa, social_activities;
	/**
	 * @param studentID
	 * @param academic_year
	 * @param gpa
	 * @param social_activities
	 */
    public Studen_bai2() {
            super();
    }
    public Studen_bai2(String studentID, int academic_year, float gpa, float social_activities) {
        this.studentID = studentID;
        this.academic_year = academic_year;
        this.gpa = gpa;
        this.social_activities = social_activities;
    }
    public Studen_bai2(String studentID, String name, char gender, int birth_year, int academic_year, float gpa, float social_activities) {
        super(name, gender, birth_year);
        this.studentID = studentID;
        this.academic_year = academic_year;
        this.gpa = gpa;
        this.social_activities = social_activities;
    }
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public int getAcademic_year() {
        return academic_year;
    }
    public void setAcademic_year(int academic_year) {
        this.academic_year = academic_year;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public float getSocial_activities() {
        return social_activities;
    }
    public void setSocial_activities(float social_activities) {
        this.social_activities = social_activities;
    }

    @Override
    public String toString() {
        return studentID + "," + getName() + "," + getGender() + "," + getBirth_year() + "," + academic_year + "," + gpa
                        + "," + social_activities;
    }
    @Override
    public int compareTo(Studen_bai2 s) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    public int compareTo(Person_Bai2 o) {
        // TODO Auto-generated method stub
        return 0;
    }

    void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("StudentID: ");
        studentID = scanner.nextLine();
        inputPerson();
        System.out.print("Academic year: ");
        academic_year = scanner.nextInt();
        System.out.print("Diem trung binh: ");
        gpa = scanner.nextFloat();
        System.out.print("Social Activities: ");
        social_activities = scanner.nextFloat();
        System.out.println();
    }

    void outputStudent() {
        System.out.println("StudentID: " + getStudentID());
        outPerson();
        System.out.println("Academic year: " + getAcademic_year());
        System.out.println("Diem trung binh: " + getGpa());
        System.out.println("Social Activities: " + getSocial_activities());
        System.out.println();
    }
}
