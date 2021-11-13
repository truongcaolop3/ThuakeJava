/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuake.bai2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author DELL
 */
public class StudentManagement {
    private 
    Student[] studentslist;

    public StudentManagement() {
        
    }
    
    public static void In(Student[] students) {
        for (Student o: students) {
            System.out.println(o.toString());
            System.out.println("====================");
        }
    }
    
    public static Student[] sort_student(Student[] studentslist) {
        for(int i = 0; i < studentslist.length - 1; i++) {
            for(int j = i + 1; j < studentslist.length; j++) {
                if(studentslist[i].compareTo(studentslist[j]) == -1) {
                    Student temp = studentslist[i];
                    studentslist[i] = studentslist[j];
                    studentslist[j] = temp;
                }
            }
        }    
        return studentslist;
    }
    
    public static void ghi (Student[] studenlist){
        try {
            //ghi file
            FileOutputStream f = new FileOutputStream("fileBynery.dat");
            ObjectOutputStream os = new ObjectOutputStream(f);
            
            os.writeObject(studenlist);
            os.close();
            f.close();
            //
            //
           
        } catch (IOException ex) {
            System.out.println("loi khi ghi file! ");
        }
    }
    public static Student[] doc(int n) throws ClassNotFoundException{
        
        Student[] studens = new Student[n];
        try {
            
            FileInputStream f = new FileInputStream("fileBynory.dat");
            ObjectInputStream oi = new ObjectInputStream(f);
            
            studens = (Student[]) oi.readObject();
            oi.close();
            f.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("loi khi tim lop!");
        } catch (IOException ex) {
            System.out.println("loi khi doc file!");
        }
        return studens;
        
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so sinh vien: ");
        int n = sc.nextInt();
        
        StudentManagement stlist = new StudentManagement();
        stlist.studentslist = new Student[n];
        
        for ( int i = 0 ; i< n ; i++){
            System.out.println("sinh vien thu " + (i+1) + ": " );
            
            stlist.studentslist[i] = new Student();
            stlist.studentslist[i].inputStudent();  
        }
        // in 
        In(stlist.studentslist);
        
        //sap xep
        Student[] s = sort_student(stlist.studentslist);
        System.out.println("sau khi sap xep ");
        In(s);

        // ghi file 
        stlist.ghi(s);
        //
        // Doc tu file
        Student[] ReadFile = stlist.doc(n);
        // Hien thi sau khi doc file
        System.out.println("Doc file fileBynory thanh cong! ");
        
            System.out.println(ReadFile);
        
    } 
}
