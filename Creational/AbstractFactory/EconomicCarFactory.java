package Creational.AbstractFactory;

public class EconomicCarFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        if (price < 10000) {
            return new EconomicCar1();
        } else if (price < 20000) {
            return new EconomicCar2();
        } else {
            return null;
        }
    }

}
