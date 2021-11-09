/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuake;

import java.util.Scanner;
import thuake.PersonBai_1;
/**
 *
 * @author DELL
 */
public class Student_bai1 extends PersonBai_1{
    
    private String studentID;
	private int academic_year;
	/**
	 * @param studentID
	 * @param academic_year
	 */
	
        
    public Student_bai1() {
    }

    public Student_bai1(String studentID, int academic_year) {
        this.studentID = studentID;
        this.academic_year = academic_year;
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

    void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID= ");
        studentID = scanner.nextLine();
        nhapPerson();
        System.out.print("Academic year: ");
        academic_year = scanner.nextInt();
        System.out.println();
    }

    void outputStudent() {
        System.out.println("ID: " + getStudentID());
        xuatPerson();
        System.out.println("Academic year: " + getAcademic_year());
        System.out.println();
    }

}
