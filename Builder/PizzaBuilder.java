package DP.Builder;

public class PizzaBuilder {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    public PizzaBuilder() {
    }

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public PizzaBuilder setBacon(boolean bacon) {
        this.bacon = bacon;
        return this;
    }

    public Pizza build() {
        return new Pizza(size, cheese, pepperoni, bacon);
    }
}
