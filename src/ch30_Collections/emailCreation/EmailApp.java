package ch30_Collections.emailCreation;

import java.util.Locale;
import java.util.Scanner;

public class EmailApp {

    private String name;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String emailSuffix= "clarusway.com";
    private int passwordLength=12;

    public EmailApp() {
    }

    public EmailApp(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

        this.password = setRandomPassword(passwordLength);
        this.department = setDepartment();
        this.email = name.toLowerCase() + lastName.toLowerCase()+"."+ department+ "@"+ emailSuffix;
    }

    public EmailApp(String name, String lastName, String password, String department, String email, String emailSuffix, int passwordLength) {
        this.name = name;
        this.lastName = lastName;



        this.emailSuffix = emailSuffix;
        this.passwordLength = passwordLength;
    }

    public String setRandomPassword(int passwordLength){

        String dataSource = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:'\",.<>?";

        char [] password = new char[passwordLength];

        for (int i = 0; i < passwordLength; i++) {

            int random = (int) (Math.random()* dataSource.length());
            password[i]=dataSource.charAt(random);
        }

        return new String(password);
    }
    public String setDepartment(){

        System.out.println("bu departmanlardan birini seçiniz\n"+
                "1 Test Automation\n"+
                "2 Developer\n"+
                "3 DevOps");

        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();

        if (secim==1){
            return "Test Automation".replaceAll(" ", "");
        } else if (secim==2) {
            return "Developer".replaceAll(" ", "");
        } else if (secim == 3) {
            return "DevOps".replaceAll(" ", "");
        }else return "hatali girdin";
    }

    @Override
    public String toString() {
        return "EmailApp{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                '}';
    }





}
