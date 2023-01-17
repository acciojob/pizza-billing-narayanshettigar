package com.driver;

// public class DeluxePizza extends Pizza {

//     public DeluxePizza(Boolean isVeg) {
//         super(isVeg);
//         // your code goes here
//     }
// }
public class DeluxePizza extends Pizza {

    public DeluxePizza(boolean isVeg) {
        super(isVeg);
        addExtraCheese();
        addExtraToppings();
    }
}

