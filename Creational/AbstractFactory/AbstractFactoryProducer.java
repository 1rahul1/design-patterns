package Creational.AbstractFactory;

public class AbstractFactoryProducer {
    public AbstractFactory getFactoryInstance(String factoryType) {
        if (factoryType.equalsIgnoreCase("Luxury")) {
            return new LuxuryCarFactory();
        } else if (factoryType.equalsIgnoreCase("Economy")) {
            return new EconomicCarFactory();
        }
        return null;
    }
}
