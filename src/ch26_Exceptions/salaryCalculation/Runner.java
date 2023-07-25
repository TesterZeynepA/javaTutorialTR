package ch26_Exceptions.salaryCalculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Employee employee = new Employee("zeynep aytop", 150000,60,2020);

        System.out.println("employee.getName() = " + employee.getName());
        System.out.println("employee.getSalary() = " + employee.getSalary());
        System.out.println("employee.tax() = " + employee.tax());
        System.out.println("employee.bonus() = " + employee.bonus());
        System.out.println("employee.raiseSalary() = " + employee.raiseSalary());

        System.out.println("employee = " + employee);

        salaryCalculate();


    }

    private static void salaryCalculate() {

        Scanner input = new Scanner(System.in);
        System.out.println("ismini gir ");
        String name = input.nextLine();

        System.out.println("maaşini gir");
        int salary=0;
        int workHours=0;
        int year=0;
        try {
             salary = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giriş yaptınız tekrar deneyin ");
            salaryCalculate();
        }

        System.out.println("çalışma saati giriniz");
        try {
             workHours = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giriş yaptınız tekrar deneyin ");
            salaryCalculate();
        }

        System.out.println("ise başlama yılını giriniz");
        try {
             year = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giriş yaptınız tekrar deneyin ");
            salaryCalculate();
        }

        Employee employee = new Employee(name, salary, workHours, year);
        System.out.println("employee.getName() = " + employee.getName());
        System.out.println("employee.getSalary() = " + employee.getSalary());
        System.out.println("employee.tax() = " + employee.tax());
        System.out.println("employee.bonus() = " + employee.bonus());
        System.out.println("employee.raiseSalary() = " + employee.raiseSalary());

        System.out.println("employee = " + employee);


    }


}
