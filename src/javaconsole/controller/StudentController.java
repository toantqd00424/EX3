/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsole.controller;

import java.util.Scanner;
import javaconsole.entity.Student;
import javaconsole.model.StudentModel;

/**
 *
 * @author MSI
 */
public class StudentController {

    private StudentModel studentModel = new StudentModel();

    public void getList() {

        System.out.println("Danh sách");

        for (Student student : studentModel.getListStudent()) {
            System.out.println(" ID :" + student.getId()
                    + ",\n Name : " + student.getName()
                    + ",\n Brithday : " + student.getBrithday()
                    + "\nPhone : " + student.getPhone()
                    + ",\n Email : " + student.getEmail()
                    + ",\n ClassNumber : " + student.getClassNumber()
                    + ".\n  ========>>>>>||<<<<<=========");

        }

    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======>Mời nhập thông tin sinh viên<=======");
        System.out.println("Mời nhập tên sinh viên : ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập ngày tháng năm sinh : ");
        String brithday = scanner.nextLine();
        System.out.println("Moi nhap SDT sinh vien : ");
        String phone = scanner.nextLine();
        System.out.println("Mời nhập email sinh viên : ");
        String email = scanner.nextLine();
        System.out.println("Mời nhập tên lớp của sinh viên : ");
        String classnumber = scanner.nextLine();

        System.out.println("Name : " + name + ", Brithday : " + brithday + ", Phone : "  + phone + ", Email : " + email + ", ClassName : " + classnumber);

        Student student = new Student();
        student.setName(name);
        student.setBrithday(brithday);
        student.setPhone(phone);
        student.setEmail(email);
        student.setClassNumber(classnumber);

        studentModel.insert(student);
    }

    public void editStudent() {
        Scanner scanner = new Scanner(System.in);

        int id;
        while (true) {
            String stringId = scanner.nextLine();
            try {
                id = Integer.parseInt(stringId);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Chỉ nhập chữ số....");
            }

        }

        Student student = studentModel.getByid(id);
        if (student != null) {
            System.out.println("Thông tin : "
                    + "\nID : " + student.getId() 
                    + "\nName : " + student.getName()
                    + "\nBrithday : " + student.getBrithday()
                    + "\nPhone : " + student.getPhone()
                    + "\nEmail : " + student.getEmail()
                    + "\nClassNuber : " + student.getClassNumber());
            System.out.println("=======>Mời nhập thông tin mới của sinh viên<=======");

            System.out.println("Mời nhập tên sinh viên : ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Mời nhập ngày tháng năm sinh : ");
            String brithday = scanner.nextLine();
            System.out.println("Moi nhap SDT sinh vien : ");
            String phone = scanner.nextLine();
            System.out.println("Mời nhập email sinh viên : ");
            String email = scanner.nextLine();
            System.out.println("Mời nhập tên lớp của sinh viên : ");
            String classnumber = scanner.nextLine();
            System.out.println("Thông tin sv sau khi sửa : ");
            System.out.println("Name : " + name + ", Brithday : " + brithday + "Phone: " + phone + ", Email : " + email + ", ClassName : " + classnumber);
            
            Student student1 = new Student(); 
            student1.setId(id);
            student1.setName(name);
            student1.setBrithday(brithday);
            student.setPhone(phone);
            student1.setEmail(email);
            student1.setClassNumber(classnumber);
            studentModel.update(student1);
            System.out.println("Sửa thành công....");
        } else {
            System.out.println("Không tìm thấy ID....");
        }

    }

    public void deleteStudent() {

        Scanner scanner = new Scanner(System.in);
        int id;
        while (true) {
            String stringId = scanner.nextLine();
            try {
                id = Integer.parseInt(stringId);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Chỉ nhập chữ số....");
            }

        }

        Student student = studentModel.getByid(id);
        if (student != null) {
            System.out.println("Thông tin : "
                    + "\nID : " + student.getId() 
                    + "\nName : " + student.getName()
                    + "\nBrithday : " + student.getBrithday()
                    + "\nPhone :" + student.getPhone()
                    + "\nEmail : " + student.getEmail()
                    + "\nClassNuber : " + student.getClassNumber());
            studentModel.delete(student);
            System.out.println("Xóa thành công");

        } else {
            System.out.println("Không tìm thấy ID.....");
        }

    }

}
