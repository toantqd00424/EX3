/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsole.filehandle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaconsole.entity.Student;
import javaconsole.model.StudentModel;

/**
 *
 * @author MSI
 */
public class FileHandle {

    public void writeToFile() {
        StudentModel studentModel = new StudentModel();
        ArrayList<Student> arraylist = studentModel.getListStudent();
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("DSSV.txt");
            bw = new BufferedWriter(fw);

            for (Student student : arraylist) {
                bw.write(student.getId());
                bw.newLine();
                bw.write(student.getName());
                bw.newLine();
                bw.write(student.getBrithday());
                bw.newLine();
                bw.write(student.getPhone());
                bw.newLine();
                bw.write(student.getEmail());
                bw.newLine();
                bw.write(student.getClassNumber());
            }

        } catch (IOException e) {
            System.out.println("Loi....." + e.getMessage());
        } finally {
            try {         
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(FileHandle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    public void ImporFile() {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            String str;
            fr = new FileReader("DSSV.txt");
            br = new BufferedReader(fr);
            while((str = br.readLine()) != null) {
                System.out.println(str);
                
            }
        } catch (FileNotFoundException e) {
        } catch (IOException ex) {
            Logger.getLogger(FileHandle.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                
                br.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

  
}
