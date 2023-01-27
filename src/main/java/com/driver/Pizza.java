package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean addExtraCheese;

    private int toppings;

    private boolean addExtraToppings;

    private boolean isTakeAway;

    private boolean isbillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.addExtraCheese=false;
        this.addExtraToppings=false;
        this.isTakeAway=false;
        this.isbillGenerated=false;
        this.bill="";
        if(isVeg){
            this.price=300;
            this.toppings=70;
            this.bill+= "Base Price Of The Pizza: " + price + '\n';
        }
        else{
            this.price=400;
            this.toppings=120;
            this.bill+= "Base Price Of The Pizza: " + price + '\n';
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!addExtraCheese){
            this.price+=80;
            this.addExtraCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!addExtraToppings){
            this.price+=this.toppings;
            this.addExtraToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price+=20;
            this.isTakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isbillGenerated) {
            if (addExtraCheese) {
                this.bill += "Extra Cheese Added: " + 80 + '\n';
            }
            if (addExtraToppings) {
                this.bill += "Extra Toppings Added: " + this.toppings + '\n';
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added: " + 20 +  '\n';
            }
            this.bill += "Total Price: " + this.price + '\n';
            isbillGenerated = true;
        }
        return this.bill;
    }
}