package in.sp.backend;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Pizza pizza = new Pizza(false);
//        pizza.addExtraCheese();
//        pizza.addExtraToppings();
//        pizza.addBagPack();
//        pizza.pizzaBill();

        DeluxPizza deluxPizzaVeg = new DeluxPizza(true);
        deluxPizzaVeg.addBagPack();
        deluxPizzaVeg.pizzaBill();
        DeluxPizza deluxPizzaNonVeg = new DeluxPizza(false);
        deluxPizzaNonVeg.addBagPack();
        deluxPizzaNonVeg.pizzaBill();

    }
}
