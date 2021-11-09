/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuake;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author DELL
 */
public class StudenManager_bai1 {
    private ArrayList<Student_bai1> studentList = new ArrayList<>();

    public StudenManager_bai1() {

    }

    public ArrayList<Student_bai1> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student_bai1> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentManagement_Bai1 [studentList=" + studentList + ", getStudentList()=" + getStudentList() + "]";
    }

     void input(int n) {
        for (int i=0; i<n; i++) {
            System.out.println("Enter student information " + (i+1) + ": ");
            Student_bai1 s = new Student_bai1();
            s.inputStudent();
            getStudentList().add(s);
        }
    }

     void output(int n) {
        input(n);
        for (int i=0; i<getStudentList().size(); i++) {
            System.out.println("\n ========== " + getStudentList().get(i).getStudentID() + " ==========");
            getStudentList().get(i).outputStudent();
        }
    }

    void findBirthYear(int year) {
        Vector<Object> studentVector = new Vector<>();
        for (int i=0; i<getStudentList().size(); i++) {
            if(getStudentList().get(i).getBirth_year() == year) {
                studentVector.add("\n Mã: " + getStudentList().get(i).getStudentID());
                studentVector.add("Tên: " + getStudentList().get(i).getName());
                studentVector.add("Giới tính: " + getStudentList().get(i).getGender());
                studentVector.add("Năm sinh: " + getStudentList().get(i).getBirth_year());
                studentVector.add("Năm nhập học: " + getStudentList().get(i).getAcademic_year() + "\n");
            }
        }
        System.out.println("Students has birth year is " + year + ": " + studentVector);
    }

    void findName(String name) {
        Vector<Object> studentVector = new Vector<>();
        for (int i=0; i<getStudentList().size(); i++) {
            if(getStudentList().get(i).getName().equals(name)) {
                studentVector.add("\n Mã: " + getStudentList().get(i).getStudentID());
                studentVector.add("Tên: " + getStudentList().get(i).getName());
                studentVector.add("Giới tính: " + getStudentList().get(i).getGender());
                studentVector.add("Năm sinh: " + getStudentList().get(i).getBirth_year());
                studentVector.add("Năm nhập học: " + getStudentList().get(i).getAcademic_year() + "\n");
            }
        }
        System.out.println("Students has name is " + name + ": " + studentVector);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StudenManager_bai1 sm = new StudenManager_bai1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity of student: ");
        int n = scanner.nextInt();
        sm.output(n);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        sm.findBirthYear(year);
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        sm.findName(name);
        scanner.close();
    }
}
