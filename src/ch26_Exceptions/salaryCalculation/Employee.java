package ch26_Exceptions.salaryCalculation;

public class Employee {

    private String name;
    private int salary;
    private int workHours;
    private int year;

    public Employee(String name, int salary, int varkHours, int year) {
        this.name = name;
        this.salary = salary;
        this.workHours = varkHours;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", year=" + year +
                '}';
    }
    public Employee(){
    }

    public double tax(){

      double paymentOfTax=0;
      if (salary<10000){

          paymentOfTax=0;
          System.out.println("vergiden muafsın ama sevinme gözüm üstünde");
      }else {
          paymentOfTax= salary*0.03;
          System.out.println("vergi dilimine girdin ");
      }

      return paymentOfTax;
    }

    public int bonus(){
        int paymentOfBonus=0;
        int additionalBonus=100;
        if (workHours>40){

            return paymentOfBonus= (workHours-40) * additionalBonus;
        }else return paymentOfBonus;
    }

    public double raiseSalary(){//artış miktarı hesaplar

        int timeOfYear = 2023;
        int sumOfYear = timeOfYear - year;
        double raising =0;

        if (sumOfYear<5){
            raising = (salary+ tax())*0.05;

        } else if (sumOfYear<15) {
            raising=(salary+tax()) * 0.10;
        }else raising = (salary+tax()) * 0.20;
        return raising;


    }







}
