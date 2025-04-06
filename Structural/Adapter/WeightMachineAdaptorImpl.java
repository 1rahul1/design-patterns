package Structural.Adapter;

public class WeightMachineAdaptorImpl implements WeightMachineAdaptor {
    private WeightMachine weightMachine;

    public WeightMachineAdaptorImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public int getWeightInkg() {
        return (int) (weightMachine.getWeightInPounds() * 0.45359237);
    }

}
