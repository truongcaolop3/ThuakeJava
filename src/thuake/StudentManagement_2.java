/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuake;

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
public class StudentManagement_2 {
    private 
    Student_2[] studentslist;

    public StudentManagement_2() {
        
    }
    
    public static void In(Student_2[] students) {
        for (Student_2 o: students) {
            System.out.println(o.toString());
            System.out.println("====================");
        }
    }
    
    public static Student_2[] sort_student(Student_2[] studentslist) {
        for(int i = 0; i < studentslist.length - 1; i++) {
            for(int j = i + 1; j < studentslist.length; j++) {
                if(studentslist[i].compareTo(studentslist[j]) == -1) {
                    Student_2 temp = studentslist[i];
                    studentslist[i] = studentslist[j];
                    studentslist[j] = temp;
                }
            }
        }    
        return studentslist;
    }
    
    public static void ghi (Student_2[] studenlist){
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
    public static Student_2[] doc(int n) throws ClassNotFoundException{
        
        Student_2[] studens = new Student_2[n];
        try {
            
            FileInputStream f = new FileInputStream("fileBynory.dat");
            ObjectInputStream oi = new ObjectInputStream(f);
            
            studens = (Student_2[]) oi.readObject();
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
        
        StudentManagement_2 stlist = new StudentManagement_2();
        stlist.studentslist = new Student_2[n];
        
        for ( int i = 0 ; i< n ; i++){
            System.out.println("sinh vien thu " + (i+1) + ": " );
            
            stlist.studentslist[i] = new Student_2();
            stlist.studentslist[i].inputStudent();  
        }
        // in 
        In(stlist.studentslist);
        
        //sap xep
        Student_2[] s = sort_student(stlist.studentslist);
        System.out.println("sau khi sap xep ");
        In(s);

        // ghi file 
        stlist.ghi(s);
        //
        // Doc tu file
        Student_2[] ReadFile = stlist.doc(n);
        // Hien thi sau khi doc file
        System.out.println("Doc file fileBynory thanh cong! ");
        
            System.out.println(ReadFile);
        
    } 
}
