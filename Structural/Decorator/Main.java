package Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new MargheritaPizza();
        System.out.println("Cost of Margherita Pizza: " + pizza.cost());

        pizza = new Mushroom(pizza);
        System.out.println("Cost of Margherita Pizza with Mushroom: " + pizza.cost());

        pizza = new ExtraCheese(pizza);
        System.out.println("Cost of Margherita Pizza with Mushroom and Extra Cheese: " + pizza.cost());

        BasePizza pizza2 = new MargheritaPizza();
        System.out.println("Cost of Margherita Pizza: " + pizza2.cost());
        pizza2 = new ExtraCheese(pizza2);
        System.out.println("Cost of Margherita Pizza with Extra Cheese: " + pizza2.cost());
    }
}
