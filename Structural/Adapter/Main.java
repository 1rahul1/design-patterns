package Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdaptor weightMachineAdaptor = new WeightMachineAdaptorImpl(new WeightMachineImpl());
        System.out.println("Weight in kg: " + weightMachineAdaptor.getWeightInkg());
    }
}
