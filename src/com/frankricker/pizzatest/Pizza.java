package com.frankricker.pizzatest;

public class Pizza {
    //Vars
    private boolean likesPizza;
    private int pizzaPrice;
    private int pizzaSize;
    //Sets up class
    public Pizza(){

    }


    //Get / Set statements
    public int getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public boolean isLikesPizza() {
        return likesPizza;
    }

    public void setLikesPizza(boolean likesPizza) {
        this.likesPizza = likesPizza;
    }

    public int getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(int pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
}
