package ch28_Interface_Polymorphism.Polymorphism.RunTime;

public class Truck extends Vehicle{

    @Override
    void speedUpTo60mph() {
        System.out.println("Truck is speeding up to 60 mph in 9 seconds");
    }
}
