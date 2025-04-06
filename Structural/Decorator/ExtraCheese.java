package Structural.Decorator;

public class ExtraCheese extends ToppingDecorator {
    private BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 50; // Adding the cost of extra cheese
    }

}
