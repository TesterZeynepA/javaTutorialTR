package ch24_Encapsulation.encapsulation02;

public class UserRunner {
    public static void main(String[] args) {

      User obj1 = new User();

      User obj2 =new User("zeynep","Aytop","12345ZA",35);
        System.out.println("obj2 = " + obj2);//obj2 = User{ad='zeynep', soyad='Aytop', password='12345ZA', yas=35}

        User obj3 = new User("zeynep", "hanim", "12345zeynep",-5);
        System.out.println("obj3 = " + obj3);


    }

}
