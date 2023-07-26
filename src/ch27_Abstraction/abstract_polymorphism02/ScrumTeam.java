package ch27_Abstraction.abstract_polymorphism02;

 public abstract class ScrumTeam {

     public String name, jobTitle;
     public double salary;

     public abstract void dailyStandUp();

     public abstract void demo();

     public void getEmployeeInfo() {

         System.out.println("*****************");

         System.out.println("employee name : " + this.name +
                 "\n Job Title : " + this.jobTitle +
                 "\n salary : " + this.salary);
         System.out.println("*****************");
     }
 }

    class Testers extends ScrumTeam{

        public Testers(String name, String jobTitle, double salary) {

            this.name=name;
            this.jobTitle=jobTitle;
            this.salary=salary;

        }

        @Override
        public void dailyStandUp() {

            System.out.println("Tester "+ name + " is working");

        }

        @Override
        public void demo() {

            System.out.println("Tester "+ name + " is doing demo");

        }
    }


class Developers extends ScrumTeam {

    public Developers(String name, String jobTitle, double salary) {

        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    @Override
    public void dailyStandUp() {
        System.out.println("Developer " + name + " is working");

    }

    @Override
    public void demo() {

        System.out.println("Developer " + name + " is doing demo");

    }
}
   class BOA{
        public static void main(String[] args) {

            Testers tester1= new Testers("Zeynep", "Tester", 5000);
            Testers tester2= new Testers("İclal", "Tester", 8000);
            Testers tester3= new Testers("Sefa", "Tester", 6000);

            ScrumTeam [] testersArr = {tester1,tester2,tester3};

            for (ScrumTeam tester : testersArr) {

                tester.getEmployeeInfo();
            }

            Developers developer1 = new Developers("Ahmet", "Developer", 5000);
            Developers developer2 = new Developers("Zeynep", "Developer", 8000);
            Developers developer3 = new Developers("İclal", "Developer", 6000);

            ScrumTeam [] developersArr = {developer1,developer2,developer3};

            for (ScrumTeam dev :developersArr) {

                dev.getEmployeeInfo();
            }

        }
    }
