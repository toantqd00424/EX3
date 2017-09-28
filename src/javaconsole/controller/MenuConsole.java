/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsole.controller;

import java.text.ParseException;
import java.util.Scanner;

import javaconsole.filehandle.FileHandle;
import swingtutorial.SubmitForm;

/**
 *
 * @author MSI
 */
public class MenuConsole {

    public static void main(String[] args) throws ParseException {
        MenuConsole menu = new MenuConsole();
       
            menu.createMenu();
      
        
    }

    private void createMenu() throws ParseException {
        while (true) {
            System.out.println("=================>Student Manage<====================");
            System.out.println("1. Student list");
            System.out.println("2. Add student");
            System.out.println("3. Edit student");
            System.out.println("4. Delete student");
            System.out.println("5. Write to file");
            System.out.println("6. Impor File");
            System.out.println("7. EXIT");
            System.out.println("======================================================");
            System.out.println("Hãy nhập lựa chọn của bạn: ");

            Scanner scanner = new Scanner(System.in);

            String strChoice = scanner.nextLine();
            

            int choice = 0;
            try {
                choice = Integer.parseInt(strChoice);
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập một chữ số ");
                continue;
            }
            SubmitForm sf = new SubmitForm();
            StudentController studentController = new StudentController();
            FileHandle fileHandle = new FileHandle();
            if (choice == 7) {
                break;

            } else {
                switch (choice) {
                    case 1:
                        System.out.println("IN RA DANH SÁCH SINH VIÊN:  ");
                        studentController.getList();
                        break;
                    case 2:
                        //System.out.println("MỜI NHẬP THÔNG TIN SINH VIÊN MỚI: ");
                        //studentController.addStudent();
                        sf.add(sf);
                        break;
                    case 3:
                        System.out.println("MỜI NHẬP ID SINH VIÊN CẦN SỬA : ");
                        studentController.editStudent();
                        break;
                    case 4:
                        System.out.println("MỜI NHẬP ID SINH VIÊN CẦN XÓA : ");
                        studentController.deleteStudent();
                        break;
                    case 5:
                        fileHandle.writeToFile();
                        break;
                    case 6:
                        fileHandle.ImporFile();
                        break;
                    default:
                        System.out.println("Vui lòng nhập số từ 1 đến 7");
                        break;
                }
            }

        }
    }

}
