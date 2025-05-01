package Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        AbstractFactory factory = abstractFactoryProducer.getFactoryInstance("Luxury");
        Car car = factory.getInstance(100000);
        System.out.println("Top speed: " + car.getTopSpeed() + " km/h");
    }
}
