package task27.Ornek3;

import task27.ornek6.Food;

import java.util.ArrayList;

public class TechnoKitchen {
    private ArrayList<Food> orders = new ArrayList<>();

    public void addOrder(Food food) {
        orders.add(food);
    }

    public void prepareOrders() {
        for (Food food : orders) {
          // food.doubleUcret();
        }
    }

    public void printUcretBilgisi() {

        for (Food food : orders) {
        }
    }
}