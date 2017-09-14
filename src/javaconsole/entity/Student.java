/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsole.entity;

/**
 *
 * @author MSI
 */
public class Student {

    private int id;
    private String name;
    private String email;
    private String brithday;
    private String classNumber;

    public Student() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public Student(int id, String name, String email, String brithday, String classNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.brithday = brithday;
        this.classNumber = classNumber;
    }

}
