package Behavioral.State;

public class VendingMachine {
    VendingState machineState;

    public VendingState getMachineState() {
        return machineState;
    }

    public void setMachineState(VendingState machineState) {
        this.machineState = machineState;
    }
}
