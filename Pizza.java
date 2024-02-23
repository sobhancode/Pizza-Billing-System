package in.sp.backend;

public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheese = 100;
    private int extraToppings = 150;
    private int backPack = 20;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isExtraBagPackAdded = false;
    private int basePizza;

    public Pizza(boolean veg) {

        this.veg = veg;
        if (this.veg) {
            this.price = 200;
        } else {
            this.price = 350;
        }
        basePizza = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheese;
    }

    public void addExtraToppings() {
        isExtraToppingAdded = true;
        this.price += extraToppings;
    }

    public void addBagPack() {
        isExtraBagPackAdded = true;
        this.price += backPack;
    }

    public void pizzaBill() {
        String bill = "";
        System.out.println("Base Pizza: " + basePizza);
        if (isExtraCheeseAdded) {

            bill += "Extra Cheese Added: " + this.extraCheese + "\n";
        }
        if (isExtraToppingAdded) {

            bill += "Extra Toppings Added: " + this.extraToppings + "\n";
        }
        if (isExtraBagPackAdded) {

            bill += "Extra BagPack Added: " + this.backPack + "\n";
        }
        bill += "Total Amount: " + this.price + "\n";
        System.out.println(bill);
    }
}
