package DP.Builder;

import DP.Builder.Pizza;
import DP.Builder.PizzaBuilder;

public class Demo {
    public static void main(String[] args)
    {
        Pizza pizza = new PizzaBuilder()
                .setSize("medium")
                .setCheese(true)
                .setPepperoni(true)
                .build();
    }
}
