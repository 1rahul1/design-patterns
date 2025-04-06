package Structural.Decorator;

public class Mushroom extends ToppingDecorator {
    private BasePizza pizza;

    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 100;
    }

}
