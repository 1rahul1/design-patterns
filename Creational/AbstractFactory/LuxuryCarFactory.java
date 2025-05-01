package Creational.AbstractFactory;

public class LuxuryCarFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        if (price > 100000) {
            return new LuxuryCar2();
        } else {
            return new LuxuryCar1();
        }
    }
}
