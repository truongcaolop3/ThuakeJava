/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuake.bai2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Student extends Person{
    private 
        String sutdenID;
        int academic_year;
        float gba;
        float social_actvities;

    public Student() {
    }

    public Student(String sutdenID, int academic_year, float gba, float social_actvities, String name, char gender, int birth_year) {
        super(name, gender, birth_year);
        this.sutdenID = sutdenID;
        this.academic_year = academic_year;
        this.gba = gba;
        this.social_actvities = social_actvities;

    }

    public String getSutdenID() {
        return sutdenID;
    }

    public void setSutdenID(String sutdenID) {
        this.sutdenID = sutdenID;
    }

    public int getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(int academic_year) {
        this.academic_year = academic_year;
    }

    public float getGba() {
        return gba;
    }

    public void setGba(float gba) {
        this.gba = gba;
    }

    public float getSocial_actvities() {
        return social_actvities;
    }

    public void setSocial_actvities(float social_actvities) {
        this.social_actvities = social_actvities;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    

    @Override
    public String toString() {
        String ketqua = super.toString();
        ketqua =  "Student{" + "sutdenID=" + sutdenID + ", academic_year=" + academic_year + ", gba=" + gba + ", social_actvities=" + social_actvities + '}';
        return ketqua;
    }

    public int compareTo(Student arg0) {
        if(getGba() > arg0.getGba() ) {
            return 1;
        }
        else if(getGba() == arg0.getGba()) {
            if(getSocial_actvities() > arg0.getSocial_actvities()) {
                    return 1;
            }
            else if(getSocial_actvities() == arg0.getSocial_actvities()) {
                    return 0;
            }
            else {
                    return -1;
            }
        }
        return -1;
    }
    
    
    void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("StudentID: ");
        setSutdenID(sc.nextLine());
            
        System.out.println("name: ");
        setName(sc.nextLine());
        
        System.out.println("gioi tinh:");
        setGender(sc.next().charAt(0));
        
        System.out.println("nam sinh: ");
        setBirth_year(sc.nextInt());
        
        System.out.println("nam nhap hoc: ");
        setAcademic_year(sc.nextInt());
        
        System.out.println("diem trung binh: ");
        setGba(sc.nextFloat());
        
        System.out.println("social_actvities: ");
        setSocial_actvities(sc.nextFloat());
        
    }
    

    
}
