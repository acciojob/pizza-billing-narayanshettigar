package com.driver;

// public class Pizza {

//     private int price;
//     private Boolean isVeg;
//     private String bill;

//     public Pizza(Boolean isVeg){
//         this.isVeg = isVeg;
//         // your code goes here
//     }

//     public int getPrice(){
//         return this.price;
//     }

//     public void addExtraCheese(){
//         // your code goes here
//     }

//     public void addExtraToppings(){
//         // your code goes here
//     }

//     public void addTakeaway(){
//         // your code goes here
//     }

//     public String getBill(){
//         // your code goes here
//         return this.bill;
//     }
// }
public class Pizza {
    private int basePrice;
    private boolean isVeg;
    private int extraCheesePrice = 80;
    private int extraToppingsPrice;
    private int paperBagPrice = 20;
    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean paperBagAdded = false;

    public Pizza(int basePrice, boolean isVeg) {
        this.basePrice = basePrice;
        this.isVeg = isVeg;
        if (isVeg) {
            extraToppingsPrice = 70;
        } else {
            extraToppingsPrice = 120;
        }
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            basePrice += extraCheesePrice;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            basePrice += extraToppingsPrice;
            extraToppingsAdded = true;
        }
    }

    public void addPaperBag() {
        if (!paperBagAdded) {
            basePrice += paperBagPrice;
            paperBagAdded = true;
        }
    }

    public int getTotalPrice() {
        return basePrice;
    }

    public String generateBill() {
        String bill = "Base Price Of The Pizza: " + basePrice + "\n";
        if (extraCheeseAdded) {
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if (extraToppingsAdded) {
            bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
        }
        if (paperBagAdded) {
            bill += "Paperbag Added: " + paperBagPrice + "\n";
        }
        bill += "Total Price: " + getTotalPrice();
        return bill;
    }
}
