
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtutorial;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javaconsole.entity.Student;

/**
 *
 * @author MSI
 */
public class FromHandle {
    private static final String PHONE_REGEX = "^0(1\\d{9}|9\\d{8}|8\\d{8})$";

    private static final String BIRTHDAY_REGEX = "^\\d{2}/\\d{2}/\\d{4}"; // bieu thuc regex
    
    private static final String EMAIL_REGEX = "^[_A-Za-z0-9-]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$";

    public boolean vaildateBirthday(String txtBrithday) {
        Pattern p = Pattern.compile(BIRTHDAY_REGEX);
        Matcher m = p.matcher(txtBrithday);
        return m.matches();
    }
    public boolean vaildatePhone(String txtPhone) {
        Pattern ptn = Pattern.compile(PHONE_REGEX);
        Matcher mcr  = ptn.matcher(txtPhone);
        return mcr.matches();
    }
    public boolean vaildateEmail(String txtEmail){
        Pattern ptn2 = Pattern.compile(EMAIL_REGEX);
        Matcher mcr2 = ptn2.matcher(txtEmail);
        return mcr2.matches();
    }
    

    public HashMap<String, String> validateSubmit(Student student) {
        HashMap<String, String> errors = new HashMap<>();
        if (student.getId() == 0) {
            errors.put("txtId", "* Vui long nhap ID");
        }
        if (student.getName().isEmpty()) {
            errors.put("txtName", "* nhap Name");
        }
        if (!vaildateEmail(student.getEmail())) {
            errors.put("txtEmail", "* nhap Email");
        }
        if (!vaildateBirthday(student.getBrithday())) {
            errors.put("txtBrithday", "* nhap Brithday");
        }
        if (student.getClassNumber().isEmpty()) {
            errors.put("txtClassNumber", "* nhap Class");
        }
        if (!vaildatePhone(student.getPhone())) {
            errors.put("txtPhone", "* nhap Phone");
        }
        return errors;
    }
}
