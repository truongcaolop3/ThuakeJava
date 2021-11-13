/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuake.hocObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import thuake.Student_bai1;
/**
 *
 * @author DELL
 */
public class HocObject {
    public static void main(String[] args) {
        Student_bai1 students = new Student_bai1("trunghtu22a",2020);
        try {
            //ghi file
            FileOutputStream fos = new FileOutputStream("studentID.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            
            oos.close();
            fos.close();    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HocObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HocObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
