/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtutorial;

import java.awt.CardLayout;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.HashMap;

import javaconsole.entity.Student;
import javaconsole.model.StudentModel;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author MSI
 */
public class SubmitForm extends JFrame {

    private JLabel lblId;
    private JLabel lblName;
    private JLabel lblBrithday;
    private JLabel lblPhone;
    private JLabel lblEmail;
    private JLabel lblClassNumber;
    private JTextField txtId;
    private JTextField txtName;
    private JFormattedTextField txtBrithday;
    private JTextField txtPhone;
    private JTextField txtEmail;
    private JTextField txtClassNumber;
    private JButton btnSubmit;
    private JButton btnReset;
    private JPanel panel;
    private JPanel panel_1;
    private JPanel panel_2;
    private JLabel lb;
    private JLabel lblIdMesage;
    private JLabel lblNameMesage;
    private JLabel lblEmailMesage;
    private JLabel lblBrithdayMesage;
    private JLabel lblPhoneMesage;
    private JLabel lblClassNumberMesagge;
    private JButton btn1;
    private JButton btn2;

    public SubmitForm() throws ParseException {
        this.setSize(1000, 790);
        this.setLocationRelativeTo(null);

        this.panel = new JPanel();

        this.panel_1 = new JPanel();
        this.panel_1 = new ImagePanel(new ImageIcon("E:\\JAVA\\Demo tren lop\\New Folder\\Assignment\\src\\swingtutorial\\18.jpg").getImage());
        this.panel_1.setBounds(0, 0, 1000, 750);
        this.panel_1.setBackground(new Color(0, 0, 0, 0));
        this.panel_1.setLayout(null);

        this.panel_2 = new JPanel();
        this.panel_2.setBackground(Color.gray);
        this.panel_2.setBounds(100, 100, 200, 200);
        this.panel_2.setLayout(null);

        this.lb = new JLabel();
        this.lb = new ImageLabel(new ImageIcon("E:\\JAVA\\Demo tren lop\\New Folder\\Assignment\\src\\swingtutorial\\14.png").getImage());
        this.lb.setBounds(505, 100, 400, 140);

        this.lblId = new JLabel("ID");
        this.lblId.setForeground(Color.red);
        this.lblId.setFont(new java.awt.Font("Times New Roman", 2, 20));
        this.lblId.setBounds(400, 240, 100, 40);

        this.lblName = new JLabel("NAME");
        this.lblName.setForeground(Color.BLACK);
        this.lblName.setFont(new java.awt.Font("Times New Roman", 2, 20));
        this.lblName.setBounds(400, 290, 100, 40);

        this.lblBrithday = new JLabel("BRITHDAY");
        this.lblBrithday.setForeground(Color.BLACK);
        this.lblBrithday.setFont(new java.awt.Font("Times New Roman", 2, 20));
        this.lblBrithday.setBounds(400, 340, 100, 40);

        this.lblPhone = new JLabel("PHONE");
        this.lblPhone.setForeground(Color.BLACK);
        this.lblPhone.setFont(new java.awt.Font("Times New Roman", 2, 20));
        this.lblPhone.setBounds(400, 390, 100, 40);

        this.lblEmail = new JLabel("EMAIL");
        this.lblEmail.setForeground(Color.BLACK);
        this.lblEmail.setFont(new java.awt.Font("Times New Roman", 2, 20));
        this.lblEmail.setBounds(400, 440, 100, 40);

        this.lblClassNumber = new JLabel("CLASS");
        this.lblClassNumber.setForeground(Color.BLACK);
        this.lblClassNumber.setFont(new java.awt.Font("Times New Roman", 2, 20));
        this.lblClassNumber.setBounds(400, 490, 100, 40);

        this.txtId = new JTextField();
        this.txtId.setForeground(Color.red);
        this.txtId.setFont(new java.awt.Font("Times New Roman", 1, 20));
        this.txtId.setBounds(505, 240, 300, 40);

        this.txtName = new JTextField();
        this.txtName.setForeground(Color.BLACK);
        this.txtName.setFont(new java.awt.Font("Times New Roman", 1, 20));
        this.txtName.setBounds(505, 290, 300, 40);

        this.txtBrithday = new JFormattedTextField(new MaskFormatter("##/##/####"));
        this.txtBrithday.setForeground(Color.BLACK);
        this.txtBrithday.setFont(new java.awt.Font("Times New Roman", 1, 20));
        this.txtBrithday.setBounds(505, 340, 300, 40);

        this.txtPhone = new JTextField();
        this.txtPhone.setForeground(Color.BLACK);
        this.txtPhone.setFont(new java.awt.Font("Times New Roman", 1, 20));
        this.txtPhone.setBounds(505, 390, 300, 40);

        this.txtEmail = new JTextField();
        this.txtEmail.setForeground(Color.BLACK);
        this.txtEmail.setFont(new java.awt.Font("Times New Roman", 1, 20));
        this.txtEmail.setBounds(505, 440, 300, 40);

        this.txtClassNumber = new JTextField();
        this.txtClassNumber.setForeground(Color.BLACK);
        this.txtClassNumber.setFont(new java.awt.Font("Times New Roman", 1, 20));
        this.txtClassNumber.setBounds(505, 490, 300, 40);

        this.btnSubmit = new JButton("SUBMIT");
        this.btnSubmit.setBackground(Color.decode("#3B5998"));
        this.btnSubmit.setForeground(Color.WHITE);
        this.btnSubmit.setBounds(520, 540, 90, 30);

        this.btnReset = new JButton("RESET");
        this.btnReset.setBackground(Color.decode("#3B5998"));
        this.btnReset.setForeground(Color.WHITE);
        this.btnReset.setBounds(615, 540, 90, 30);

        this.lblIdMesage = new JLabel();
        this.lblIdMesage.setBounds(810, 240, 100, 40);

        this.lblNameMesage = new JLabel();
        this.lblNameMesage.setBounds(810, 290, 100, 40);

        this.lblPhoneMesage = new JLabel();
        this.lblPhoneMesage.setBounds(810, 390, 100, 40);

        this.lblEmailMesage = new JLabel();
        this.lblEmailMesage.setBounds(810, 440, 100, 40);

        this.lblBrithdayMesage = new JLabel();
        this.lblBrithdayMesage.setBounds(810, 340, 100, 40);

        this.lblClassNumberMesagge = new JLabel();
        this.lblClassNumberMesagge.setBounds(810, 490, 100, 40);

        this.btn1 = new JButton("LOGIN");
        this.btn1.setBackground(Color.decode("#3B5998"));
        this.btn1.setForeground(Color.WHITE);
        this.btn1.setBounds(710, 540, 90, 30);

        this.btn2 = new JButton("REGISTER");
        this.btn2.setBackground(Color.decode("#3B5998"));
        this.btn2.setForeground(Color.WHITE);
        this.btn2.setBounds(750, 540, 90, 30);

        this.btnSubmit.addActionListener(new SubmitHadel());
        this.btnReset.addActionListener(new ResetHadle());

        CardLayout cl = new CardLayout();
        this.panel.setLayout(cl);
        this.panel.add(panel_1, "1");
        this.panel.add(panel_2, "2");

        cl.show(this.panel, "1");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panel, "2");
            }

        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panel, "1");
            }
        });

        this.add(this.panel);
        this.panel_1.add(this.btn1);
        this.panel_1.add(this.lb);
        this.panel_1.add(this.lblId);
        this.panel_1.add(this.lblName);
        this.panel_1.add(this.lblPhone);
        this.panel_1.add(this.lblEmail);
        this.panel_1.add(this.lblBrithday);
        this.panel_1.add(this.lblClassNumber);
        this.panel_1.add(this.txtId);
        this.panel_1.add(this.txtName);
        this.panel_1.add(this.txtBrithday);
        this.panel_1.add(this.txtEmail);
        this.panel_1.add(this.txtPhone);
        this.panel_1.add(this.txtClassNumber);
        this.panel_1.add(this.btnSubmit);
        this.panel_1.add(this.btnReset);
        this.panel_1.add(this.lblIdMesage);
        this.panel_1.add(this.lblNameMesage);
        this.panel_1.add(this.lblBrithdayMesage);
        this.panel_1.add(this.lblEmailMesage);
        this.panel_1.add(this.lblClassNumberMesagge);
        this.panel_1.add(this.lblPhoneMesage);

        this.panel_2.add(this.btn2);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    class SubmitHadel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Student student = new Student();

            try {
                student.setId(Integer.parseInt(txtId.getText()));
            } catch (NumberFormatException ex) {
            }

            String name = txtName.getText();
            String email = txtEmail.getText();
            String phone = txtPhone.getText();
            String brithday = txtBrithday.getText();
            String classNuber = txtClassNumber.getText();

            student.setName(name);
            student.setBrithday(brithday);
            student.setPhone(phone);
            student.setEmail(email);
            student.setClassNumber(classNuber);

            HashMap<String, String> errors = new FromHandle().validateSubmit(student);
            if (errors.size() == 0) {
                resetMesage();
                int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn nhập thông tin bên dưới?"
                        + "\nID : " + txtId.getText()
                        + "\nNAME : " + txtName.getText()
                        + "\nBRITHDAY : " + txtBrithday.getText()
                        + "\nPHONE : " + txtPhone.getText()
                        + "\nEMAIL : " + txtEmail.getText()
                        + "\nCLASSNUMBER : " + txtClassNumber.getText());

                if (result == 0) {
                    StudentModel studentModel = new StudentModel();
                    studentModel.insert(student);
                    JOptionPane.showMessageDialog(null, "Them du lieu thanh cong");

                }
                if (result == 1) {
                    txtId.setText("");
                    txtName.setText("");
                    txtPhone.setText("");
                    txtBrithday.setText("");
                    txtEmail.setText("");
                    txtClassNumber.setText("");

                }

            } else {
                showError(errors);
            }
        }

        private void resetMesage() {
            lblIdMesage.setText("");
            lblNameMesage.setText("");
            lblEmailMesage.setText("");
            lblBrithdayMesage.setText("");
            lblClassNumberMesagge.setText("");
        }

        private void showError(HashMap<String, String> errors) {
            if (errors.containsKey("txtId")) {
                lblIdMesage.setForeground(Color.red);
                lblIdMesage.setText(errors.get("txtId"));
            } else {
                lblIdMesage.setForeground(Color.green);
                lblIdMesage.setText("ok");
            }
            if (errors.containsKey("txtName")) {
                lblNameMesage.setForeground(Color.red);
                lblNameMesage.setText(errors.get("txtName"));
            } else {
                lblNameMesage.setForeground(Color.green);
                lblNameMesage.setText("ok");
            }
            if (errors.containsKey("txtBrithday")) {
                lblBrithdayMesage.setForeground(Color.red);
                lblBrithdayMesage.setText(errors.get("txtBrithday"));
            } else {
                lblBrithdayMesage.setForeground(Color.green);
                lblBrithdayMesage.setText("ok");
            }
            if (errors.containsKey("txtEmail")) {
                lblEmailMesage.setForeground(Color.red);
                lblEmailMesage.setText(errors.get("txtEmail"));
            } else {
                lblEmailMesage.setForeground(Color.green);
                lblEmailMesage.setText("ok");
            }
            if (errors.containsKey("txtClassNumber")) {
                lblClassNumberMesagge.setForeground(Color.red);
                lblClassNumberMesagge.setText(errors.get("txtClassNumber"));
            } else {
                lblClassNumberMesagge.setForeground(Color.green);
                lblClassNumberMesagge.setText("ok");
            }
            if (errors.containsKey("txtPhone")) {
                lblPhoneMesage.setForeground(Color.red);
                lblPhoneMesage.setText(errors.get("txtPhone"));
            } else {
                lblPhoneMesage.setForeground(Color.green);
                lblPhoneMesage.setText("ok");
            }
        }

    }

    class ResetHadle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            txtId.setText("");
            txtName.setText("");
            txtPhone.setText("");
            txtBrithday.setText("");
            txtEmail.setText("");
            txtClassNumber.setText("");
        }
   }

//   public static void main(String[] args) throws ParseException {
//        SubmitForm lf = new SubmitForm();
//
//   }

}
